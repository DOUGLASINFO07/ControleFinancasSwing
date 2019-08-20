package financascasa;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas borges egidio
 * @since 25/09/2018
 */

public class EmpresaJFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    Connection conn;

    public EmpresaJFrame() {
        initComponents();
    }

    public EmpresaJFrame(Connection conn) {
        initComponents();
        this.conn = conn;

        Empresa empresa = new Empresa(conn);

        empresa.bloquearCamposEmpresa(
                  tabelaEmpresajTable,
                  nomeEmpresajTextField,
                  tipoServicojTextField,
                  siteEmpresajTextField,
                  telefoneEmpresajTextField,
                  emailEmpresajTextField,
                  loginEmpresajTextField,
                  senhaEmpresajTextField,
                  CadastrarEmpresajButton,
                  ExcluirEmpresajButton,
                  atualizarEmpresajButton,
                  selecionarEmpresasjButton,
                  imprimirEmpresajButton,
                  novoCadastrojButton,
                  listarEmpresasjButton
        );
        
       this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomeEmpresajTextField = new javax.swing.JTextField();
        tipoServicojTextField = new javax.swing.JTextField();
        siteEmpresajTextField = new javax.swing.JTextField();
        emailEmpresajTextField = new javax.swing.JTextField();
        loginEmpresajTextField = new javax.swing.JTextField();
        senhaEmpresajTextField = new javax.swing.JTextField();
        CadastrarEmpresajButton = new javax.swing.JButton();
        ExcluirEmpresajButton = new javax.swing.JButton();
        atualizarEmpresajButton = new javax.swing.JButton();
        novoCadastrojButton = new javax.swing.JButton();
        telefoneEmpresajTextField = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEmpresajTable = new javax.swing.JTable();
        listarEmpresasjButton = new javax.swing.JButton();
        selecionarEmpresasjButton = new javax.swing.JButton();
        imprimirEmpresajButton = new javax.swing.JButton();
        voltarEmpresaJButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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
        jLabel2.setText("Tipo Servico ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Telefone");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Site");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Login");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("E-mail");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("senha");

        nomeEmpresajTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeEmpresajTextField.setForeground(new java.awt.Color(0, 102, 153));

        tipoServicojTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoServicojTextField.setForeground(new java.awt.Color(0, 102, 153));

        siteEmpresajTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        siteEmpresajTextField.setForeground(new java.awt.Color(0, 102, 153));

        emailEmpresajTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailEmpresajTextField.setForeground(new java.awt.Color(0, 102, 153));

        loginEmpresajTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginEmpresajTextField.setForeground(new java.awt.Color(0, 102, 153));

        senhaEmpresajTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        senhaEmpresajTextField.setForeground(new java.awt.Color(0, 102, 153));

        CadastrarEmpresajButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CadastrarEmpresajButton.setForeground(new java.awt.Color(0, 102, 153));
        CadastrarEmpresajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        CadastrarEmpresajButton.setText("Cadastrar");
        CadastrarEmpresajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarEmpresajButtonActionPerformed(evt);
            }
        });
        CadastrarEmpresajButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CadastrarEmpresajButtonKeyPressed(evt);
            }
        });

        ExcluirEmpresajButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExcluirEmpresajButton.setForeground(new java.awt.Color(0, 102, 153));
        ExcluirEmpresajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir (1).png"))); // NOI18N
        ExcluirEmpresajButton.setText("Excluir");
        ExcluirEmpresajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirEmpresajButtonActionPerformed(evt);
            }
        });
        ExcluirEmpresajButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ExcluirEmpresajButtonKeyPressed(evt);
            }
        });

        atualizarEmpresajButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        atualizarEmpresajButton.setForeground(new java.awt.Color(0, 102, 153));
        atualizarEmpresajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizar.png"))); // NOI18N
        atualizarEmpresajButton.setText("Atualizar");
        atualizarEmpresajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarEmpresajButtonActionPerformed(evt);
            }
        });
        atualizarEmpresajButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                atualizarEmpresajButtonKeyPressed(evt);
            }
        });

        novoCadastrojButton.setBackground(new java.awt.Color(255, 255, 255));
        novoCadastrojButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        novoCadastrojButton.setForeground(new java.awt.Color(0, 102, 153));
        novoCadastrojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedores1.png"))); // NOI18N
        novoCadastrojButton.setText("Nova Empresa");
        novoCadastrojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoCadastrojButtonActionPerformed(evt);
            }
        });
        novoCadastrojButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                novoCadastrojButtonKeyPressed(evt);
            }
        });

        telefoneEmpresajTextField.setForeground(new java.awt.Color(0, 102, 153));
        try {
            telefoneEmpresajTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneEmpresajTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeEmpresajTextField)
                            .addComponent(tipoServicojTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(siteEmpresajTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailEmpresajTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginEmpresajTextField)
                            .addComponent(senhaEmpresajTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(telefoneEmpresajTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(CadastrarEmpresajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(atualizarEmpresajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(ExcluirEmpresajButton)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(novoCadastrojButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(novoCadastrojButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeEmpresajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoServicojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(telefoneEmpresajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siteEmpresajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailEmpresajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginEmpresajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaEmpresajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarEmpresajButton)
                    .addComponent(ExcluirEmpresajButton)
                    .addComponent(CadastrarEmpresajButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        tabelaEmpresajTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabelaEmpresajTable.setForeground(new java.awt.Color(0, 102, 153));
        tabelaEmpresajTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Empresa", "Tipo de Serviço", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEmpresajTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEmpresajTableMouseClicked(evt);
            }
        });
        tabelaEmpresajTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaEmpresajTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEmpresajTable);

        listarEmpresasjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listarEmpresasjButton.setForeground(new java.awt.Color(0, 102, 153));
        listarEmpresasjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/profissao.png"))); // NOI18N
        listarEmpresasjButton.setText("Listar Empresas");
        listarEmpresasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarEmpresasjButtonActionPerformed(evt);
            }
        });
        listarEmpresasjButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listarEmpresasjButtonKeyPressed(evt);
            }
        });

        selecionarEmpresasjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selecionarEmpresasjButton.setForeground(new java.awt.Color(0, 102, 153));
        selecionarEmpresasjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dedo.png"))); // NOI18N
        selecionarEmpresasjButton.setText("Selecionar");
        selecionarEmpresasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarEmpresasjButtonActionPerformed(evt);
            }
        });
        selecionarEmpresasjButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                selecionarEmpresasjButtonKeyPressed(evt);
            }
        });

        imprimirEmpresajButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        imprimirEmpresajButton.setForeground(new java.awt.Color(0, 102, 153));
        imprimirEmpresajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PDF.png"))); // NOI18N
        imprimirEmpresajButton.setText("Imprimir");
        imprimirEmpresajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirEmpresajButtonActionPerformed(evt);
            }
        });
        imprimirEmpresajButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imprimirEmpresajButtonKeyPressed(evt);
            }
        });

        voltarEmpresaJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        voltarEmpresaJButton.setForeground(new java.awt.Color(0, 102, 153));
        voltarEmpresaJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        voltarEmpresaJButton.setText("Voltar Menu");
        voltarEmpresaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarEmpresaJButtonActionPerformed(evt);
            }
        });
        voltarEmpresaJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                voltarEmpresaJButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(selecionarEmpresasjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imprimirEmpresajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarEmpresaJButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(listarEmpresasjButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listarEmpresasjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecionarEmpresasjButton)
                    .addComponent(imprimirEmpresajButton)
                    .addComponent(voltarEmpresaJButton))
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cadastro de Empresas");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DIMTECH - SISTEMA FINANCEIRO");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoDIMTech1.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consultarVenda.png"))); // NOI18N
        jLabel11.setText("jLabel10");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jLabel12.setText("jLabel10");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarEmpresajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarEmpresajButtonActionPerformed
        cadastrar();
    }//GEN-LAST:event_CadastrarEmpresajButtonActionPerformed

    private void atualizarEmpresajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarEmpresajButtonActionPerformed
        atualizar();
    }//GEN-LAST:event_atualizarEmpresajButtonActionPerformed

    private void selecionarEmpresasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarEmpresasjButtonActionPerformed
        selecionar();
    }//GEN-LAST:event_selecionarEmpresasjButtonActionPerformed

    private void listarEmpresasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarEmpresasjButtonActionPerformed
        listar();
    }//GEN-LAST:event_listarEmpresasjButtonActionPerformed

    private void ExcluirEmpresajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirEmpresajButtonActionPerformed
        excluir();
    }//GEN-LAST:event_ExcluirEmpresajButtonActionPerformed

    private void novoCadastrojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoCadastrojButtonActionPerformed
        novocadastro();
    }//GEN-LAST:event_novoCadastrojButtonActionPerformed

    private void voltarEmpresaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarEmpresaJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarEmpresaJButtonActionPerformed

    private void novoCadastrojButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novoCadastrojButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            novocadastro();
        }
    }//GEN-LAST:event_novoCadastrojButtonKeyPressed

    private void CadastrarEmpresajButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CadastrarEmpresajButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cadastrar();
        }
    }//GEN-LAST:event_CadastrarEmpresajButtonKeyPressed

    private void atualizarEmpresajButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atualizarEmpresajButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            atualizar();
        }
    }//GEN-LAST:event_atualizarEmpresajButtonKeyPressed

    private void ExcluirEmpresajButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ExcluirEmpresajButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            excluir();
        }
    }//GEN-LAST:event_ExcluirEmpresajButtonKeyPressed

    private void listarEmpresasjButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listarEmpresasjButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listar();
        }
    }//GEN-LAST:event_listarEmpresasjButtonKeyPressed

    private void selecionarEmpresasjButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selecionarEmpresasjButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            selecionar();
        }
    }//GEN-LAST:event_selecionarEmpresasjButtonKeyPressed

    private void imprimirEmpresajButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imprimirEmpresajButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            imprimir();
        }
    }//GEN-LAST:event_imprimirEmpresajButtonKeyPressed

    private void voltarEmpresaJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_voltarEmpresaJButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.dispose();
        }
    }//GEN-LAST:event_voltarEmpresaJButtonKeyPressed

    private void tabelaEmpresajTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaEmpresajTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            selecionarEmpresasjButton.requestFocus();
        }
    }//GEN-LAST:event_tabelaEmpresajTableKeyPressed

    private void tabelaEmpresajTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEmpresajTableMouseClicked
        if (evt.getClickCount() == 2) {
            selecionar();
        }
    }//GEN-LAST:event_tabelaEmpresajTableMouseClicked

    private void imprimirEmpresajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirEmpresajButtonActionPerformed
        imprimir();
    }//GEN-LAST:event_imprimirEmpresajButtonActionPerformed

    public void cadastrar() {
        Empresa e = new Empresa(conn);

        e.cadastrarEmpresa(
                  tabelaEmpresajTable,
                  nomeEmpresajTextField,
                  tipoServicojTextField,
                  siteEmpresajTextField,
                  telefoneEmpresajTextField,
                  emailEmpresajTextField,
                  loginEmpresajTextField,
                  senhaEmpresajTextField,
                  CadastrarEmpresajButton,
                  ExcluirEmpresajButton,
                  atualizarEmpresajButton,
                  selecionarEmpresasjButton,
                  imprimirEmpresajButton,
                  novoCadastrojButton,
                  listarEmpresasjButton
        );

    }

    public void excluir() {

        Empresa e = new Empresa(conn);

        e.excluirEmpresa(
                  tabelaEmpresajTable,
                  nomeEmpresajTextField,
                  tipoServicojTextField,
                  siteEmpresajTextField,
                  telefoneEmpresajTextField,
                  emailEmpresajTextField,
                  loginEmpresajTextField,
                  senhaEmpresajTextField,
                  CadastrarEmpresajButton,
                  ExcluirEmpresajButton,
                  atualizarEmpresajButton,
                  selecionarEmpresasjButton,
                  imprimirEmpresajButton,
                  novoCadastrojButton,
                  listarEmpresasjButton
        );

    }

    public void atualizar() {

        Empresa e = new Empresa(conn);

        e.atualizarEmpresa(
                  tabelaEmpresajTable,
                  nomeEmpresajTextField,
                  tipoServicojTextField,
                  siteEmpresajTextField,
                  telefoneEmpresajTextField,
                  emailEmpresajTextField,
                  loginEmpresajTextField,
                  senhaEmpresajTextField,
                  CadastrarEmpresajButton,
                  ExcluirEmpresajButton,
                  atualizarEmpresajButton,
                  selecionarEmpresasjButton,
                  imprimirEmpresajButton,
                  novoCadastrojButton,
                  listarEmpresasjButton
        );

    }

    public void novocadastro() {
        Empresa e = new Empresa(conn);

        e.liberarCamposEmpresa(
                  tabelaEmpresajTable,
                  nomeEmpresajTextField,
                  tipoServicojTextField,
                  siteEmpresajTextField,
                  telefoneEmpresajTextField,
                  emailEmpresajTextField,
                  loginEmpresajTextField,
                  senhaEmpresajTextField,
                  CadastrarEmpresajButton,
                  ExcluirEmpresajButton,
                  atualizarEmpresajButton,
                  selecionarEmpresasjButton,
                  imprimirEmpresajButton,
                  novoCadastrojButton,
                  listarEmpresasjButton
        );

        e.limparFormularioEmpresa(
                  tabelaEmpresajTable,
                  nomeEmpresajTextField,
                  tipoServicojTextField,
                  siteEmpresajTextField,
                  telefoneEmpresajTextField,
                  emailEmpresajTextField,
                  loginEmpresajTextField,
                  senhaEmpresajTextField,
                  CadastrarEmpresajButton,
                  ExcluirEmpresajButton,
                  atualizarEmpresajButton,
                  selecionarEmpresasjButton,
                  imprimirEmpresajButton,
                  novoCadastrojButton,
                  listarEmpresasjButton
        );

        e.limparTabela(tabelaEmpresajTable);

        nomeEmpresajTextField.requestFocus();

        CadastrarEmpresajButton.setEnabled(true);
        ExcluirEmpresajButton.setEnabled(false);
        atualizarEmpresajButton.setEnabled(false);
    }

    public void listar() {
        Empresa e = new Empresa(conn);

        e.listarEmpresas(tabelaEmpresajTable);

        e.limparFormularioEmpresa(
                  tabelaEmpresajTable,
                  nomeEmpresajTextField,
                  tipoServicojTextField,
                  siteEmpresajTextField,
                  telefoneEmpresajTextField,
                  emailEmpresajTextField,
                  loginEmpresajTextField,
                  senhaEmpresajTextField,
                  CadastrarEmpresajButton,
                  ExcluirEmpresajButton,
                  atualizarEmpresajButton,
                  selecionarEmpresasjButton,
                  imprimirEmpresajButton,
                  novoCadastrojButton,
                  listarEmpresasjButton
        );

        e.bloquearCamposEmpresa(
                  tabelaEmpresajTable,
                  nomeEmpresajTextField,
                  tipoServicojTextField,
                  siteEmpresajTextField,
                  telefoneEmpresajTextField,
                  emailEmpresajTextField,
                  loginEmpresajTextField,
                  senhaEmpresajTextField,
                  CadastrarEmpresajButton,
                  ExcluirEmpresajButton,
                  atualizarEmpresajButton,
                  selecionarEmpresasjButton,
                  imprimirEmpresajButton,
                  novoCadastrojButton,
                  listarEmpresasjButton
        );

        tabelaEmpresajTable.setEnabled(true);
        imprimirEmpresajButton.setEnabled(true);
        selecionarEmpresasjButton.setEnabled(true);
        CadastrarEmpresajButton.setEnabled(false);

    }

    public void selecionar() {

        Empresa e = new Empresa(conn);

        if (tabelaEmpresajTable.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "ATENÇÂO!" + "\nSelecione uma linha na tabela!");
        } else {
            e.obterDadosTabela(
                      tabelaEmpresajTable,
                      nomeEmpresajTextField,
                      tipoServicojTextField,
                      siteEmpresajTextField,
                      telefoneEmpresajTextField,
                      emailEmpresajTextField,
                      loginEmpresajTextField,
                      senhaEmpresajTextField,
                      CadastrarEmpresajButton,
                      ExcluirEmpresajButton,
                      atualizarEmpresajButton,
                      selecionarEmpresasjButton,
                      imprimirEmpresajButton,
                      novoCadastrojButton,
                      listarEmpresasjButton
            );

            e.limparTabela(tabelaEmpresajTable);

            e.liberarCamposEmpresa(
                      tabelaEmpresajTable,
                      nomeEmpresajTextField,
                      tipoServicojTextField,
                      siteEmpresajTextField,
                      telefoneEmpresajTextField,
                      emailEmpresajTextField,
                      loginEmpresajTextField,
                      senhaEmpresajTextField,
                      CadastrarEmpresajButton,
                      ExcluirEmpresajButton,
                      atualizarEmpresajButton,
                      selecionarEmpresasjButton,
                      imprimirEmpresajButton,
                      novoCadastrojButton,
                      listarEmpresasjButton
            );

            nomeEmpresajTextField.setEditable(false);
            
            atualizarEmpresajButton.setEnabled(true);
            ExcluirEmpresajButton.setEnabled(true);
            selecionarEmpresasjButton.setEnabled(false);
            imprimirEmpresajButton.setEnabled(false);
            CadastrarEmpresajButton.setEnabled(false);
            
            tipoServicojTextField.requestFocus();
        }

    }
    
    public void imprimir(){

        Utilitario util = new Utilitario(conn);

        String relatorio = "src/financascasa/Empresa.jasper";

        util.relatorio(relatorio);
        
    }

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
            java.util.logging.Logger.getLogger(EmpresaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpresaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpresaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpresaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EmpresaJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarEmpresajButton;
    private javax.swing.JButton ExcluirEmpresajButton;
    private javax.swing.JButton atualizarEmpresajButton;
    public javax.swing.JTextField emailEmpresajTextField;
    private javax.swing.JButton imprimirEmpresajButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listarEmpresasjButton;
    public javax.swing.JTextField loginEmpresajTextField;
    public javax.swing.JTextField nomeEmpresajTextField;
    private javax.swing.JButton novoCadastrojButton;
    private javax.swing.JButton selecionarEmpresasjButton;
    public javax.swing.JTextField senhaEmpresajTextField;
    public javax.swing.JTextField siteEmpresajTextField;
    private javax.swing.JTable tabelaEmpresajTable;
    private javax.swing.JFormattedTextField telefoneEmpresajTextField;
    public javax.swing.JTextField tipoServicojTextField;
    private javax.swing.JButton voltarEmpresaJButton;
    // End of variables declaration//GEN-END:variables
}
