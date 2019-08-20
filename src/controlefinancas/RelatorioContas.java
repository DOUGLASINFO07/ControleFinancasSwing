//Classe que implementa a Interface PassivosInterface.
package controlefinancas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class RelatorioContas {

    Connection conn;

    //Variáveis de instancia.
    private String parametroPesquisaRelatorioContas;
    private String itemUmPesquisaRelatorioContas;
    private String itemDoisPesquisaRelatorioContas;
    private double valorTotalPagarContas;
    private double valorTotalPagoContas;
    //Fim das variáveis de instancia.

    //Inicio conector.
    public RelatorioContas(Connection conn) {
        this.conn = conn;

    }//fim conector. 

    //Inicio dos métodos Getter e Setter.
    public String getParametroPesquisaRelatorioContas() {
        return parametroPesquisaRelatorioContas;
    }

    public void setParametroPesquisaRelatorioContas(String parametroPesquisaRelatorioContas) {
        this.parametroPesquisaRelatorioContas = parametroPesquisaRelatorioContas;
    }

    public String getItemUmPesquisaRelatorioContas() {
        return itemUmPesquisaRelatorioContas;
    }

    public void setItemUmPesquisaRelatorioContas(String itemUmPesquisaRelatorioContas) {
        this.itemUmPesquisaRelatorioContas = itemUmPesquisaRelatorioContas;
    }

    public String getItemDoisPesquisaRelatorioContas() {
        return itemDoisPesquisaRelatorioContas;
    }

    public void setItemDoisPesquisaRelatorioContas(String itemDoisPesquisaRelatorioContas) {
        this.itemDoisPesquisaRelatorioContas = itemDoisPesquisaRelatorioContas;
    }

    public double getValorTotalPagarContas() {
        return valorTotalPagarContas;
    }

    public void setValorTotalPagarContas(double valorTotalPagarContas) {
        this.valorTotalPagarContas = valorTotalPagarContas;
    }

    public double getValorTotalPagoContas() {
        return valorTotalPagoContas;
    }

    public void setValorTotalPagoContas(double valorTotalPagoContas) {
        this.valorTotalPagoContas = valorTotalPagoContas;
    }
    //Inicio dos métodos de implemmento.

    //Fim dos métodos de implemento.
    public void imprimirBaixarBoleto() {

    }

    public void listarRelatorioContas(
              JTable tabelaRelatorioContas,
              JComboBox parametroPesquisaRelatorioContas,
              JTextField itemUmPesquisaRelatorioContas,
              JTextField itemDoisPesquisaRelatorioContas,
              JTextField valorTotalPagoContas,
              JTextField valorTotalPagarContas,
              JButton novaBuscaRelatorioContas,
              JButton imprimirRelatorioContas,
              JButton confirmaPesquisaRelatorioContas,
              JButton pesquisarPesquisaRelatorioContas
    ) {

        double calculo = 0;

        Utilitario util = new Utilitario(conn);

        DefaultTableModel m = (DefaultTableModel) tabelaRelatorioContas.getModel();

        while (tabelaRelatorioContas.getRowCount() > 0) {
            m.removeRow(0);
        }

        setParametroPesquisaRelatorioContas(parametroPesquisaRelatorioContas.getSelectedItem().toString());
        setItemUmPesquisaRelatorioContas(itemUmPesquisaRelatorioContas.getText());
        setItemDoisPesquisaRelatorioContas(itemDoisPesquisaRelatorioContas.getText());

        String data1;
        String data2;

        String queryBancoDados = null;

        Date d = new Date();

        if ("Mês Atual".equals(getParametroPesquisaRelatorioContas())) {

            String dataFormato = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);

            int mes = Integer.parseInt((String) dataFormato.subSequence(3, 5));
            int ano = Integer.parseInt((String) dataFormato.subSequence(6, 10));

            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE vencimentoBoleto >= '" + ano + "-" + mes + "-01" + "' "
                      + "AND vencimentoBoleto <= '" + ano + "-" + mes + "-31" + "' "
                      + "ORDER BY codigoBoleto ASC";

        } else if ("Boletos à Vencer".equals(getParametroPesquisaRelatorioContas())) {
            String dataAtual = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
            String dataHoje = util.converterDataBrasilAmericano(dataAtual);
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE vencimentoBoleto >= '" + dataHoje + "' "
                      + "AND valorPagoBoleto <= 0 "
                      + "ORDER BY codigoBoleto ASC";

        } else if ("Boletos Vencidos".equals(getParametroPesquisaRelatorioContas())) {
            String dataAtual = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
            String dataHoje = util.converterDataBrasilAmericano(dataAtual);
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE vencimentoBoleto <= '" + dataHoje + "' "
                      + "AND valorPagoBoleto <= 0 "
                      + "ORDER BY codigoBoleto ASC";

        } else if ("Boletos à Pagar".equals(getParametroPesquisaRelatorioContas())) {
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE valorPagoBoleto = 0 "
                      + "ORDER BY codigoBoleto ASC";

        } else if ("Boletos Pagos".equals(getParametroPesquisaRelatorioContas())) {
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE valorPagoBoleto > 0 "
                      + "ORDER BY codigoBoleto ASC";

        } else if ("Período de Boletos Vencidos".equals(getParametroPesquisaRelatorioContas())) {
            data1 = util.converterDataBrasilAmericano(getItemUmPesquisaRelatorioContas());
            data2 = util.converterDataBrasilAmericano(getItemDoisPesquisaRelatorioContas());
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE vencimentoBoleto >= '" + data1 + "' "
                      + "AND vencimentoBoleto <= '" + data2 + "' "
                      + "AND valorPagoBoleto <= 0 "
                      + "ORDER BY codigoBoleto ASC";

        } else if ("Período de Boletos Pagos".equals(getParametroPesquisaRelatorioContas())) {
            data1 = util.converterDataBrasilAmericano(getItemUmPesquisaRelatorioContas());
            data2 = util.converterDataBrasilAmericano(getItemDoisPesquisaRelatorioContas());
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE vencimentoBoleto >= '" + data1 + "' "
                      + "AND vencimentoBoleto <= '" + data2 + "' "
                      + "AND valorPagoBoleto > 0 "
                      + "ORDER BY codigoBoleto ASC";

        } else if ("Data de Vencimento do Boleto".equals(getParametroPesquisaRelatorioContas())) {
            data1 = util.converterDataBrasilAmericano(getItemUmPesquisaRelatorioContas());
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE vencimentoBoleto = '" + data1 + "' "
                      + "AND valorPagoBoleto <= 0 "
                      + "ORDER BY codigoBoleto ASC";

        } else if ("Data de Pagamento do Boleto".equals(getParametroPesquisaRelatorioContas())) {
            data1 = util.converterDataBrasilAmericano(getItemUmPesquisaRelatorioContas());
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE dataPagamentoBoleto = '" + data1 + "' "
                      + "AND valorPagoBoleto >= 0 "
                      + "ORDER BY codigoBoleto ASC";

        } else if ("Boletos Vencidos Mês Atual".equals(getParametroPesquisaRelatorioContas())) {

            String dataFormato = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);

            int mes = Integer.parseInt((String) dataFormato.subSequence(3, 5));
            int ano = Integer.parseInt((String) dataFormato.subSequence(6, 10));

            String dataAtual = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
            String dataHoje = util.converterDataBrasilAmericano(dataAtual);

            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE vencimentoBoleto >= '" + ano + "-" + mes + "-01" + "' "
                      + "AND vencimentoBoleto <= '" + ano + "-" + mes + "-31" + "' "
                      + "AND vencimentoBoleto < '" + dataHoje + "' "
                      + "AND valorPagoBoleto <= 0 "
                      + "ORDER BY codigoBoleto ASC";

        } else if ("Boletos à Vencer Mês Atual".equals(getParametroPesquisaRelatorioContas())) {

            String dataFormato = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);

            int mes = Integer.parseInt((String) dataFormato.subSequence(3, 5));
            int ano = Integer.parseInt((String) dataFormato.subSequence(6, 10));

            String dataAtual = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
            String dataHoje = util.converterDataBrasilAmericano(dataAtual);

            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE vencimentoBoleto >= '" + ano + "-" + mes + "-01" + "' "
                      + "AND vencimentoBoleto <= '" + ano + "-" + mes + "-31" + "' "
                      + "AND vencimentoBoleto >= '" + dataHoje + "' "
                      + "AND valorPagoBoleto <= 0 "
                      + "ORDER BY codigoBoleto ASC";

        } else if ("Todos os Boletos".equals(getParametroPesquisaRelatorioContas())) {
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE empresaBoleto LIKE '%" + "" + "%' "
                      + "ORDER BY codigoBoleto ASC";

        } else {//"Empresa que gerou o boleto".equals
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE empresaBoleto LIKE '%" + getParametroPesquisaRelatorioContas() + "%' "
                      + "ORDER BY codigoBoleto DESC";
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

                    double valorBoletoPagar = rs.getDouble("valorPagarBoleto");
                    String boletoPagar = util.converterCifraoAmericanoBrasil(valorBoletoPagar);

                    double valorBoletoPago = rs.getDouble("valorPagoBoleto");
                    String boletoPago = util.converterCifraoAmericanoBrasil(valorBoletoPago);

                    String dataVencimento = util.converterDataAmericanoBrasil(rs.getString("vencimentoBoleto"));
                    String dataPagamentoBoleto = util.converterDataAmericanoBrasil(rs.getString("dataPagamentoBoleto"));

                    if ("01-01-2000".equals(dataPagamentoBoleto)) {
                        dataPagamentoBoleto = "";
                    }

                    m.addRow(new Object[]{
                        rs.getString("empresaBoleto"),
                        rs.getString("servicoBoleto"),
                        dataVencimento,
                        boletoPagar,
                        rs.getString("numeroParcelasBoleto"),
                        dataPagamentoBoleto,
                        rs.getString("localPagamentoBoleto"),
                        rs.getString("pagadorBoleto"),
                        boletoPago
                    });

                    setValorTotalPagarContas(getValorTotalPagarContas() + valorBoletoPagar);
                    setValorTotalPagoContas(getValorTotalPagoContas() + valorBoletoPago);

                    calculo = getValorTotalPagarContas() - getValorTotalPagoContas();
                }

            }

            valorTotalPagoContas.setText("" + util.converterCifraoAmericanoBrasil(getValorTotalPagoContas()));
            valorTotalPagarContas.setText("" + util.converterCifraoAmericanoBrasil(calculo));

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

    public void RelatorioMesAtual(
              String relatorio,
              String dataInicioMes,
              String dataFinalMes
    ) {

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão do relatorio?", "Atenção!", JOptionPane.YES_NO_CANCEL_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            try {
                HashMap<String, Object> filtro = new HashMap<>();
                filtro.put("dataInicioMes", dataInicioMes);
                filtro.put("dataFinalMes", dataFinalMes);

                JasperPrint print;
                print = JasperFillManager.fillReport(relatorio, filtro, conn);
                JasperViewer.viewReport(print, false);

            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, "erro ao imprimir" + e.getMessage());
            }
        }
    }

    public void RelatorioBoletosVencidosMesAtual(
              String relatorio,
              String dataAtual,
              String dataInicioMes,
              String dataFinalMes
    ) {

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão do relatorio?", "Atenção!", JOptionPane.YES_NO_CANCEL_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            try {
                HashMap<String, Object> filtro = new HashMap<>();
                filtro.put("dataInicioMes", dataInicioMes);
                filtro.put("dataFinalMes", dataFinalMes);
                filtro.put("datAtual", dataAtual);

                JasperPrint print;
                print = JasperFillManager.fillReport(relatorio, filtro, conn);
                JasperViewer.viewReport(print, false);

            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, "erro ao imprimir" + e.getMessage());
            }
        }
    }

}
