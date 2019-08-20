/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import controlefinancas.Calendario;
import controlefinancas.Versao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author dougl
 */
public class MenuJFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    Connection conn;

    public MenuJFrame() {
        initComponents();
    }

    public MenuJFrame(Connection conn) {
        initComponents();
        this.conn = conn;

        //Médoto para não exibir o botão de fechar janela.
//        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem15 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        UsuarioJMenuItem = new javax.swing.JMenuItem();
        empresaJMenuItem = new javax.swing.JMenuItem();
        boletoJMenuItem = new javax.swing.JMenuItem();
        salarioJMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        darBaixaJMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();

        jMenuItem15.setText("jMenuItem15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MARCA DIMTECH 750_360.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu1.setForeground(new java.awt.Color(153, 153, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro.png"))); // NOI18N
        jMenu1.setText("Cadastro");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N

        UsuarioJMenuItem.setBackground(new java.awt.Color(0, 0, 0));
        UsuarioJMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UsuarioJMenuItem.setForeground(new java.awt.Color(153, 153, 0));
        UsuarioJMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clientes.png"))); // NOI18N
        UsuarioJMenuItem.setText("Usuário");
        UsuarioJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioJMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(UsuarioJMenuItem);

        empresaJMenuItem.setBackground(new java.awt.Color(0, 0, 0));
        empresaJMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        empresaJMenuItem.setForeground(new java.awt.Color(153, 153, 0));
        empresaJMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/profissao.png"))); // NOI18N
        empresaJMenuItem.setText("Empresa");
        empresaJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresaJMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(empresaJMenuItem);

        boletoJMenuItem.setBackground(new java.awt.Color(0, 0, 0));
        boletoJMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boletoJMenuItem.setForeground(new java.awt.Color(153, 153, 0));
        boletoJMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorioCaixa.png"))); // NOI18N
        boletoJMenuItem.setText("Boleto");
        boletoJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boletoJMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(boletoJMenuItem);

        salarioJMenuItem.setBackground(new java.awt.Color(0, 0, 0));
        salarioJMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salarioJMenuItem.setForeground(new java.awt.Color(153, 153, 0));
        salarioJMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/meuCaixa.png"))); // NOI18N
        salarioJMenuItem.setText("Salário");
        salarioJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioJMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(salarioJMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(153, 153, 0));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixa1 (1).png"))); // NOI18N
        jMenu2.setText("Controle");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N

        darBaixaJMenuItem.setBackground(new java.awt.Color(0, 0, 0));
        darBaixaJMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        darBaixaJMenuItem.setForeground(new java.awt.Color(153, 153, 0));
        darBaixaJMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/praLembrar (1).png"))); // NOI18N
        darBaixaJMenuItem.setText("Baixar Boleto");
        darBaixaJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darBaixaJMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(darBaixaJMenuItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(153, 153, 0));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Relatorio (1).png"))); // NOI18N
        jMenu3.setText("Relatório");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N

        jMenuItem6.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(153, 153, 0));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consultarProtuto (1).png"))); // NOI18N
        jMenuItem6.setText("Contas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem11.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem11.setForeground(new java.awt.Color(153, 153, 0));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/meuCaixa.png"))); // NOI18N
        jMenuItem11.setText("Salários");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(153, 153, 0));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/utilitarios (1).png"))); // NOI18N
        jMenu4.setText("Utilitário");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N

        jMenuItem7.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(153, 153, 0));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculadora.png"))); // NOI18N
        jMenuItem7.setText("Calculadora");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(153, 153, 0));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calendario.png"))); // NOI18N
        jMenuItem8.setText("Calendário");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu5.setForeground(new java.awt.Color(153, 153, 0));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/informacao.png"))); // NOI18N
        jMenu5.setText("Sobre");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N

        jMenuItem9.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(153, 153, 0));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoSistema.png"))); // NOI18N
        jMenuItem9.setText("versão");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(153, 153, 0));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tutorial.png"))); // NOI18N
        jMenuItem10.setText("Manual");
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu6.setForeground(new java.awt.Color(153, 153, 0));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jMenu6.setText("Sair");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N

        jMenuItem16.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem16.setForeground(new java.awt.Color(153, 153, 0));
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logOut.png"))); // NOI18N
        jMenuItem16.setText("Fazer LogOff ");
        jMenu6.add(jMenuItem16);

        jMenuItem17.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem17.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem17.setForeground(new java.awt.Color(153, 153, 0));
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/finalizar.png"))); // NOI18N
        jMenuItem17.setText("Fechar Sistema");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void UsuarioJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioJMenuItemActionPerformed
        UsuarioJFrame usuario = new UsuarioJFrame(conn);
        usuario.setVisible(true);
        usuario.setTitle("Controle Financeiro - DIMTECH");
        usuario.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_UsuarioJMenuItemActionPerformed

    private void empresaJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresaJMenuItemActionPerformed
        EmpresaJFrame empresa = new EmpresaJFrame(conn);
        empresa.setVisible(true);
        empresa.setTitle("Controle Financeiro - DIMTECH");
        empresa.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_empresaJMenuItemActionPerformed

    private void boletoJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boletoJMenuItemActionPerformed
        try {
            BoletoJFrame boleto = new BoletoJFrame(conn);
            boleto.setVisible(true);
            boleto.setTitle("Controle Financeiro - DIMTECH");
            boleto.setExtendedState(JFrame.MAXIMIZED_BOTH);
        } catch (SQLException ex) {
            Logger.getLogger(MenuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boletoJMenuItemActionPerformed

    private void salarioJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioJMenuItemActionPerformed
        try {
            SalarioJFrame salario = new SalarioJFrame(conn);
            salario.setVisible(true);
            salario.setTitle("Controle Financeiro - DIMTECH");
            salario.setExtendedState(JFrame.MAXIMIZED_BOTH);
        } catch (SQLException ex) {
            Logger.getLogger(MenuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salarioJMenuItemActionPerformed

    private void darBaixaJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darBaixaJMenuItemActionPerformed
        try {
            BaixarBoletoJFrame baixarBoleto = new BaixarBoletoJFrame(conn);
            baixarBoleto.setVisible(true);
            baixarBoleto.setTitle("Controle Financeiro - DIMTECH");
            baixarBoleto.setExtendedState(JFrame.MAXIMIZED_BOTH);
        } catch (SQLException ex) {
            Logger.getLogger(MenuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_darBaixaJMenuItemActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        try {
            RelatorioSalarioJFrame relatorioSalario = new RelatorioSalarioJFrame(conn);
            relatorioSalario.setVisible(true);
            relatorioSalario.setTitle("Controle Financeiro - DIMTECH");
            relatorioSalario.setExtendedState(JFrame.MAXIMIZED_BOTH);
        } catch (SQLException ex) {
            Logger.getLogger(MenuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            Runtime.getRuntime().exec("calc"); //assim
//           Runtime.getRuntime().exec("C:\Windows\System32\calc.exe"); //e assim?
        } catch (IOException e) {
            System.err.println("Erro ao abrir calculadora!");
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            RelatorioContasJFrame relatorioContas = new RelatorioContasJFrame(conn);
            relatorioContas.setVisible(true);
            relatorioContas.setTitle("Controle Financeiro - DIMTECH");
            relatorioContas.setExtendedState(JFrame.MAXIMIZED_BOTH);
        } catch (SQLException ex) {
            Logger.getLogger(MenuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Calendario calendario = new Calendario();
        calendario.setVisible(true);
        calendario.setTitle("Controle Financeiro - DIMTECH");
        calendario.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Versao versao = new Versao();
        versao.setVisible(true);
        versao.setTitle("Controle Financeiro - DIMTECH");
        versao.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem UsuarioJMenuItem;
    private javax.swing.JMenuItem boletoJMenuItem;
    private javax.swing.JMenuItem darBaixaJMenuItem;
    private javax.swing.JMenuItem empresaJMenuItem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem salarioJMenuItem;
    // End of variables declaration//GEN-END:variables
}
