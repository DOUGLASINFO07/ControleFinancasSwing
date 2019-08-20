//Classe que implementa a Interface PassivosInterface.
package financascasa;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class BaixarBoleto {

    Connection conn;

    //Variáveis de instancia.
    private String nomeEmpresa;
    private String produto;
    private double valorPagar;
    private String dataVencimento;
    private int parcelasPagar;
    private String cicloPagamento;
    private String formaPagamento;
    private double valorpago;
    private String dataPagamento;
    private String localPagamento;
    private String pagador;
    private String parametroPesquisa;
    private String itemUmPesquisa;
    private String itemDoisPesquisa;
    private String parametroBancoDados;
    //Fim das variáveis de instancia.

    //Inicio conector.
    public BaixarBoleto(Connection conn) {
        this.conn = conn;
    }//fim conector. 

    //Inicio dos métodos Getter e Setter.
    public String getParametroBancoDados() {
        return parametroBancoDados;
    }

    public void setParametroBancoDados(String parametroBancoDados) {
        this.parametroBancoDados = parametroBancoDados;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {

        this.dataVencimento = dataVencimento;
    }

    public int getParcelasPagar() {
        return parcelasPagar;
    }

    public void setParcelasPagar(int parcelasPagar) {
        this.parcelasPagar = parcelasPagar;
    }

    public String getCicloPagamento() {
        return cicloPagamento;
    }

    public void setCicloPagamento(String cicloPagamento) {
        this.cicloPagamento = cicloPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorpago() {
        return valorpago;
    }

    public void setValorpago(double valorpago) {
        this.valorpago = valorpago;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getLocalPagamento() {
        return localPagamento;
    }

    public void setLocalPagamento(String localPagamento) {
        this.localPagamento = localPagamento;
    }

    public String getPagador() {
        return pagador;
    }

    public String getParametroPesquisa() {
        return parametroPesquisa;
    }

    public void setParametroPesquisa(String parametroPesquisa) {
        this.parametroPesquisa = parametroPesquisa;
    }

    public String getItemUmPesquisa() {
        return itemUmPesquisa;
    }

    public void setItemUmPesquisa(String itemUmPesquisa) {
        this.itemUmPesquisa = itemUmPesquisa;
    }

    public String getItemDoisPesquisa() {
        return itemDoisPesquisa;
    }

    public void setItemDoisPesquisa(String itemDoisPesquisa) {
        this.itemDoisPesquisa = itemDoisPesquisa;
    }

    //Fim dos mnétodos Getter e Setter.
    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    //Inicio dos métodos de implemmento.
    //Fim dos métodos de implemento.
    public void atualizarBaixarBoleto(
              JTable tabelaPassivos,
              JTextField empresaBaixarBoleto,
              JTextField servicoBaixarBoleto,
              JTextField valorBaixarBoletoTextField,
              JTextField dataVencimentoBaixarBoleto,
              JTextField parcelasPagarBaixarBoletoTextField,
              JTextField numeroParcelaBaixarBoleto,
              JTextField cicloPagamentoBaixarBoleto,
              JTextField formaPagamentoBaixarBoleto,
              JTextField valorPagamentoBaixarBoletoTextField,
              JTextField dataPagamentoBaixarBoleto,
              JComboBox localPagamentoBaixarBoleto,
              JComboBox pagadorBaixarBoleto,
              JComboBox parametroPesquisaBaixarBoleto,
              JTextField itemUmPesquisaBaixarBoleto,
              JTextField itemDoisPesquisaBaixarBoleto,
              JButton atualizarBaixarBoleto,
              JButton selecionarBaixarBoleto,
              JButton novaBusca,
              JButton imprimirBaixarBoleto,
              JButton confirmaPesquisaBaixarBoleto,
              JButton pesquisarPesquisaBaixarBoleto
    ) {

        Utilitario util = new Utilitario(conn);
        setNomeEmpresa(empresaBaixarBoleto.getText());

        String valorBoletoPagar = valorPagamentoBaixarBoletoTextField.getText();
        setValorpago(Double.parseDouble(util.converterCifraoBrasiloAmericano(valorBoletoPagar)));

        String dataPagamnetoBoleto = dataPagamentoBaixarBoleto.getText();
        setDataPagamento(util.converterDataBrasilAmericano(dataPagamnetoBoleto));

        setPagador(pagadorBaixarBoleto.getSelectedItem().toString());
        setLocalPagamento(localPagamentoBaixarBoleto.getSelectedItem().toString());

        String dataVencimentoBoleto = dataVencimentoBaixarBoleto.getText();
        setDataVencimento(util.converterDataBrasilAmericano(dataVencimentoBoleto));

        if (!getLocalPagamento().equals("***  Selecione  ***")
                  && !getPagador().equals("***  Selecione  ***")) {
            try {
                try (PreparedStatement pstm = conn.prepareStatement("UPDATE Boleto SET "
                          + "valorPagoBoleto = '" + getValorpago() + "',"
                          + "dataPagamentoBoleto = '" + getDataPagamento() + "',"
                          + "localPagamentoBoleto = '" + getLocalPagamento() + "',"
                          + "pagadorBoleto = '" + getPagador() + "' "
                          + "WHERE empresaBoleto LIKE '" + getNomeEmpresa() + "' AND "
                          + "vencimentoBoleto LIKE '" + getDataVencimento() + "'")) {

                    limparBloquear(
                              tabelaPassivos,
                              empresaBaixarBoleto,
                              servicoBaixarBoleto,
                              valorBaixarBoletoTextField,
                              dataVencimentoBaixarBoleto,
                              parcelasPagarBaixarBoletoTextField,
                              numeroParcelaBaixarBoleto,
                              cicloPagamentoBaixarBoleto,
                              formaPagamentoBaixarBoleto,
                              valorPagamentoBaixarBoletoTextField,
                              dataPagamentoBaixarBoleto,
                              localPagamentoBaixarBoleto,
                              pagadorBaixarBoleto,
                              parametroPesquisaBaixarBoleto,
                              itemUmPesquisaBaixarBoleto,
                              itemDoisPesquisaBaixarBoleto,
                              atualizarBaixarBoleto,
                              selecionarBaixarBoleto,
                              novaBusca,
                              imprimirBaixarBoleto,
                              confirmaPesquisaBaixarBoleto,
                              pesquisarPesquisaBaixarBoleto
                    );

                    pstm.executeUpdate();
                }
                JOptionPane.showMessageDialog(null, "Passivo baixado com sucesso!");
            } catch (SQLException | HeadlessException e) {
                System.out.println("Erro ao baixar Passivo!\n" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem estar preenchidos!");
        }
    }

    public void imprimirBaixarBoleto() {

    }

    public void limparFormularioBaixarBoleto(
              JTable tabelaPassivos,
              JTextField empresaBaixarBoleto,
              JTextField servicoBaixarBoleto,
              JTextField valorBaixarBoletoTextField,
              JTextField dataVencimentoBaixarBoleto,
              JTextField parcelasPagarBaixarBoletoTextField,
              JTextField numeroParcelaBaixarBoleto,
              JTextField cicloPagamentoBaixarBoleto,
              JTextField formaPagamentoBaixarBoleto,
              JTextField valorPagamentoBaixarBoletoTextField,
              JTextField dataPagamentoBaixarBoleto,
              JComboBox localPagamentoBaixarBoleto,
              JComboBox pagadorBaixarBoleto,
              JComboBox parametroPesquisaBaixarBoleto,
              JTextField itemUmPesquisaBaixarBoleto,
              JTextField itemDoisPesquisaBaixarBoleto,
              JButton atualizarBaixarBoleto,
              JButton selecionarBaixarBoleto,
              JButton novaBusca,
              JButton imprimirBaixarBoleto,
              JButton confirmaPesquisaBaixarBoleto,
              JButton pesquisarPesquisaBaixarBoleto
    ) {
        empresaBaixarBoleto.setText(null);
        servicoBaixarBoleto.setText(null);
        valorBaixarBoletoTextField.setText(null);
        dataVencimentoBaixarBoleto.setText(null);
        parcelasPagarBaixarBoletoTextField.setText(null);
        numeroParcelaBaixarBoleto.setText(null);
        cicloPagamentoBaixarBoleto.setText(null);
        formaPagamentoBaixarBoleto.setText(null);
        valorPagamentoBaixarBoletoTextField.setText("R$ ");
        dataPagamentoBaixarBoleto.setText(null);
        localPagamentoBaixarBoleto.setSelectedItem("***  Selecione  ***");
        pagadorBaixarBoleto.setSelectedItem("***  Selecione  ***");
    }

    public void pegarDadosTabelaBaixarBoleto(
              JTable tabelaPassivos,
              JTextField empresaBaixarBoleto,
              JTextField servicoBaixarBoleto,
              JTextField valorBaixarBoletoTextField,
              JTextField dataVencimentoBaixarBoleto,
              JTextField parcelasPagarBaixarBoletoTextField,
              JTextField numeroParcelaBaixarBoleto,
              JTextField cicloPagamentoBaixarBoleto,
              JTextField formaPagamentoBaixarBoleto,
              JTextField valorPagamentoBaixarBoletoTextField,
              JTextField dataPagamentoBaixarBoleto,
              JComboBox localPagamentoBaixarBoleto,
              JComboBox pagadorBaixarBoleto,
              JComboBox parametroPesquisaBaixarBoleto,
              JTextField itemUmPesquisaBaixarBoleto,
              JTextField itemDoisPesquisaBaixarBoleto,
              JButton atualizarBaixarBoleto,
              JButton selecionarBaixarBoleto,
              JButton novaBusca,
              JButton imprimirBaixarBoleto,
              JButton confirmaPesquisaBaixarBoleto,
              JButton pesquisarPesquisaBaixarBoleto
    ) {

        Utilitario util = new Utilitario(conn);

        if (tabelaPassivos.getSelectedRowCount() == 1) {

            String nomeEmpresa1 = tabelaPassivos.getValueAt(tabelaPassivos.getSelectedRow(), 0).toString();

            String dataVencimentoParcela = tabelaPassivos.getValueAt(tabelaPassivos.getSelectedRow(), 2).toString();
            setDataVencimento(util.converterDataBrasilAmericano(dataVencimentoParcela));

            String valorPagarBoleto = tabelaPassivos.getValueAt(tabelaPassivos.getSelectedRow(), 3).toString();

            try {
                Statement stmt = conn.createStatement();
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM Boleto "
                          + "WHERE empresaBoleto LIKE '" + nomeEmpresa1 + "' "
                          + "AND vencimentoBoleto = '" + getDataVencimento() + "'")) {
                    while (rs.next()) {

                        empresaBaixarBoleto.setText(rs.getString("empresaBoleto"));
                        servicoBaixarBoleto.setText(rs.getString("servicoBoleto"));

                        double valorBoleto = rs.getDouble("valorPagarBoleto");
                        valorBaixarBoletoTextField.setText("" + util.converterCifraoAmericanoBrasil(valorBoleto));

                        String datavencimento = rs.getString("vencimentoBoleto");
                        dataVencimentoBaixarBoleto.setText(util.converterDataAmericanoBrasil(datavencimento));

                        parcelasPagarBaixarBoletoTextField.setText(rs.getString("parcelasBoleto"));
                        numeroParcelaBaixarBoleto.setText(rs.getString("numeroParcelasBoleto"));
                        cicloPagamentoBaixarBoleto.setText(rs.getString("cicloBoleto"));
                        formaPagamentoBaixarBoleto.setText(rs.getString("formaPagamentoBoleto"));

                        double valorPago = rs.getDouble("valorPagoBoleto");
                        if (valorPago == 0.0) {
                            valorPagamentoBaixarBoletoTextField.setText("" + util.converterCifraoAmericanoBrasil(valorBoleto));
                        } else {
                            valorPagamentoBaixarBoletoTextField.setText(util.converterCifraoAmericanoBrasil(valorPago));
                        }
                        
                        String dataPagamentoBoleto = rs.getString("dataPagamentoBoleto");
                        if ("2000-01-01".equals(dataPagamentoBoleto)) {
                            Date d = new Date();
                            String data = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
                            String dataReplace = data.replace("/", "-");
                            dataPagamentoBaixarBoleto.setText(dataReplace);
                        } else {
                            dataPagamentoBaixarBoleto.setText(util.converterDataAmericanoBrasil(dataPagamentoBoleto));
                        }

                        localPagamentoBaixarBoleto.setSelectedItem(rs.getString("localPagamentoBoleto"));
                        pagadorBaixarBoleto.setSelectedItem(rs.getString("pagadorBoleto"));

                        valorPagamentoBaixarBoletoTextField.requestFocus();

                    }
                    valorPagamentoBaixarBoletoTextField.setEditable(true);
                    dataPagamentoBaixarBoleto.setEditable(true);
                    localPagamentoBaixarBoleto.setEnabled(true);
                    pagadorBaixarBoleto.setEnabled(true);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar Boleto selecionado na tabela!\n" + e.getMessage());
            }
        }

    }

    public void listarBaixarBoleto(
              JTable tabelaPassivos,
              JTextField empresaBaixarBoleto,
              JTextField servicoBaixarBoleto,
              JTextField valorBaixarBoletoTextField,
              JTextField dataVencimentoBaixarBoleto,
              JTextField parcelasPagarBaixarBoletoTextField,
              JTextField numeroParcelaBaixarBoleto,
              JTextField cicloPagamentoBaixarBoleto,
              JTextField formaPagamentoBaixarBoleto,
              JTextField valorPagamentoBaixarBoletoTextField,
              JTextField dataPagamentoBaixarBoleto,
              JComboBox localPagamentoBaixarBoleto,
              JComboBox pagadorBaixarBoleto,
              JComboBox parametroPesquisaBaixarBoleto,
              JTextField itemUmPesquisaBaixarBoleto,
              JTextField itemDoisPesquisaBaixarBoleto,
              JButton atualizarBaixarBoleto,
              JButton selecionarBaixarBoleto,
              JButton novaBusca,
              JButton imprimirBaixarBoleto,
              JButton confirmaPesquisaBaixarBoleto,
              JButton pesquisarPesquisaBaixarBoleto
    ) {

        Utilitario util = new Utilitario(conn);

        DefaultTableModel m = (DefaultTableModel) tabelaPassivos.getModel();

        while (tabelaPassivos.getRowCount() > 0) {
            m.removeRow(0);
        }

        setParametroPesquisa(parametroPesquisaBaixarBoleto.getSelectedItem().toString());
        setItemUmPesquisa(itemUmPesquisaBaixarBoleto.getText());
        setItemDoisPesquisa(itemDoisPesquisaBaixarBoleto.getText());

        String data1;
        String data2;

        String queryBancoDados;

        if ("Contas pagas".equals(getParametroPesquisa())) {
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE valorPagoBoleto > 0 "
                      + "ORDER BY codigoBoleto ASC";
        } else if ("Contas abertas".equals(getParametroPesquisa())) {
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE valorPagoBoleto = 0 "
                      + "ORDER BY codigoBoleto DESC";
        } else if ("Produto ou Serviço".equals(getParametroPesquisa())) {
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE servicoBoleto LIKE '%" + getItemUmPesquisa() + "%' "
                      + "ORDER BY codigoBoleto DESC";
        } else if ("Período".equals(getParametroPesquisa())) {
            data1 = util.converterDataBrasilAmericano(getItemUmPesquisa());
            data2 = util.converterDataBrasilAmericano(getItemDoisPesquisa());
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE vencimentoBoleto >= '" + data1 + "' "
                      + "AND vencimentoBoleto <= '" + data2 + "' "
                      + "ORDER BY codigoBoleto ASC";
        } else if ("Data".equals(getParametroPesquisa())) {
            data1 = util.converterDataBrasilAmericano(getItemUmPesquisa());
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE vencimentoBoleto = '" + data1 + "' "
                      + "ORDER BY codigoBoleto ASC";
        } else if ("Pagador".equals(getParametroPesquisa())) {
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE pagadorBoleto LIKE '%" + getItemUmPesquisa() + "%' "
                      + "ORDER BY codigoBoleto ASC";
        } else if ("Todos".equals(getParametroPesquisa())) {
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE empresaBoleto LIKE '%" + "" + "%' "
                      + "ORDER BY codigoBoleto ASC";
        } else {
            queryBancoDados = "SELECT * FROM Boleto "
                      + "WHERE empresaBoleto LIKE '%" + getParametroPesquisa() + "%' "
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

                    double valorPagarPassivos = rs.getDouble("valorPagarBoleto");
                    String valorPagarFormatado = util.converterCifraoAmericanoBrasil(valorPagarPassivos);

                    String data = util.converterDataAmericanoBrasil(rs.getString("vencimentoBoleto"));

                    m.addRow(new Object[]{rs.getString("empresaBoleto"),
                        rs.getString("servicoBoleto"),
                        data,
                        valorPagarFormatado,
                        rs.getString("numeroParcelasBoleto")
                    });
                }

            }

        } catch (SQLException e) {
            System.out.println("Error ao listar Boleto!" + e.getMessage());
        }

    }

    public void limparTabelaPassivos(JTable tabelaPassivos
    ) {

        ((DefaultTableModel) tabelaPassivos.getModel()).setRowCount(0);
    }

    public void bloquearCamposBaixarBoleto(
              JTable tabelaPassivos,
              JTextField empresaBaixarBoleto,
              JTextField servicoBaixarBoleto,
              JTextField valorBaixarBoletoTextField,
              JTextField dataVencimentoBaixarBoleto,
              JTextField parcelasPagarBaixarBoletoTextField,
              JTextField numeroParcelaBaixarBoleto,
              JTextField cicloPagamentoBaixarBoleto,
              JTextField formaPagamentoBaixarBoleto,
              JTextField valorPagamentoBaixarBoletoTextField,
              JTextField dataPagamentoBaixarBoleto,
              JComboBox localPagamentoBaixarBoleto,
              JComboBox pagadorBaixarBoleto,
              JComboBox parametroPesquisaBaixarBoleto,
              JTextField itemUmPesquisaBaixarBoleto,
              JTextField itemDoisPesquisaBaixarBoleto,
              JButton atualizarBaixarBoleto,
              JButton selecionarBaixarBoleto,
              JButton novaBusca,
              JButton imprimirBaixarBoleto,
              JButton confirmaPesquisaBaixarBoleto,
              JButton pesquisarPesquisaBaixarBoleto
    ) {
        empresaBaixarBoleto.setEditable(false);
        servicoBaixarBoleto.setEditable(false);
        valorBaixarBoletoTextField.setEditable(false);
        dataVencimentoBaixarBoleto.setEditable(false);
        parcelasPagarBaixarBoletoTextField.setEditable(false);
        numeroParcelaBaixarBoleto.setEditable(false);
        cicloPagamentoBaixarBoleto.setEditable(false);
        formaPagamentoBaixarBoleto.setEditable(false);
        valorPagamentoBaixarBoletoTextField.setEditable(false);
        dataPagamentoBaixarBoleto.setEditable(false);
        localPagamentoBaixarBoleto.setEnabled(false);
        pagadorBaixarBoleto.setEnabled(false);
    }

    public void liberarCamposBaixarBoleto(
              JTable tabelaPassivos,
              JTextField empresaBaixarBoleto,
              JTextField servicoBaixarBoleto,
              JTextField valorBaixarBoletoTextField,
              JTextField dataVencimentoBaixarBoleto,
              JTextField parcelasPagarBaixarBoletoTextField,
              JTextField numeroParcelaBaixarBoleto,
              JTextField cicloPagamentoBaixarBoleto,
              JTextField formaPagamentoBaixarBoleto,
              JTextField valorPagamentoBaixarBoletoTextField,
              JTextField dataPagamentoBaixarBoleto,
              JComboBox localPagamentoBaixarBoleto,
              JComboBox pagadorBaixarBoleto,
              JComboBox parametroPesquisaBaixarBoleto,
              JTextField itemUmPesquisaBaixarBoleto,
              JTextField itemDoisPesquisaBaixarBoleto,
              JButton atualizarBaixarBoleto,
              JButton selecionarBaixarBoleto,
              JButton novaBusca,
              JButton imprimirBaixarBoleto,
              JButton confirmaPesquisaBaixarBoleto,
              JButton pesquisarPesquisaBaixarBoleto
    ) {
        empresaBaixarBoleto.setEditable(true);
        servicoBaixarBoleto.setEditable(true);
        valorBaixarBoletoTextField.setEditable(true);
        dataVencimentoBaixarBoleto.setEditable(true);
        parcelasPagarBaixarBoletoTextField.setEditable(true);
        numeroParcelaBaixarBoleto.setEditable(true);
        cicloPagamentoBaixarBoleto.setEditable(true);
        formaPagamentoBaixarBoleto.setEditable(true);
        valorPagamentoBaixarBoletoTextField.setEditable(true);
        dataPagamentoBaixarBoleto.setEditable(true);
        localPagamentoBaixarBoleto.setEnabled(true);
        pagadorBaixarBoleto.setEnabled(true);
    }

//    public String somar(String pagar, String pago) {
//
//        Locale ptBr = new Locale("pt", "BR");
//
//        NumberFormat nf = NumberFormat.getCurrencyInstance(ptBr);
//        setValorpago(Double.parseDouble(pago));
//        setValorPagar(Double.parseDouble(pagar));
//
//        double somar = getValorPagar() + getValorpago();
//        String teste = "" + nf.format(somar);
//        return teste;
//    }
    public void preencherCombomBoxNomeEmpresa(JComboBox nomeEmpresa) throws SQLException {

        nomeEmpresa.removeAllItems();
        nomeEmpresa.addItem("***  Selecione  ***");
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

    public void limparBloquear(
              JTable tabelaPassivos,
              JTextField empresaBaixarBoleto,
              JTextField servicoBaixarBoleto,
              JTextField valorBaixarBoletoTextField,
              JTextField dataVencimentoBaixarBoleto,
              JTextField parcelasPagarBaixarBoletoTextField,
              JTextField numeroParcelaBaixarBoleto,
              JTextField cicloPagamentoBaixarBoleto,
              JTextField formaPagamentoBaixarBoleto,
              JTextField valorPagamentoBaixarBoletoTextField,
              JTextField dataPagamentoBaixarBoleto,
              JComboBox localPagamentoBaixarBoleto,
              JComboBox pagadorBaixarBoleto,
              JComboBox parametroPesquisaBaixarBoleto,
              JTextField itemUmPesquisaBaixarBoleto,
              JTextField itemDoisPesquisaBaixarBoleto,
              JButton atualizarBaixarBoleto,
              JButton selecionarBaixarBoleto,
              JButton novaBusca,
              JButton imprimirBaixarBoleto,
              JButton confirmaPesquisaBaixarBoleto,
              JButton pesquisarPesquisaBaixarBoleto
    ) {

        limparFormularioBaixarBoleto(
                  tabelaPassivos,
                  empresaBaixarBoleto,
                  servicoBaixarBoleto,
                  valorBaixarBoletoTextField,
                  dataVencimentoBaixarBoleto,
                  parcelasPagarBaixarBoletoTextField,
                  numeroParcelaBaixarBoleto,
                  cicloPagamentoBaixarBoleto,
                  formaPagamentoBaixarBoleto,
                  valorPagamentoBaixarBoletoTextField,
                  dataPagamentoBaixarBoleto,
                  localPagamentoBaixarBoleto,
                  pagadorBaixarBoleto,
                  parametroPesquisaBaixarBoleto,
                  itemUmPesquisaBaixarBoleto,
                  itemDoisPesquisaBaixarBoleto,
                  atualizarBaixarBoleto,
                  selecionarBaixarBoleto,
                  novaBusca,
                  imprimirBaixarBoleto,
                  confirmaPesquisaBaixarBoleto,
                  pesquisarPesquisaBaixarBoleto
        );

        bloquearCamposBaixarBoleto(
                  tabelaPassivos,
                  empresaBaixarBoleto,
                  servicoBaixarBoleto,
                  valorBaixarBoletoTextField,
                  dataVencimentoBaixarBoleto,
                  parcelasPagarBaixarBoletoTextField,
                  numeroParcelaBaixarBoleto,
                  cicloPagamentoBaixarBoleto,
                  formaPagamentoBaixarBoleto,
                  valorPagamentoBaixarBoletoTextField,
                  dataPagamentoBaixarBoleto,
                  localPagamentoBaixarBoleto,
                  pagadorBaixarBoleto,
                  parametroPesquisaBaixarBoleto,
                  itemUmPesquisaBaixarBoleto,
                  itemDoisPesquisaBaixarBoleto,
                  atualizarBaixarBoleto,
                  selecionarBaixarBoleto,
                  novaBusca,
                  imprimirBaixarBoleto,
                  confirmaPesquisaBaixarBoleto,
                  pesquisarPesquisaBaixarBoleto
        );

    }

}
