//Classe Empresa implementando a Interface EmpresaInterface.
package financascasa;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author douglas borges egidio
 * @since 25/09/2018.
 */
public class Empresa {

    Connection conn;

    //Variáveis de instancia
    private String nomeEmpresa;
    private String tipoServicoEmpresa;
    private String telefoneEmpresa;
    private String siteEmpresa;
    private String emailEmpresa;
    private String loginEmpresa;
    private String senhaEmpresa;
    //Fim da Variáveis de instancia

    //Inicio conector.
    public Empresa(Connection conn) {
        this.conn = conn;
    }//fim conector. 

    //Método Getter e setter.
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getTipoServicoEmpresa() {
        return tipoServicoEmpresa;
    }

    public void setTipoServicoEmpresa(String tipoServicoEmpresa) {
        this.tipoServicoEmpresa = tipoServicoEmpresa;
    }

    public String getTelefoneEmpresa() {
        return telefoneEmpresa;
    }

    public void setTelefoneEmpresa(String telefoneEmpresa) {
        this.telefoneEmpresa = telefoneEmpresa;
    }

    public String getSiteEmpresa() {
        return siteEmpresa;
    }

    public void setSiteEmpresa(String siteEmpresa) {
        this.siteEmpresa = siteEmpresa;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public String getLoginEmpresa() {
        return loginEmpresa;
    }

    public void setLoginEmpresa(String loginEmpresa) {
        this.loginEmpresa = loginEmpresa;
    }

    public String getSenhaEmpresa() {
        return senhaEmpresa;
    }

    public void setSenhaEmpresa(String senhaEmpresa) {
        this.senhaEmpresa = senhaEmpresa;
    }
    //Fim dos Métodos Getter e Setter.

    //Inicio dos métodos implementados de implemento da Interface EmpresaInterface.
    public void cadastrarEmpresa(
              JTable tabelaEmpresa,
              JTextField nomeEmpresa,
              JTextField tipoServico,
              JTextField siteEmpresa,
              JTextField telefoneEmpresa,
              JTextField emailEmpresa,
              JTextField loginEmpresa,
              JTextField senhaEmpresa,
              JButton cadastrarBotao,
              JButton excluirBotao,
              JButton atualizarBotao,
              JButton selecionarBotao,
              JButton imprimirBotao,
              JButton novocadastroBotao,
              JButton listrarEmpresa
    ) {

        setNomeEmpresa(nomeEmpresa.getText());
        setTipoServicoEmpresa(tipoServico.getText());
        setSiteEmpresa(siteEmpresa.getText());
        setTelefoneEmpresa(telefoneEmpresa.getText());
        setEmailEmpresa(emailEmpresa.getText());
        setLoginEmpresa(loginEmpresa.getText());
        setSenhaEmpresa(senhaEmpresa.getText());

        if (!getNomeEmpresa().equals("")
                  && !getTipoServicoEmpresa().equals("")
                  && !getTelefoneEmpresa().equals("")
                  && !getSiteEmpresa().equals("")) {

            try (PreparedStatement pstm = conn.prepareStatement("INSERT INTO Empresa "
                      + "VALUES(null,?,?,?,?,?,?,?)")) {
                pstm.setString(1, getNomeEmpresa());
                pstm.setString(2, getTipoServicoEmpresa());
                pstm.setString(3, getTelefoneEmpresa());
                pstm.setString(4, getSiteEmpresa());
                pstm.setString(5, getEmailEmpresa());
                pstm.setString(6, getLoginEmpresa());
                pstm.setString(7, getSenhaEmpresa());

                pstm.executeUpdate();
                pstm.close();

                limparBloquearEmpresa(
                          tabelaEmpresa,
                          nomeEmpresa,
                          tipoServico,
                          siteEmpresa,
                          telefoneEmpresa,
                          emailEmpresa,
                          loginEmpresa,
                          senhaEmpresa,
                          cadastrarBotao,
                          excluirBotao,
                          atualizarBotao,
                          selecionarBotao,
                          imprimirBotao,
                          novocadastroBotao,
                          listrarEmpresa
                );//FIM DO MÈTODO
                
                novocadastroBotao.requestFocus();

                JOptionPane.showMessageDialog(null, "A Empresa " + getNomeEmpresa()
                          + " foi cadastrada com sucesso!");
            }//FIM DO TRY
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar Empresa. " + e.getMessage());
            }//FIM DO CATCH
        }//FIM DO IF
        else {
            JOptionPane.showMessageDialog(null, "Confira o Formulário!"
                      + "\nTodos os campos devem ser preenchidos!");
        }//FIM DO ELSE
    }//FIM DO MÉTODO

    public void excluirEmpresa(
              JTable tabelaEmpresa,
              JTextField nomeEmpresa,
              JTextField tipoServico,
              JTextField siteEmpresa,
              JTextField telefoneEmpresa,
              JTextField emailEmpresa,
              JTextField loginEmpresa,
              JTextField senhaEmpresa,
              JButton cadastrarBotao,
              JButton excluirBotao,
              JButton atualizarBotao,
              JButton selecionarBotao,
              JButton imprimirBotao,
              JButton novocadastroBotao,
              JButton listrarEmpresa
    ) {

        setNomeEmpresa(nomeEmpresa.getText());
        setTipoServicoEmpresa(tipoServico.getText());
        setSiteEmpresa(siteEmpresa.getText());
        setTelefoneEmpresa(telefoneEmpresa.getText());
        setEmailEmpresa(emailEmpresa.getText());
        setLoginEmpresa(loginEmpresa.getText());
        setSenhaEmpresa(senhaEmpresa.getText());

        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja "
                  + "excluir a Empresa " + getNomeEmpresa() + " ?",
                  "Controle de Finanças - Cadastro de Empresas", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try {
                try (PreparedStatement pstm = conn.prepareStatement("DELETE FROM Empresa"
                          + " WHERE Nome = '" + getNomeEmpresa() + "' ")) {
                    pstm.executeUpdate();
                    JOptionPane.showMessageDialog(null, "A Empresa " + getNomeEmpresa()
                              + "foi excluída com sucesso!");

                    limparBloquearEmpresa(
                              tabelaEmpresa,
                              nomeEmpresa,
                              tipoServico,
                              siteEmpresa,
                              telefoneEmpresa,
                              emailEmpresa,
                              loginEmpresa,
                              senhaEmpresa,
                              cadastrarBotao,
                              excluirBotao,
                              atualizarBotao,
                              selecionarBotao,
                              imprimirBotao,
                              novocadastroBotao,
                              listrarEmpresa
                    );
                    
                    novocadastroBotao.requestFocus();
                }
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir Empresa!!\n" + e.getMessage());
            }
        }
    }

    public void atualizarEmpresa(
              JTable tabelaEmpresa,
              JTextField nomeEmpresa,
              JTextField tipoServico,
              JTextField siteEmpresa,
              JTextField telefoneEmpresa,
              JTextField emailEmpresa,
              JTextField loginEmpresa,
              JTextField senhaEmpresa,
              JButton cadastrarBotao,
              JButton excluirBotao,
              JButton atualizarBotao,
              JButton selecionarBotao,
              JButton imprimirBotao,
              JButton novocadastroBotao,
              JButton listrarEmpresa
    ) {

        setNomeEmpresa(nomeEmpresa.getText());
        setTipoServicoEmpresa(tipoServico.getText());
        setSiteEmpresa(siteEmpresa.getText());
        setTelefoneEmpresa(telefoneEmpresa.getText());
        setEmailEmpresa(emailEmpresa.getText());
        setLoginEmpresa(loginEmpresa.getText());
        setSenhaEmpresa(senhaEmpresa.getText());

        try {
            try (PreparedStatement pstm = conn.prepareStatement("UPDATE Empresa "
                      + "SET tipoServico = '" + getTipoServicoEmpresa() + "',"
                      + "telefoneEmpresa = '" + getTelefoneEmpresa() + "',"
                      + "siteEmpresa = '" + getSiteEmpresa() + "',"
                      + "emailEmpresa = '" + getEmailEmpresa() + "',"
                      + "login = '" + getLoginEmpresa() + "',"
                      + "senha = '" + getSenhaEmpresa() + "'"
                      + "WHERE nome LIKE '" + getNomeEmpresa() + "'")) {
                pstm.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Empresa atualizada com sucesso!");

            limparBloquearEmpresa(
                      tabelaEmpresa,
                      nomeEmpresa,
                      tipoServico,
                      siteEmpresa,
                      telefoneEmpresa,
                      emailEmpresa,
                      loginEmpresa,
                      senhaEmpresa,
                      cadastrarBotao,
                      excluirBotao,
                      atualizarBotao,
                      selecionarBotao,
                      imprimirBotao,
                      novocadastroBotao,
                      listrarEmpresa
            );
            
            novocadastroBotao.requestFocus();

        } catch (SQLException | HeadlessException e) {
            System.out.println("Erro ao Alterar Empresa!\n" + e.getMessage());
        }
    }

    public void novoCadastroEmpresa(
              JTable tabelaEmpresa,
              JTextField nomeEmpresa,
              JTextField tipoServico,
              JTextField siteEmpresa,
              JTextField telefoneEmpresa,
              JTextField emailEmpresa,
              JTextField loginEmpresa,
              JTextField senhaEmpresa,
              JButton cadastrarBotao,
              JButton excluirBotao,
              JButton atualizarBotao,
              JButton selecionarBotao,
              JButton imprimirBotao,
              JButton novocadastroBotao,
              JButton listrarEmpresa
    ) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void imprimirEmpresa(
              JTable tabelaEmpresa,
              JTextField nomeEmpresa,
              JTextField tipoServico,
              JTextField siteEmpresa,
              JTextField telefoneEmpresa,
              JTextField emailEmpresa,
              JTextField loginEmpresa,
              JTextField senhaEmpresa,
              JButton cadastrarBotao,
              JButton excluirBotao,
              JButton atualizarBotao,
              JButton selecionarBotao,
              JButton imprimirBotao,
              JButton novocadastroBotao,
              JButton listrarEmpresa
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Fim dos métodos de implemento.

    public void limparFormularioEmpresa(
              JTable tabelaEmpresa,
              JTextField nomeEmpresa,
              JTextField tipoServico,
              JTextField siteEmpresa,
              JTextField telefoneEmpresa,
              JTextField emailEmpresa,
              JTextField loginEmpresa,
              JTextField senhaEmpresa,
              JButton cadastrarBotao,
              JButton excluirBotao,
              JButton atualizarBotao,
              JButton selecionarBotao,
              JButton imprimirBotao,
              JButton novocadastroBotao,
              JButton listrarEmpresa
    ) {
        nomeEmpresa.setText(null);
        tipoServico.setText(null);
        telefoneEmpresa.setText(null);
        siteEmpresa.setText(null);
        emailEmpresa.setText(null);
        loginEmpresa.setText(null);
        senhaEmpresa.setText(null);
    }

    public void obterDadosTabela(
              JTable tabelaEmpresa,
              JTextField nomeEmpresa,
              JTextField tipoServico,
              JTextField siteEmpresa,
              JTextField telefoneEmpresa,
              JTextField emailEmpresa,
              JTextField loginEmpresa,
              JTextField senhaEmpresa,
              JButton cadastrarBotao,
              JButton excluirBotao,
              JButton atualizarBotao,
              JButton selecionarBotao,
              JButton imprimirBotao,
              JButton novocadastroBotao,
              JButton listrarEmpresa
    ) {

        setNomeEmpresa(nomeEmpresa.getText());
        setTipoServicoEmpresa(tipoServico.getText());
        setSiteEmpresa(siteEmpresa.getText());
        setTelefoneEmpresa(telefoneEmpresa.getText());
        setEmailEmpresa(emailEmpresa.getText());
        setLoginEmpresa(loginEmpresa.getText());
        setSenhaEmpresa(senhaEmpresa.getText());

        if (tabelaEmpresa.getSelectedRowCount() == 1) {
            String nomeEmpresaTabela = tabelaEmpresa.getValueAt(tabelaEmpresa.getSelectedRow(), 0).toString();
            try {
                Statement stmt = conn.createStatement();
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM Empresa "
                          + "WHERE nome LIKE '" + nomeEmpresaTabela + "' ")) {
                    while (rs.next()) {
                        nomeEmpresa.setText(rs.getString("nome"));
                        tipoServico.setText(rs.getString("tipoServico"));
                        telefoneEmpresa.setText(rs.getString("telefoneEmpresa"));
                        siteEmpresa.setText(rs.getString("siteEmpresa"));
                        emailEmpresa.setText(rs.getString("emailEmpresa"));
                        loginEmpresa.setText(rs.getString("login"));
                        senhaEmpresa.setText(rs.getString("senha"));
                    }
                }
                nomeEmpresa.setEditable(false);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar Empresa selecionado na tabela!\n" + e.getMessage());
            }
        }
    }

    public void listarEmpresas(JTable tabelaEmpresa) {

        DefaultTableModel m = (DefaultTableModel) tabelaEmpresa.getModel();

        while (tabelaEmpresa.getRowCount() > 0) {
            m.removeRow(0);
        }
        try {
            Statement stmt = conn.createStatement();
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM Empresa ORDER BY Nome ASC")) {

                while (rs.next()) {
                    m.addRow(new Object[]{rs.getString("Nome"),
                        rs.getString("tipoServico"),
                        rs.getString("telefoneEmpresa")});
                }
            }
        } catch (SQLException e) {
            System.out.println("Error ao listar Empresas!" + e.getMessage());
        }
    }

    public void limparTabela(JTable tabelaEmpresa) {

        ((DefaultTableModel) tabelaEmpresa.getModel()).setRowCount(0);

    }

    public void bloquearCamposEmpresa(
              JTable tabelaEmpresa,
              JTextField nomeEmpresa,
              JTextField tipoServico,
              JTextField siteEmpresa,
              JTextField telefoneEmpresa,
              JTextField emailEmpresa,
              JTextField loginEmpresa,
              JTextField senhaEmpresa,
              JButton cadastrarBotao,
              JButton excluirBotao,
              JButton atualizarBotao,
              JButton selecionarBotao,
              JButton imprimirBotao,
              JButton novocadastroBotao,
              JButton listrarEmpresa
    ) {
        nomeEmpresa.setEditable(false);
        tipoServico.setEditable(false);
        telefoneEmpresa.setEditable(false);
        siteEmpresa.setEditable(false);
        emailEmpresa.setEditable(false);
        loginEmpresa.setEditable(false);
        senhaEmpresa.setEditable(false);
        cadastrarBotao.setEnabled(false);
        atualizarBotao.setEnabled(false);
        excluirBotao.setEnabled(false);
        imprimirBotao.setEnabled(false);
        selecionarBotao.setEnabled(false);
    }

    public void liberarCamposEmpresa(
              JTable tabelaEmpresa,
              JTextField nomeEmpresa,
              JTextField tipoServico,
              JTextField siteEmpresa,
              JTextField telefoneEmpresa,
              JTextField emailEmpresa,
              JTextField loginEmpresa,
              JTextField senhaEmpresa,
              JButton cadastrarBotao,
              JButton excluirBotao,
              JButton atualizarBotao,
              JButton selecionarBotao,
              JButton imprimirBotao,
              JButton novocadastroBotao,
              JButton listrarEmpresa
    ) {
        nomeEmpresa.setEditable(true);
        tipoServico.setEditable(true);
        telefoneEmpresa.setEditable(true);
        siteEmpresa.setEditable(true);
        emailEmpresa.setEditable(true);
        loginEmpresa.setEditable(true);
        senhaEmpresa.setEditable(true);
    }

    public void limparBloquearEmpresa(JTable tabelaEmpresa,
              JTextField nomeEmpresa,
              JTextField tipoServico,
              JTextField siteEmpresa,
              JTextField telefoneEmpresa,
              JTextField emailEmpresa,
              JTextField loginEmpresa,
              JTextField senhaEmpresa,
              JButton cadastrarBotao,
              JButton excluirBotao,
              JButton atualizarBotao,
              JButton selecionarBotao,
              JButton imprimirBotao,
              JButton novocadastroBotao,
              JButton listrarEmpresa) {

        limparFormularioEmpresa(
                  tabelaEmpresa,
                  nomeEmpresa,
                  tipoServico,
                  siteEmpresa,
                  telefoneEmpresa,
                  emailEmpresa,
                  loginEmpresa,
                  senhaEmpresa,
                  cadastrarBotao,
                  excluirBotao,
                  atualizarBotao,
                  selecionarBotao,
                  imprimirBotao,
                  novocadastroBotao,
                  listrarEmpresa
        );

        bloquearCamposEmpresa(
                  tabelaEmpresa,
                  nomeEmpresa,
                  tipoServico,
                  siteEmpresa,
                  telefoneEmpresa,
                  emailEmpresa,
                  loginEmpresa,
                  senhaEmpresa,
                  cadastrarBotao,
                  excluirBotao,
                  atualizarBotao,
                  selecionarBotao,
                  imprimirBotao,
                  novocadastroBotao,
                  listrarEmpresa);
    }

}
