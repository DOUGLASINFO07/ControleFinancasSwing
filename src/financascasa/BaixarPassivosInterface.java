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
public interface BaixarPassivosInterface {

//    public void cadastrarPassivos(
//              JTable tabelaPassivos,
//              JComboBox empresaPassivo,
//              JComboBox produtoPassivo,
//              JTextField valorPagarPassivoTextField,
//              String valorPagarPassivo,
//              JTextField dataVencimentoPassivo,
//              JTextField parcelasPagarPassivoTextField,
//              String parcelasPagarPassivo,
//              JTextField numeroParcelaPassivo,
//              JComboBox cicloPagamentopassivo,
//              JComboBox formaPagamentoPassivo,
//              JTextField valorPagamentoPassivoTextField,
//              String valorPagamentoPassivo,
//              JTextField dataPagamentoPassivo,
//              JComboBox localPagamentopassivo,
//              JComboBox pagadorPassivo,
//              JButton cadastrarPassivos,
//              JButton excluirPassivos,
//              JButton atualizarPassivos,
//              JButton imprimirPassivos,
//              JButton SelecionarPassivos
//    );
//    public void excluirPassivos();
    public void atualizarPassivos(
              JTable tabelaPassivos,
              JTextField empresaPassivo,
              JTextField produtoPassivo,
              JTextField valorPagarPassivoTextField,
                            String valorPagarPassivo,
              JTextField dataVencimentoPassivo,
              JTextField parcelasPagarPassivoTextField,
              JTextField numeroParcelaPassivo,
              String parcelasPagarPassivo,
              JTextField cicloPagamentopassivo,
              JTextField formaPagamentoPassivo,
              JTextField valorPagamentoPassivoTextField,
                            String valorPagamentoPassivo,
              JTextField dataPagamentoPassivo,
              JComboBox localPagamentopassivo,
              JComboBox pagadorPassivo,
              JButton atualizarPassivos,
              JButton imprimirPassivos,
              JButton selecionarPassivos

    );

    public void imprimirPassivos();

    public void limparFormularioPassivos(
              JTextField empresaPassivo,
              JTextField produtoPassivo,
              JTextField valorPagarPassivoTextField,
              JTextField dataVencimentoPassivo,
              JTextField parcelasPagarPassivoTextField,
              JTextField numeroParcelasPassivo,
              JTextField cicloPagamentopassivo,
              JTextField formaPagamentoPassivo,
              JTextField valorPagamentoPassivoTextField,
              JTextField dataPagamentoPassivo,
              JComboBox localPagamentopassivo,
              JComboBox pagadorPassivo
    );

    public void pegarDadosTabelaPassivos(
              JTable tabelaPassivos,
              JTextField empresaPassivo,
              JTextField produtoPassivo,
              JTextField valorPagarPassivo,
              JTextField dataVencimentoPassivo,
              JTextField parcelasPagarPassivo,
              JTextField numeroParcelaPassivo,
              JTextField cicloPagamentopassivo,
              JTextField formaPagamentoPassivo,
              JTextField valorPagamentoPassivo,
              JTextField dataPagamentoPassivo,
              JComboBox localPagamentopassivo,
              JComboBox pagadorPassivo
    );

    public void listarPassivos(
              JTable tabelaPassivos,
              JComboBox parametro,
              JTextField itemUmPesquisa,
              JTextField itemDoisPesquisa,
              JTextField valorPagamento
    );

    public void limparTabelaPassivos(JTable tabelaEmpresa);

    public void bloquearCamposBotoesPassivos(
              JTable tabelaPassivos,
              JTextField empresaPassivo,
              JTextField produtoPassivo,
              JTextField valorPagarPassivo,
              JTextField dataVencimentoPassivo,
              JTextField parcelasPagarPassivo,
              JTextField numeroParcelaPassivo,
              JTextField cicloPagamentopassivo,
              JTextField formaPagamentoPassivo,
              JTextField valorPagamentoPassivo,
              JTextField dataPagamentoPassivo,
              JComboBox localPagamentopassivo,
              JComboBox pagadorPassivo,
              JButton atualizar,
              JButton imprimir,
              JButton selecionar
    );

    public void liberarCamposPassivos(
              //              JComboBox empresaPassivo,
              //              JComboBox produtoPassivo,
              //              JTextField valorPagarPassivo,
              //              JTextField dataVencimentoPassivo,
              //              JTextField parcelasPagarPassivo,
              //              JComboBox cicloPagamentopassivo,
              //              JComboBox formaPagamentoPassivo,
              JTextField valorPagamentoPassivo,
              JTextField dataPagamentoPassivo,
              JComboBox localPagamentopassivo,
              JComboBox pagadorPassivo
    );

}
