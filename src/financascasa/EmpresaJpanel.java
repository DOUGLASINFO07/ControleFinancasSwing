/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financascasa;

import java.sql.Connection;

/**
 *
 * @author dougl
 */
public class EmpresaJpanel extends javax.swing.JPanel {
    
    Connection conn;

    public EmpresaJpanel() {
        initComponents();
    }
    
    public EmpresaJpanel(Connection conn) {
        initComponents();
        this.conn = conn;
    }    

        
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomeEmpresajTextField = new javax.swing.JTextField();
        tipoServicojTextField = new javax.swing.JTextField();
        telefoneEmpresajTextField = new javax.swing.JTextField();
        siteEmpresajTextField = new javax.swing.JTextField();
        emailEmpresajTextField = new javax.swing.JTextField();
        loginEmpresajTextField = new javax.swing.JTextField();
        senhaEmpresajTextField = new javax.swing.JTextField();
        CadastrarEmpresajButton = new javax.swing.JButton();
        ExcluirEmpresajButton = new javax.swing.JButton();
        atualizarEmpresajButton = new javax.swing.JButton();
        consultarEmpresajButton = new javax.swing.JButton();
        imprimirEmpresajButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("NomeEmpresa");

        jLabel2.setText("Tipo Servico ");

        jLabel3.setText("Telefone");

        jLabel4.setText("Site");

        jLabel5.setText("login");

        jLabel6.setText("E-mail");

        jLabel7.setText("senha");

        CadastrarEmpresajButton.setText("Cadastrar");

        ExcluirEmpresajButton.setText("Excluir");

        atualizarEmpresajButton.setText("Atualizar");

        consultarEmpresajButton.setText("Consultar");

        imprimirEmpresajButton.setText("Imprimir");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CADASTRO DE EMPRESA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeEmpresajTextField)
                                    .addComponent(tipoServicojTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(telefoneEmpresajTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(siteEmpresajTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailEmpresajTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(loginEmpresajTextField)
                                    .addComponent(senhaEmpresajTextField, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(CadastrarEmpresajButton)
                        .addGap(18, 18, 18)
                        .addComponent(ExcluirEmpresajButton)
                        .addGap(18, 18, 18)
                        .addComponent(atualizarEmpresajButton)
                        .addGap(18, 18, 18)
                        .addComponent(consultarEmpresajButton)
                        .addGap(18, 18, 18)
                        .addComponent(imprimirEmpresajButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeEmpresajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoServicojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneEmpresajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siteEmpresajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailEmpresajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginEmpresajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaEmpresajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarEmpresajButton)
                    .addComponent(ExcluirEmpresajButton)
                    .addComponent(atualizarEmpresajButton)
                    .addComponent(consultarEmpresajButton)
                    .addComponent(imprimirEmpresajButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarEmpresajButton;
    private javax.swing.JButton ExcluirEmpresajButton;
    private javax.swing.JButton atualizarEmpresajButton;
    private javax.swing.JButton consultarEmpresajButton;
    private javax.swing.JTextField emailEmpresajTextField;
    private javax.swing.JButton imprimirEmpresajButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField loginEmpresajTextField;
    private javax.swing.JTextField nomeEmpresajTextField;
    private javax.swing.JTextField senhaEmpresajTextField;
    private javax.swing.JTextField siteEmpresajTextField;
    private javax.swing.JTextField telefoneEmpresajTextField;
    private javax.swing.JTextField tipoServicojTextField;
    // End of variables declaration//GEN-END:variables
}