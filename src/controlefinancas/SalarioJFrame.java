package controlefinancas;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas borges egidio
 * @since 26/09/2018
 */
public class SalarioJFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    Connection conn;

    public SalarioJFrame() {
        initComponents();
    }

    public SalarioJFrame(Connection conn) throws SQLException {
        initComponents();
        this.conn = conn;

        Salario salario = new Salario(conn);

        salario.bloquearCamposSalario(tabelaSalarioJTable,
                  empresaSalarioJComboBox,
                  valorSalarioJTextField,
                  dataRecebimentoJTextField,
                  cicloPagamentoSalarioJTextField,
                  cadastrarSalarioJButton,
                  atualizarSalarioJButton,
                  excluirSalarioJBttuon,
                  selecionarSalarioJButton,
                  imprimirSalarioJButton,
                  novoCadastroSalarioJButton,
                  listarSalarioJButton,
                  voltarSalarioJButton
        );

        salario.preencherCombomBoxNomeEmpresa(empresaSalarioJComboBox);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valorSalarioJTextField = new javax.swing.JTextField();
        cadastrarSalarioJButton = new javax.swing.JButton();
        excluirSalarioJBttuon = new javax.swing.JButton();
        atualizarSalarioJButton = new javax.swing.JButton();
        novoCadastroSalarioJButton = new javax.swing.JButton();
        dataRecebimentoJTextField = new javax.swing.JFormattedTextField();
        cicloPagamentoSalarioJTextField = new javax.swing.JComboBox<>();
        empresaSalarioJComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSalarioJTable = new javax.swing.JTable();
        listarSalarioJButton = new javax.swing.JButton();
        selecionarSalarioJButton = new javax.swing.JButton();
        imprimirSalarioJButton = new javax.swing.JButton();
        voltarSalarioJButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nome Empresa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Salário");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Data recebimento");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Ciclo de pagamento");

        valorSalarioJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valorSalarioJTextField.setForeground(new java.awt.Color(0, 102, 153));

        cadastrarSalarioJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cadastrarSalarioJButton.setForeground(new java.awt.Color(0, 102, 153));
        cadastrarSalarioJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        cadastrarSalarioJButton.setText("Cadastrar");
        cadastrarSalarioJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarSalarioJButtonActionPerformed(evt);
            }
        });
        cadastrarSalarioJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastrarSalarioJButtonKeyPressed(evt);
            }
        });

        excluirSalarioJBttuon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        excluirSalarioJBttuon.setForeground(new java.awt.Color(0, 102, 153));
        excluirSalarioJBttuon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir (1).png"))); // NOI18N
        excluirSalarioJBttuon.setText("Excluir");
        excluirSalarioJBttuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirSalarioJBttuonActionPerformed(evt);
            }
        });
        excluirSalarioJBttuon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                excluirSalarioJBttuonKeyPressed(evt);
            }
        });

        atualizarSalarioJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        atualizarSalarioJButton.setForeground(new java.awt.Color(0, 102, 153));
        atualizarSalarioJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizar.png"))); // NOI18N
        atualizarSalarioJButton.setText("Atualizar");
        atualizarSalarioJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarSalarioJButtonActionPerformed(evt);
            }
        });
        atualizarSalarioJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                atualizarSalarioJButtonKeyPressed(evt);
            }
        });

        novoCadastroSalarioJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        novoCadastroSalarioJButton.setForeground(new java.awt.Color(0, 102, 153));
        novoCadastroSalarioJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/meuCaixa.png"))); // NOI18N
        novoCadastroSalarioJButton.setText("Novo Salário");
        novoCadastroSalarioJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoCadastroSalarioJButtonActionPerformed(evt);
            }
        });
        novoCadastroSalarioJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                novoCadastroSalarioJButtonKeyPressed(evt);
            }
        });

        dataRecebimentoJTextField.setForeground(new java.awt.Color(0, 102, 153));
        try {
            dataRecebimentoJTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataRecebimentoJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        cicloPagamentoSalarioJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cicloPagamentoSalarioJTextField.setForeground(new java.awt.Color(0, 102, 153));
        cicloPagamentoSalarioJTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "***  Selecione  ***", "Diário", "Semanal", "Quinzenal", "Mensal", "Bimestral", "Trimestral", "Simestral", "Anual" }));

        empresaSalarioJComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empresaSalarioJComboBox.setForeground(new java.awt.Color(0, 102, 153));
        empresaSalarioJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "***  Selecione  ***", "Diário", "Semanal", "Quinzenal", "Mensal", "Bimestral", "Trimestral", "Simestral", "Anual" }));
        empresaSalarioJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresaSalarioJComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataRecebimentoJTextField)
                            .addComponent(cicloPagamentoSalarioJTextField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(empresaSalarioJComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorSalarioJTextField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(novoCadastroSalarioJButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cadastrarSalarioJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(atualizarSalarioJButton)
                                .addGap(18, 18, 18)
                                .addComponent(excluirSalarioJBttuon)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(novoCadastroSalarioJButton)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(empresaSalarioJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorSalarioJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dataRecebimentoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cicloPagamentoSalarioJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 154, 154)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarSalarioJButton)
                    .addComponent(excluirSalarioJBttuon)
                    .addComponent(cadastrarSalarioJButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        tabelaSalarioJTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabelaSalarioJTable.setForeground(new java.awt.Color(0, 102, 153));
        tabelaSalarioJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Empresa", "Salario", "Data Recebimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaSalarioJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaSalarioJTableMouseClicked(evt);
            }
        });
        tabelaSalarioJTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaSalarioJTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaSalarioJTable);

        listarSalarioJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listarSalarioJButton.setForeground(new java.awt.Color(0, 102, 153));
        listarSalarioJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorioCaixa.png"))); // NOI18N
        listarSalarioJButton.setText("Listar Salários");
        listarSalarioJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarSalarioJButtonActionPerformed(evt);
            }
        });
        listarSalarioJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listarSalarioJButtonKeyPressed(evt);
            }
        });

        selecionarSalarioJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selecionarSalarioJButton.setForeground(new java.awt.Color(0, 102, 153));
        selecionarSalarioJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dedo.png"))); // NOI18N
        selecionarSalarioJButton.setText("Selecionar");
        selecionarSalarioJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarSalarioJButtonActionPerformed(evt);
            }
        });
        selecionarSalarioJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                selecionarSalarioJButtonKeyPressed(evt);
            }
        });

        imprimirSalarioJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        imprimirSalarioJButton.setForeground(new java.awt.Color(0, 102, 153));
        imprimirSalarioJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PDF.png"))); // NOI18N
        imprimirSalarioJButton.setText("Imprimir");
        imprimirSalarioJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirSalarioJButtonActionPerformed(evt);
            }
        });
        imprimirSalarioJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imprimirSalarioJButtonKeyPressed(evt);
            }
        });

        voltarSalarioJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        voltarSalarioJButton.setForeground(new java.awt.Color(0, 102, 153));
        voltarSalarioJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        voltarSalarioJButton.setText("Voltar Menu");
        voltarSalarioJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarSalarioJButtonActionPerformed(evt);
            }
        });
        voltarSalarioJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                voltarSalarioJButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(selecionarSalarioJButton)
                        .addGap(18, 18, 18)
                        .addComponent(imprimirSalarioJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(voltarSalarioJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(listarSalarioJButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listarSalarioJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecionarSalarioJButton)
                    .addComponent(imprimirSalarioJButton)
                    .addComponent(voltarSalarioJButton))
                .addContainerGap())
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consultarVenda.png"))); // NOI18N
        jLabel11.setText("jLabel10");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cadastro de Salários");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DIMTECH - SISTEMA FINANCEIRO");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoDIMTech1.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jLabel12.setText("jLabel10");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarSalarioJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarSalarioJButtonActionPerformed
        listar();
    }//GEN-LAST:event_listarSalarioJButtonActionPerformed

    private void selecionarSalarioJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarSalarioJButtonActionPerformed
        selecionar();
    }//GEN-LAST:event_selecionarSalarioJButtonActionPerformed

    private void cadastrarSalarioJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarSalarioJButtonActionPerformed
        cadastrar();
    }//GEN-LAST:event_cadastrarSalarioJButtonActionPerformed

    private void excluirSalarioJBttuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirSalarioJBttuonActionPerformed
        excluir();
    }//GEN-LAST:event_excluirSalarioJBttuonActionPerformed

    private void atualizarSalarioJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarSalarioJButtonActionPerformed
        atualizar();
    }//GEN-LAST:event_atualizarSalarioJButtonActionPerformed

    private void novoCadastroSalarioJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoCadastroSalarioJButtonActionPerformed
        novocadastro();
    }//GEN-LAST:event_novoCadastroSalarioJButtonActionPerformed

    private void empresaSalarioJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresaSalarioJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empresaSalarioJComboBoxActionPerformed

    private void voltarSalarioJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarSalarioJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarSalarioJButtonActionPerformed

    private void novoCadastroSalarioJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novoCadastroSalarioJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            novocadastro();
        }
    }//GEN-LAST:event_novoCadastroSalarioJButtonKeyPressed

    private void cadastrarSalarioJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastrarSalarioJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cadastrar();
        }
    }//GEN-LAST:event_cadastrarSalarioJButtonKeyPressed

    private void atualizarSalarioJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atualizarSalarioJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            atualizar();
        }
    }//GEN-LAST:event_atualizarSalarioJButtonKeyPressed

    private void excluirSalarioJBttuonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_excluirSalarioJBttuonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            excluir();
        }
    }//GEN-LAST:event_excluirSalarioJBttuonKeyPressed

    private void listarSalarioJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listarSalarioJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listar();
        }
    }//GEN-LAST:event_listarSalarioJButtonKeyPressed

    private void selecionarSalarioJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selecionarSalarioJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            selecionar();
        }
    }//GEN-LAST:event_selecionarSalarioJButtonKeyPressed

    private void voltarSalarioJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_voltarSalarioJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.dispose();
        }
    }//GEN-LAST:event_voltarSalarioJButtonKeyPressed

    private void imprimirSalarioJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imprimirSalarioJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            imprimir();
        }
    }//GEN-LAST:event_imprimirSalarioJButtonKeyPressed

    private void tabelaSalarioJTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaSalarioJTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            selecionarSalarioJButton.requestFocus();
        }
    }//GEN-LAST:event_tabelaSalarioJTableKeyPressed

    private void tabelaSalarioJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaSalarioJTableMouseClicked
        if (evt.getClickCount() == 2) {
            selecionar();
        }
    }//GEN-LAST:event_tabelaSalarioJTableMouseClicked

    private void imprimirSalarioJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirSalarioJButtonActionPerformed
imprimir();
    }//GEN-LAST:event_imprimirSalarioJButtonActionPerformed

    public void cadastrar() {

        Salario a = new Salario(conn);

        a.cadastrarSalario(tabelaSalarioJTable,
                  empresaSalarioJComboBox,
                  valorSalarioJTextField,
                  dataRecebimentoJTextField,
                  cicloPagamentoSalarioJTextField,
                  cadastrarSalarioJButton,
                  atualizarSalarioJButton,
                  excluirSalarioJBttuon,
                  selecionarSalarioJButton,
                  imprimirSalarioJButton,
                  novoCadastroSalarioJButton,
                  listarSalarioJButton,
                  voltarSalarioJButton
        );

    }

    public void excluir() {
        Salario a = new Salario(conn);

        a.excluirSalario(tabelaSalarioJTable,
                  empresaSalarioJComboBox,
                  valorSalarioJTextField,
                  dataRecebimentoJTextField,
                  cicloPagamentoSalarioJTextField,
                  cadastrarSalarioJButton,
                  atualizarSalarioJButton,
                  excluirSalarioJBttuon,
                  selecionarSalarioJButton,
                  imprimirSalarioJButton,
                  novoCadastroSalarioJButton,
                  listarSalarioJButton,
                  voltarSalarioJButton
        );

    }

    public void atualizar() {
        Salario a = new Salario(conn);

        a.atualizarSalario(tabelaSalarioJTable,
                  empresaSalarioJComboBox,
                  valorSalarioJTextField,
                  dataRecebimentoJTextField,
                  cicloPagamentoSalarioJTextField,
                  cadastrarSalarioJButton,
                  atualizarSalarioJButton,
                  excluirSalarioJBttuon,
                  selecionarSalarioJButton,
                  imprimirSalarioJButton,
                  novoCadastroSalarioJButton,
                  listarSalarioJButton,
                  voltarSalarioJButton
        );

    }

    public void novocadastro() {
        Salario a = new Salario(conn);

        a.liberarCamposSalario(tabelaSalarioJTable,
                  empresaSalarioJComboBox,
                  valorSalarioJTextField,
                  dataRecebimentoJTextField,
                  cicloPagamentoSalarioJTextField,
                  cadastrarSalarioJButton,
                  atualizarSalarioJButton,
                  excluirSalarioJBttuon,
                  selecionarSalarioJButton,
                  imprimirSalarioJButton,
                  novoCadastroSalarioJButton,
                  listarSalarioJButton,
                  voltarSalarioJButton
        );

        a.limparFormularioSalario(tabelaSalarioJTable,
                  empresaSalarioJComboBox,
                  valorSalarioJTextField,
                  dataRecebimentoJTextField,
                  cicloPagamentoSalarioJTextField,
                  cadastrarSalarioJButton,
                  atualizarSalarioJButton,
                  excluirSalarioJBttuon,
                  selecionarSalarioJButton,
                  imprimirSalarioJButton,
                  novoCadastroSalarioJButton,
                  listarSalarioJButton,
                  voltarSalarioJButton
        );

        a.limparTabelaSalario(tabelaSalarioJTable);

        empresaSalarioJComboBox.requestFocus();

        cadastrarSalarioJButton.setEnabled(true);
        excluirSalarioJBttuon.setEnabled(false);
        atualizarSalarioJButton.setEnabled(false);
    }

    public void listar() {

        Salario a = new Salario(conn);

        a.listarSalario(tabelaSalarioJTable);

        a.limparFormularioSalario(tabelaSalarioJTable,
                  empresaSalarioJComboBox,
                  valorSalarioJTextField,
                  dataRecebimentoJTextField,
                  cicloPagamentoSalarioJTextField,
                  cadastrarSalarioJButton,
                  atualizarSalarioJButton,
                  excluirSalarioJBttuon,
                  selecionarSalarioJButton,
                  imprimirSalarioJButton,
                  novoCadastroSalarioJButton,
                  listarSalarioJButton,
                  voltarSalarioJButton
        );

        a.bloquearCamposSalario(
                  tabelaSalarioJTable,
                  empresaSalarioJComboBox,
                  valorSalarioJTextField,
                  valorSalarioJTextField,
                  cicloPagamentoSalarioJTextField,
                  cadastrarSalarioJButton,
                  atualizarSalarioJButton,
                  excluirSalarioJBttuon,
                  imprimirSalarioJButton,
                  selecionarSalarioJButton,
                  novoCadastroSalarioJButton,
                  listarSalarioJButton,
                  voltarSalarioJButton
        );

        cadastrarSalarioJButton.setEnabled(false);
        tabelaSalarioJTable.setEnabled(true);
        imprimirSalarioJButton.setEnabled(true);
        selecionarSalarioJButton.setEnabled(true);

    }

    public void selecionar() {

        Salario a = new Salario(conn);

        if (tabelaSalarioJTable.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "ATENÇÂO!" + "\nSelecione uma linha na tabela!");
        } else {
            a.pegarDadosTabelaSalario(
                      tabelaSalarioJTable,
                      empresaSalarioJComboBox,
                      valorSalarioJTextField,
                      dataRecebimentoJTextField,
                      cicloPagamentoSalarioJTextField,
                      cadastrarSalarioJButton,
                      atualizarSalarioJButton,
                      excluirSalarioJBttuon,
                      selecionarSalarioJButton,
                      imprimirSalarioJButton,
                      novoCadastroSalarioJButton,
                      listarSalarioJButton,
                      voltarSalarioJButton
            );

            a.limparTabelaSalario(tabelaSalarioJTable);

            a.liberarCamposSalario(
                      tabelaSalarioJTable,
                      empresaSalarioJComboBox,
                      valorSalarioJTextField,
                      dataRecebimentoJTextField,
                      cicloPagamentoSalarioJTextField,
                      cadastrarSalarioJButton,
                      atualizarSalarioJButton,
                      excluirSalarioJBttuon,
                      selecionarSalarioJButton,
                      imprimirSalarioJButton,
                      novoCadastroSalarioJButton,
                      listarSalarioJButton,
                      voltarSalarioJButton
            );

            empresaSalarioJComboBox.setEnabled(false);
            dataRecebimentoJTextField.setEditable(false);

            cadastrarSalarioJButton.setEnabled(false);
            atualizarSalarioJButton.setEnabled(true);
            excluirSalarioJBttuon.setEnabled(true);
            selecionarSalarioJButton.setEnabled(false);
            imprimirSalarioJButton.setEnabled(false);

            valorSalarioJTextField.requestFocus();
        }
    }

    public void imprimir() {

        Utilitario util = new Utilitario(conn);

        String relatorio = "src/financascasa/Salario.jasper";

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SalarioJFrame().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarSalarioJButton;
    private javax.swing.JButton cadastrarSalarioJButton;
    private javax.swing.JComboBox<String> cicloPagamentoSalarioJTextField;
    private javax.swing.JFormattedTextField dataRecebimentoJTextField;
    private javax.swing.JComboBox<String> empresaSalarioJComboBox;
    private javax.swing.JButton excluirSalarioJBttuon;
    private javax.swing.JButton imprimirSalarioJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listarSalarioJButton;
    private javax.swing.JButton novoCadastroSalarioJButton;
    private javax.swing.JButton selecionarSalarioJButton;
    private javax.swing.JTable tabelaSalarioJTable;
    public javax.swing.JTextField valorSalarioJTextField;
    private javax.swing.JButton voltarSalarioJButton;
    // End of variables declaration//GEN-END:variables
}
