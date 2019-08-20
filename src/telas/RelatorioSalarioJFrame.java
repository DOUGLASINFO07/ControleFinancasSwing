package telas;

import classes.BaixarBoleto;
import classes.RelatorioSalario;
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

public class RelatorioSalarioJFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    Connection conn;

    //Construtor da classe.
    public RelatorioSalarioJFrame() {
        initComponents();
    }

    //Contrutor de Inicialização de atributos e métodos
    public RelatorioSalarioJFrame(Connection conn) throws SQLException {
        initComponents();
        this.conn = conn;

        campo1jLabel.setVisible(false);
        campo2jLabel.setVisible(false);
        itemUmPesquisaJTextField.setVisible(false);
        itemDoisPesquisaJTextField1.setVisible(false);
        parametroPesquisaRelatorioSalarioJCombobox.setVisible(false);
        PesquisarjButton.setVisible(false);
        confirmarjButton.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        PassivosjPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRelatorioSalariojTable = new javax.swing.JTable();
        imprimirRelatorioSalarioJButton = new javax.swing.JButton();
        parametroPesquisaRelatorioSalarioJCombobox = new javax.swing.JComboBox<>();
        PesquisarjButton = new javax.swing.JButton();
        itemDoisPesquisaJTextField1 = new javax.swing.JFormattedTextField();
        novaBuscajButton = new javax.swing.JButton();
        campo1jLabel = new javax.swing.JLabel();
        campo2jLabel = new javax.swing.JLabel();
        confirmarjButton = new javax.swing.JButton();
        voltarRelatorioSalarioJButton = new javax.swing.JButton();
        campo2jLabel1 = new javax.swing.JLabel();
        valorTotalJTextField = new javax.swing.JFormattedTextField();
        tituloFiltroPesquisajLabel = new javax.swing.JLabel();
        itemUmPesquisaJTextField = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        PassivosjPanel.setBackground(new java.awt.Color(0, 0, 0));

        tabelaRelatorioSalariojTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabelaRelatorioSalariojTable.setForeground(new java.awt.Color(0, 102, 153));
        tabelaRelatorioSalariojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fonte Pagadora", "Data Pagamento", "ciclo do pagamento", "Valor Salário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRelatorioSalariojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaRelatorioSalariojTableMouseClicked(evt);
            }
        });
        tabelaRelatorioSalariojTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaRelatorioSalariojTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaRelatorioSalariojTable);

        imprimirRelatorioSalarioJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        imprimirRelatorioSalarioJButton.setForeground(new java.awt.Color(0, 102, 153));
        imprimirRelatorioSalarioJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PDF.png"))); // NOI18N
        imprimirRelatorioSalarioJButton.setText("Imprimir");
        imprimirRelatorioSalarioJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirRelatorioSalarioJButtonActionPerformed(evt);
            }
        });
        imprimirRelatorioSalarioJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imprimirRelatorioSalarioJButtonKeyPressed(evt);
            }
        });

        parametroPesquisaRelatorioSalarioJCombobox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        parametroPesquisaRelatorioSalarioJCombobox.setForeground(new java.awt.Color(0, 102, 153));

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

        itemDoisPesquisaJTextField1.setForeground(new java.awt.Color(0, 102, 153));
        try {
            itemDoisPesquisaJTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        itemDoisPesquisaJTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        itemDoisPesquisaJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDoisPesquisaJTextField1ActionPerformed(evt);
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

        voltarRelatorioSalarioJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        voltarRelatorioSalarioJButton.setForeground(new java.awt.Color(0, 102, 153));
        voltarRelatorioSalarioJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        voltarRelatorioSalarioJButton.setText("Voltar Menu");
        voltarRelatorioSalarioJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarRelatorioSalarioJButtonActionPerformed(evt);
            }
        });
        voltarRelatorioSalarioJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                voltarRelatorioSalarioJButtonKeyPressed(evt);
            }
        });

        campo2jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campo2jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        campo2jLabel1.setText("Total");

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

        javax.swing.GroupLayout PassivosjPanelLayout = new javax.swing.GroupLayout(PassivosjPanel);
        PassivosjPanel.setLayout(PassivosjPanelLayout);
        PassivosjPanelLayout.setHorizontalGroup(
            PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassivosjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassivosjPanelLayout.createSequentialGroup()
                        .addComponent(parametroPesquisaRelatorioSalarioJCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemUmPesquisaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo2jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemDoisPesquisaJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(PesquisarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PassivosjPanelLayout.createSequentialGroup()
                        .addComponent(novaBuscajButton)
                        .addGap(18, 18, 18)
                        .addComponent(tituloFiltroPesquisajLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassivosjPanelLayout.createSequentialGroup()
                        .addComponent(imprimirRelatorioSalarioJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarRelatorioSalarioJButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassivosjPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(campo2jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorTotalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                        .addComponent(itemDoisPesquisaJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo2jLabel)
                        .addComponent(PesquisarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(itemUmPesquisaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo1jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(parametroPesquisaRelatorioSalarioJCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorTotalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo2jLabel1))
                .addGap(18, 18, 18)
                .addGroup(PassivosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imprimirRelatorioSalarioJButton)
                    .addComponent(voltarRelatorioSalarioJButton))
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
        jLabel17.setText("Relatório Salário");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoDIMTech1.png"))); // NOI18N
        jLabel18.setText("jLabel10");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MARCA DIMTECH 250_120.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PassivosjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel19)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17))
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(PassivosjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
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

    private void imprimirRelatorioSalarioJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirRelatorioSalarioJButtonActionPerformed
        imprimirRelatorio();//        exibeTelaSec();
    }//GEN-LAST:event_imprimirRelatorioSalarioJButtonActionPerformed

    private void itemDoisPesquisaJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDoisPesquisaJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemDoisPesquisaJTextField1ActionPerformed

    private void PesquisarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarjButtonActionPerformed
        listar();
    }//GEN-LAST:event_PesquisarjButtonActionPerformed

    private void confirmarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarjButtonActionPerformed
        try {
            confirmarPesquisaEscolhaParametro();
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioSalarioJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirmarjButtonActionPerformed

    private void confirmarPesquisaEscolhaParametro() throws SQLException {

        RelatorioSalario relatorioSalario = new RelatorioSalario(conn);

        String parametro = parametroPesquisaRelatorioSalarioJCombobox.getSelectedItem().toString();

        if (null == parametro) {

        } else {
            switch (parametro) {
                case "Todos os Salários":
                    campo1jLabel.setVisible(false);
                    campo2jLabel.setVisible(false);
                    itemUmPesquisaJTextField.setVisible(false);
                    itemDoisPesquisaJTextField1.setVisible(false);
                    parametroPesquisaRelatorioSalarioJCombobox.setEnabled(false);
                    confirmarjButton.setEnabled(true);
                    PesquisarjButton.setVisible(true);
                    tituloFiltroPesquisajLabel.setText(mensagemFiltroPesquisa());

                    break;
                case "***  Pesquisar por  ***":
                    campo1jLabel.setVisible(false);
                    campo2jLabel.setVisible(false);
                    itemUmPesquisaJTextField.setVisible(false);
                    itemDoisPesquisaJTextField1.setVisible(false);
                    parametroPesquisaRelatorioSalarioJCombobox.setEnabled(true);
                    PesquisarjButton.setEnabled(false);
                    confirmarjButton.setVisible(true);
                    PesquisarjButton.setVisible(true);
                    JOptionPane.showMessageDialog(null, "ATENÇÂO!!\nEscolha um modo de pesquisa!!");
                    break;
                case "Fonte Pagadora dos Salários":
                    campo1jLabel.setVisible(false);
                    campo2jLabel.setVisible(false);
                    itemUmPesquisaJTextField.setVisible(false);
                    itemDoisPesquisaJTextField1.setVisible(false);
                    parametroPesquisaRelatorioSalarioJCombobox.setEnabled(true);
                    PesquisarjButton.setEnabled(true);
                    confirmarjButton.setEnabled(false);
                    PesquisarjButton.setVisible(true);
                    tituloFiltroPesquisajLabel.setText(mensagemFiltroPesquisa());
                    relatorioSalario.preencherCombomBoxNomeEmpresa(parametroPesquisaRelatorioSalarioJCombobox);
                    break;
                case "Período dos Salários":
                    campo1jLabel.setVisible(true);
                    campo1jLabel.setText("Data inicio");
                    campo2jLabel.setVisible(true);
                    campo2jLabel.setText("Data final");
                    itemUmPesquisaJTextField.setVisible(true);
                    itemUmPesquisaJTextField.setEditable(true);
                    itemDoisPesquisaJTextField1.setVisible(true);
                    parametroPesquisaRelatorioSalarioJCombobox.setEnabled(false);
                    PesquisarjButton.setEnabled(true);
                    confirmarjButton.setEnabled(false);
                    PesquisarjButton.setVisible(true);
                    tituloFiltroPesquisajLabel.setText(mensagemFiltroPesquisa());
                    break;
                case "Data dos Salários":
                    campo1jLabel.setVisible(true);
                    campo1jLabel.setText("Data");
                    campo2jLabel.setVisible(false);
                    itemUmPesquisaJTextField.setVisible(true);
                    itemDoisPesquisaJTextField1.setVisible(false);
                    parametroPesquisaRelatorioSalarioJCombobox.setEnabled(false);
                    PesquisarjButton.setEnabled(true);
                    confirmarjButton.setEnabled(false);
                    PesquisarjButton.setVisible(true);
                    tituloFiltroPesquisajLabel.setText(mensagemFiltroPesquisa());
                    break;
                case "Mês Atual dos Salários":
                    campo1jLabel.setVisible(false);
                    campo1jLabel.setText("Data inicio");
                    campo2jLabel.setVisible(false);
                    campo2jLabel.setText("Data final");
                    itemUmPesquisaJTextField.setVisible(false);
                    itemUmPesquisaJTextField.setEditable(false);
                    itemDoisPesquisaJTextField1.setVisible(false);
                    parametroPesquisaRelatorioSalarioJCombobox.setEnabled(false);
                    PesquisarjButton.setEnabled(true);
                    confirmarjButton.setEnabled(false);
                    PesquisarjButton.setVisible(true);
                    tituloFiltroPesquisajLabel.setText(mensagemFiltroPesquisa());
                    break;
                default:
                    break;
            }
        }
    }

    private void selecionar() {
        BaixarBoleto p = new BaixarBoleto(conn);

        imprimirRelatorioSalarioJButton.setEnabled(false);
        itemUmPesquisaJTextField.setVisible(false);
        campo1jLabel.setVisible(false);
        itemDoisPesquisaJTextField1.setVisible(false);
        campo2jLabel.setVisible(false);

        PesquisarjButton.setVisible(false);

    }

    private void listar() {
        RelatorioSalario b = new RelatorioSalario(conn);

//        
        b.listarBaixarBoleto(tabelaRelatorioSalariojTable,
                  parametroPesquisaRelatorioSalarioJCombobox,
                  itemUmPesquisaJTextField,
                  itemDoisPesquisaJTextField1,
                  valorTotalJTextField,
                  novaBuscajButton,
                  imprimirRelatorioSalarioJButton,
                  confirmarjButton,
                  PesquisarjButton
        );
    }

    private void novaBusca() {

        BaixarBoleto p = new BaixarBoleto(conn);
        parametroPesquisaRelatorioSalarioJCombobox.removeAllItems();

        parametroPesquisaRelatorioSalarioJCombobox.addItem("***  Pesquisar por  ***");
        parametroPesquisaRelatorioSalarioJCombobox.addItem("Fonte Pagadora dos Salários");
        parametroPesquisaRelatorioSalarioJCombobox.addItem("Período dos Salários");
        parametroPesquisaRelatorioSalarioJCombobox.addItem("Data dos Salários");
        parametroPesquisaRelatorioSalarioJCombobox.addItem("Mês Atual dos Salários");
        parametroPesquisaRelatorioSalarioJCombobox.addItem("Todos os Salários");
        parametroPesquisaRelatorioSalarioJCombobox.setVisible(true);
        parametroPesquisaRelatorioSalarioJCombobox.setEnabled(true);
        parametroPesquisaRelatorioSalarioJCombobox.setSelectedItem("***  Pesquisar por  ***");
        confirmarjButton.setVisible(true);

        campo1jLabel.setVisible(false);
        campo2jLabel.setVisible(false);
        itemUmPesquisaJTextField.setVisible(false);
        itemUmPesquisaJTextField.setText(null);
        itemDoisPesquisaJTextField1.setVisible(false);
        PesquisarjButton.setVisible(false);

        p.limparTabelaPassivos(tabelaRelatorioSalariojTable);
        confirmarjButton.setEnabled(true);
    }

    private void imprimirRelatorio() {
        RelatorioSalario relatorio = new RelatorioSalario(conn);
        relatorio.imprimir(
                  parametroPesquisaRelatorioSalarioJCombobox,
                  itemUmPesquisaJTextField,
                  itemDoisPesquisaJTextField1,
                  tituloFiltroPesquisajLabel
        );
    }

    private void novaBuscajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaBuscajButtonActionPerformed
        novaBusca();
    }//GEN-LAST:event_novaBuscajButtonActionPerformed

    private void novaBuscajButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novaBuscajButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            novaBusca();
        }
    }//GEN-LAST:event_novaBuscajButtonKeyPressed

    private void tabelaRelatorioSalariojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRelatorioSalariojTableMouseClicked
        if (evt.getClickCount() == 2) {
            selecionar();
        }
    }//GEN-LAST:event_tabelaRelatorioSalariojTableMouseClicked

    private void imprimirRelatorioSalarioJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imprimirRelatorioSalarioJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            imprimirRelatorio();
        }
    }//GEN-LAST:event_imprimirRelatorioSalarioJButtonKeyPressed

    private void tabelaRelatorioSalariojTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaRelatorioSalariojTableKeyPressed

    }//GEN-LAST:event_tabelaRelatorioSalariojTableKeyPressed

    private void confirmarjButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmarjButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                confirmarPesquisaEscolhaParametro();
            } catch (SQLException ex) {
                Logger.getLogger(RelatorioSalarioJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_confirmarjButtonKeyPressed

    private void PesquisarjButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisarjButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listar();
        }
    }//GEN-LAST:event_PesquisarjButtonKeyPressed

    private void voltarRelatorioSalarioJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarRelatorioSalarioJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarRelatorioSalarioJButtonActionPerformed

    private void voltarRelatorioSalarioJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_voltarRelatorioSalarioJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.dispose();
        }
    }//GEN-LAST:event_voltarRelatorioSalarioJButtonKeyPressed

    private void valorTotalJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTotalJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorTotalJTextFieldActionPerformed

    public String mensagemFiltroPesquisa() {
        tituloFiltroPesquisajLabel.setText("");

        String texto = parametroPesquisaRelatorioSalarioJCombobox.getSelectedItem().toString();

        String mensagem = "Pesquisa feita por " + texto;

//        tituloFiltroPesquisajLabel.setText(mensagem);
        return mensagem;
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
            java.util.logging.Logger.getLogger(RelatorioSalarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioSalarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioSalarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioSalarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RelatorioSalarioJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PassivosjPanel;
    private javax.swing.JButton PesquisarjButton;
    private javax.swing.JLabel campo1jLabel;
    private javax.swing.JLabel campo2jLabel;
    private javax.swing.JLabel campo2jLabel1;
    private javax.swing.JButton confirmarjButton;
    private javax.swing.JButton imprimirRelatorioSalarioJButton;
    private javax.swing.JFormattedTextField itemDoisPesquisaJTextField1;
    private javax.swing.JFormattedTextField itemUmPesquisaJTextField;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton novaBuscajButton;
    private javax.swing.JComboBox<String> parametroPesquisaRelatorioSalarioJCombobox;
    private javax.swing.JTable tabelaRelatorioSalariojTable;
    private javax.swing.JLabel tituloFiltroPesquisajLabel;
    private javax.swing.JFormattedTextField valorTotalJTextField;
    private javax.swing.JButton voltarRelatorioSalarioJButton;
    // End of variables declaration//GEN-END:variables
}
