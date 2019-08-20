//Classe que implementa a Interface PassivosInterface.
package classes;

import controlefinancas.Utilitario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

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
    private String mensagemPesquisa;
    //Fim das variáveis de instancia.

    //Inicio conector.
    public RelatorioSalario(Connection conn) {
        this.conn = conn;

    }//fim conector. 

    //Inicio dos métodos Getter e Setter.

    public String getMensagemPesquisa() {
        return mensagemPesquisa;
    }

    public void setMensagemPesquisa(String mensagemPesquisa) {
        this.mensagemPesquisa = mensagemPesquisa;
    }
    
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
                      + "ORDER BY dataRecebimentoSalario ASC";
        } else if ("Data dos Salários".equals(getParametroPesquisaRelatorioSalario())) {
            data1 = util.converterDataBrasilAmericano(getItemUmPesquisaRelatorioSalario());
            queryBancoDados = "SELECT * FROM Salario "
                      + "WHERE dataRecebimentoSalario = '" + data1 + "' "
                      + "ORDER BY empresaSalario ASC";
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
                      + "ORDER BY dataRecebimentosalario ASC";

        } else if ("Todos os Salários".equals(getParametroPesquisaRelatorioSalario())) {
            queryBancoDados = "SELECT * FROM Salario "
                      + "WHERE empresaSalario LIKE '%" + "" + "%' "
                      + "ORDER BY dataRecebimentosalario DESC";
        } else {
            queryBancoDados = "SELECT * FROM Salario "
                      + "WHERE empresaSalario LIKE '%" + getParametroPesquisaRelatorioSalario() + "%' "
                      + "ORDER BY empresasalario ASC";
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
                        data,
                        rs.getString("cicloRecebimentoSalario"),
                        salario
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
    
    public void Relatorios(
              String relatorio,
              String dataInicioMes,
              String dataFinalMes,
              String dataAtual,
              String empresa,
              String dataInicial,
              String dataFinal,
              String mensagemPesquisa
    ) {

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão do relatorio?", "Atenção!", JOptionPane.YES_NO_CANCEL_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            try {
                HashMap<String, Object> filtro = new HashMap<>();
                filtro.put("dataInicioMes", dataInicioMes);
                filtro.put("dataFinalMes", dataFinalMes);
                filtro.put("dataAtual", dataAtual);
                filtro.put("empresa", empresa);
                filtro.put("dataInicial", dataInicial);
                filtro.put("dataFinal", dataFinal);
                filtro.put("mensagemPesquisa", mensagemPesquisa);

                JasperPrint print;
                print = JasperFillManager.fillReport(relatorio, filtro, conn);
                JasperViewer.viewReport(print, false);

            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, "erro ao imprimir" + e.getMessage());
            }
        }
    }

    public void imprimir(
              JComboBox parametroPesquisaRelatorioContas,
              JTextField dataInicial,
              JTextField dataFinal,
              JLabel mensagem
    ) {

        Date d = new Date();

        Utilitario util = new Utilitario(conn);

        String relatorio;

        String dataInicioMes;
        String dataFinalMes;

        setItemUmPesquisaRelatorioSalario(dataInicial.getText());
        setItemDoisPesquisaRelatorioSalario(dataFinal.getText());
        setParametroPesquisaRelatorioSalario(parametroPesquisaRelatorioContas.getSelectedItem().toString());
        setMensagemPesquisa(mensagem.getText());

        String dataInicio;
        if ("  -  -    ".equals(getItemUmPesquisaRelatorioSalario())) {
            dataInicio = "2000-01-01";
        } else {
            dataInicio = util.converterDataBrasilAmericano(getItemUmPesquisaRelatorioSalario());
        }
        
        String dataFim;
        if ("  -  -    ".equals(getItemDoisPesquisaRelatorioSalario())) {
            dataFim = "2000-01-01";
        } else {
            dataFim = util.converterDataBrasilAmericano(getItemDoisPesquisaRelatorioSalario());
        }

        String data = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
        String dataAtual = util.converterDataBrasilAmericano(data);

        int mes1 = Integer.parseInt((String) data.subSequence(3, 5));
        int ano1 = Integer.parseInt((String) data.subSequence(6, 10));

        int mes2 = Integer.parseInt((String) data.subSequence(3, 5));
        int ano2 = Integer.parseInt((String) data.subSequence(6, 10));

        dataInicioMes = ano1 + "-" + mes1 + "-01";
        dataFinalMes = ano2 + "-" + mes2 + "-31";

        if ("Mês Atual dos Salários".equals(parametroPesquisaRelatorioContas.getSelectedItem().toString())) {

            //variável que artmazena o caminho do relatório
            relatorio = "src/relatorio/RelatorioSalarioMesAtual.jasper";

        } else if ("Todos os Salários".equals(parametroPesquisaRelatorioContas.getSelectedItem().toString())) {

            //variável que artmazena o caminho do relatório
            relatorio = "src/relatorio/RelatorioSalarioTodos.jasper";

        } else if ("Período dos Salários".equals(parametroPesquisaRelatorioContas.getSelectedItem().toString())) {

            //variável que artmazena o caminho do relatório
            relatorio = "src/relatorio/RelatorioSalarioPeriodo.jasper";

        } else if ("Data dos Salários".equals(parametroPesquisaRelatorioContas.getSelectedItem().toString())) {

            //variável que artmazena o caminho do relatório
            relatorio = "src/relatorio/RelatorioSalarioData.jasper";

        }else {

            //variável que artmazena o caminho do relatório
            relatorio = "src/relatorio/RelatorioSalarioEmpresa.jasper";

        }
        
        System.out.println("" + dataInicio);

        //MÉTODO QUE FAZ A COMUNICAÇÃO DO SISTEMA COM O RELATORIO O ARQUIVO .JRXML(IREPORT)
        Relatorios(
                  relatorio,
                  dataInicioMes,
                  dataFinalMes,
                  dataAtual,
                  getParametroPesquisaRelatorioSalario(),
                  dataInicio,
                  dataFim,
                  getMensagemPesquisa()
        );

    }

}
