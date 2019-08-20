//Classe que implementa a Interface PassivosInterface.
package financascasa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author douglas borges egidio
 * @since 25/09/2018
 */
public class RelatorioSalario {

    Connection conn;

    //Variáveis de instancia.
    private String parametroPesquisaRelatorioSalario;
    private String itemUmPesquisaRelatorioSalario;
    private String itemDoisPesquisaRelatorioSalario;
    private double valorTotalSalario;
    //Fim das variáveis de instancia.

    //Inicio conector.
    public RelatorioSalario(Connection conn) {
        this.conn = conn;

    }//fim conector. 

    //Inicio dos métodos Getter e Setter.
    public String getParametroPesquisaRelatorioSalario() {
        return parametroPesquisaRelatorioSalario;
    }

    public void setParametroPesquisaRelatorioSalario(String parametroPesquisaRelatorioSalario) {
        this.parametroPesquisaRelatorioSalario = parametroPesquisaRelatorioSalario;
    }

    public String getItemUmPesquisaRelatorioSalario() {
        return itemUmPesquisaRelatorioSalario;
    }

    public void setItemUmPesquisaRelatorioSalario(String itemUmPesquisaRelatorioSalario) {
        this.itemUmPesquisaRelatorioSalario = itemUmPesquisaRelatorioSalario;
    }

    public String getItemDoisPesquisaRelatorioSalario() {
        return itemDoisPesquisaRelatorioSalario;
    }

    public void setItemDoisPesquisaRelatorioSalario(String itemDoisPesquisaRelatorioSalario) {
        this.itemDoisPesquisaRelatorioSalario = itemDoisPesquisaRelatorioSalario;
    }

    public double getValorTotalSalario() {
        return valorTotalSalario;
    }

    public void setValorTotalSalario(double valorTotalSalario) {
        this.valorTotalSalario = valorTotalSalario;
    }

    //Inicio dos métodos de implemmento.
    //Fim dos métodos de implemento.
    public void imprimirBaixarBoleto() {

    }

    public void listarBaixarBoleto(
              JTable tabelaRelatorioSalario,
              JComboBox parametroPesquisaRelatorioSalario,
              JTextField itemUmPesquisaRelatorioSalario,
              JTextField itemDoisPesquisaRelatorioSalario,
              JTextField valorTotalSalario,
              JButton novaBuscaRelatorioSalario,
              JButton imprimirRelatorioSalario,
              JButton confirmaPesquisaRelatorioSalario,
              JButton pesquisarPesquisaRelatorioSalario
    ) {

        Utilitario util = new Utilitario(conn);

        DefaultTableModel m = (DefaultTableModel) tabelaRelatorioSalario.getModel();

        while (tabelaRelatorioSalario.getRowCount() > 0) {
            m.removeRow(0);
        }

        setParametroPesquisaRelatorioSalario(parametroPesquisaRelatorioSalario.getSelectedItem().toString());
        setItemUmPesquisaRelatorioSalario(itemUmPesquisaRelatorioSalario.getText());
        setItemDoisPesquisaRelatorioSalario(itemDoisPesquisaRelatorioSalario.getText());

        String data1;
        String data2;

        String queryBancoDados = null;

        if ("Período dos Salários".equals(getParametroPesquisaRelatorioSalario())) {
            data1 = util.converterDataBrasilAmericano(getItemUmPesquisaRelatorioSalario());
            data2 = util.converterDataBrasilAmericano(getItemDoisPesquisaRelatorioSalario());
            queryBancoDados = "SELECT * FROM Salario "
                      + "WHERE dataRecebimentoSalario >= '" + data1 + "' "
                      + "AND dataRecebimentoSalario <= '" + data2 + "' "
                      + "ORDER BY codigoSalario ASC";
        } else if ("Data dos Salários".equals(getParametroPesquisaRelatorioSalario())) {
            data1 = util.converterDataBrasilAmericano(getItemUmPesquisaRelatorioSalario());
            queryBancoDados = "SELECT * FROM Salario "
                      + "WHERE dataRecebimentoSalario = '" + data1 + "' "
                      + "ORDER BY codigoSalario ASC";
        } else if ("Mês Atual dos Salários".equals(getParametroPesquisaRelatorioSalario())) {

            Date d = new Date();
            String dataFormato = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
//            JOptionPane.showMessageDialog(null, "data Atual:" + dataFormato);
            int dia = Integer.parseInt((String) dataFormato.subSequence(0, 2));
            int mes = Integer.parseInt((String) dataFormato.subSequence(3, 5));
            int ano = Integer.parseInt((String) dataFormato.subSequence(6, 10));

            queryBancoDados = "SELECT * FROM Salario "
                      + "WHERE dataRecebimentoSalario >= '" + ano + "-" + mes + "-01" + "' "
                      + "AND dataRecebimentoSalario <= '" + ano + "-" + mes + "-31" + "' "
                      + "ORDER BY codigoSalario ASC";

        } else if ("Todos os Salários".equals(getParametroPesquisaRelatorioSalario())) {
            queryBancoDados = "SELECT * FROM Salario "
                      + "WHERE empresaSalario LIKE '%" + "" + "%' "
                      + "ORDER BY codigoSalario ASC";
        } else {
            queryBancoDados = "SELECT * FROM Salario "
                      + "WHERE empresaSalario LIKE '%" + getParametroPesquisaRelatorioSalario() + "%' "
                      + "ORDER BY codigoSalario DESC";
        }

        try {
            Statement stmt = conn.createStatement();
            try (ResultSet rs = stmt.executeQuery(queryBancoDados)) {

                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(null, "ATENÇÃO!!\n"
                              + "Nenhum dado foi encontrado!!\n"
                              + "Tente outro filtro de pesquisa!!");
                } else {
                    rs.previous();
                }

                while (rs.next()) {

                    double valorSalario = rs.getDouble("valorSalario");
                    String salario = util.converterCifraoAmericanoBrasil(valorSalario);

                    String data = util.converterDataAmericanoBrasil(rs.getString("dataRecebimentoSalario"));

                    m.addRow(new Object[]{
                        rs.getString("empresaSalario"),
                        salario,
                        data,
                        rs.getString("cicloRecebimentoSalario")
                    });

                    setValorTotalSalario(getValorTotalSalario() + valorSalario);
                }
            }
            valorTotalSalario.setText("" + util.converterCifraoAmericanoBrasil(getValorTotalSalario()));

        } catch (SQLException e) {
            System.out.println("Error ao listar Salário!" + e.getMessage());
        }

    }

    public void limparTabelaPassivos(JTable tabelaPassivos
    ) {

        ((DefaultTableModel) tabelaPassivos.getModel()).setRowCount(0);
    }

    public void preencherCombomBoxNomeEmpresa(JComboBox nomeEmpresa) throws SQLException {

        nomeEmpresa.removeAllItems();
        nomeEmpresa.addItem("***  Selecione Fonte Pagadora  ***");
        Statement stmt = conn.createStatement();
        try (ResultSet rs = stmt.executeQuery("SELECT DISTINCT nome FROM empresa ORDER BY nome")) {
            while (rs.next()) {
                String nome = rs.getString("nome");
                nomeEmpresa.addItem(nome);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir nome Empresa no combo Box!\n" + ex.getMessage());
        }

    }

    public void preencherCombomBoxProduto(JComboBox tipoServico) throws SQLException {

        tipoServico.removeAllItems();
        tipoServico.addItem("***  Selecione  ***");
        Statement stmt = conn.createStatement();
        try (ResultSet rs = stmt.executeQuery("SELECT DISTINCT tipoServico FROM empresa ORDER BY tipoServico")) {
            while (rs.next()) {
                String servico = rs.getString("tipoServico");
                tipoServico.addItem(servico);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir tipo de serviço no combo Box!\n" + ex.getMessage());
        }
    }

    public void preencherCombomUsuario(JComboBox nomeUsuario) throws SQLException {

        nomeUsuario.removeAllItems();
        nomeUsuario.addItem("***  Selecione  ***");
        Statement stmt = conn.createStatement();
        try (ResultSet rs = stmt.executeQuery("SELECT DISTINCT nomeUsuario FROM usuario ORDER BY nomeUsuario")) {
            while (rs.next()) {
                String usuario = rs.getString("nomeUsuario");
                nomeUsuario.addItem(usuario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuario no combo Box!\n" + ex.getMessage());
        }
    }

}
