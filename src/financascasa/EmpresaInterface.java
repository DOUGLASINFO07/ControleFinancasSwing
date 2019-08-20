//Interface da classe Empresa.

package financascasa;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author douglas borges egidio
 * @since 25/09/2018
 */

public interface EmpresaInterface {

    public void cadastrarEmpresa();
    public void excluirEmpresa();
    public void atualizarEmpresa();
    public void novoCadastroEmpresa();
    public void imprimirEmpresa();
    public void limparFormularioEmpresa(JTextField nome,
              JTextField tipoServico,
              JTextField telefone,
              JTextField site,
              JTextField email,
              JTextField login,
              JTextField senha);
    public void pegarDadosTabela(JTable tabelaEmpresa, 
              JTextField nome,
              JTextField tipoServico,
              JTextField telefone,
              JTextField site,
              JTextField email,
              JTextField login,
              JTextField senha);
    public void listarEmpresas(JTable tabelaEmpresa);
    public void limparTabela(JTable tabelaEmpresa);
    public void bloquearCamposBotoes(JTable tabelaEmpresa,
              JTextField nome,
              JTextField tipoServico,
              JTextField telefone,
              JTextField site,
              JTextField email,
              JTextField login,
              JTextField senha,
              JButton cadastrar,
              JButton atualizar,
              JButton excluir,
              JButton imprimir,
              JButton selecionar);
    public void liberarCampos(JTable tabelaEmpresa,
              JTextField nome,
              JTextField tipoServico,
              JTextField telefone,
              JTextField site,
              JTextField email,
              JTextField login,
              JTextField senha);
}
