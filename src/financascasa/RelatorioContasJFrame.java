package financascasa;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas borges egidio
 * @since 27/09/2018.
 */
public class RelatorioContasJFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    Connection conn;

    public RelatorioContasJFrame() {
        initComponents();
    }

    public RelatorioContasJFrame(Connection conn) throws SQLException {
        initComponents();
        this.conn = conn;

        campo1jLabel.setVisible(false);
        campo2jLabel.setVisible(false);
        itemUmPesquisaJTextField.setVisible(false);
        itemDoisPesquisaTextField1.setVisible(false);
        parametroPesquisaRelatorioContasJCombobox.setVisible(false);
        PesquisarjButton.setVisible(false);
        confirmarjButton.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        PassivosjPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRelatorioContasjTable = new javax.swing.JTable();
        imprimirRelatorioContasJButton = new javax.swing.JButton();
        parametroPesquisaRelatorioContasJCombobox = new javax.swing.JComboBox<>();
        PesquisarjButton = new javax.swing.JButton();
        itemDoisPesquisaTextField1 = new javax.swing.JFormattedTextField();
        novaBuscajButton = new javax.swing.JButton();
        campo1jLabel = new javax.swing.JLabel();
        campo2jLabel = new javax.swing.JLabel();
        confirmarjButton = new javax.swing.JButton();
        voltarRelatorioContasJButton = new javax.swing.JButton();
        campo2jLabel1 = new javax.swing.JLabel();
        valorTotalJTextField = new javax.swing.JFormattedTextField();
        tituloFiltroPesquisajLabel = new javax.swing.JLabel();
        itemUmPesquisaJTextField = new javax.swing.JFormattedTextField();
        campo2jLabel2 = new javax.swing.JLabel();
        valorTotalPagarJTextField = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        PassivosjPanel.setBackground(new java.awt.Color(0, 0, 0));

        tabelaRelatorioContasjTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabelaRelatorioContasjTable.setForeground(new java.awt.Color(0, 102, 153));
        tabelaRelatorioContasjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empresa", "Tipo serviço", "Vencimento", "Valor Boleto", "Nº Parcelas", "Data Pagamento", "Local Pagamento", "Pagador", "Valor  Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRelatorioContasjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaRelatorioContasjTableMouseClicked(evt);
            }
        });
        tabelaRelatorioContasjTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaRelatorioContasjTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaRelatorioContasjTable);

        imprimirRelatorioContasJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        imprimirRelatorioContasJButton.setForeground(new java.awt.Color(0, 102, 153));
        imprimirRelatorioContasJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PDF.png"))); // NOI18N
        imprimirRelatorioContasJButton.setText("Imprimir");
        imprimirRelatorioContasJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirRelatorioContasJButtonActionPerformed(evt);
            }
        });
        imprimirRelatorioContasJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imprimirRelatorioContasJButtonKeyPressed(evt);
            }
        });

        parametroPesquisaRelatorioContasJCombobox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        parametroPesquisaRelatorioContasJCombobox.setForeground(new java.awt.Color(0, 102, 153));

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

        itemDoisPesquisaTextField1.setForeground(new java.awt.Color(0, 102, 153));
        try {
            itemDoisPesquisaTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        itemDoisPesquisaTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        itemDoisPesquisaTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDoisPesquisaTextField1ActionPerformed(evt);
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

        voltarRelatorioContasJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        voltarRelatorioContasJButton.setForeground(new java.awt.Color(0, 102, 153));
        voltarRelatorioContasJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        voltarRelatorioContasJButton.setText("Voltar Menu");
        voltarRelatorioContasJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarRelatorioContasJButtonActionPerformed(evt);
            }
        });
        voltarRelatorioContasJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                voltarRelatorioContasJButtonKeyPressed(evt);
            }
        });

        campo2jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campo2jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        campo2jLabel1.setText("Total Pago");

        valorTotalJTextField.setForeground(new java.awt.Color(0, 102, 153));
        valorTotalJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valorTotalJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTotalJTextFieldActionPerformed(evt);
            }
        });

        tituloFiltroPesquisajLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloFiltroPesquisajLabel.setForeground(new java.awt.Color(153, 153, 0));
        tituloFiltroPesquisajLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        itemUmPesquisaJTextField.setForeground(new java.awt.Color(0, 102, 153));
        try {
            itemUmPesquisaJTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        itemUmPesquisaJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        campo2jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campo2jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        campo2jLabel2.setText("Total Pagar");

        valorTotalPagarJTextField.setForeground(new java.awt.Color(0, 102, 153));
        valorTotalPagarJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valorTotalPagarJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTotalPagarJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PassivosjPanelLayout = new javax.swing.GroupLayout(PassivosjPanel);
        PassivosjPanel.setLayout(PassivosjPanelLayout);
        PassivosjPanelLayout.setHorizontalGroup(
            PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassivosjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PassivosjPanelLayout.createSequentialGroup()
                        .addComponent(novaBuscajButton)
                        .addGap(18, 18, 18)
                        .addComponent(tituloFiltroPesquisajLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassivosjPanelLayout.createSequentialGroup()
                        .addComponent(imprimirRelatorioContasJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarRelatorioContasJButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassivosjPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(campo2jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorTotalPagarJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo2jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorTotalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PassivosjPanelLayout.createSequentialGroup()
                        .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(PassivosjPanelLayout.createSequentialGroup()
                                .addComponent(parametroPesquisaRelatorioContasJCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirmarjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemUmPesquisaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo2jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemDoisPesquisaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PesquisarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        PassivosjPanelLayout.setVerticalGroup(
            PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassivosjPanelLayout.createSequentialGroup()
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(novaBuscajButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tituloFiltroPesquisajLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(itemDoisPesquisaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo2jLabel)
                        .addComponent(PesquisarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(itemUmPesquisaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo1jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(parametroPesquisaRelatorioContasJCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valorTotalPagarJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo2jLabel2))
                    .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valorTotalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo2jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imprimirRelatorioContasJButton)
                    .addComponent(voltarRelatorioContasJButton))
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
        jLabel17.setText("Relatório Contas");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoDIMTech1.png"))); // NOI18N
        jLabel18.setText("jLabel10");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19)
                    .addComponent(PassivosjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17))
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(PassivosjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
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

    private void imprimirRelatorioContasJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirRelatorioContasJButtonActionPerformed
imprimir();

    }//GEN-LAST:event_imprimirRelatorioContasJButtonActionPerformed

    private void itemDoisPesquisaTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDoisPesquisaTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemDoisPesquisaTextField1ActionPerformed

    private void PesquisarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarjButtonActionPerformed
        listar();
    }//GEN-LAST:event_PesquisarjButtonActionPerformed

    private void confirmarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarjButtonActionPerformed
        try {
            confirmarPesquisaEscolhaParametro();
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioContasJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirmarjButtonActionPerformed

    public void confirmarPesquisaEscolhaParametro() throws SQLException {

        RelatorioContas relatorioContas = new RelatorioContas(conn);

        String parametro = parametroPesquisaRelatorioContasJCombobox.getSelectedItem().toString();

        if (null == parametro) {

        } else {
            switch (parametro) {
                case "Mês Atual":
                    bloquearCamposPesquisa();
                    break;
                case "Boletos à Vencer":
                    bloquearCamposPesquisa();
                    break;
                case "***  Pesquisar por  ***":
                    campo1jLabel.setVisible(false);
                    campo2jLabel.setVisible(false);
                    itemUmPesquisaJTextField.setVisible(false);
                    itemDoisPesquisaTextField1.setVisible(false);
                    parametroPesquisaRelatorioContasJCombobox.setEnabled(true);
                    PesquisarjButton.setEnabled(false);
                    confirmarjButton.setVisible(true);
                    PesquisarjButton.setVisible(true);
                    JOptionPane.showMessageDialog(null, "ATENÇÂO!!\nEscolha um modo de pesquisa!!");
                    break;
                case "Boletos Vencidos":
                    bloquearCamposPesquisa();
                    break;
                case "Boletos à Pagar":
                    bloquearCamposPesquisa();
                    break;
                case "Boletos Pagos":
                    bloquearCamposPesquisa();
                    break;
                case "Período de Boletos Vencidos":
                    liberarCamposPeriodoPesquisa();
                    break;
                case "Período de Boletos Pagos":
                    liberarCamposPeriodoPesquisa();
                    break;
                case "Data de Vencimento do Boleto":
                    liberarCamposDataPesquisa();
                    break;
                case "Data de Pagamento do Boleto":
                    liberarCamposDataPesquisa();
                    break;
                case "Boletos Vencidos Mês Atual":
                    bloquearCamposPesquisa();
                    break;
                case "Boletos à Vencer Mês Atual":
                    bloquearCamposPesquisa();
                    break;
                case "Todos os Boletos":
                    bloquearCamposPesquisa();
                    break;
                case "Empresa que gerou o Boleto":
                    bloquearCamposPesquisa();
                    relatorioContas.preencherCombomBoxNomeEmpresa(parametroPesquisaRelatorioContasJCombobox);
                    parametroPesquisaRelatorioContasJCombobox.setEnabled(true);
                    break;
                default:
                    break;
            }
        }
    }

    public void listar() {

        RelatorioContas b = new RelatorioContas(conn);

        b.listarRelatorioContas(tabelaRelatorioContasjTable,
                  parametroPesquisaRelatorioContasJCombobox,
                  itemUmPesquisaJTextField,
                  itemDoisPesquisaTextField1,
                  valorTotalJTextField,
                  valorTotalPagarJTextField,
                  novaBuscajButton,
                  imprimirRelatorioContasJButton,
                  confirmarjButton,
                  PesquisarjButton
        );

    }

    public void novaBusca() {

        BaixarBoleto p = new BaixarBoleto(conn);

        parametroPesquisaRelatorioContasJCombobox.removeAllItems();

        parametroPesquisaRelatorioContasJCombobox.addItem("***  Pesquisar por  ***");
        parametroPesquisaRelatorioContasJCombobox.addItem("Mês Atual");
        parametroPesquisaRelatorioContasJCombobox.addItem("Boletos Vencidos Mês Atual");
        parametroPesquisaRelatorioContasJCombobox.addItem("Boletos à Vencer Mês Atual");
        parametroPesquisaRelatorioContasJCombobox.addItem("Boletos à Vencer");
        parametroPesquisaRelatorioContasJCombobox.addItem("Boletos Vencidos");
        parametroPesquisaRelatorioContasJCombobox.addItem("Boletos Pagos");
        parametroPesquisaRelatorioContasJCombobox.addItem("Boletos à Pagar");
        parametroPesquisaRelatorioContasJCombobox.addItem("Empresa que gerou o Boleto");
        parametroPesquisaRelatorioContasJCombobox.addItem("Período de Boletos Vencidos");
        parametroPesquisaRelatorioContasJCombobox.addItem("Período de Boletos Pagos");
        parametroPesquisaRelatorioContasJCombobox.addItem("Data de Vencimento do Boleto");
        parametroPesquisaRelatorioContasJCombobox.addItem("Data de Pagamento do Boleto");
        parametroPesquisaRelatorioContasJCombobox.addItem("Todos os Boletos");
        parametroPesquisaRelatorioContasJCombobox.setVisible(true);
        parametroPesquisaRelatorioContasJCombobox.setEnabled(true);
        parametroPesquisaRelatorioContasJCombobox.setSelectedItem("***  Pesquisar por  ***");
        confirmarjButton.setVisible(true);

        campo1jLabel.setVisible(false);
        campo2jLabel.setVisible(false);
        itemUmPesquisaJTextField.setVisible(false);
        itemDoisPesquisaTextField1.setVisible(false);
        itemUmPesquisaJTextField.setText(null);
        itemDoisPesquisaTextField1.setText(null);
        PesquisarjButton.setVisible(false);

        p.limparTabelaPassivos(tabelaRelatorioContasjTable);

        confirmarjButton.setEnabled(true);
    }

    public void imprimir() {

        RelatorioContas relatorioContas = new RelatorioContas(conn);

        String relatorio;

        String data1;
        String data2;

        if ("Mês Atual".equals(parametroPesquisaRelatorioContasJCombobox.getSelectedItem().toString())) {
            Date d = new Date();
            String dataAtual1 = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);

            System.out.println("teste " + dataAtual1);
            
            int mes1 = Integer.parseInt((String) dataAtual1.subSequence(3, 5));
            int ano1 = Integer.parseInt((String) dataAtual1.subSequence(6, 10));
            
            int mes2 = Integer.parseInt((String) dataAtual1.subSequence(3, 5));
            int ano2 = Integer.parseInt((String) dataAtual1.subSequence(6, 10));

            data1 = ano1 + "-" + mes1 + "-01";
            data2 = ano2 + "-" + mes2 + "-31";
            
            System.out.println("teste " + data1);
            System.out.println("teste " + data2);

            relatorio = "src/financascasa/RelatorioContasMesAtual.jasper";
            
            relatorioContas.RelatorioMesAtual(relatorio, data1, data2);
        }

    }

    private void novaBuscajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaBuscajButtonActionPerformed
        novaBusca();
    }//GEN-LAST:event_novaBuscajButtonActionPerformed

    private void novaBuscajButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novaBuscajButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            novaBusca();
        }
    }//GEN-LAST:event_novaBuscajButtonKeyPressed

    private void tabelaRelatorioContasjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRelatorioContasjTableMouseClicked

    }//GEN-LAST:event_tabelaRelatorioContasjTableMouseClicked

    private void imprimirRelatorioContasJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imprimirRelatorioContasJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_imprimirRelatorioContasJButtonKeyPressed

    private void tabelaRelatorioContasjTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaRelatorioContasjTableKeyPressed

    }//GEN-LAST:event_tabelaRelatorioContasjTableKeyPressed

    private void confirmarjButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmarjButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                confirmarPesquisaEscolhaParametro();
            } catch (SQLException ex) {
                Logger.getLogger(RelatorioContasJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_confirmarjButtonKeyPressed

    private void PesquisarjButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisarjButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listar();
        }
    }//GEN-LAST:event_PesquisarjButtonKeyPressed

    private void voltarRelatorioContasJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarRelatorioContasJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarRelatorioContasJButtonActionPerformed

    private void voltarRelatorioContasJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_voltarRelatorioContasJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.dispose();
        }
    }//GEN-LAST:event_voltarRelatorioContasJButtonKeyPressed

    private void valorTotalJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTotalJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorTotalJTextFieldActionPerformed

    private void valorTotalPagarJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTotalPagarJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorTotalPagarJTextFieldActionPerformed

    public String mensagemFiltroPesquisa() {
        tituloFiltroPesquisajLabel.setText("");

        String texto = parametroPesquisaRelatorioContasJCombobox.getSelectedItem().toString();

        String mensagem = "Pesquisa feita por " + texto;

        return mensagem;
    }

    public void liberarCamposPeriodoPesquisa() {
        campo1jLabel.setVisible(true);
        campo1jLabel.setText("Data inicio");
        campo2jLabel.setVisible(true);
        campo2jLabel.setText("Data final");
        itemUmPesquisaJTextField.setVisible(true);
        itemUmPesquisaJTextField.setEditable(true);
        itemDoisPesquisaTextField1.setVisible(true);
        itemDoisPesquisaTextField1.setEditable(true);
        parametroPesquisaRelatorioContasJCombobox.setEnabled(false);
        PesquisarjButton.setEnabled(true);
        confirmarjButton.setEnabled(false);
        PesquisarjButton.setVisible(true);
        tituloFiltroPesquisajLabel.setText(mensagemFiltroPesquisa());
    }

    public void bloquearCamposPesquisa() {
        campo1jLabel.setVisible(false);
        campo2jLabel.setVisible(false);
        itemUmPesquisaJTextField.setVisible(false);
        itemDoisPesquisaTextField1.setVisible(false);
        parametroPesquisaRelatorioContasJCombobox.setEnabled(false);
        confirmarjButton.setEnabled(false);
        PesquisarjButton.setVisible(true);
        tituloFiltroPesquisajLabel.setText(mensagemFiltroPesquisa());
    }

    public void liberarCamposDataPesquisa() {
        campo1jLabel.setVisible(true);
        campo1jLabel.setText("Data inicio");
        campo2jLabel.setVisible(false);
        campo2jLabel.setText("Data final");
        itemUmPesquisaJTextField.setVisible(true);
        itemUmPesquisaJTextField.setEditable(true);
        itemDoisPesquisaTextField1.setVisible(false);
        itemDoisPesquisaTextField1.setEditable(false);
        parametroPesquisaRelatorioContasJCombobox.setEnabled(false);
        PesquisarjButton.setEnabled(true);
        confirmarjButton.setEnabled(false);
        PesquisarjButton.setVisible(true);
        tituloFiltroPesquisajLabel.setText(mensagemFiltroPesquisa());
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
            java.util.logging.Logger.getLogger(RelatorioContasJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioContasJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioContasJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioContasJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RelatorioContasJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PassivosjPanel;
    private javax.swing.JButton PesquisarjButton;
    private javax.swing.JLabel campo1jLabel;
    private javax.swing.JLabel campo2jLabel;
    private javax.swing.JLabel campo2jLabel1;
    private javax.swing.JLabel campo2jLabel2;
    private javax.swing.JButton confirmarjButton;
    private javax.swing.JButton imprimirRelatorioContasJButton;
    private javax.swing.JFormattedTextField itemDoisPesquisaTextField1;
    private javax.swing.JFormattedTextField itemUmPesquisaJTextField;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton novaBuscajButton;
    private javax.swing.JComboBox<String> parametroPesquisaRelatorioContasJCombobox;
    private javax.swing.JTable tabelaRelatorioContasjTable;
    private javax.swing.JLabel tituloFiltroPesquisajLabel;
    private javax.swing.JFormattedTextField valorTotalJTextField;
    private javax.swing.JFormattedTextField valorTotalPagarJTextField;
    private javax.swing.JButton voltarRelatorioContasJButton;
    // End of variables declaration//GEN-END:variables
}
