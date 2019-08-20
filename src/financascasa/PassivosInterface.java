//Interface da Classe Passisvos.
package financascasa;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author douglas borges egidio
 * @since 25/09/2018
 */
public interface PassivosInterface {

    public void cadastrarPassivos(
              JTable tabelaPassivos,
              JComboBox empresaPassivo,
              JComboBox produtoPassivo,
              JTextField valorPagarPassivoTextField,
              String valorPagarPassivo,
              JTextField dataVencimentoPassivo,
              JTextField parcelasPagarPassivoTextField,
              String parcelasPagarPassivo,
              JTextField numeroParcelaPassivo,
              JComboBox cicloPagamentopassivo,
              JComboBox formaPagamentoPassivo,
              JButton cadastrarPassivos,
              JButton excluirPassivos,
              JButton atualizarPassivos,
              JButton imprimirPassivos,
              JButton SelecionarPassivos
    );

    public void excluirPassivos(
              JTable tabelaPassivos,
              JComboBox empresaPassivo,
              JComboBox produtoPassivo,
              JTextField valorPagarPassivo,
              JTextField dataVencimentoPassivo,
              JTextField parcelasPagarPassivo,
              JTextField numeroParcelaPassivo,
              JComboBox cicloPagamentopassivo,
              JComboBox formaPagamentoPassivo,
              JButton cadastrar,
              JButton atualizar,
              JButton excluir,
              //              JButton imprimir,
              JButton selecionar
    );

    public void atualizarPassivos(
              JTable tabelaPassivos,
              JComboBox empresaPassivo,
              JComboBox produtoPassivo,
              JTextField valorPagarPassivoTextField,
//              String valorPagarPassivo,
              JTextField dataVencimentoPassivo,
              JTextField parcelasPagarPassivoTextField,
              JTextField numeroParcelaPassivo,
              String parcelasPagarPassivo,
              JComboBox cicloPagamentopassivo,
              JComboBox formaPagamentoPassivo,
              JButton cadastrarPassivos,
              JButton excluirPassivos,
              JButton atualizarPassivos,
              JButton imprimirPassivos,
              JButton selecionarPassivos
    );

    public void imprimirPassivos();

    public void limparFormularioPassivos(
              JComboBox empresaPassivo,
              JComboBox produtoPassivo,
              JTextField valorPagarPassivoTextField,
              JTextField dataVencimentoPassivo,
              JTextField parcelasPagarPassivoTextField,
              JTextField numeroParcelaPassivo,
              JComboBox cicloPagamentopassivo,
              JComboBox formaPagamentoPassivo
    );

    public void pegarDadosTabelaPassivos(
              JTable tabelaPassivos,
              JComboBox empresaPassivo,
              JComboBox produtoPassivo,
              JTextField valorPagarPassivo,
              JTextField dataVencimentoPassivo,
              JTextField parcelasPagarPassivo,
              JTextField numeroParcelaPassivo,
              JComboBox cicloPagamentopassivo,
              JComboBox formaPagamentoPassivo
    );

    public void listarPassivos(JTable tabelaEmpresa);

    public void limparTabelaPassivos(JTable tabelaEmpresa);

    public void bloquearCamposBotoesPassivos(
              JTable tabelaPassivos,
              JComboBox empresaPassivo,
              JComboBox produtoPassivo,
              JTextField valorPagarPassivo,
              JTextField dataVencimentoPassivo,
              JTextField parcelasPagarPassivo,
              JTextField numeroParcelaPassivo,
              JComboBox cicloPagamentopassivo,
              JComboBox formaPagamentoPassivo,
              JButton cadastrar,
              JButton atualizar,
              JButton excluir,
              //              JButton imprimir,
              JButton selecionar
    );

    public void liberarCamposPassivos(
              JComboBox empresaPassivo,
              JComboBox produtoPassivo,
              JTextField valorPagarPassivo,
              JTextField dataVencimentoPassivo,
              JTextField parcelasPagarPassivo,
              JComboBox cicloPagamentopassivo,
              JComboBox formaPagamentoPassivo
    );

}
