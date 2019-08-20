//Classe de implemento da Interface UsuarioInterface.
package classes;

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
 * @since 25/09/2018
 */
public class Usuario {

    Connection conn;

    //variáveis de instancia.
    private String nomeUsuario;
    private String telefoneUsuario;
    private String emailUsuario;
    private String loginUsuario;
    private String senhaUsuario;
    //Fim das Variáveis de Instancia.

    //Inicio conector.
    public Usuario(Connection conn) {
        this.conn = conn;
    }//fim conector. 

    //Inicio dos Métodos Getter e setter.
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
    //Fim dos Métodos Getter e Setter.

    //Inicio dos métodos de implemento.
    public void consultar() {
    }

    public void imprimir() {
    }
    //Fim dos métodos de implemmento.

    public void cadastrarUsuario(
              JTable tabelaUsuario,
              JTextField nomeUsuario,
              JTextField telefoneUsuario,
              JTextField emailUsuario,
              JTextField loginUsuario,
              JTextField senhaUsuario,
              JButton excluirUsuario,
              JButton atualizarUsuario,
              JButton selecionarUsuario,
              JButton imprimirUsuario,
              JButton cadastrarUsuario,
              JButton novoCadastroUsuario,
              JButton listarUsuario
    ) {

        setNomeUsuario(nomeUsuario.getText());
        setTelefoneUsuario(telefoneUsuario.getText());
        setEmailUsuario(emailUsuario.getText());
        setLoginUsuario(loginUsuario.getText());
        setSenhaUsuario(senhaUsuario.getText());

        if (!getNomeUsuario().equals("")
                  && !getTelefoneUsuario().equals("")
                  && !getEmailUsuario().equals("")
                  && !getLoginUsuario().equals("")
                  && !getSenhaUsuario().equals("")) {

            try (PreparedStatement pstm = conn.prepareStatement("INSERT INTO Usuario VALUES(null,?,?,?,?,?)")) {
                pstm.setString(1, getNomeUsuario());
                pstm.setString(2, getTelefoneUsuario());
                pstm.setString(3, getEmailUsuario());
                pstm.setString(4, getLoginUsuario());
                pstm.setString(5, getSenhaUsuario());

                cadastrarUsuario.setEnabled(false);

                pstm.executeUpdate();
                pstm.close();

            }//FIM DO TRY
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar Usuario. " + e.getMessage());
            }//FIM DO CATCH           

            limparFormularioUsuario(
                      tabelaUsuario,
                      nomeUsuario,
                      telefoneUsuario,
                      emailUsuario,
                      loginUsuario,
                      senhaUsuario,
                      excluirUsuario,
                      atualizarUsuario,
                      selecionarUsuario,
                      imprimirUsuario,
                      cadastrarUsuario,
                      novoCadastroUsuario,
                      listarUsuario
            );

            bloquearCamposBotoesUsuarios(
                      tabelaUsuario,
                      nomeUsuario,
                      telefoneUsuario,
                      emailUsuario,
                      loginUsuario,
                      senhaUsuario,
                      excluirUsuario,
                      atualizarUsuario,
                      selecionarUsuario,
                      imprimirUsuario,
                      cadastrarUsuario,
                      novoCadastroUsuario,
                      listarUsuario
            );
            
            novoCadastroUsuario.requestFocus();

            JOptionPane.showMessageDialog(null, "O Usuario " + getNomeUsuario() + " foi cadastrada com sucesso!");

        }//FIM DO IF
        else {
            JOptionPane.showMessageDialog(null, "Confira o Formulário!\nTodos os campos devem ser preenchidos!");
            nomeUsuario.requestFocus();
        }//FIM DO ELSE

    }

    public void excluirUsuarios(
              JTable tabelaUsuario,
              JTextField nomeUsuario,
              JTextField telefoneUsuario,
              JTextField emailUsuario,
              JTextField loginUsuario,
              JTextField senhaUsuario,
              JButton excluirUsuario,
              JButton atualizarUsuario,
              JButton selecionarUsuario,
              JButton imprimirUsuario,
              JButton cadastrarUsuario,
              JButton novoCadastroUsuario,
              JButton listarUsuario
    ) {

        setNomeUsuario(nomeUsuario.getText());
        setSenhaUsuario(senhaUsuario.getText());
        
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja "
                  + "excluir o Usuario " + getNomeUsuario() + "?",
                  "Controle de Finanças - Cadastro de Usuarios", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            try {
                try (PreparedStatement pstm = conn.prepareStatement("DELETE FROM Usuario "
                          + "WHERE nomeUsuario = '" + getNomeUsuario() + "'"
                                    + "AND senhaUsuario = '" + getSenhaUsuario() + "' ")) {
                    pstm.executeUpdate();
                    JOptionPane.showMessageDialog(null, "O Usuario " + getNomeUsuario()
                              + " foi excluído com sucesso!");

                    limparFormularioUsuario(
                    tabelaUsuario,
                      nomeUsuario,
                      telefoneUsuario,
                      emailUsuario,
                      loginUsuario,
                      senhaUsuario,
                      excluirUsuario,
                      atualizarUsuario,
                      selecionarUsuario,
                      imprimirUsuario,
                      cadastrarUsuario,
                      novoCadastroUsuario,
                      listarUsuario
                    );

                    bloquearCamposBotoesUsuarios(
                    tabelaUsuario,
                      nomeUsuario,
                      telefoneUsuario,
                      emailUsuario,
                      loginUsuario,
                      senhaUsuario,
                      excluirUsuario,
                      atualizarUsuario,
                      selecionarUsuario,
                      imprimirUsuario,
                      cadastrarUsuario,
                      novoCadastroUsuario,
                      listarUsuario
                    );

                }
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir usuario!!\n" + e.getMessage());
            }
        }

    }

    public void atualizarUsuario(
              JTable tabelaUsuario,
              JTextField nomeUsuario,
              JTextField telefoneUsuario,
              JTextField emailUsuario,
              JTextField loginUsuario,
              JTextField senhaUsuario,
              JButton excluirUsuario,
              JButton atualizarUsuario,
              JButton selecionarUsuario,
              JButton imprimirUsuario,
              JButton cadastrarUsuario,
              JButton novoCadastroUsuario,
              JButton listarUsuario
    ) {

        setNomeUsuario(nomeUsuario.getText());
        setTelefoneUsuario(telefoneUsuario.getText());
        setEmailUsuario(emailUsuario.getText());
        setLoginUsuario(loginUsuario.getText());
        setSenhaUsuario(senhaUsuario.getText());

        if (!getNomeUsuario().equals("")
                  && !getTelefoneUsuario().equals("(  )      -    ")
                  && !getEmailUsuario().equals("")
                  && !getLoginUsuario().equals("")
                  && !getSenhaUsuario().equals("")) {

            try {
                try (PreparedStatement pstm = conn.prepareStatement("UPDATE Usuario SET "
                          + "telefoneUsuario = '" + getTelefoneUsuario() + "',"
                          + "emailUsuario = '" + getEmailUsuario() + "',"
                          + "loginUsuario = '" + getLoginUsuario() + "',"
                          + "senhaUsuario = '" + getSenhaUsuario() + "' "
                          + "WHERE nomeUsuario LIKE '" + getNomeUsuario() + "' ")) {

                    limparFormularioUsuario(
                              tabelaUsuario,
                      nomeUsuario,
                      telefoneUsuario,
                      emailUsuario,
                      loginUsuario,
                      senhaUsuario,
                      excluirUsuario,
                      atualizarUsuario,
                      selecionarUsuario,
                      imprimirUsuario,
                      cadastrarUsuario,
                      novoCadastroUsuario,
                      listarUsuario
                    );

                    bloquearCamposBotoesUsuarios(
                              tabelaUsuario,
                      nomeUsuario,
                      telefoneUsuario,
                      emailUsuario,
                      loginUsuario,
                      senhaUsuario,
                      excluirUsuario,
                      atualizarUsuario,
                      selecionarUsuario,
                      imprimirUsuario,
                      cadastrarUsuario,
                      novoCadastroUsuario,
                      listarUsuario
                    );

                    pstm.executeUpdate();
                }

                JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso!");

            } catch (SQLException | HeadlessException e) {
                System.out.println("Erro ao Alterar usuario!\n" + e.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem estar preenchidos!");
        }

    }

    public void limparFormularioUsuario(
              JTable tabelaUsuario,
              JTextField nomeUsuario,
              JTextField telefoneUsuario,
              JTextField emailUsuario,
              JTextField loginUsuario,
              JTextField senhaUsuario,
              JButton excluirUsuario,
              JButton atualizarUsuario,
              JButton selecionarUsuario,
              JButton imprimirUsuario,
              JButton cadastrarUsuario,
              JButton novoCadastroUsuario,
              JButton listarUsuario
    ) {

        nomeUsuario.setText("");
        telefoneUsuario.setText(null);
        emailUsuario.setText("");
        loginUsuario.setText("");
        senhaUsuario.setText("");

    }

    public void pegarDadosFormularioUsuario(
              JTable tabelaUsuario,
              JTextField nomeUsuario,
              JTextField telefoneUsuario,
              JTextField emailUsuario,
              JTextField loginUsuario,
              JTextField senhaUsuario,
              JButton excluirUsuario,
              JButton atualizarUsuario,
              JButton selecionarUsuario,
              JButton imprimirUsuario,
              JButton cadastrarUsuario,
              JButton novoCadastroUsuario,
              JButton listarUsuario
    ) {

        if (tabelaUsuario.getSelectedRowCount() == 1) {

            String nomeUsuarioBusca = tabelaUsuario.getValueAt(tabelaUsuario.getSelectedRow(), 0).toString();
            try {
                Statement stmt = conn.createStatement();
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM Usuario "
                          + "WHERE nomeUsuario LIKE '" + nomeUsuarioBusca + "' ")) {
                    while (rs.next()) {
                        nomeUsuario.setText(rs.getString("nomeUsuario"));
                        telefoneUsuario.setText(rs.getString("telefoneUsuario"));
                        emailUsuario.setText(rs.getString("emailUsuario"));
                        loginUsuario.setText(rs.getString("loginUsuario"));
                        senhaUsuario.setText(rs.getString("senhaUsuario"));
                    }
                }
                nomeUsuario.setEditable(false);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar usuarios selecionado na tabela!\n" + e.getMessage());
            }
        }
    }

    public void listarUsuario(JTable tabelaUsuario) {

        DefaultTableModel m = (DefaultTableModel) tabelaUsuario.getModel();
        while (tabelaUsuario.getRowCount() > 0) {
            m.removeRow(0);
        }
        try {
            Statement stmt = conn.createStatement();
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM Usuario ORDER BY nomeUsuario ASC")) {
                while (rs.next()) {
                    m.addRow(new Object[]{rs.getString("nomeUsuario"),
                        rs.getString("telefoneUsuario"),
                        rs.getString("emailUsuario")});
                }
            }
        } catch (SQLException e) {
            System.out.println("Error ao listar Passivos!" + e.getMessage());
        }
    }

    public void limparTabelaUsuarios(JTable tabelaUsuario) {
        ((DefaultTableModel) tabelaUsuario.getModel()).setRowCount(0);
    }

    public void bloquearCamposBotoesUsuarios(
              JTable tabelaUsuario,
              JTextField nomeUsuario,
              JTextField telefoneUsuario,
              JTextField emailUsuario,
              JTextField loginUsuario,
              JTextField senhaUsuario,
              JButton excluirUsuario,
              JButton atualizarUsuario,
              JButton selecionarUsuario,
              JButton imprimirUsuario,
              JButton cadastrarUsuario,
              JButton novoCadastroUsuario,
              JButton listarUsuario
    ) {

        tabelaUsuario.setEnabled(true);
        nomeUsuario.setEditable(false);
        telefoneUsuario.setEditable(false);
        emailUsuario.setEditable(false);
        loginUsuario.setEditable(false);
        senhaUsuario.setEditable(false);
        cadastrarUsuario.setEnabled(false);
        excluirUsuario.setEnabled(false);
        atualizarUsuario.setEnabled(false);
        imprimirUsuario.setEnabled(false);
        selecionarUsuario.setEnabled(false);

    }

    public void liberarCamposUsuarios(
              JTable tabelaUsuario,
              JTextField nomeUsuario,
              JTextField telefoneUsuario,
              JTextField emailUsuario,
              JTextField loginUsuario,
              JTextField senhaUsuario,
              JButton excluirUsuario,
              JButton atualizarUsuario,
              JButton selecionarUsuario,
              JButton imprimirUsuario,
              JButton cadastrarUsuario,
              JButton novoCadastroUsuario,
              JButton listarUsuario
    ) {

        nomeUsuario.setEditable(true);
        telefoneUsuario.setEditable(true);
        emailUsuario.setEditable(true);
        loginUsuario.setEditable(true);
        senhaUsuario.setEditable(true);

    }

}
