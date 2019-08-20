package financascasa;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas borges egidio
 * @since 27/09/2018.
 */
public class BaixarBoletoJFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    Connection conn;

    public BaixarBoletoJFrame() {
        initComponents();
    }

    public BaixarBoletoJFrame(Connection conn) throws SQLException {
        initComponents();
        this.conn = conn;

        BaixarBoleto baixarBoletos = new BaixarBoleto(conn);

        baixarBoletos.bloquearCamposBaixarBoleto(
                  tabelaBaixarPassivosjTable,
                  nomeEmpresaBaixarPassivosJTextField,
                  produtoBaixarPassivosJTextField,
                  valorPagarBaixarPassivosjTextField,
                  dataVencimentoBaixarPassivojTextField,
                  parcelasPagarBaixarPassivojTextField,
                  numeroParcelaPassivoBaixarjTextField2,
                  cicloPagamentoBaixarPassivosJTextField,
                  formaPagamentoBaixarPassivoJTextField,
                  valorPagamentoBaixarPassivosjTextField1,
                  dataPagamentoBaixarPassivojTextField1,
                  localPagamentoBaixarPassivojCombobox,
                  pagadorPassivosBaixarjCombobox,
                  parametroPesquisaBaixarBoletoJCombobox1,
                  itemUmPesquisaJTextField,
                  itemDoisPesquisajFormattedTextField1,
                  atualizarBaixarPassivosjButton,
                  selecionarbaixarPassivosjButton,
                  novaBuscajButton,
                  imprimirPassivosjButton,
                  confirmarjButton,
                  PesquisarjButton
        );

        campo1jLabel.setVisible(false);
        campo2jLabel.setVisible(false);
        itemUmPesquisaJTextField.setVisible(false);
        itemDoisPesquisajFormattedTextField1.setVisible(false);
        parametroPesquisaBaixarBoletoJCombobox1.setVisible(false);
        PesquisarjButton.setVisible(false);
        confirmarjButton.setVisible(false);

        baixarBoletos.preencherCombomUsuario(pagadorPassivosBaixarjCombobox);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        atualizarBaixarPassivosjButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        valorPagamentoBaixarPassivosjTextField1 = new javax.swing.JTextField();
        valorPagarBaixarPassivosjTextField = new javax.swing.JTextField();
        dataVencimentoBaixarPassivojTextField = new javax.swing.JFormattedTextField();
        dataPagamentoBaixarPassivojTextField1 = new javax.swing.JFormattedTextField();
        localPagamentoBaixarPassivojCombobox = new javax.swing.JComboBox<>();
        pagadorPassivosBaixarjCombobox = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        parcelasPagarBaixarPassivojTextField = new javax.swing.JTextField();
        numeroParcelaPassivoBaixarjTextField2 = new javax.swing.JTextField();
        nomeEmpresaBaixarPassivosJTextField = new javax.swing.JTextField();
        produtoBaixarPassivosJTextField = new javax.swing.JTextField();
        cicloPagamentoBaixarPassivosJTextField = new javax.swing.JTextField();
        formaPagamentoBaixarPassivoJTextField = new javax.swing.JTextField();
        PassivosjPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaBaixarPassivosjTable = new javax.swing.JTable();
        selecionarbaixarPassivosjButton = new javax.swing.JButton();
        imprimirPassivosjButton = new javax.swing.JButton();
        parametroPesquisaBaixarBoletoJCombobox1 = new javax.swing.JComboBox<>();
        PesquisarjButton = new javax.swing.JButton();
        novaBuscajButton = new javax.swing.JButton();
        campo1jLabel = new javax.swing.JLabel();
        campo2jLabel = new javax.swing.JLabel();
        confirmarjButton = new javax.swing.JButton();
        voltarBaixarBoletoJButton = new javax.swing.JButton();
        itemUmPesquisaJTextField = new javax.swing.JFormattedTextField();
        itemDoisPesquisajFormattedTextField1 = new javax.swing.JFormattedTextField();
        mensagemFiltroJLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nome Empresa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Produto");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Valor pagar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Data vencimento");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Ciclo Pagamento");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Parcelas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Forma pagamento");

        atualizarBaixarPassivosjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        atualizarBaixarPassivosjButton.setForeground(new java.awt.Color(0, 102, 153));
        atualizarBaixarPassivosjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorioCaixa.png"))); // NOI18N
        atualizarBaixarPassivosjButton.setText("Dar baixa");
        atualizarBaixarPassivosjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBaixarPassivosjButtonActionPerformed(evt);
            }
        });
        atualizarBaixarPassivosjButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                atualizarBaixarPassivosjButtonKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Pagador");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Local pagamento");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Data pagamento");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("valor pagamento");

        valorPagamentoBaixarPassivosjTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valorPagamentoBaixarPassivosjTextField1.setForeground(new java.awt.Color(0, 102, 153));
        valorPagamentoBaixarPassivosjTextField1.setToolTipText("");
        valorPagamentoBaixarPassivosjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorPagamentoBaixarPassivosjTextField1ActionPerformed(evt);
            }
        });

        valorPagarBaixarPassivosjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valorPagarBaixarPassivosjTextField.setForeground(new java.awt.Color(0, 102, 153));

        dataVencimentoBaixarPassivojTextField.setForeground(new java.awt.Color(0, 102, 153));
        try {
            dataVencimentoBaixarPassivojTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataVencimentoBaixarPassivojTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dataVencimentoBaixarPassivojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataVencimentoBaixarPassivojTextFieldActionPerformed(evt);
            }
        });

        dataPagamentoBaixarPassivojTextField1.setForeground(new java.awt.Color(0, 102, 153));
        try {
            dataPagamentoBaixarPassivojTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataPagamentoBaixarPassivojTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dataPagamentoBaixarPassivojTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPagamentoBaixarPassivojTextField1ActionPerformed(evt);
            }
        });

        localPagamentoBaixarPassivojCombobox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        localPagamentoBaixarPassivojCombobox.setForeground(new java.awt.Color(0, 102, 153));
        localPagamentoBaixarPassivojCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "***  Selecione  ***", "Banco", "Lotérica", "Aplicativo", "Na Empresa" }));

        pagadorPassivosBaixarjCombobox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pagadorPassivosBaixarjCombobox.setForeground(new java.awt.Color(0, 102, 153));
        pagadorPassivosBaixarjCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "***  Selecione  ***", " " }));
        pagadorPassivosBaixarjCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagadorPassivosBaixarjComboboxActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Nº Parcelas");

        parcelasPagarBaixarPassivojTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        parcelasPagarBaixarPassivojTextField.setForeground(new java.awt.Color(0, 102, 153));

        numeroParcelaPassivoBaixarjTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numeroParcelaPassivoBaixarjTextField2.setForeground(new java.awt.Color(0, 102, 153));

        nomeEmpresaBaixarPassivosJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nomeEmpresaBaixarPassivosJTextField.setForeground(new java.awt.Color(0, 102, 153));

        produtoBaixarPassivosJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        produtoBaixarPassivosJTextField.setForeground(new java.awt.Color(0, 102, 153));

        cicloPagamentoBaixarPassivosJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cicloPagamentoBaixarPassivosJTextField.setForeground(new java.awt.Color(0, 102, 153));

        formaPagamentoBaixarPassivoJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        formaPagamentoBaixarPassivoJTextField.setForeground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataVencimentoBaixarPassivojTextField)
                            .addComponent(parcelasPagarBaixarPassivojTextField)
                            .addComponent(valorPagarBaixarPassivosjTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nomeEmpresaBaixarPassivosJTextField)
                            .addComponent(produtoBaixarPassivosJTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataPagamentoBaixarPassivojTextField1)
                            .addComponent(localPagamentoBaixarPassivojCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pagadorPassivosBaixarjCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorPagamentoBaixarPassivosjTextField1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroParcelaPassivoBaixarjTextField2)
                            .addComponent(cicloPagamentoBaixarPassivosJTextField)
                            .addComponent(formaPagamentoBaixarPassivoJTextField))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(atualizarBaixarPassivosjButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeEmpresaBaixarPassivosJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produtoBaixarPassivosJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(valorPagarBaixarPassivosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(dataVencimentoBaixarPassivojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(parcelasPagarBaixarPassivojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(numeroParcelaPassivoBaixarjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cicloPagamentoBaixarPassivosJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formaPagamentoBaixarPassivoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(valorPagamentoBaixarPassivosjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(dataPagamentoBaixarPassivojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(localPagamentoBaixarPassivojCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pagadorPassivosBaixarjCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atualizarBaixarPassivosjButton)
                .addContainerGap())
        );

        PassivosjPanel.setBackground(new java.awt.Color(0, 0, 0));

        tabelaBaixarPassivosjTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabelaBaixarPassivosjTable.setForeground(new java.awt.Color(0, 102, 153));
        tabelaBaixarPassivosjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Empresa", "Produto/ Serviço", "Data Vencimento", "Valor Pagar", "Parcelas à pagar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaBaixarPassivosjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaBaixarPassivosjTableMouseClicked(evt);
            }
        });
        tabelaBaixarPassivosjTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaBaixarPassivosjTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaBaixarPassivosjTable);
        if (tabelaBaixarPassivosjTable.getColumnModel().getColumnCount() > 0) {
            tabelaBaixarPassivosjTable.getColumnModel().getColumn(1).setResizable(false);
        }

        selecionarbaixarPassivosjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selecionarbaixarPassivosjButton.setForeground(new java.awt.Color(0, 102, 153));
        selecionarbaixarPassivosjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dedo.png"))); // NOI18N
        selecionarbaixarPassivosjButton.setText("Selecionar");
        selecionarbaixarPassivosjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarbaixarPassivosjButtonActionPerformed(evt);
            }
        });
        selecionarbaixarPassivosjButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                selecionarbaixarPassivosjButtonKeyPressed(evt);
            }
        });

        imprimirPassivosjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        imprimirPassivosjButton.setForeground(new java.awt.Color(0, 102, 153));
        imprimirPassivosjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PDF.png"))); // NOI18N
        imprimirPassivosjButton.setText("Imprimir");
        imprimirPassivosjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirPassivosjButtonActionPerformed(evt);
            }
        });
        imprimirPassivosjButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imprimirPassivosjButtonKeyPressed(evt);
            }
        });

        parametroPesquisaBaixarBoletoJCombobox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        parametroPesquisaBaixarBoletoJCombobox1.setForeground(new java.awt.Color(0, 102, 153));

        PesquisarjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PesquisarjButton.setForeground(new java.awt.Color(0, 102, 153));
        PesquisarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        PesquisarjButton.setText("Pesquisar");
        PesquisarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarjButtonActionPerformed(evt);
            }
        });
        PesquisarjButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PesquisarjButtonKeyPressed(evt);
            }
        });

        novaBuscajButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        novaBuscajButton.setForeground(new java.awt.Color(0, 102, 153));
        novaBuscajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consultarProtuto (1).png"))); // NOI18N
        novaBuscajButton.setText("Nova Pesquisa");
        novaBuscajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaBuscajButtonActionPerformed(evt);
            }
        });
        novaBuscajButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                novaBuscajButtonKeyPressed(evt);
            }
        });

        campo1jLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campo1jLabel.setForeground(new java.awt.Color(204, 204, 204));
        campo1jLabel.setText("jLabel17");

        campo2jLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campo2jLabel.setForeground(new java.awt.Color(204, 204, 204));
        campo2jLabel.setText("jLabel17");

        confirmarjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmarjButton.setForeground(new java.awt.Color(0, 102, 153));
        confirmarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ok.png"))); // NOI18N
        confirmarjButton.setText("Confirmar");
        confirmarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarjButtonActionPerformed(evt);
            }
        });
        confirmarjButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmarjButtonKeyPressed(evt);
            }
        });

        voltarBaixarBoletoJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        voltarBaixarBoletoJButton.setForeground(new java.awt.Color(0, 102, 153));
        voltarBaixarBoletoJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        voltarBaixarBoletoJButton.setText("Voltar Menu");
        voltarBaixarBoletoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBaixarBoletoJButtonActionPerformed(evt);
            }
        });
        voltarBaixarBoletoJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                voltarBaixarBoletoJButtonKeyPressed(evt);
            }
        });

        try {
            itemUmPesquisaJTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            itemDoisPesquisajFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        mensagemFiltroJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mensagemFiltroJLabel.setForeground(new java.awt.Color(153, 153, 0));
        mensagemFiltroJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PassivosjPanelLayout = new javax.swing.GroupLayout(PassivosjPanel);
        PassivosjPanel.setLayout(PassivosjPanelLayout);
        PassivosjPanelLayout.setHorizontalGroup(
            PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassivosjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(PassivosjPanelLayout.createSequentialGroup()
                        .addComponent(selecionarbaixarPassivosjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imprimirPassivosjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarBaixarBoletoJButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassivosjPanelLayout.createSequentialGroup()
                        .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PassivosjPanelLayout.createSequentialGroup()
                                .addComponent(campo1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemUmPesquisaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campo2jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15)
                                .addComponent(itemDoisPesquisajFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(parametroPesquisaBaixarBoletoJCombobox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confirmarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PesquisarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2))
                    .addGroup(PassivosjPanelLayout.createSequentialGroup()
                        .addComponent(novaBuscajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mensagemFiltroJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PassivosjPanelLayout.setVerticalGroup(
            PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassivosjPanelLayout.createSequentialGroup()
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(novaBuscajButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mensagemFiltroJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parametroPesquisaBaixarBoletoJCombobox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo2jLabel)
                    .addComponent(PesquisarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campo1jLabel)
                    .addComponent(itemUmPesquisaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemDoisPesquisajFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecionarbaixarPassivosjButton)
                    .addComponent(imprimirPassivosjButton)
                    .addComponent(voltarBaixarBoletoJButton))
                .addContainerGap())
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DIMTECH - SISTEMA FINANCEIRO");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consultarVenda.png"))); // NOI18N
        jLabel15.setText("jLabel10");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Baixar Boletos");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoDIMTech1.png"))); // NOI18N
        jLabel18.setText("jLabel10");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PassivosjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17))
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PassivosjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarBaixarPassivosjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBaixarPassivosjButtonActionPerformed
        atualizar();
    }//GEN-LAST:event_atualizarBaixarPassivosjButtonActionPerformed

    private void selecionarbaixarPassivosjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarbaixarPassivosjButtonActionPerformed
        selecionar();
    }//GEN-LAST:event_selecionarbaixarPassivosjButtonActionPerformed

    private void imprimirPassivosjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirPassivosjButtonActionPerformed
//        exibeTelaSec();
    }//GEN-LAST:event_imprimirPassivosjButtonActionPerformed

    TesteJFrame jfTelaSec = new TesteJFrame(conn);

    private void dataVencimentoBaixarPassivojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataVencimentoBaixarPassivojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataVencimentoBaixarPassivojTextFieldActionPerformed

    private void dataPagamentoBaixarPassivojTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPagamentoBaixarPassivojTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataPagamentoBaixarPassivojTextField1ActionPerformed

    private void pagadorPassivosBaixarjComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagadorPassivosBaixarjComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagadorPassivosBaixarjComboboxActionPerformed

    private void valorPagamentoBaixarPassivosjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorPagamentoBaixarPassivosjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorPagamentoBaixarPassivosjTextField1ActionPerformed

    private void PesquisarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarjButtonActionPerformed
        listar();
    }//GEN-LAST:event_PesquisarjButtonActionPerformed

    private void confirmarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarjButtonActionPerformed

        if (parametroPesquisaBaixarBoletoJCombobox1.getSelectedItem().toString() == "Período"
                  || parametroPesquisaBaixarBoletoJCombobox1.getSelectedItem().toString() == "Data"
                  || parametroPesquisaBaixarBoletoJCombobox1.getSelectedItem().toString() == "Empresa") {
            try {
                confirmarPesquisaEscolhaParametro();
            } catch (SQLException ex) {
                Logger.getLogger(BaixarBoletoJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            listar();
        }
    }//GEN-LAST:event_confirmarjButtonActionPerformed

    public void confirmarPesquisaEscolhaParametro() throws SQLException {

        BaixarBoleto baixarboleto = new BaixarBoleto(conn);

        String parametro = parametroPesquisaBaixarBoletoJCombobox1.getSelectedItem().toString();

        if (null == parametro) {

        } else {
            switch (parametro) {
                case "Todos":
                    campo1jLabel.setVisible(false);
                    campo2jLabel.setVisible(false);
                    itemUmPesquisaJTextField.setVisible(false);
                    itemDoisPesquisajFormattedTextField1.setVisible(false);
                    parametroPesquisaBaixarBoletoJCombobox1.setEnabled(false);
                    confirmarjButton.setEnabled(true);
                    PesquisarjButton.setVisible(true);
                    break;
                case "***  Pesquisar por  ***":
                    campo1jLabel.setVisible(false);
                    campo2jLabel.setVisible(false);
                    itemUmPesquisaJTextField.setVisible(false);
                    itemDoisPesquisajFormattedTextField1.setVisible(false);
                    parametroPesquisaBaixarBoletoJCombobox1.setEnabled(true);
                    PesquisarjButton.setEnabled(false);
                    confirmarjButton.setVisible(true);
                    PesquisarjButton.setVisible(true);
                    JOptionPane.showMessageDialog(null, "ATENÇÂO!!\nEscolha um modo de pesquisa!!");
                    break;
                case "Contas pagas":
                    campo1jLabel.setVisible(false);
                    campo2jLabel.setVisible(false);
                    itemUmPesquisaJTextField.setVisible(false);
                    itemDoisPesquisajFormattedTextField1.setVisible(false);
                    parametroPesquisaBaixarBoletoJCombobox1.setEnabled(false);
                    PesquisarjButton.setEnabled(true);
                    confirmarjButton.setEnabled(false);
                    PesquisarjButton.setVisible(true);
                    break;
                case "Contas abertas":
                    campo1jLabel.setVisible(false);
                    campo2jLabel.setVisible(false);
                    itemUmPesquisaJTextField.setVisible(false);
                    itemDoisPesquisajFormattedTextField1.setVisible(false);
                    parametroPesquisaBaixarBoletoJCombobox1.setEnabled(false);
                    PesquisarjButton.setEnabled(true);
                    confirmarjButton.setEnabled(false);
                    PesquisarjButton.setVisible(true);
                    break;
                case "Empresa":
//                    campo1jLabel.setVisible(true);
//                    campo1jLabel.setText("Empresa");
//                    campo2jLabel.setVisible(false);
//                    itemUmPesquisaJTextField.setVisible(true);
//                    itemUmPesquisaJTextField.setEditable(true);
//                    itemDoisPesquisajFormattedTextField1.setVisible(false);
                    parametroPesquisaBaixarBoletoJCombobox1.setEnabled(true);
                    PesquisarjButton.setEnabled(true);
                    confirmarjButton.setEnabled(false);
                    PesquisarjButton.setVisible(true);

                    mensagemFiltroJLabel.setText("Selecione uma empresa!");
                    baixarboleto.preencherCombomBoxNomeEmpresa(parametroPesquisaBaixarBoletoJCombobox1);
                    parametroPesquisaBaixarBoletoJCombobox1.setEnabled(true);
                    break;
                case "Produto ou Serviço":
                    campo1jLabel.setVisible(true);
                    campo1jLabel.setText("Serviço");
                    campo2jLabel.setVisible(false);
                    itemUmPesquisaJTextField.setVisible(true);
                    itemDoisPesquisajFormattedTextField1.setVisible(false);
                    parametroPesquisaBaixarBoletoJCombobox1.setEnabled(false);
                    PesquisarjButton.setEnabled(true);
                    confirmarjButton.setEnabled(false);
                    PesquisarjButton.setVisible(true);
                    break;
                case "Período":
                    campo1jLabel.setVisible(true);
                    campo1jLabel.setText("Data inicio");
                    campo2jLabel.setVisible(true);
                    campo2jLabel.setText("Data final");
                    itemUmPesquisaJTextField.setVisible(true);
                    itemUmPesquisaJTextField.setEditable(true);
                    itemDoisPesquisajFormattedTextField1.setVisible(true);
                    parametroPesquisaBaixarBoletoJCombobox1.setEnabled(false);
                    PesquisarjButton.setEnabled(true);
                    confirmarjButton.setEnabled(false);
                    PesquisarjButton.setVisible(true);

                    break;
                case "Data":
                    campo1jLabel.setVisible(true);
                    campo1jLabel.setText("Data inicio");
                    campo2jLabel.setVisible(false);
                    itemUmPesquisaJTextField.setVisible(true);
                    itemDoisPesquisajFormattedTextField1.setVisible(false);
                    parametroPesquisaBaixarBoletoJCombobox1.setEnabled(false);
                    PesquisarjButton.setEnabled(true);
                    confirmarjButton.setEnabled(false);
                    PesquisarjButton.setVisible(true);
                    break;
                case "Pagador":
                    campo1jLabel.setVisible(true);
                    campo1jLabel.setText("Nome");
                    campo2jLabel.setVisible(false);
                    itemUmPesquisaJTextField.setVisible(true);
                    itemUmPesquisaJTextField.setEditable(true);
                    itemDoisPesquisajFormattedTextField1.setVisible(false);
                    parametroPesquisaBaixarBoletoJCombobox1.setEnabled(false);
                    PesquisarjButton.setEnabled(true);
                    confirmarjButton.setEnabled(false);
                    PesquisarjButton.setVisible(true);
                    break;
                default:
                    break;
            }
        }
        
        baixarboleto.limparTabelaPassivos(tabelaBaixarPassivosjTable);
        
    }

    public void selecionar() {
        BaixarBoleto p = new BaixarBoleto(conn);

        p.pegarDadosTabelaBaixarBoleto(
                  tabelaBaixarPassivosjTable,
                  nomeEmpresaBaixarPassivosJTextField,
                  produtoBaixarPassivosJTextField,
                  valorPagarBaixarPassivosjTextField,
                  dataVencimentoBaixarPassivojTextField,
                  parcelasPagarBaixarPassivojTextField,
                  numeroParcelaPassivoBaixarjTextField2,
                  cicloPagamentoBaixarPassivosJTextField,
                  formaPagamentoBaixarPassivoJTextField,
                  valorPagamentoBaixarPassivosjTextField1,
                  dataPagamentoBaixarPassivojTextField1,
                  localPagamentoBaixarPassivojCombobox,
                  pagadorPassivosBaixarjCombobox,
                  parametroPesquisaBaixarBoletoJCombobox1,
                  itemUmPesquisaJTextField,
                  itemDoisPesquisajFormattedTextField1,
                  atualizarBaixarPassivosjButton,
                  selecionarbaixarPassivosjButton,
                  novaBuscajButton,
                  imprimirPassivosjButton,
                  confirmarjButton,
                  PesquisarjButton
        );

        p.bloquearCamposBaixarBoleto(
                  tabelaBaixarPassivosjTable,
                  nomeEmpresaBaixarPassivosJTextField,
                  produtoBaixarPassivosJTextField,
                  valorPagarBaixarPassivosjTextField,
                  dataVencimentoBaixarPassivojTextField,
                  parcelasPagarBaixarPassivojTextField,
                  numeroParcelaPassivoBaixarjTextField2,
                  cicloPagamentoBaixarPassivosJTextField,
                  formaPagamentoBaixarPassivoJTextField,
                  valorPagamentoBaixarPassivosjTextField1,
                  dataPagamentoBaixarPassivojTextField1,
                  localPagamentoBaixarPassivojCombobox,
                  pagadorPassivosBaixarjCombobox,
                  parametroPesquisaBaixarBoletoJCombobox1,
                  itemUmPesquisaJTextField,
                  itemDoisPesquisajFormattedTextField1,
                  atualizarBaixarPassivosjButton,
                  selecionarbaixarPassivosjButton,
                  novaBuscajButton,
                  imprimirPassivosjButton,
                  confirmarjButton,
                  PesquisarjButton
        );

        atualizarBaixarPassivosjButton.setEnabled(true);
        selecionarbaixarPassivosjButton.setEnabled(false);
        imprimirPassivosjButton.setEnabled(false);

        valorPagamentoBaixarPassivosjTextField1.setEditable(true);
        dataPagamentoBaixarPassivojTextField1.setEditable(true);
        localPagamentoBaixarPassivojCombobox.setEnabled(true);
        pagadorPassivosBaixarjCombobox.setEnabled(true);

        itemUmPesquisaJTextField.setVisible(false);
        campo1jLabel.setVisible(false);
        itemDoisPesquisajFormattedTextField1.setVisible(false);
        campo2jLabel.setVisible(false);

        PesquisarjButton.setVisible(false);

        p.limparTabelaPassivos(tabelaBaixarPassivosjTable);

    }

    public void atualizar() {
        BaixarBoleto p = new BaixarBoleto(conn);

        p.atualizarBaixarBoleto(
                  tabelaBaixarPassivosjTable,
                  nomeEmpresaBaixarPassivosJTextField,
                  produtoBaixarPassivosJTextField,
                  valorPagarBaixarPassivosjTextField,
                  dataVencimentoBaixarPassivojTextField,
                  parcelasPagarBaixarPassivojTextField,
                  numeroParcelaPassivoBaixarjTextField2,
                  cicloPagamentoBaixarPassivosJTextField,
                  formaPagamentoBaixarPassivoJTextField,
                  valorPagamentoBaixarPassivosjTextField1,
                  dataPagamentoBaixarPassivojTextField1,
                  localPagamentoBaixarPassivojCombobox,
                  pagadorPassivosBaixarjCombobox,
                  parametroPesquisaBaixarBoletoJCombobox1,
                  itemUmPesquisaJTextField,
                  itemDoisPesquisajFormattedTextField1,
                  atualizarBaixarPassivosjButton,
                  selecionarbaixarPassivosjButton,
                  novaBuscajButton,
                  imprimirPassivosjButton,
                  confirmarjButton,
                  PesquisarjButton
        );

    }

    public void listar() {
        BaixarBoleto b = new BaixarBoleto(conn);

        b.listarBaixarBoleto(
                  tabelaBaixarPassivosjTable,
                  nomeEmpresaBaixarPassivosJTextField,
                  produtoBaixarPassivosJTextField,
                  valorPagarBaixarPassivosjTextField,
                  dataVencimentoBaixarPassivojTextField,
                  parcelasPagarBaixarPassivojTextField,
                  numeroParcelaPassivoBaixarjTextField2,
                  cicloPagamentoBaixarPassivosJTextField,
                  formaPagamentoBaixarPassivoJTextField,
                  valorPagamentoBaixarPassivosjTextField1,
                  dataPagamentoBaixarPassivojTextField1,
                  localPagamentoBaixarPassivojCombobox,
                  pagadorPassivosBaixarjCombobox,
                  parametroPesquisaBaixarBoletoJCombobox1,
                  itemUmPesquisaJTextField,
                  itemDoisPesquisajFormattedTextField1,
                  atualizarBaixarPassivosjButton,
                  selecionarbaixarPassivosjButton,
                  novaBuscajButton,
                  imprimirPassivosjButton,
                  confirmarjButton,
                  PesquisarjButton
        );

        b.limparBloquear(
                  tabelaBaixarPassivosjTable,
                  itemUmPesquisaJTextField,
                  itemUmPesquisaJTextField,
                  valorPagarBaixarPassivosjTextField,
                  itemUmPesquisaJTextField,
                  parcelasPagarBaixarPassivojTextField,
                  numeroParcelaPassivoBaixarjTextField2,
                  cicloPagamentoBaixarPassivosJTextField,
                  formaPagamentoBaixarPassivoJTextField,
                  valorPagamentoBaixarPassivosjTextField1,
                  formaPagamentoBaixarPassivoJTextField,
                  localPagamentoBaixarPassivojCombobox,
                  pagadorPassivosBaixarjCombobox,
                  parametroPesquisaBaixarBoletoJCombobox1,
                  itemUmPesquisaJTextField,
                  itemUmPesquisaJTextField,
                  atualizarBaixarPassivosjButton,
                  selecionarbaixarPassivosjButton,
                  novaBuscajButton,
                  imprimirPassivosjButton,
                  PesquisarjButton,
                  PesquisarjButton
        );

        selecionarbaixarPassivosjButton.setEnabled(true);
        
        mensagemFiltroJLabel.setText("");

    }

    public void novaBusca() {

        BaixarBoleto p = new BaixarBoleto(conn);
        parametroPesquisaBaixarBoletoJCombobox1.removeAllItems();
        parametroPesquisaBaixarBoletoJCombobox1.addItem("***  Selecione  ***");
        parametroPesquisaBaixarBoletoJCombobox1.addItem("Contas pagas");
        parametroPesquisaBaixarBoletoJCombobox1.addItem("Contas abertas");
        parametroPesquisaBaixarBoletoJCombobox1.addItem("Empresa");
        parametroPesquisaBaixarBoletoJCombobox1.addItem("Produto ou Serviço");
        parametroPesquisaBaixarBoletoJCombobox1.addItem("Período");
        parametroPesquisaBaixarBoletoJCombobox1.addItem("Data");
        parametroPesquisaBaixarBoletoJCombobox1.addItem("Pagador");
        parametroPesquisaBaixarBoletoJCombobox1.addItem("Todos");


        parametroPesquisaBaixarBoletoJCombobox1.setVisible(true);
        parametroPesquisaBaixarBoletoJCombobox1.setEnabled(true);
        parametroPesquisaBaixarBoletoJCombobox1.setSelectedItem("***  Pesquisar por  ***");
        confirmarjButton.setVisible(true);

        campo1jLabel.setVisible(false);
        campo2jLabel.setVisible(false);
        itemUmPesquisaJTextField.setVisible(false);
        itemDoisPesquisajFormattedTextField1.setVisible(false);
        PesquisarjButton.setVisible(false);

        p.limparTabelaPassivos(tabelaBaixarPassivosjTable);

        p.limparBloquear(
                  tabelaBaixarPassivosjTable,
                  nomeEmpresaBaixarPassivosJTextField,
                  produtoBaixarPassivosJTextField,
                  valorPagarBaixarPassivosjTextField,
                  dataVencimentoBaixarPassivojTextField,
                  parcelasPagarBaixarPassivojTextField,
                  numeroParcelaPassivoBaixarjTextField2,
                  cicloPagamentoBaixarPassivosJTextField,
                  formaPagamentoBaixarPassivoJTextField,
                  valorPagamentoBaixarPassivosjTextField1,
                  dataPagamentoBaixarPassivojTextField1,
                  localPagamentoBaixarPassivojCombobox,
                  pagadorPassivosBaixarjCombobox,
                  parametroPesquisaBaixarBoletoJCombobox1,
                  itemUmPesquisaJTextField,
                  itemDoisPesquisajFormattedTextField1,
                  atualizarBaixarPassivosjButton,
                  selecionarbaixarPassivosjButton,
                  novaBuscajButton,
                  imprimirPassivosjButton,
                  confirmarjButton,
                  PesquisarjButton
        );

        confirmarjButton.setEnabled(true);
        
        mensagemFiltroJLabel.setText("");
    }

    private void novaBuscajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaBuscajButtonActionPerformed
        novaBusca();
    }//GEN-LAST:event_novaBuscajButtonActionPerformed

    private void atualizarBaixarPassivosjButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atualizarBaixarPassivosjButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            atualizar();
        }
    }//GEN-LAST:event_atualizarBaixarPassivosjButtonKeyPressed

    private void novaBuscajButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novaBuscajButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            novaBusca();
        }
    }//GEN-LAST:event_novaBuscajButtonKeyPressed

    private void tabelaBaixarPassivosjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaBaixarPassivosjTableMouseClicked
        if (evt.getClickCount() == 2) {
            selecionar();
        }
    }//GEN-LAST:event_tabelaBaixarPassivosjTableMouseClicked

    private void selecionarbaixarPassivosjButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selecionarbaixarPassivosjButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            selecionar();
        }
    }//GEN-LAST:event_selecionarbaixarPassivosjButtonKeyPressed

    private void imprimirPassivosjButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imprimirPassivosjButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.dispose();
        }
    }//GEN-LAST:event_imprimirPassivosjButtonKeyPressed

    private void tabelaBaixarPassivosjTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaBaixarPassivosjTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            selecionarbaixarPassivosjButton.requestFocus();
        }
    }//GEN-LAST:event_tabelaBaixarPassivosjTableKeyPressed

    private void confirmarjButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmarjButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (parametroPesquisaBaixarBoletoJCombobox1.getSelectedItem().toString() == "Período"
                      || parametroPesquisaBaixarBoletoJCombobox1.getSelectedItem().toString() == "Data") {
                try {
                    confirmarPesquisaEscolhaParametro();
                } catch (SQLException ex) {
                    Logger.getLogger(BaixarBoletoJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                listar();
            }
        }
    }//GEN-LAST:event_confirmarjButtonKeyPressed

    private void PesquisarjButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisarjButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listar();
        }
    }//GEN-LAST:event_PesquisarjButtonKeyPressed

    private void voltarBaixarBoletoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBaixarBoletoJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarBaixarBoletoJButtonActionPerformed

    private void voltarBaixarBoletoJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_voltarBaixarBoletoJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.dispose();
        }
    }//GEN-LAST:event_voltarBaixarBoletoJButtonKeyPressed

//    //METODO PARA EXIBIR DADOS EM OUTRA TELA.
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
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BaixarBoletoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaixarBoletoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaixarBoletoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaixarBoletoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BaixarBoletoJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PassivosjPanel;
    private javax.swing.JButton PesquisarjButton;
    private javax.swing.JButton atualizarBaixarPassivosjButton;
    private javax.swing.JLabel campo1jLabel;
    private javax.swing.JLabel campo2jLabel;
    private javax.swing.JTextField cicloPagamentoBaixarPassivosJTextField;
    private javax.swing.JButton confirmarjButton;
    private javax.swing.JFormattedTextField dataPagamentoBaixarPassivojTextField1;
    private javax.swing.JFormattedTextField dataVencimentoBaixarPassivojTextField;
    private javax.swing.JTextField formaPagamentoBaixarPassivoJTextField;
    private javax.swing.JButton imprimirPassivosjButton;
    private javax.swing.JFormattedTextField itemDoisPesquisajFormattedTextField1;
    private javax.swing.JFormattedTextField itemUmPesquisaJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> localPagamentoBaixarPassivojCombobox;
    private javax.swing.JLabel mensagemFiltroJLabel;
    private javax.swing.JTextField nomeEmpresaBaixarPassivosJTextField;
    private javax.swing.JButton novaBuscajButton;
    private javax.swing.JTextField numeroParcelaPassivoBaixarjTextField2;
    private javax.swing.JComboBox<String> pagadorPassivosBaixarjCombobox;
    private javax.swing.JComboBox<String> parametroPesquisaBaixarBoletoJCombobox1;
    private javax.swing.JTextField parcelasPagarBaixarPassivojTextField;
    private javax.swing.JTextField produtoBaixarPassivosJTextField;
    private javax.swing.JButton selecionarbaixarPassivosjButton;
    private javax.swing.JTable tabelaBaixarPassivosjTable;
    public javax.swing.JTextField valorPagamentoBaixarPassivosjTextField1;
    public javax.swing.JTextField valorPagarBaixarPassivosjTextField;
    private javax.swing.JButton voltarBaixarBoletoJButton;
    // End of variables declaration//GEN-END:variables
}
