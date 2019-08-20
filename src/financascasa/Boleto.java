package financascasa;

//BIBLIOTECA UTILIZADAS NA CLASSE
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
//FIM DAS BIBLIOTECAS.

/**
 *
 * @author douglas borges egidio
 * @since 25/09/2018
 */
//INICIO DA CLASSE BOLETO.
public class Boleto {

    //CLASSE DE CONEXÃO COM BANCO DE DADOS.
    Connection conn;

    //INÍCIO DAS VARIÁVEIS DE INSTANCIA.
    private String empresaBoleto;
    private String servicoBoleto;
    private double valorPagarBoleto;
    private String vencimentoBoleto;
    private int parcelasBoleto;
    private String numeroParcelaBoleto;
    private String cicloPagamentoBoleto;
    private String formaPagamentoBoleto;
    //FIM DAS VARIÁVEIS DE INSTANCIA.

    //INÍCIO DO CONECTOR DA CLASSE BOLETO.
    public Boleto(Connection conn) {
        this.conn = conn;
    }//FIM DO CONECTOR.

    //INÍCIO DOS MÉTODOS GETTER E SETTER..
    public String getEmpresaBoleto() {
        return empresaBoleto;
    }

    public void setEmpresaBoleto(String empresaBoleto) {
        this.empresaBoleto = empresaBoleto;
    }

    public String getServicoBoleto() {
        return servicoBoleto;
    }

    public void setServicoBoleto(String servicoBoleto) {
        this.servicoBoleto = servicoBoleto;
    }

    public double getValorPagarBoleto() {
        return valorPagarBoleto;
    }

    public void setValorPagarBoleto(double valorPagarBoleto) {
        this.valorPagarBoleto = valorPagarBoleto;
    }

    public String getVencimentoBoleto() {
        return vencimentoBoleto;
    }

    public void setVencimentoBoleto(String vencimentoBoleto) {
        this.vencimentoBoleto = vencimentoBoleto;
    }

    public int getParcelasBoleto() {
        return parcelasBoleto;
    }

    public void setParcelasBoleto(int parcelasBoleto) {
        this.parcelasBoleto = parcelasBoleto;
    }

    public String getNumeroParcelaBoleto() {
        return numeroParcelaBoleto;
    }

    public void setNumeroParcelaBoleto(String numeroParcelaBoleto) {
        this.numeroParcelaBoleto = numeroParcelaBoleto;
    }

    public String getCicloPagamentoBoleto() {
        return cicloPagamentoBoleto;
    }

    public void setCicloPagamentoBoleto(String cicloPagamentoBoleto) {
        this.cicloPagamentoBoleto = cicloPagamentoBoleto;
    }

    public String getFormaPagamentoBoleto() {
        return formaPagamentoBoleto;
    }

    public void setFormaPagamentoBoleto(String formaPagamentoBoleto) {
        this.formaPagamentoBoleto = formaPagamentoBoleto;
    }
    //FIM DOS MÉTODOS GETTER E SETTER.

    //INICIO DO MÉTODO QUE REALIZA CADASTRO DE BOLETO.
    public void cadastrarBoleto(
              //PARAMETROS DO MÉTODO CADASTRARBOLETO().
              JTable tabelaBoleto,
              JComboBox empresaBoleto,
              JComboBox servicoBoleto,
              JTextField valorPagarBoleto,
              JTextField vencimentoBoleto,
              JTextField parcelasBoleto,
              JTextField numeroParcelaBoleto,
              JComboBox cicloPagamentoBoleto,
              JComboBox formaPagamentoBoleto,
              JButton cadastrarBoleto,
              JButton atualizarBoleto,
              JButton excluirBoleto,
              JButton selecionarBoleto,
              JButton novoCadastroBoleto,
              JButton listarBoleto,
              JButton imprimirBoleto//FIM DOS PARÂMETROS.
    ) {

        //CRIAÇÃO INSTANCIA DO OBJETO UTIL.
        Utilitario util = new Utilitario(conn);

        setEmpresaBoleto(empresaBoleto.getSelectedItem().toString());
        setServicoBoleto(servicoBoleto.getSelectedItem().toString());

        String pagarBoleto = valorPagarBoleto.getText();//Valor não formatado
        setValorPagarBoleto(Double.parseDouble(util.converterCifraoBrasiloAmericano(pagarBoleto)));//Valor formatado

        String dataVencimento = vencimentoBoleto.getText();//Data não formatada                

        setParcelasBoleto(Integer.parseInt(parcelasBoleto.getText()));
        setCicloPagamentoBoleto(cicloPagamentoBoleto.getSelectedItem().toString());
        setFormaPagamentoBoleto(formaPagamentoBoleto.getSelectedItem().toString());

        if (!getEmpresaBoleto().equals("***  Selecione  ***")
                  && !getServicoBoleto().equals("***  Selecione  ***")
                  && !pagarBoleto.equals("R$ 0")
                  && !dataVencimento.equals("  -  -    ")
                  && getParcelasBoleto() != 0
                  && !getCicloPagamentoBoleto().equals("***  Selecione  ***")
                  && !getFormaPagamentoBoleto().equals("***  Selecione  ***")) {

            //Método realiza o cadastro de boletos de acordo com a quantidade de parcelas,
            //gerando cada boleto com datas mensais automaticamente.
            int contador = 1;
            int diaVencimento = Integer.parseInt((String) dataVencimento.subSequence(0, 2));
            int mesVencimento = Integer.parseInt((String) dataVencimento.subSequence(3, 5));
            int anoVencimento = Integer.parseInt((String) dataVencimento.subSequence(6, 10));
            String data;

            while (contador <= getParcelasBoleto()) {

                if (mesVencimento > 12) {
                    mesVencimento = 1;
                    anoVencimento++;

                    String diaVencimentoTeste;
                    String mesVencimentoTeste;

                    if (diaVencimento <= 9) {
                        diaVencimentoTeste = "0" + diaVencimento;
                    } else {
                        diaVencimentoTeste = "" + diaVencimento;
                    }
                    if (mesVencimento <= 9) {
                        mesVencimentoTeste = "0" + mesVencimento;
                    } else {
                        mesVencimentoTeste = "" + mesVencimento;
                    }
                    data = anoVencimento + "/" + mesVencimentoTeste + "/" + diaVencimentoTeste;
                } else {
                    String diaVencimentoTeste;
                    String mesVencimentoTeste;
                    if (diaVencimento <= 9) {
                        diaVencimentoTeste = "0" + diaVencimento;
                    } else {
                        diaVencimentoTeste = "" + diaVencimento;
                    }
                    if (mesVencimento <= 9) {
                        mesVencimentoTeste = "0" + mesVencimento;
                    } else {
                        mesVencimentoTeste = "" + mesVencimento;
                    }
                    data = anoVencimento + "/" + mesVencimentoTeste + "/" + diaVencimentoTeste;
                }

                mesVencimento++;
                //Fim do método que gera os boletos automaticamente. 

                try (PreparedStatement pstm = conn.prepareStatement("INSERT INTO Boleto "
                          + "VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?)")) {

                    pstm.setString(1, getEmpresaBoleto());
                    pstm.setString(2, getServicoBoleto());
                    pstm.setDouble(3, getValorPagarBoleto());
                    pstm.setString(4, data);
                    pstm.setInt(5, getParcelasBoleto());
                    pstm.setString(6, contador + "/" + getParcelasBoleto());
                    pstm.setString(7, getCicloPagamentoBoleto());
                    pstm.setString(8, getFormaPagamentoBoleto());
                    pstm.setString(9, "2000-01-01");
                    pstm.setString(10, "0.0");
                    pstm.setString(11, "");
                    pstm.setString(12, "");
                    contador++;

                    pstm.executeUpdate();
                    pstm.close();

                }// FIM DO TRY
                catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar Boleto. " + e.getMessage());
                }//FIM DO CATCH
            }//FIM do WHILE

            JOptionPane.showMessageDialog(null, "O Boleto da " + getEmpresaBoleto()
                      + " com data de vencimento para " + dataVencimento + " foi cadastrada com sucesso!");

            limparBloquear(
                      tabelaBoleto,
                      empresaBoleto,
                      servicoBoleto,
                      valorPagarBoleto,
                      vencimentoBoleto,
                      parcelasBoleto,
                      numeroParcelaBoleto,
                      cicloPagamentoBoleto,
                      formaPagamentoBoleto,
                      cadastrarBoleto,
                      atualizarBoleto,
                      excluirBoleto,
                      selecionarBoleto,
                      novoCadastroBoleto,
                      listarBoleto,
                      imprimirBoleto
            );

            novoCadastroBoleto.requestFocus();

        }//FIM DO IF.
        else {
            JOptionPane.showMessageDialog(null, "Confira o Formulário!\nTodos os campos devem ser preenchidos!");
            empresaBoleto.requestFocus();
        }//FIM DO ELSE

    }//FIM DO MÉTODO DE CADASTRO.

    public void excluirBoleto(
              JTable tabelaBoleto,
              JComboBox empresaBoleto,
              JComboBox servicoBoleto,
              JTextField valorPagarBoleto,
              JTextField vencimentoBoleto,
              JTextField parcelasBoleto,
              JTextField numeroParcelaBoleto,
              JComboBox cicloPagamentoBoleto,
              JComboBox formaPagamentoBoleto,
              JButton cadastrarBoleto,
              JButton atualizarBoleto,
              JButton excluirBoleto,
              JButton selecionarBoleto,
              JButton novoCadastroBoleto,
              JButton listarBoleto,
              JButton imprimirBoleto
    ) {
        Utilitario util = new Utilitario(conn);

        setEmpresaBoleto(empresaBoleto.getSelectedItem().toString());
        String dataVencimento = vencimentoBoleto.getText();//Data sem formatação.
        setVencimentoBoleto(util.converterDataBrasilAmericano(dataVencimento));//Data com formato Americano.

        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir o Boleto da" + getEmpresaBoleto()
                  + " com data de vencimento para " + dataVencimento + "?",
                  "Controle de Finanças - Cadastro de Boletos", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            try {
                try (PreparedStatement pstm = conn.prepareStatement("DELETE FROM Boleto "
                          + "WHERE empresaBoleto = '" + getEmpresaBoleto() + "' "
                          + "AND vencimentoBoleto = '" + getVencimentoBoleto() + "'")) {
                    pstm.executeUpdate();
                    JOptionPane.showMessageDialog(null, "O Boleto da " + getEmpresaBoleto()
                              + " com data de vencimento para " + dataVencimento + " foi excluída com sucesso!");

                    limparBloquear(
                              tabelaBoleto,
                              empresaBoleto,
                              servicoBoleto,
                              valorPagarBoleto,
                              vencimentoBoleto,
                              parcelasBoleto,
                              numeroParcelaBoleto,
                              cicloPagamentoBoleto,
                              formaPagamentoBoleto,
                              cadastrarBoleto,
                              atualizarBoleto,
                              excluirBoleto,
                              selecionarBoleto,
                              novoCadastroBoleto,
                              listarBoleto,
                              imprimirBoleto
                    );

                    novoCadastroBoleto.requestFocus();

                }
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir Boleto!!\n" + e.getMessage());
            }
        }
    }

    public void atualizarBoleto(
              JTable tabelaBoleto,
              JComboBox empresaBoleto,
              JComboBox servicoBoleto,
              JTextField valorPagarBoleto,
              JTextField vencimentoBoleto,
              JTextField parcelasBoleto,
              JTextField numeroParcelaBoleto,
              JComboBox cicloPagamentoBoleto,
              JComboBox formaPagamentoBoleto,
              JButton cadastrarBoleto,
              JButton atualizarBoleto,
              JButton excluirBoleto,
              JButton selecionarBoleto,
              JButton novoCadastroBoleto,
              JButton listarBoleto,
              JButton imprimirBoleto
    ) {
        Utilitario util = new Utilitario(conn);

        setEmpresaBoleto(empresaBoleto.getSelectedItem().toString());
        setServicoBoleto(servicoBoleto.getSelectedItem().toString());

        String pagarBoleto = valorPagarBoleto.getText();//Valor não formatado
        setValorPagarBoleto(Double.parseDouble(util.converterCifraoBrasiloAmericano(pagarBoleto)));//Valor formatado

        String dataVencimento = vencimentoBoleto.getText();//Data não formatada                
        setVencimentoBoleto(util.converterDataBrasilAmericano(dataVencimento));//data formatada

        setParcelasBoleto(Integer.parseInt(parcelasBoleto.getText()));
        setCicloPagamentoBoleto(cicloPagamentoBoleto.getSelectedItem().toString());
        setFormaPagamentoBoleto(formaPagamentoBoleto.getSelectedItem().toString());

        if (!getEmpresaBoleto().equals("***  Selecione  ***")
                  && !getServicoBoleto().equals("***  Selecione  ***")
                  && !pagarBoleto.equals("R$ ")
                  && !dataVencimento.equals("  -  -    ")
                  && getParcelasBoleto() != 0
                  && !getCicloPagamentoBoleto().equals("***  Selecione  ***")
                  && !getFormaPagamentoBoleto().equals("***  Selecione  ***")) {

            try {

                try (PreparedStatement pstm = conn.prepareStatement("UPDATE Boleto SET "
                          + "servicoBoleto = '" + getServicoBoleto() + "',"
                          + "valorPagarBoleto = '" + getValorPagarBoleto() + "',"
                          + "cicloBoleto = '" + getCicloPagamentoBoleto() + "',"
                          + "formaPagamentoBoleto = '" + getFormaPagamentoBoleto() + "' "
                          + "WHERE empresaBoleto LIKE '" + getEmpresaBoleto() + "' "
                          + "AND vencimentoBoleto LIKE '" + getVencimentoBoleto() + "'")) {

                    limparBloquear(
                              tabelaBoleto,
                              empresaBoleto,
                              servicoBoleto,
                              valorPagarBoleto,
                              vencimentoBoleto,
                              parcelasBoleto,
                              numeroParcelaBoleto,
                              cicloPagamentoBoleto,
                              formaPagamentoBoleto,
                              cadastrarBoleto,
                              atualizarBoleto,
                              excluirBoleto,
                              selecionarBoleto,
                              novoCadastroBoleto,
                              listarBoleto,
                              imprimirBoleto
                    );

                    pstm.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Boleto atualizado com sucesso!");
                }

            } catch (SQLException | HeadlessException e) {
                System.out.println("Erro ao Alterar Boleto!\n" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem estar preenchidos!");
        }
    }

    public void imprimirBoleto() {

    }

    public void limparFormularioBoleto(
              JTable tabelaBoleto,
              JComboBox empresaBoleto,
              JComboBox servicoBoleto,
              JTextField valorPagarBoleto,
              JTextField vencimentoBoleto,
              JTextField parcelasBoleto,
              JTextField numeroParcelaBoleto,
              JComboBox cicloPagamentoBoleto,
              JComboBox formaPagamentoBoleto,
              JButton cadastrarBoleto,
              JButton atualizarBoleto,
              JButton excluirBoleto,
              JButton selecionarBoleto,
              JButton novoCadastroBoleto,
              JButton listarBoleto,
              JButton imprimirBoleto
    ) {
        empresaBoleto.setSelectedItem("***  Selecione  ***");
        servicoBoleto.setSelectedItem("***  Selecione  ***");
        valorPagarBoleto.setText("R$ 0");
        vencimentoBoleto.setText(null);
        parcelasBoleto.setText("" + 0);
        numeroParcelaBoleto.setText(null);
        cicloPagamentoBoleto.setSelectedItem("***  Selecione  ***");
        formaPagamentoBoleto.setSelectedItem("***  Selecione  ***");
    }

    public void pegarDadosTabelaBoleto(
              JTable tabelaBoleto,
              JComboBox empresaBoleto,
              JComboBox servicoBoleto,
              JTextField valorPagarBoleto,
              JTextField vencimentoBoleto,
              JTextField parcelasBoleto,
              JTextField numeroParcelaBoleto,
              JComboBox cicloPagamentoBoleto,
              JComboBox formaPagamentoBoleto,
              JButton cadastrarBoleto,
              JButton atualizarBoleto,
              JButton excluirBoleto,
              JButton selecionarBoleto,
              JButton novoCadastroBoleto,
              JButton listarBoleto,
              JButton imprimirBoleto
    ) {

        Utilitario util = new Utilitario(conn);

        if (tabelaBoleto.getSelectedRowCount() == 1) {

            String nomeEmpresa = (tabelaBoleto.getValueAt(tabelaBoleto.getSelectedRow(), 0).toString());
            String dataVencimento = (tabelaBoleto.getValueAt(tabelaBoleto.getSelectedRow(), 2).toString());
            String dataPesquisa = util.converterDataBrasilAmericano(dataVencimento);

            try {
                Statement stmt = conn.createStatement();
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM  Boleto "
                          + "WHERE empresaBoleto LIKE '" + nomeEmpresa + "' "
                          + "AND vencimentoBoleto = '" + dataPesquisa + "'")) {
                    while (rs.next()) {
                        empresaBoleto.setSelectedItem(rs.getString("empresaBoleto"));
                        servicoBoleto.setSelectedItem(rs.getString("servicoBoleto"));

                        double valor = rs.getDouble("valorPagarBoleto");//valor original sem conversão
                        String valorPagar = util.converterCifraoAmericanoBrasil(valor);//valor convertido.
                        valorPagarBoleto.setText(valorPagar);

                        String datavencimento = rs.getString("vencimentoBoleto");
                        String data = util.converterDataAmericanoBrasil(datavencimento);

                        vencimentoBoleto.setText(data);
                        parcelasBoleto.setText(rs.getString("parcelasBoleto"));
                        cicloPagamentoBoleto.setSelectedItem(rs.getString("cicloBoleto"));
                        formaPagamentoBoleto.setSelectedItem(rs.getString("formaPagamentoBoleto"));
                        numeroParcelaBoleto.setText(rs.getString("numeroParcelasBoleto"));
                    }
                }

                empresaBoleto.setEnabled(false);
                vencimentoBoleto.setEditable(false);
                parcelasBoleto.setEditable(false);
                numeroParcelaBoleto.setEditable(false);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar Boleto selecionado na tabela!\n" + e.getMessage());
            }
        }
    }

    public void listarBoleto(JTable tabelaPassivos) {

        Utilitario util = new Utilitario(conn);

        DefaultTableModel m = (DefaultTableModel) tabelaPassivos.getModel();

        while (tabelaPassivos.getRowCount() > 0) {
            m.removeRow(0);
        }

        try {
            Statement stmt = conn.createStatement();
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM Boleto ORDER BY codigoBoleto ASC")) {

                while (rs.next()) {

                    double valorPagarPassivos = rs.getDouble("valorPagarBoleto");
                    String valorPagarFormatado = util.converterCifraoAmericanoBrasil(valorPagarPassivos);

                    String datavencimento = rs.getString("vencimentoBoleto");
                    String data = util.converterDataAmericanoBrasil(datavencimento);

                    m.addRow(new Object[]{rs.getString("empresaBoleto"),
                        rs.getString("servicoBoleto"),
                        data,
                        valorPagarFormatado,
                        rs.getString("numeroParcelasBoleto")
                    });
                }
            }
        } catch (SQLException e) {
            System.out.println("Error ao listar Passivos!" + e.getMessage());
        }
    }

    public void limparTabelaBoleto(JTable tabelaBoleto) {

        ((DefaultTableModel) tabelaBoleto.getModel()).setRowCount(0);
    }

    public void bloquearFormularioBoleto(
              JTable tabelaBoleto,
              JComboBox empresaBoleto,
              JComboBox servicoBoleto,
              JTextField valorPagarBoleto,
              JTextField vencimentoBoleto,
              JTextField parcelasBoleto,
              JTextField numeroParcelaBoleto,
              JComboBox cicloPagamentoBoleto,
              JComboBox formaPagamentoBoleto,
              JButton cadastrarBoleto,
              JButton atualizarBoleto,
              JButton excluirBoleto,
              JButton selecionarBoleto,
              JButton novoCadastroBoleto,
              JButton listarBoleto,
              JButton imprimirBoleto
    ) {
        empresaBoleto.setEnabled(false);
        servicoBoleto.setEnabled(false);
        valorPagarBoleto.setEditable(false);
        vencimentoBoleto.setEditable(false);
        parcelasBoleto.setEditable(false);
        numeroParcelaBoleto.setEditable(false);
        cicloPagamentoBoleto.setEnabled(false);
        formaPagamentoBoleto.setEnabled(false);
        cadastrarBoleto.setEnabled(false);
        atualizarBoleto.setEnabled(false);
        excluirBoleto.setEnabled(false);
        imprimirBoleto.setEnabled(false);
        selecionarBoleto.setEnabled(false);
    }

    public void liberarFormularioBoleto(
              JTable tabelaBoleto,
              JComboBox empresaBoleto,
              JComboBox servicoBoleto,
              JTextField valorPagarBoleto,
              JTextField vencimentoBoleto,
              JTextField parcelasBoleto,
              JTextField numeroParcelaBoleto,
              JComboBox cicloPagamentoBoleto,
              JComboBox formaPagamentoBoleto,
              JButton cadastrarBoleto,
              JButton atualizarBoleto,
              JButton excluirBoleto,
              JButton selecionarBoleto,
              JButton novoCadastroBoleto,
              JButton listarBoleto,
              JButton imprimirBoleto
    ) {
        empresaBoleto.setEnabled(true);
        servicoBoleto.setEnabled(true);
        valorPagarBoleto.setEditable(true);
        vencimentoBoleto.setEditable(true);
        parcelasBoleto.setEditable(true);
        numeroParcelaBoleto.setEditable(false);
        cicloPagamentoBoleto.setEnabled(true);
        formaPagamentoBoleto.setEnabled(true);

    }

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

    public void limparBloquear(
              JTable tabelaBoleto,
              JComboBox empresaBoleto,
              JComboBox servicoBoleto,
              JTextField valorPagarBoleto,
              JTextField vencimentoBoleto,
              JTextField parcelasBoleto,
              JTextField numeroParcelaBoleto,
              JComboBox cicloPagamentoBoleto,
              JComboBox formaPagamentoBoleto,
              JButton cadastrarBoleto,
              JButton atualizarBoleto,
              JButton excluirBoleto,
              JButton selecionarBoleto,
              JButton novoCadastroBoleto,
              JButton listarBoleto,
              JButton imprimirBoleto
    ) {

        limparFormularioBoleto(
                  tabelaBoleto,
                  empresaBoleto,
                  servicoBoleto,
                  valorPagarBoleto,
                  vencimentoBoleto,
                  parcelasBoleto,
                  numeroParcelaBoleto,
                  cicloPagamentoBoleto,
                  formaPagamentoBoleto,
                  cadastrarBoleto,
                  atualizarBoleto,
                  excluirBoleto,
                  selecionarBoleto,
                  novoCadastroBoleto,
                  listarBoleto,
                  imprimirBoleto
        );

        bloquearFormularioBoleto(
                  tabelaBoleto,
                  empresaBoleto,
                  servicoBoleto,
                  valorPagarBoleto,
                  vencimentoBoleto,
                  parcelasBoleto,
                  numeroParcelaBoleto,
                  cicloPagamentoBoleto,
                  formaPagamentoBoleto,
                  cadastrarBoleto,
                  atualizarBoleto,
                  excluirBoleto,
                  selecionarBoleto,
                  novoCadastroBoleto,
                  listarBoleto,
                  imprimirBoleto
        );

    }

}
