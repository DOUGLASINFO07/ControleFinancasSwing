//Interface da Classe Ativos.
package financascasa;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * @author douglas borges egidio.
 * @since 25/09/2018.
 */
public interface AtivosInterface {

    public void cadastrarAtivos(
              JComboBox nome,
              JTextField salarioJTextField,
              String salario,
              JTextField dataRecebimento,
              JComboBox cicloRecebimento,
              JButton botaoCadastrar
    );

    public void excluirAtivos();

    public void atualizarAtivos(
              JTable tabelaAtivos,
              JComboBox nomeEmpresa,
              JTextField salario,
              String valorSalario,
              JTextField datarecebimento,
              JComboBox cicloRecebimento,
              JButton cadastrar,
              JButton atualizar,
              JButton excluir,
              JButton imprimir,
              JButton selecionar
    );

    public void novoCadastroAtivos();

    public void imprimirAtivos();

    public void limparFormularioAtivos(
              JComboBox nome,
              JTextField salario,
              JTextField dataRecebimento,
              JComboBox cicloRecebimento
    );

    public void pegarDadosTabelaAtivos(
              JTable tabelaAtivos,
              JComboBox nomeEmpresa,
              JTextField salario,
              JTextField dataRecebimento,
              JComboBox ciclorecebimento
    );

    public void listarAtivos(JTable tabelaAtivos);

    public void limparTabelaAtivos(JTable tabelaAtivos);

    public void bloquearCamposBotoesAtivos(
              JComboBox nomeEmpresa,
              JTextField salario,
              JTextField dataRecebimento,
              JComboBox cicloRecebimento,
              JButton cadastrar,
              JButton atualizar,
              JButton excluir,
              JButton imprimir,
              JButton selecionar
    );

    public void liberarCamposAtivos(
              JTable tabelaAtivos,
              JComboBox nomeEmpresa,
              JTextField salario,
              JTextField dataRecebimento,
              JComboBox cicloRecebimento
    );

}
