//Interface da Classe Usuario.
package financascasa;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * @author douglas borges egidio.
 * @since 25/09/2018
 */
public interface UsuarioInterface {

    public void cadastrarUsuario(
              JTable tabelaUsuario,
              JTextField nomeUsuario,
              JTextField telefoneUsuario,
              JTextField emailUsuario,
              JTextField loginUsuario,
              JTextField senhausuario,
              JButton excluirUsuario,
              JButton atualizarUsuario,
              JButton selecionarUsuario,
              JButton imprimirUsuario,
              JButton cadastrarUsuario
    );

    public void excluirUsuarios();

    public void atualizarUsuario(
              JTable tabelaUsuario,
              JTextField nomeUsuario,
              JTextField telefoneUsuario,
              JTextField emailUsuario,
              JTextField loginUsuario,
              JTextField senhausuario,
              JButton excluirUsuario,
              JButton atualizarUsuario,
              JButton selecionarUsuario,
              JButton imprimirUsuario,
              JButton cadastrarUsuario
    );

    public void limparFormularioUsuario(
              JTextField nomeUsuario,
              JTextField telefoneUsuario,
              JTextField emailUsuario,
              JTextField loginUsuario,
              JTextField senhausuario
    );

    public void pegarDadosFormularioUsuario(
              JTable tabelaUsuario,
              JTextField nomeUsuario,
              JTextField telefoneUsuario,
              JTextField emailUsuario,
              JTextField loginUsuario,
              JTextField senhausuario
    );

    public void listarUsuario(JTable tabelaUsuario);

    public void limparTabelaUsuarios(JTable tabelaUsuario);

    public void bloquearCamposBotoesUsuarios(JTable tabelaUsuario,
              JTextField nomeUsuario,
              JTextField telefoneUsuario,
              JTextField emailUsuario,
              JTextField loginUsuario,
              JTextField senhausuario,
              JButton excluirUsuario,
              JButton atualizarUsuario,
              JButton selecionarUsuario,
              JButton imprimirUsuario,
              JButton cadastrarUsuario
    );

    public void liberarCamposUsuarios(
              JTextField nomeUsuario,
              JTextField telefoneUsuario,
              JTextField emailUsuario,
              JTextField loginUsuario,
              JTextField senhausuario
    );

    public void consultar();

    public void imprimir();

}
