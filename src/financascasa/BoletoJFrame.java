package financascasa;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas borges egidio
 * @since 27/09/2018.
 */
public final class BoletoJFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    Connection conn;

    public BoletoJFrame() {
        initComponents();
    }

    public BoletoJFrame(Connection conn) throws SQLException {
        initComponents();
        this.conn = conn;

        Boleto boleto = new Boleto(conn);

        boleto.bloquearFormularioBoleto(
                  tabelaBoletoJTable,
                  empresaBoletoJCombobox,
                  servicoBoletoJCombobox,
                  valorPagarBoletoJTextField,
                  vencimentoBoletoJTextField,
                  parcelasBoletoJTextField,
                  numeroParcelasBoletoJTextField,
                  cicloBoletoJComboBox,
                  formaPagamentoBoletoJComboBox,
                  CadastrarBoletoJButton,
                  atualizarBoletoJButton,
                  excluirBoletoJButton,
                  selecionarBoletoJButton,
                  novoCadastroBoletoJButton,
                  listarBoletoJButton,
                  imprimirBoletoJButton
        );

        boleto.preencherCombomBoxNomeEmpresa(empresaBoletoJCombobox);

        boleto.preencherCombomBoxProduto(servicoBoletoJCombobox);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        PassivosjPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaBoletoJTable = new javax.swing.JTable();
        listarBoletoJButton = new javax.swing.JButton();
        selecionarBoletoJButton = new javax.swing.JButton();
        imprimirBoletoJButton = new javax.swing.JButton();
        voltarBoletoJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CadastrarBoletoJButton = new javax.swing.JButton();
        excluirBoletoJButton = new javax.swing.JButton();
        atualizarBoletoJButton = new javax.swing.JButton();
        novoCadastroBoletoJButton = new javax.swing.JButton();
        valorPagarBoletoJTextField = new javax.swing.JTextField();
        cicloBoletoJComboBox = new javax.swing.JComboBox<>();
        vencimentoBoletoJTextField = new javax.swing.JFormattedTextField();
        formaPagamentoBoletoJComboBox = new javax.swing.JComboBox<>();
        empresaBoletoJCombobox = new javax.swing.JComboBox<>();
        servicoBoletoJCombobox = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        parcelasBoletoJTextField = new javax.swing.JTextField();
        numeroParcelasBoletoJTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        PassivosjPanel.setBackground(new java.awt.Color(0, 0, 0));

        tabelaBoletoJTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabelaBoletoJTable.setForeground(new java.awt.Color(0, 102, 153));
        tabelaBoletoJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empresa", "Serviço", "Vencimento", "Valor Boleto", "Parcela"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaBoletoJTable.getTableHeader().setReorderingAllowed(false);
        tabelaBoletoJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaBoletoJTableMouseClicked(evt);
            }
        });
        tabelaBoletoJTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaBoletoJTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaBoletoJTable);

        listarBoletoJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listarBoletoJButton.setForeground(new java.awt.Color(0, 102, 153));
        listarBoletoJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consultarProtuto (1).png"))); // NOI18N
        listarBoletoJButton.setText("Listar Boletos");
        listarBoletoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarBoletoJButtonActionPerformed(evt);
            }
        });
        listarBoletoJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listarBoletoJButtonKeyPressed(evt);
            }
        });

        selecionarBoletoJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selecionarBoletoJButton.setForeground(new java.awt.Color(0, 102, 153));
        selecionarBoletoJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dedo.png"))); // NOI18N
        selecionarBoletoJButton.setText("Selecionar");
        selecionarBoletoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarBoletoJButtonActionPerformed(evt);
            }
        });
        selecionarBoletoJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                selecionarBoletoJButtonKeyPressed(evt);
            }
        });

        imprimirBoletoJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        imprimirBoletoJButton.setForeground(new java.awt.Color(0, 102, 153));
        imprimirBoletoJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PDF.png"))); // NOI18N
        imprimirBoletoJButton.setText("Imprimir");
        imprimirBoletoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirBoletoJButtonActionPerformed(evt);
            }
        });
        imprimirBoletoJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imprimirBoletoJButtonKeyPressed(evt);
            }
        });

        voltarBoletoJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        voltarBoletoJButton.setForeground(new java.awt.Color(0, 102, 153));
        voltarBoletoJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        voltarBoletoJButton.setText("Voltar Menu");
        voltarBoletoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBoletoJButtonActionPerformed(evt);
            }
        });
        voltarBoletoJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                voltarBoletoJButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PassivosjPanelLayout = new javax.swing.GroupLayout(PassivosjPanel);
        PassivosjPanel.setLayout(PassivosjPanelLayout);
        PassivosjPanelLayout.setHorizontalGroup(
            PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassivosjPanelLayout.createSequentialGroup()
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(PassivosjPanelLayout.createSequentialGroup()
                        .addComponent(selecionarBoletoJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(imprimirBoletoJButton)
                        .addGap(18, 31, Short.MAX_VALUE)
                        .addComponent(voltarBoletoJButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassivosjPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listarBoletoJButton)))
                .addContainerGap())
        );
        PassivosjPanelLayout.setVerticalGroup(
            PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassivosjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listarBoletoJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecionarBoletoJButton)
                    .addComponent(imprimirBoletoJButton)
                    .addComponent(voltarBoletoJButton))
                .addContainerGap())
        );

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

        CadastrarBoletoJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CadastrarBoletoJButton.setForeground(new java.awt.Color(0, 102, 153));
        CadastrarBoletoJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        CadastrarBoletoJButton.setText("Cadastrar");
        CadastrarBoletoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarBoletoJButtonActionPerformed(evt);
            }
        });
        CadastrarBoletoJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CadastrarBoletoJButtonKeyPressed(evt);
            }
        });

        excluirBoletoJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        excluirBoletoJButton.setForeground(new java.awt.Color(0, 102, 153));
        excluirBoletoJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir (1).png"))); // NOI18N
        excluirBoletoJButton.setText("Excluir");
        excluirBoletoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBoletoJButtonActionPerformed(evt);
            }
        });
        excluirBoletoJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                excluirBoletoJButtonKeyPressed(evt);
            }
        });

        atualizarBoletoJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        atualizarBoletoJButton.setForeground(new java.awt.Color(0, 102, 153));
        atualizarBoletoJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizar.png"))); // NOI18N
        atualizarBoletoJButton.setText("Atualizar");
        atualizarBoletoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBoletoJButtonActionPerformed(evt);
            }
        });
        atualizarBoletoJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                atualizarBoletoJButtonKeyPressed(evt);
            }
        });

        novoCadastroBoletoJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        novoCadastroBoletoJButton.setForeground(new java.awt.Color(0, 102, 153));
        novoCadastroBoletoJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartao.png"))); // NOI18N
        novoCadastroBoletoJButton.setText("Novo Boleto");
        novoCadastroBoletoJButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                novoCadastroBoletoJButtonFocusGained(evt);
            }
        });
        novoCadastroBoletoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoCadastroBoletoJButtonActionPerformed(evt);
            }
        });
        novoCadastroBoletoJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                novoCadastroBoletoJButtonKeyPressed(evt);
            }
        });

        valorPagarBoletoJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valorPagarBoletoJTextField.setForeground(new java.awt.Color(0, 102, 153));
        valorPagarBoletoJTextField.setToolTipText("");
        valorPagarBoletoJTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valorPagarBoletoJTextFieldMouseClicked(evt);
            }
        });
        valorPagarBoletoJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorPagarBoletoJTextFieldKeyPressed(evt);
            }
        });

        cicloBoletoJComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cicloBoletoJComboBox.setForeground(new java.awt.Color(0, 102, 153));
        cicloBoletoJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "***  Selecione  ***", "Diário", "Semanal", "Quinzenal", "Mensal", "Bimestral", "Trimestral", "Simestral", "Anual" }));

        vencimentoBoletoJTextField.setForeground(new java.awt.Color(0, 102, 153));
        try {
            vencimentoBoletoJTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        vencimentoBoletoJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vencimentoBoletoJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vencimentoBoletoJTextFieldActionPerformed(evt);
            }
        });

        formaPagamentoBoletoJComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        formaPagamentoBoletoJComboBox.setForeground(new java.awt.Color(0, 102, 153));
        formaPagamentoBoletoJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "***  Selecione  ***", "Dinheiro", "Boleto", "Transferência Bancária", "Cartão Crédito", "Cartão Débito", "Depósito Bancário" }));

        empresaBoletoJCombobox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empresaBoletoJCombobox.setForeground(new java.awt.Color(0, 102, 153));
        empresaBoletoJCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "***  Selecione  ***", "Diário", "Semanal", "Quinzenal", "Mensal", "Bimestral", "Trimestral", "Simestral", "Anual" }));

        servicoBoletoJCombobox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        servicoBoletoJCombobox.setForeground(new java.awt.Color(0, 102, 153));
        servicoBoletoJCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "***  Selecione  ***", "Diário", "Semanal", "Quinzenal", "Mensal", "Bimestral", "Trimestral", "Simestral", "Anual" }));
        servicoBoletoJCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicoBoletoJComboboxActionPerformed(evt);
            }
        });
        servicoBoletoJCombobox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                servicoBoletoJComboboxKeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Número da parcela");

        parcelasBoletoJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        parcelasBoletoJTextField.setForeground(new java.awt.Color(0, 102, 153));
        parcelasBoletoJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcelasBoletoJTextFieldActionPerformed(evt);
            }
        });

        numeroParcelasBoletoJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numeroParcelasBoletoJTextField.setForeground(new java.awt.Color(0, 102, 153));

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
                            .addComponent(vencimentoBoletoJTextField)
                            .addComponent(empresaBoletoJCombobox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(servicoBoletoJCombobox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(parcelasBoletoJTextField)
                            .addComponent(valorPagarBoletoJTextField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CadastrarBoletoJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atualizarBoletoJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(excluirBoletoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                            .addComponent(cicloBoletoJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(formaPagamentoBoletoJComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numeroParcelasBoletoJTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(novoCadastroBoletoJButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(novoCadastroBoletoJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(empresaBoletoJCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(servicoBoletoJCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(valorPagarBoletoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(vencimentoBoletoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(parcelasBoletoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(numeroParcelasBoletoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cicloBoletoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formaPagamentoBoletoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarBoletoJButton)
                    .addComponent(excluirBoletoJButton)
                    .addComponent(CadastrarBoletoJButton))
                .addContainerGap())
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consultarVenda.png"))); // NOI18N
        jLabel11.setText("jLabel10");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DIMTECH - SISTEMA FINANCEIRO");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cadastro de Boletos");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoDIMTech1.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jLabel12.setText("jLabel10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PassivosjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PassivosjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jLabel12)
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

    private void CadastrarBoletoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarBoletoJButtonActionPerformed

        cadastrar();

    }//GEN-LAST:event_CadastrarBoletoJButtonActionPerformed

    private void excluirBoletoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBoletoJButtonActionPerformed

        excluir();
    }//GEN-LAST:event_excluirBoletoJButtonActionPerformed

    private void atualizarBoletoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBoletoJButtonActionPerformed

        atualizar();

    }//GEN-LAST:event_atualizarBoletoJButtonActionPerformed

    private void novoCadastroBoletoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoCadastroBoletoJButtonActionPerformed

        novocadastro();

    }//GEN-LAST:event_novoCadastroBoletoJButtonActionPerformed

    private void listarBoletoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarBoletoJButtonActionPerformed
        listar();
    }//GEN-LAST:event_listarBoletoJButtonActionPerformed

    private void selecionarBoletoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarBoletoJButtonActionPerformed

        selecionar();

    }//GEN-LAST:event_selecionarBoletoJButtonActionPerformed

    private void imprimirBoletoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirBoletoJButtonActionPerformed
imprimir();
    }//GEN-LAST:event_imprimirBoletoJButtonActionPerformed

    TesteJFrame jfTelaSec = new TesteJFrame(conn);

    private void vencimentoBoletoJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vencimentoBoletoJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vencimentoBoletoJTextFieldActionPerformed

    private void servicoBoletoJComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicoBoletoJComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servicoBoletoJComboboxActionPerformed

    private void voltarBoletoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBoletoJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarBoletoJButtonActionPerformed

    private void parcelasBoletoJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcelasBoletoJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parcelasBoletoJTextFieldActionPerformed

    private void selecionarBoletoJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selecionarBoletoJButtonKeyPressed
        selecionar();
    }//GEN-LAST:event_selecionarBoletoJButtonKeyPressed

    private void tabelaBoletoJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaBoletoJTableMouseClicked
        if (evt.getClickCount() == 2) {
            selecionar();
        }
    }//GEN-LAST:event_tabelaBoletoJTableMouseClicked

    private void voltarBoletoJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_voltarBoletoJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.dispose();
        }
    }//GEN-LAST:event_voltarBoletoJButtonKeyPressed

    private void tabelaBoletoJTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaBoletoJTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            selecionarBoletoJButton.requestFocus();
        }
    }//GEN-LAST:event_tabelaBoletoJTableKeyPressed

    private void listarBoletoJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listarBoletoJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listar();
        }
    }//GEN-LAST:event_listarBoletoJButtonKeyPressed

    private void CadastrarBoletoJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CadastrarBoletoJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cadastrar();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_CadastrarBoletoJButtonKeyPressed

    private void atualizarBoletoJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atualizarBoletoJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            atualizar();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_atualizarBoletoJButtonKeyPressed

    private void excluirBoletoJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_excluirBoletoJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            excluir();

        }        // TODO add your handling code here:
    }//GEN-LAST:event_excluirBoletoJButtonKeyPressed

    private void novoCadastroBoletoJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novoCadastroBoletoJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            novocadastro();
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_novoCadastroBoletoJButtonKeyPressed

    private void imprimirBoletoJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imprimirBoletoJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            imprimir();
        }
    }//GEN-LAST:event_imprimirBoletoJButtonKeyPressed

    private void novoCadastroBoletoJButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_novoCadastroBoletoJButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_novoCadastroBoletoJButtonFocusGained

    private void valorPagarBoletoJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorPagarBoletoJTextFieldKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_valorPagarBoletoJTextFieldKeyPressed

    private void valorPagarBoletoJTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorPagarBoletoJTextFieldMouseClicked
    }//GEN-LAST:event_valorPagarBoletoJTextFieldMouseClicked

    private void servicoBoletoJComboboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_servicoBoletoJComboboxKeyPressed
    }//GEN-LAST:event_servicoBoletoJComboboxKeyPressed

    public void cadastrar() {
        Boleto boleto = new Boleto(conn);

        boleto.cadastrarBoleto(
                  tabelaBoletoJTable,
                  empresaBoletoJCombobox,
                  servicoBoletoJCombobox,
                  valorPagarBoletoJTextField,
                  vencimentoBoletoJTextField,
                  parcelasBoletoJTextField,
                  numeroParcelasBoletoJTextField,
                  cicloBoletoJComboBox,
                  formaPagamentoBoletoJComboBox,
                  CadastrarBoletoJButton,
                  atualizarBoletoJButton,
                  excluirBoletoJButton,
                  selecionarBoletoJButton,
                  novoCadastroBoletoJButton,
                  listarBoletoJButton,
                  imprimirBoletoJButton
        );
    }

    public void excluir() {

        Boleto p = new Boleto(conn);

        p.excluirBoleto(
                  tabelaBoletoJTable,
                  empresaBoletoJCombobox,
                  servicoBoletoJCombobox,
                  valorPagarBoletoJTextField,
                  vencimentoBoletoJTextField,
                  parcelasBoletoJTextField,
                  numeroParcelasBoletoJTextField,
                  cicloBoletoJComboBox,
                  formaPagamentoBoletoJComboBox,
                  CadastrarBoletoJButton,
                  atualizarBoletoJButton,
                  excluirBoletoJButton,
                  selecionarBoletoJButton,
                  novoCadastroBoletoJButton,
                  listarBoletoJButton,
                  imprimirBoletoJButton
        );
    }

    public void atualizar() {
        Boleto p = new Boleto(conn);

        p.atualizarBoleto(
                  tabelaBoletoJTable,
                  empresaBoletoJCombobox,
                  servicoBoletoJCombobox,
                  valorPagarBoletoJTextField,
                  vencimentoBoletoJTextField,
                  parcelasBoletoJTextField,
                  numeroParcelasBoletoJTextField,
                  cicloBoletoJComboBox,
                  formaPagamentoBoletoJComboBox,
                  CadastrarBoletoJButton,
                  atualizarBoletoJButton,
                  excluirBoletoJButton,
                  selecionarBoletoJButton,
                  novoCadastroBoletoJButton,
                  listarBoletoJButton,
                  imprimirBoletoJButton
        );
    }

    public void novocadastro() {

        Boleto p = new Boleto(conn);

        p.limparFormularioBoleto(
                  tabelaBoletoJTable,
                  empresaBoletoJCombobox,
                  servicoBoletoJCombobox,
                  valorPagarBoletoJTextField,
                  vencimentoBoletoJTextField,
                  parcelasBoletoJTextField,
                  numeroParcelasBoletoJTextField,
                  cicloBoletoJComboBox,
                  formaPagamentoBoletoJComboBox,
                  CadastrarBoletoJButton,
                  atualizarBoletoJButton,
                  excluirBoletoJButton,
                  selecionarBoletoJButton,
                  novoCadastroBoletoJButton,
                  listarBoletoJButton,
                  imprimirBoletoJButton
        );

        p.liberarFormularioBoleto(
                  tabelaBoletoJTable,
                  empresaBoletoJCombobox,
                  servicoBoletoJCombobox,
                  valorPagarBoletoJTextField,
                  vencimentoBoletoJTextField,
                  parcelasBoletoJTextField,
                  numeroParcelasBoletoJTextField,
                  cicloBoletoJComboBox,
                  formaPagamentoBoletoJComboBox,
                  CadastrarBoletoJButton,
                  atualizarBoletoJButton,
                  excluirBoletoJButton,
                  selecionarBoletoJButton,
                  novoCadastroBoletoJButton,
                  listarBoletoJButton,
                  imprimirBoletoJButton
        );

        p.limparTabelaBoleto(tabelaBoletoJTable);

        empresaBoletoJCombobox.requestFocus();

        numeroParcelasBoletoJTextField.setEditable(false);
        CadastrarBoletoJButton.setEnabled(true);
        excluirBoletoJButton.setEnabled(false);
        atualizarBoletoJButton.setEnabled(false);

    }

    public void listar() {

        Boleto p = new Boleto(conn);

        p.listarBoleto(tabelaBoletoJTable);

        p.limparFormularioBoleto(
                  tabelaBoletoJTable,
                  empresaBoletoJCombobox,
                  servicoBoletoJCombobox,
                  valorPagarBoletoJTextField,
                  vencimentoBoletoJTextField,
                  parcelasBoletoJTextField,
                  numeroParcelasBoletoJTextField,
                  cicloBoletoJComboBox,
                  formaPagamentoBoletoJComboBox,
                  CadastrarBoletoJButton,
                  atualizarBoletoJButton,
                  excluirBoletoJButton,
                  selecionarBoletoJButton,
                  novoCadastroBoletoJButton,
                  listarBoletoJButton,
                  imprimirBoletoJButton
        );

        p.bloquearFormularioBoleto(tabelaBoletoJTable,
                  empresaBoletoJCombobox,
                  servicoBoletoJCombobox,
                  valorPagarBoletoJTextField,
                  vencimentoBoletoJTextField,
                  parcelasBoletoJTextField,
                  numeroParcelasBoletoJTextField,
                  cicloBoletoJComboBox,
                  formaPagamentoBoletoJComboBox,
                  CadastrarBoletoJButton,
                  atualizarBoletoJButton,
                  excluirBoletoJButton,
                  selecionarBoletoJButton,
                  novoCadastroBoletoJButton,
                  listarBoletoJButton,
                  imprimirBoletoJButton
        );

        CadastrarBoletoJButton.setEnabled(false);
        tabelaBoletoJTable.setEnabled(true);
        imprimirBoletoJButton.setEnabled(true);
        selecionarBoletoJButton.setEnabled(true);

    }

    public void selecionar() {

        Boleto p = new Boleto(conn);

        if (tabelaBoletoJTable.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "ATENÇÂO!" + "\nSelecione uma linha na tabela!");
        } else {
            p.pegarDadosTabelaBoleto(
                      tabelaBoletoJTable,
                      empresaBoletoJCombobox,
                      servicoBoletoJCombobox,
                      valorPagarBoletoJTextField,
                      vencimentoBoletoJTextField,
                      parcelasBoletoJTextField,
                      numeroParcelasBoletoJTextField,
                      cicloBoletoJComboBox,
                      formaPagamentoBoletoJComboBox,
                      CadastrarBoletoJButton,
                      atualizarBoletoJButton,
                      excluirBoletoJButton,
                      selecionarBoletoJButton,
                      novoCadastroBoletoJButton,
                      listarBoletoJButton,
                      imprimirBoletoJButton
            );
            p.limparTabelaBoleto(tabelaBoletoJTable);

            p.liberarFormularioBoleto(
                      tabelaBoletoJTable,
                      empresaBoletoJCombobox,
                      servicoBoletoJCombobox,
                      valorPagarBoletoJTextField,
                      vencimentoBoletoJTextField,
                      parcelasBoletoJTextField,
                      numeroParcelasBoletoJTextField,
                      cicloBoletoJComboBox,
                      formaPagamentoBoletoJComboBox,
                      CadastrarBoletoJButton,
                      atualizarBoletoJButton,
                      excluirBoletoJButton,
                      selecionarBoletoJButton,
                      novoCadastroBoletoJButton,
                      listarBoletoJButton,
                      imprimirBoletoJButton
            );

            empresaBoletoJCombobox.setEnabled(false);
            vencimentoBoletoJTextField.setEditable(false);
            parcelasBoletoJTextField.setEditable(false);
            numeroParcelasBoletoJTextField.setEditable(false);

            CadastrarBoletoJButton.setEnabled(false);
            atualizarBoletoJButton.setEnabled(true);
            excluirBoletoJButton.setEnabled(true);
            selecionarBoletoJButton.setEnabled(false);
            imprimirBoletoJButton.setEnabled(false);

            servicoBoletoJCombobox.requestFocus();
        }
    }
    
    public void imprimir(){
        
         Utilitario util = new Utilitario(conn);

        String relatorio = "src/financascasa/Boleto.jasper";

        util.relatorio(relatorio);
        
    }

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
            java.util.logging.Logger.getLogger(BoletoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoletoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoletoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoletoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BoletoJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarBoletoJButton;
    private javax.swing.JPanel PassivosjPanel;
    private javax.swing.JButton atualizarBoletoJButton;
    private javax.swing.JComboBox<String> cicloBoletoJComboBox;
    private javax.swing.JComboBox<String> empresaBoletoJCombobox;
    private javax.swing.JButton excluirBoletoJButton;
    private javax.swing.JComboBox<String> formaPagamentoBoletoJComboBox;
    private javax.swing.JButton imprimirBoletoJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listarBoletoJButton;
    private javax.swing.JButton novoCadastroBoletoJButton;
    private javax.swing.JTextField numeroParcelasBoletoJTextField;
    private javax.swing.JTextField parcelasBoletoJTextField;
    private javax.swing.JButton selecionarBoletoJButton;
    private javax.swing.JComboBox<String> servicoBoletoJCombobox;
    private javax.swing.JTable tabelaBoletoJTable;
    private javax.swing.JTextField valorPagarBoletoJTextField;
    private javax.swing.JFormattedTextField vencimentoBoletoJTextField;
    private javax.swing.JButton voltarBoletoJButton;
    // End of variables declaration//GEN-END:variables
}
