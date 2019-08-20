package financascasa;

import java.sql.Connection;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author douglas borges egidio
 * @since 04/10/2018
 */
public class Utilitario {

    Connection conn;

    public Utilitario(Connection conn) {
        this.conn = conn;
    }

    public String converterDataBrasilAmericano(String data) {

        int dia = Integer.parseInt((String) data.subSequence(0, 2));
        int mes = Integer.parseInt((String) data.subSequence(3, 5));
        int ano = Integer.parseInt((String) data.subSequence(6, 10));

        String diaTeste;
        String mesTeste;
        String dataConvertida;

        if (dia <= 9) {
            diaTeste = "0" + dia;
        } else {
            diaTeste = "" + dia;
        }
        if (mes <= 9) {
            mesTeste = "0" + mes;
        } else {
            mesTeste = "" + mes;
        }
        dataConvertida = ano + "-" + mesTeste + "-" + diaTeste;

        return dataConvertida;
    }

    public String converterDataAmericanoBrasil(String data) {

        int diaVencimento = Integer.parseInt((String) data.subSequence(8, 10));
        int mesVencimento = Integer.parseInt((String) data.subSequence(5, 7));
        int anoVencimento = Integer.parseInt((String) data.subSequence(0, 4));

        String diaVencimentoTeste;
        String mesVencimentoTeste;
        String dataConvertida;

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
        dataConvertida = diaVencimentoTeste + "-" + mesVencimentoTeste + "-" + anoVencimento;

        return dataConvertida;
    }

    public String converterCifraoBrasiloAmericano(String valor) {

        String valorConverterCifrao = valor.replace("R$ ", "");
        String valorConverterPonto = valorConverterCifrao.replace(".", "");
        String valorCOnverterVirgula = valorConverterPonto.replace(",", ".");
        if ("R$ ".equals(valorCOnverterVirgula)) {
            valorCOnverterVirgula = "R$ " + 0;
        }

        return valorCOnverterVirgula;
    }

    public String converterCifraoAmericanoBrasil(double valor) {

        Locale ptBr = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(ptBr);
        String valorRecebido = nf.format(valor);

        return valorRecebido;
    }

    public String gerarParcelasBoleto(String data, int parcelas, int contador) {

//        contador = 1;
        int diaVencimento = Integer.parseInt((String) data.subSequence(0, 2));
        int mesVencimento = Integer.parseInt((String) data.subSequence(3, 5));
        int anoVencimento = Integer.parseInt((String) data.subSequence(6, 10));
        String dataConvertida = null;
        String diaVencimentoTeste;
        String mesVencimentoTeste;

        while (contador <= parcelas) {

            //Instrução que automatiza o vencimento dos boletos
            //a cada parcela a instrução acrescenta um passivo(boleto) com um novo vencimento.
            if (mesVencimento > 12) {
                mesVencimento = 1;
                anoVencimento++;

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
                dataConvertida = anoVencimento + "/" + mesVencimentoTeste + "/" + diaVencimentoTeste;
            } else {
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
                dataConvertida = anoVencimento + "/" + mesVencimentoTeste + "/" + diaVencimentoTeste;
            }

            mesVencimento++;
            //Fim da instrução.
        }
        return dataConvertida;
    }

    public void relatorio(String relatorio) {

        JasperPrint jasperPrint = null;

        try {
            jasperPrint = JasperFillManager.fillReport(relatorio, null, conn);
        } catch (JRException ex) {
            Logger.getLogger(SalarioJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        JasperViewer view = new JasperViewer(jasperPrint, false);

        view.setVisible(true);
        view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
        
    }

    //
////    public String somar(String pagar, String pago) {
////
////        Locale ptBr = new Locale("pt", "BR");
////
////        NumberFormat nf = NumberFormat.getCurrencyInstance(ptBr);
////        setValorpago(Double.parseDouble(pago));
////        setValorPagar(Double.parseDouble(pagar));
////
////        double somar = getValorPagar() + getValorpago();
////        String teste = "" + nf.format(somar);
////        return teste;
////    }
    //METODO PARA EXIBIR DADOS EM OUTRA TELA.
//    private void exibeTelaSec() {
//
//        int tela = 0;
//        int tela1 = 0;
//        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        GraphicsDevice[] devices = ge.getScreenDevices();
//        for (int i = 0; i < devices.length && tela < 0; i++) {
//            tela1 = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir o Ativo ?",
//                      "Controle de Finanças - Cadastro de Ativos", JOptionPane.YES_NO_OPTION);
//            if (tela1 == JOptionPane.YES_OPTION) {
//                tela = i;
//            }
////            if (.confirmar(this, "Exibir interface de usuário na tela " + (i+1) + "?", "CONEM")) {
////                tela = i;
////            }
//        }
//        if (tela < 0) {
//            JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir o Ativo  ?",
//                      "Controle de Finanças - Cadastro de Ativos", JOptionPane.YES_NO_OPTION);
////            UTI.aviso(this, "Nenhuma tela selecionada, execute o comando novamente", "CONEM");
//        } else {
//            devices[tela].setFullScreenWindow(jfTelaSec);
//            int width = jfTelaSec.getWidth();
//            int height = jfTelaSec.getHeight();
//            int xx = (int) jfTelaSec.getLocation().getX();
//            int yy = (int) jfTelaSec.getLocation().getY();
//            devices[tela].setFullScreenWindow(null);
//            jfTelaSec.setSize(width, height);
//            jfTelaSec.setLocation(xx, yy);
//            jfTelaSec.setVisible(true);
//        }
//    }
//    public void setDadosBoleto() {
//        Boleto boleto = new Boleto(conn);
//        Utilitario util = new Utilitario();
//        boleto.setEmpresaBoleto(empresaBoletoJCombobox.getSelectedItem().toString());
//        boleto.setServicoBoleto(servicoBoletoJCombobox.getSelectedItem().toString());
//        String valorPagarBoleto = util.converterCifraoBrasiloAmericano(valorPagarBoletoJTextField.getText());
//        boleto.setValorPagarBoleto(Double.parseDouble(valorPagarBoleto));
//        String dataVencimento = util.converterDataBrasilAmericano(vencimentoBoletoJTextField.getText());
//        boleto.setVencimentoBoleto(dataVencimento);
//        boleto.setParcelasBoleto(Integer.parseInt(parcelasBoletoJTextField.getText()));
//        boleto.setNumeroParcelaBoleto(numeroParcelasBoletoJTextField.getText());
//        boleto.setCicloPagamentoBoleto(cicloBoletoJComboBox.getSelectedItem().toString());
//        boleto.setFormaPagamentoBoleto(formaPagamentoBoletoJComboBox.getSelectedItem().toString());
//    }
//
//    public void getDadosBoleto() {
//        Boleto boleto = new Boleto(conn);
//        empresaBoletoJCombobox.setSelectedItem(boleto.getEmpresaBoleto());
//        servicoBoletoJCombobox.setSelectedItem(boleto.getServicoBoleto());
//        valorPagarBoletoJTextField.setText("" + boleto.getValorPagarBoleto());
//        vencimentoBoletoJTextField.setText(boleto.getVencimentoBoleto());
//        parcelasBoletoJTextField.setText("" + boleto.getParcelasBoleto());
//        numeroParcelasBoletoJTextField.setText(boleto.getNumeroParcelaBoleto());
//        cicloBoletoJComboBox.setSelectedItem(boleto.getCicloPagamentoBoleto());
//        formaPagamentoBoletoJComboBox.setSelectedItem(boleto.getFormaPagamentoBoleto());
//    }
//
//    public void bloquearFormularioBoleto() {
//        Boleto boleto = new Boleto(conn);
//        empresaBoletoJCombobox.setEnabled(false);
//        servicoBoletoJCombobox.setEnabled(false);
//        valorPagarBoletoJTextField.setEditable(false);
//        vencimentoBoletoJTextField.setEditable(false);
//        parcelasBoletoJTextField.setEditable(false);
//        numeroParcelasBoletoJTextField.setEditable(false);
//        cicloBoletoJComboBox.setEnabled(false);
//        formaPagamentoBoletoJComboBox.setEnabled(false);
//    }
//
//    public void liberarFormularioBoleto() {
//        empresaBoletoJCombobox.setEnabled(true);
//        servicoBoletoJCombobox.setEnabled(true);
//        valorPagarBoletoJTextField.setEditable(true);
//        vencimentoBoletoJTextField.setEditable(true);
//        parcelasBoletoJTextField.setEditable(true);
//        numeroParcelasBoletoJTextField.setEditable(true);
//        cicloBoletoJComboBox.setEnabled(true);
//        formaPagamentoBoletoJComboBox.setEnabled(true);
//    }
//
//    public void bloquearBotoesBoleto() {
//        CadastrarBoletoJButton.setEnabled(false);
//        atualizarBoletoJButton.setEnabled(false);
//        excluirBoletoJButton.setEnabled(false);
//        selecionarBoletoJButton.setEnabled(false);
//        imprimirBoletoJButton.setEnabled(false);
//    }
    //        Boleto a = new Boleto(conn);
//
//        String t1 = valorPagarPassivosjTextField.getText().replace(",", ".");
//        String t2 = valorPagamentoPassivosjTextField1.getText().replace(",", ".");;
//        String teste2 = a.somar(t1, t2);
//
//        JOptionPane.showMessageDialog(null, "teste = " + teste2);
//
//        jfTelaSec.recebendo(teste2);
}
