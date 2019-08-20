package financascasa;

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

/**
 *
 * @author douglas borges egidio
 * @since 25/09/2018
 */
public class Salario {

    Connection conn;

    //Variáveis de instancia
    private String empresaSalario;
    private double valorSalario = 0;
    private String dataRecebimentoSalario;
    private String cicloRecebimentoSalario;
    //Fim das Variáveis de instancia.

    //Inicio conector.
    public Salario(Connection conn) {
        this.conn = conn;
    }//fim conector. 

    //Inicio dos método Getter e setter.
    public String getEmpresaSalario() {
        return empresaSalario;
    }

    public void setEmpresaSalario(String empresaSalario) {
        this.empresaSalario = empresaSalario;
    }

    public double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public String getDataRecebimentoSalario() {
        return dataRecebimentoSalario;
    }

    public void setDataRecebimentoSalario(String dataRecebimentoSalario) {
        this.dataRecebimentoSalario = dataRecebimentoSalario;
    }

    public String getCicloRecebimentoSalario() {
        return cicloRecebimentoSalario;
    }

    public void setCicloRecebimentoSalario(String cicloRecebimentoSalario) {
        this.cicloRecebimentoSalario = cicloRecebimentoSalario;
    }
    //Fim dos Métodos Getter e Setter.

    //Inicio dos método de implemento.
    public void cadastrarSalario(
              JTable tabelaSalario,
              JComboBox empresaSalario,
              JTextField valorSalario,
              JTextField dataRecebimentoSalario,
              JComboBox cicloRecebimentoSalario,
              JButton cadastrarSalarioBotao,
              JButton atualizarSalarioBotao,
              JButton excluirSalarioBotao,
              JButton imprimirSalarioBotao,
              JButton selecionarSalarioBotao,
              JButton novoCadastroSalarioBotao,
              JButton listarSalarioBotao,
              JButton voltarCadastroBotao
    ) {
        Utilitario util = new Utilitario(conn);

        setEmpresaSalario(empresaSalario.getSelectedItem().toString());

        String salario = valorSalario.getText();
        setValorSalario(Double.parseDouble(util.converterCifraoBrasiloAmericano(salario)));

        String dataSalario = dataRecebimentoSalario.getText();
        if(!"  -  -    ".equals(dataSalario)){
        setDataRecebimentoSalario(util.converterDataBrasilAmericano(dataSalario));
        }else{
            setDataRecebimentoSalario(null);
        }
        
        setCicloRecebimentoSalario(cicloRecebimentoSalario.getSelectedItem().toString());
        
        
        if (!getEmpresaSalario().equals("***  Selecione  ***")
                  && !salario.equals("R$ 0")
                  && !dataSalario.equals(null)
                  && !getCicloRecebimentoSalario().equals("***  Selecione  ***")) {

            try (PreparedStatement pstm = conn.prepareStatement("INSERT INTO Salario "
                      + "VALUES(null,?,?,?,?)")) {
                pstm.setString(1, getEmpresaSalario());
                pstm.setDouble(2, getValorSalario());
                pstm.setString(3, getDataRecebimentoSalario());
                pstm.setString(4, getCicloRecebimentoSalario());

                pstm.executeUpdate();
                pstm.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar Salário. " + e.getMessage());
            }

            JOptionPane.showMessageDialog(null, "O Salário do dia " + dataSalario + ",\n"
                      + "do(a)" + getEmpresaSalario() + " foi cadastrada com sucesso!");

            limparBloquear(
                      tabelaSalario,
                      empresaSalario,
                      valorSalario,
                      dataRecebimentoSalario,
                      cicloRecebimentoSalario,
                      cadastrarSalarioBotao,
                      atualizarSalarioBotao,
                      excluirSalarioBotao,
                      imprimirSalarioBotao,
                      selecionarSalarioBotao,
                      novoCadastroSalarioBotao,
                      listarSalarioBotao,
                      voltarCadastroBotao
            );

            novoCadastroSalarioBotao.requestFocus();

        }//FIM DO IF
        else {
            JOptionPane.showMessageDialog(null, "Confira o Formulário!\nTodos os campos "
                      + "devem ser preenchidos!");
            empresaSalario.requestFocus();
        }//FIM DO ELSE

    }//FIM DO MÈTODO CADASTRO

    public void excluirSalario(
              JTable tabelaSalario,
              JComboBox empresaSalario,
              JTextField valorSalario,
              JTextField dataRecebimentoSalario,
              JComboBox cicloRecebimentoSalario,
              JButton cadastrarSalarioBotao,
              JButton atualizarSalarioBotao,
              JButton excluirSalarioBotao,
              JButton imprimirSalarioBotao,
              JButton selecionarSalarioBotao,
              JButton novoCadastroSalarioBotao,
              JButton listarSalarioBotao,
              JButton voltarCadastroBotao
    ) {

        Utilitario util = new Utilitario(conn);
        
        setEmpresaSalario(empresaSalario.getSelectedItem().toString());
        
        String dataRecebimento = dataRecebimentoSalario.getText();
        setDataRecebimentoSalario(util.converterDataBrasilAmericano(dataRecebimento));
        
        String salario = valorSalario.getText();

        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja "
                  + "excluir o Salário da mês de " + dataRecebimento + ",\nno valor de " + salario + " ?",
                  "Controle de Finanças - Cadastro de Salário", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try {
                try (PreparedStatement pstm = conn.prepareStatement("DELETE FROM Salario "
                          + "WHERE empresaSalario = '" + getEmpresaSalario() + "' "
                          + "AND dataRecebimentoSalario = '" + getDataRecebimentoSalario() + "'")) {

                    JOptionPane.showMessageDialog(null, "O Salário da empresa " + getEmpresaSalario()
                              + " com data de " + dataRecebimento + " foi excluída com sucesso!");
                    pstm.executeUpdate();

                    limparBloquear(
                              tabelaSalario,
                              empresaSalario,
                              valorSalario,
                              dataRecebimentoSalario,
                              cicloRecebimentoSalario,
                              cadastrarSalarioBotao,
                              atualizarSalarioBotao,
                              excluirSalarioBotao,
                              imprimirSalarioBotao,
                              selecionarSalarioBotao,
                              novoCadastroSalarioBotao,
                              listarSalarioBotao,
                              voltarCadastroBotao
                    );

                    novoCadastroSalarioBotao.requestFocus();

                }
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir Salário!!\n" + e.getMessage());
            }
        }
    }

    public void atualizarSalario(
              JTable tabelaSalario,
              JComboBox empresaSalario,
              JTextField valorSalario,
              JTextField dataRecebimentoSalario,
              JComboBox cicloRecebimentoSalario,
              JButton cadastrarSalarioBotao,
              JButton atualizarSalarioBotao,
              JButton excluirSalarioBotao,
              JButton imprimirSalarioBotao,
              JButton selecionarSalarioBotao,
              JButton novoCadastroSalarioBotao,
              JButton listarSalarioBotao,
              JButton voltarCadastroBotao
    ) {

        Utilitario util = new Utilitario(conn);

        setEmpresaSalario(empresaSalario.getSelectedItem().toString());

        String salario = valorSalario.getText();
        setValorSalario(Double.parseDouble(util.converterCifraoBrasiloAmericano(salario)));

        String dataSalario = dataRecebimentoSalario.getText();
        setDataRecebimentoSalario(util.converterDataBrasilAmericano(dataSalario));

        setCicloRecebimentoSalario(cicloRecebimentoSalario.getSelectedItem().toString());

        try {
            try (PreparedStatement pstm = conn.prepareStatement("UPDATE Salario "
                      + "SET valorSalario = '" + getValorSalario() + "',"
                      + "cicloRecebimentoSalario = '" + getCicloRecebimentoSalario() + "' "
                      + "WHERE empresaSalario LIKE '" + getEmpresaSalario() + "' "
                      + "AND dataRecebimentoSalario LIKE '" + getDataRecebimentoSalario() + "'")) {

                limparBloquear(
                          tabelaSalario,
                          empresaSalario,
                          valorSalario,
                          dataRecebimentoSalario,
                          cicloRecebimentoSalario,
                          cadastrarSalarioBotao,
                          atualizarSalarioBotao,
                          excluirSalarioBotao,
                          imprimirSalarioBotao,
                          selecionarSalarioBotao,
                          novoCadastroSalarioBotao,
                          listarSalarioBotao,
                          voltarCadastroBotao
                );
                
                novoCadastroSalarioBotao.requestFocus();

                pstm.executeUpdate();
            }

            JOptionPane.showMessageDialog(null, "Salário atualizado com sucesso!");

        } catch (SQLException | HeadlessException e) {
            System.out.println("Erro ao Alterar Salário!\n" + e.getMessage());
        }
    }

    public void novoCadastroSalario() {
    }

    public void imprimirSalario() {
    }

    public void limparFormularioSalario(
              JTable tabelaSalario,
              JComboBox empresaSalario,
              JTextField valorSalario,
              JTextField dataRecebimentoSalario,
              JComboBox cicloRecebimentoSalario,
              JButton cadastrarSalarioBotao,
              JButton atualizarSalarioBotao,
              JButton excluirSalarioBotao,
              JButton imprimirSalarioBotao,
              JButton selecionarSalarioBotao,
              JButton novoCadastroSalarioBotao,
              JButton listarSalarioBotao,
              JButton voltarCadastroBotao
    ) {
        empresaSalario.setSelectedItem("***  Selecione  ***");
        valorSalario.setText("R$ 0");
        dataRecebimentoSalario.setText(null);
        cicloRecebimentoSalario.setSelectedItem("***  Selecione  ***");
    }

    public void pegarDadosTabelaSalario(
              JTable tabelaSalario,
              JComboBox empresaSalario,
              JTextField valorSalario,
              JTextField dataRecebimentoSalario,
              JComboBox cicloRecebimentoSalario,
              JButton cadastrarSalarioBotao,
              JButton atualizarSalarioBotao,
              JButton excluirSalarioBotao,
              JButton imprimirSalarioBotao,
              JButton selecionarSalarioBotao,
              JButton novoCadastroSalarioBotao,
              JButton listarSalarioBotao,
              JButton voltarCadastroBotao
    ) {

        Utilitario util = new Utilitario(conn);

        if (tabelaSalario.getSelectedRowCount() == 1) {

            String empresa = tabelaSalario.getValueAt(tabelaSalario.getSelectedRow(), 0).toString();
            String data = tabelaSalario.getValueAt(tabelaSalario.getSelectedRow(), 2).toString();
            String dataBuscaTabela = util.converterDataBrasilAmericano(data);

            try {
                Statement stmt = conn.createStatement();
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM Salario "
                          + "WHERE empresaSalario = '" + empresa + "' "
                          + "AND dataRecebimentoSalario = '" + dataBuscaTabela + "' ")) {
                    while (rs.next()) {

                        empresaSalario.setSelectedItem(rs.getString("empresaSalario"));

                        double salario = rs.getDouble("valorSalario");
                        String salarioRecebido = util.converterCifraoAmericanoBrasil(salario);
                        valorSalario.setText(salarioRecebido);

                        setDataRecebimentoSalario(util.converterDataAmericanoBrasil(rs.getString("dataRecebimentoSalario")));
                        dataRecebimentoSalario.setText(getDataRecebimentoSalario());

                        cicloRecebimentoSalario.setSelectedItem(rs.getString("cicloRecebimentoSalario"));

                    }
                }

                empresaSalario.setEnabled(false);
                dataRecebimentoSalario.setEditable(false);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar Salário"
                          + " selecionado na tabela!\n" + e.getMessage());
            }
        }
    }

    public void listarSalario(JTable tabelaAtivos){

        Utilitario util = new Utilitario(conn);

        DefaultTableModel m = (DefaultTableModel) tabelaAtivos.getModel();

        while (tabelaAtivos.getRowCount() > 0) {
            m.removeRow(0);
        }

        try {
            Statement stmt = conn.createStatement();
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM Salario "
                      + "ORDER BY dataRecebimentoSalario DESC")) {

                while (rs.next()) {

                    double valor = rs.getDouble("valorSalario");
                    String salario = util.converterCifraoAmericanoBrasil(valor);
                    
                    setDataRecebimentoSalario(util.converterDataAmericanoBrasil(rs.getString("dataRecebimentoSalario")));

                    m.addRow(new Object[]{
                        rs.getString("empresaSalario"),
                        salario,
                        getDataRecebimentoSalario()
                    });
                }

            }
        } catch (SQLException e) {
            System.out.println("Error ao listar Salário!" + e.getMessage());
        }
    }

    public void limparTabelaSalario(JTable tabelaEmpresa) {

        ((DefaultTableModel) tabelaEmpresa.getModel()).setRowCount(0);
    }

    public void bloquearCamposSalario(
              JTable tabelaSalario,
              JComboBox empresaSalario,
              JTextField valorSalario,
              JTextField dataRecebimentoSalario,
              JComboBox cicloRecebimentoSalario,
              JButton cadastrarSalarioBotao,
              JButton atualizarSalarioBotao,
              JButton excluirSalarioBotao,
              JButton imprimirSalarioBotao,
              JButton selecionarSalarioBotao,
              JButton novoCadastroSalarioBotao,
              JButton listarSalarioBotao,
              JButton voltarCadastroBotao
    ) {

        empresaSalario.setEnabled(false);
        valorSalario.setEditable(false);
        dataRecebimentoSalario.setEditable(false);
        cicloRecebimentoSalario.setEnabled(false);
        cadastrarSalarioBotao.setEnabled(false);
        atualizarSalarioBotao.setEnabled(false);
        excluirSalarioBotao.setEnabled(false);
        imprimirSalarioBotao.setEnabled(false);
        selecionarSalarioBotao.setEnabled(false);
    }

    public void liberarCamposSalario(
              JTable tabelaSalario,
              JComboBox empresaSalario,
              JTextField valorSalario,
              JTextField dataRecebimentoSalario,
              JComboBox cicloRecebimentoSalario,
              JButton cadastrarSalarioBotao,
              JButton atualizarSalarioBotao,
              JButton excluirSalarioBotao,
              JButton imprimirSalarioBotao,
              JButton selecionarSalarioBotao,
              JButton novoCadastroSalarioBotao,
              JButton listarSalarioBotao,
              JButton voltarCadastroBotao
    ) {

        empresaSalario.setEnabled(true);
        valorSalario.setEditable(true);
        dataRecebimentoSalario.setEditable(true);
        cicloRecebimentoSalario.setEnabled(true);

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
            JOptionPane.showMessageDialog(null, "Erro ao inserir nome "
                      + "Empresa no combo Box!\n" + ex.getMessage());
        }

    }

    private void limparBloquear(
              JTable tabelaSalario,
              JComboBox empresaSalario,
              JTextField valorSalario,
              JTextField dataRecebimentoSalario,
              JComboBox cicloRecebimentoSalario,
              JButton cadastrarSalarioBotao,
              JButton atualizarSalarioBotao,
              JButton excluirSalarioBotao,
              JButton imprimirSalarioBotao,
              JButton selecionarSalarioBotao,
              JButton novoCadastroSalarioBotao,
              JButton listarSalarioBotao,
              JButton voltarCadastroBotao
    ) {

        limparFormularioSalario(
                  tabelaSalario,
                  empresaSalario,
                  valorSalario,
                  dataRecebimentoSalario,
                  cicloRecebimentoSalario,
                  cadastrarSalarioBotao,
                  atualizarSalarioBotao,
                  excluirSalarioBotao,
                  imprimirSalarioBotao,
                  selecionarSalarioBotao,
                  novoCadastroSalarioBotao,
                  listarSalarioBotao,
                  voltarCadastroBotao
        );

        bloquearCamposSalario(
                  tabelaSalario,
                  empresaSalario,
                  valorSalario,
                  dataRecebimentoSalario,
                  cicloRecebimentoSalario,
                  cadastrarSalarioBotao,
                  atualizarSalarioBotao,
                  excluirSalarioBotao,
                  imprimirSalarioBotao,
                  selecionarSalarioBotao,
                  novoCadastroSalarioBotao,
                  listarSalarioBotao,
                  voltarCadastroBotao
        );

    }

}
