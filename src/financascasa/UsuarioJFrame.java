package financascasa;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;

/**
 *
 * @author douglas borges egidio
 * @since 26/09/2018
 */
public class UsuarioJFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    Connection conn;

    public UsuarioJFrame() {
        initComponents();
    }

    public UsuarioJFrame(Connection conn) {
        initComponents();
        this.conn = conn;

        Usuario usuario = new Usuario(conn);

        usuario.bloquearCamposBotoesUsuarios(
                  tabelaUsuariojTable,
                  nomeUsuariojTextField,
                  telefoneUSuariojTextField,
                  emailUsuariojTextField,
                  loginUsuariojTextField,
                  senhaUsuariojTextField,
                  excluirUsuariojButton,
                  atualizarUsuariojButton,
                  selecionarUsuariojButton,
                  imprimirUsuariojButton,
                  CadastrarUsuariojButton,
                  novoCadastroUsuariojButton,
                  listarUsuariojButton
        );

        JTableHeader cabecalho = tabelaUsuariojTable.getTableHeader();
        tabelaUsuariojTable.setGridColor(Color.BLACK);
        Font font = new Font("tahoma", Font.BOLD, 16);
        Color color = new Color(0, 0, 0);
        Border border = new EmptyBorder(0, 0, 0, 0);
        cabecalho.setFont(font);
        cabecalho.setBackground(color);
        cabecalho.setForeground(Color.GRAY);
        cabecalho.setBorder(border);
        tabelaUsuariojTable.setBackground(color);

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
        nomeUsuariojTextField = new javax.swing.JTextField();
        emailUsuariojTextField = new javax.swing.JTextField();
        loginUsuariojTextField = new javax.swing.JTextField();
        CadastrarUsuariojButton = new javax.swing.JButton();
        excluirUsuariojButton = new javax.swing.JButton();
        atualizarUsuariojButton = new javax.swing.JButton();
        novoCadastroUsuariojButton = new javax.swing.JButton();
        senhaUsuariojTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefoneUSuariojTextField = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuariojTable = new javax.swing.JTable();
        listarUsuariojButton = new javax.swing.JButton();
        selecionarUsuariojButton = new javax.swing.JButton();
        imprimirUsuariojButton = new javax.swing.JButton();
        voltarjButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Nome Usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Telefone Usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("E-mail Usuário");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("login Usuario");

        nomeUsuariojTextField.setBackground(new java.awt.Color(0, 0, 0));
        nomeUsuariojTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nomeUsuariojTextField.setForeground(new java.awt.Color(0, 102, 153));
        nomeUsuariojTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        nomeUsuariojTextField.setCaretColor(new java.awt.Color(153, 153, 0));
        nomeUsuariojTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nomeUsuariojTextField.setFocusAccelerator('\u1000');
        nomeUsuariojTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeUsuariojTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeUsuariojTextFieldFocusLost(evt);
            }
        });
        nomeUsuariojTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomeUsuariojTextFieldMouseClicked(evt);
            }
        });
        nomeUsuariojTextField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                nomeUsuariojTextFieldCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        emailUsuariojTextField.setBackground(new java.awt.Color(0, 0, 0));
        emailUsuariojTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailUsuariojTextField.setForeground(new java.awt.Color(0, 102, 153));
        emailUsuariojTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        emailUsuariojTextField.setCaretColor(new java.awt.Color(153, 153, 0));

        loginUsuariojTextField.setBackground(new java.awt.Color(0, 0, 0));
        loginUsuariojTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginUsuariojTextField.setForeground(new java.awt.Color(0, 102, 153));
        loginUsuariojTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        loginUsuariojTextField.setCaretColor(new java.awt.Color(153, 153, 0));

        CadastrarUsuariojButton.setBackground(new java.awt.Color(0, 0, 0));
        CadastrarUsuariojButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CadastrarUsuariojButton.setForeground(new java.awt.Color(0, 102, 153));
        CadastrarUsuariojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        CadastrarUsuariojButton.setText("Cadastrar");
        CadastrarUsuariojButton.setBorder(null);
        CadastrarUsuariojButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastrarUsuariojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarUsuariojButtonActionPerformed(evt);
            }
        });
        CadastrarUsuariojButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CadastrarUsuariojButtonKeyPressed(evt);
            }
        });

        excluirUsuariojButton.setBackground(new java.awt.Color(0, 0, 0));
        excluirUsuariojButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        excluirUsuariojButton.setForeground(new java.awt.Color(0, 102, 153));
        excluirUsuariojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir (1).png"))); // NOI18N
        excluirUsuariojButton.setText("Excluir");
        excluirUsuariojButton.setBorder(null);
        excluirUsuariojButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluirUsuariojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirUsuariojButtonActionPerformed(evt);
            }
        });
        excluirUsuariojButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                excluirUsuariojButtonKeyPressed(evt);
            }
        });

        atualizarUsuariojButton.setBackground(new java.awt.Color(0, 0, 0));
        atualizarUsuariojButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        atualizarUsuariojButton.setForeground(new java.awt.Color(0, 102, 153));
        atualizarUsuariojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizar.png"))); // NOI18N
        atualizarUsuariojButton.setText("Atualizar");
        atualizarUsuariojButton.setBorder(null);
        atualizarUsuariojButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atualizarUsuariojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarUsuariojButtonActionPerformed(evt);
            }
        });
        atualizarUsuariojButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                atualizarUsuariojButtonKeyPressed(evt);
            }
        });

        novoCadastroUsuariojButton.setBackground(new java.awt.Color(0, 0, 0));
        novoCadastroUsuariojButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        novoCadastroUsuariojButton.setForeground(new java.awt.Color(0, 102, 153));
        novoCadastroUsuariojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario (1).png"))); // NOI18N
        novoCadastroUsuariojButton.setText("Novo Usuário");
        novoCadastroUsuariojButton.setBorder(null);
        novoCadastroUsuariojButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        novoCadastroUsuariojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoCadastroUsuariojButtonActionPerformed(evt);
            }
        });
        novoCadastroUsuariojButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                novoCadastroUsuariojButtonKeyPressed(evt);
            }
        });

        senhaUsuariojTextField.setBackground(new java.awt.Color(0, 0, 0));
        senhaUsuariojTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        senhaUsuariojTextField.setForeground(new java.awt.Color(0, 102, 153));
        senhaUsuariojTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        senhaUsuariojTextField.setCaretColor(new java.awt.Color(153, 153, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Senha Usuário");

        telefoneUSuariojTextField.setBackground(new java.awt.Color(0, 0, 0));
        telefoneUSuariojTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        telefoneUSuariojTextField.setForeground(new java.awt.Color(0, 102, 153));
        try {
            telefoneUSuariojTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneUSuariojTextField.setCaretColor(new java.awt.Color(153, 153, 0));
        telefoneUSuariojTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(novoCadastroUsuariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhaUsuariojTextField)
                            .addComponent(nomeUsuariojTextField)
                            .addComponent(emailUsuariojTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginUsuariojTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(telefoneUSuariojTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CadastrarUsuariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atualizarUsuariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirUsuariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(novoCadastroUsuariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeUsuariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneUSuariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailUsuariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginUsuariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaUsuariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarUsuariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarUsuariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirUsuariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        tabelaUsuariojTable.setBackground(new java.awt.Color(0, 0, 0));
        tabelaUsuariojTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tabelaUsuariojTable.setForeground(new java.awt.Color(0, 102, 153));
        tabelaUsuariojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Usuario", "telefone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuariojTable.setCellSelectionEnabled(false);
        tabelaUsuariojTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaUsuariojTable.setFillsViewportHeight(true);
        tabelaUsuariojTable.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tabelaUsuariojTable.setRowHeight(18);
        tabelaUsuariojTable.setRowSelectionAllowed(true);
        tabelaUsuariojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuariojTableMouseClicked(evt);
            }
        });
        tabelaUsuariojTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaUsuariojTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuariojTable);

        listarUsuariojButton.setBackground(new java.awt.Color(0, 0, 0));
        listarUsuariojButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listarUsuariojButton.setForeground(new java.awt.Color(0, 102, 153));
        listarUsuariojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tutorial.png"))); // NOI18N
        listarUsuariojButton.setText("Listar Usuários");
        listarUsuariojButton.setBorder(null);
        listarUsuariojButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listarUsuariojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarUsuariojButtonActionPerformed(evt);
            }
        });
        listarUsuariojButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listarUsuariojButtonKeyPressed(evt);
            }
        });

        selecionarUsuariojButton.setBackground(new java.awt.Color(0, 0, 0));
        selecionarUsuariojButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selecionarUsuariojButton.setForeground(new java.awt.Color(0, 102, 153));
        selecionarUsuariojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dedo.png"))); // NOI18N
        selecionarUsuariojButton.setText("Selecionar");
        selecionarUsuariojButton.setBorder(null);
        selecionarUsuariojButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecionarUsuariojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarUsuariojButtonActionPerformed(evt);
            }
        });
        selecionarUsuariojButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                selecionarUsuariojButtonKeyPressed(evt);
            }
        });

        imprimirUsuariojButton.setBackground(new java.awt.Color(0, 0, 0));
        imprimirUsuariojButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        imprimirUsuariojButton.setForeground(new java.awt.Color(0, 102, 153));
        imprimirUsuariojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PDF.png"))); // NOI18N
        imprimirUsuariojButton.setText("Imprimir");
        imprimirUsuariojButton.setBorder(null);
        imprimirUsuariojButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imprimirUsuariojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirUsuariojButtonActionPerformed(evt);
            }
        });
        imprimirUsuariojButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imprimirUsuariojButtonKeyPressed(evt);
            }
        });

        voltarjButton.setBackground(new java.awt.Color(0, 0, 0));
        voltarjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        voltarjButton.setForeground(new java.awt.Color(0, 102, 153));
        voltarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        voltarjButton.setText("Voltar Menu");
        voltarjButton.setBorder(null);
        voltarjButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarjButtonActionPerformed(evt);
            }
        });
        voltarjButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                voltarjButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selecionarUsuariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(listarUsuariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(imprimirUsuariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(listarUsuariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imprimirUsuariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selecionarUsuariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consultarVenda.png"))); // NOI18N
        jLabel11.setText("jLabel10");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DIMTECH - SISTEMA FINANCEIRO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cadastro de Usuário");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jLabel14.setText("jLabel10");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarUsuariojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarUsuariojButtonActionPerformed

        listar();

    }//GEN-LAST:event_listarUsuariojButtonActionPerformed

    private void selecionarUsuariojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarUsuariojButtonActionPerformed

        selecionar();
    }//GEN-LAST:event_selecionarUsuariojButtonActionPerformed

    private void CadastrarUsuariojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarUsuariojButtonActionPerformed

        cadastrar();

    }//GEN-LAST:event_CadastrarUsuariojButtonActionPerformed

    private void excluirUsuariojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirUsuariojButtonActionPerformed

        excluir();

    }//GEN-LAST:event_excluirUsuariojButtonActionPerformed

    private void atualizarUsuariojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarUsuariojButtonActionPerformed

        atualizar();

    }//GEN-LAST:event_atualizarUsuariojButtonActionPerformed

    private void novoCadastroUsuariojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoCadastroUsuariojButtonActionPerformed

        novocadastro();

    }//GEN-LAST:event_novoCadastroUsuariojButtonActionPerformed

    private void voltarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarjButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarjButtonActionPerformed

    private void listarUsuariojButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listarUsuariojButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listar();
        }
    }//GEN-LAST:event_listarUsuariojButtonKeyPressed

    private void novoCadastroUsuariojButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novoCadastroUsuariojButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            novocadastro();
        }
    }//GEN-LAST:event_novoCadastroUsuariojButtonKeyPressed

    private void CadastrarUsuariojButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CadastrarUsuariojButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cadastrar();
        }
    }//GEN-LAST:event_CadastrarUsuariojButtonKeyPressed

    private void atualizarUsuariojButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atualizarUsuariojButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            atualizar();
        }
    }//GEN-LAST:event_atualizarUsuariojButtonKeyPressed

    private void excluirUsuariojButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_excluirUsuariojButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            excluir();
        }
    }//GEN-LAST:event_excluirUsuariojButtonKeyPressed

    private void selecionarUsuariojButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selecionarUsuariojButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            selecionar();
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            selecionarUsuariojButton.requestFocus();
        }
    }//GEN-LAST:event_selecionarUsuariojButtonKeyPressed

    private void imprimirUsuariojButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imprimirUsuariojButtonKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            imprimir();
        }
    }//GEN-LAST:event_imprimirUsuariojButtonKeyPressed

    private void tabelaUsuariojTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaUsuariojTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            selecionar();
        }
    }//GEN-LAST:event_tabelaUsuariojTableKeyPressed

    private void voltarjButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_voltarjButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.dispose();
        }
    }//GEN-LAST:event_voltarjButtonKeyPressed

    private void tabelaUsuariojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuariojTableMouseClicked
        if (evt.getClickCount() == 2) {
            selecionar();
        }
    }//GEN-LAST:event_tabelaUsuariojTableMouseClicked

    private void imprimirUsuariojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirUsuariojButtonActionPerformed
        imprimir();
    }//GEN-LAST:event_imprimirUsuariojButtonActionPerformed

    private void nomeUsuariojTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeUsuariojTextFieldMouseClicked

    }//GEN-LAST:event_nomeUsuariojTextFieldMouseClicked

    private void nomeUsuariojTextFieldCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_nomeUsuariojTextFieldCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUsuariojTextFieldCaretPositionChanged

    private void nomeUsuariojTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeUsuariojTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUsuariojTextFieldFocusLost

    private void nomeUsuariojTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeUsuariojTextFieldFocusGained
        if (nomeUsuariojTextField.getText().equals("Insira o endereço")) {
            nomeUsuariojTextField.setText("");
        }
    }//GEN-LAST:event_nomeUsuariojTextFieldFocusGained

    public void cadastrar() {
        Usuario u = new Usuario(conn);

        u.cadastrarUsuario(
                  tabelaUsuariojTable,
                  nomeUsuariojTextField,
                  telefoneUSuariojTextField,
                  emailUsuariojTextField,
                  loginUsuariojTextField,
                  senhaUsuariojTextField,
                  excluirUsuariojButton,
                  atualizarUsuariojButton,
                  selecionarUsuariojButton,
                  imprimirUsuariojButton,
                  CadastrarUsuariojButton,
                  novoCadastroUsuariojButton,
                  listarUsuariojButton
        );
    }

    public void excluir() {

        Usuario u = new Usuario(conn);

        u.excluirUsuarios(
                  tabelaUsuariojTable,
                  nomeUsuariojTextField,
                  telefoneUSuariojTextField,
                  emailUsuariojTextField,
                  loginUsuariojTextField,
                  senhaUsuariojTextField,
                  excluirUsuariojButton,
                  atualizarUsuariojButton,
                  selecionarUsuariojButton,
                  imprimirUsuariojButton,
                  CadastrarUsuariojButton,
                  novoCadastroUsuariojButton,
                  listarUsuariojButton
        );
    }

    public void atualizar() {
        Usuario u = new Usuario(conn);

        u.atualizarUsuario(
                  tabelaUsuariojTable,
                  nomeUsuariojTextField,
                  telefoneUSuariojTextField,
                  emailUsuariojTextField,
                  loginUsuariojTextField,
                  senhaUsuariojTextField,
                  excluirUsuariojButton,
                  atualizarUsuariojButton,
                  selecionarUsuariojButton,
                  imprimirUsuariojButton,
                  CadastrarUsuariojButton,
                  novoCadastroUsuariojButton,
                  listarUsuariojButton
        );
    }

    public void novocadastro() {
        Usuario a = new Usuario(conn);

        a.liberarCamposUsuarios(
                  tabelaUsuariojTable,
                  nomeUsuariojTextField,
                  telefoneUSuariojTextField,
                  emailUsuariojTextField,
                  loginUsuariojTextField,
                  senhaUsuariojTextField,
                  excluirUsuariojButton,
                  atualizarUsuariojButton,
                  selecionarUsuariojButton,
                  imprimirUsuariojButton,
                  CadastrarUsuariojButton,
                  novoCadastroUsuariojButton,
                  listarUsuariojButton
        );

        a.limparFormularioUsuario(
                  tabelaUsuariojTable,
                  nomeUsuariojTextField,
                  telefoneUSuariojTextField,
                  emailUsuariojTextField,
                  loginUsuariojTextField,
                  senhaUsuariojTextField,
                  excluirUsuariojButton,
                  atualizarUsuariojButton,
                  selecionarUsuariojButton,
                  imprimirUsuariojButton,
                  CadastrarUsuariojButton,
                  novoCadastroUsuariojButton,
                  listarUsuariojButton
        );

        a.limparTabelaUsuarios(tabelaUsuariojTable);

        excluirUsuariojButton.setEnabled(false);
        atualizarUsuariojButton.setEnabled(false);
        CadastrarUsuariojButton.setEnabled(true);

        nomeUsuariojTextField.requestFocus();

    }

    public void listar() {
        Usuario a = new Usuario(conn);

        a.listarUsuario(tabelaUsuariojTable);

        a.limparFormularioUsuario(
                  tabelaUsuariojTable,
                  nomeUsuariojTextField,
                  telefoneUSuariojTextField,
                  emailUsuariojTextField,
                  loginUsuariojTextField,
                  senhaUsuariojTextField,
                  excluirUsuariojButton,
                  atualizarUsuariojButton,
                  selecionarUsuariojButton,
                  imprimirUsuariojButton,
                  CadastrarUsuariojButton,
                  novoCadastroUsuariojButton,
                  listarUsuariojButton
        );

        a.bloquearCamposBotoesUsuarios(
                  tabelaUsuariojTable,
                  nomeUsuariojTextField,
                  telefoneUSuariojTextField,
                  emailUsuariojTextField,
                  loginUsuariojTextField,
                  senhaUsuariojTextField,
                  excluirUsuariojButton,
                  atualizarUsuariojButton,
                  selecionarUsuariojButton,
                  imprimirUsuariojButton,
                  CadastrarUsuariojButton,
                  novoCadastroUsuariojButton,
                  listarUsuariojButton
        );

        tabelaUsuariojTable.setEnabled(true);
        imprimirUsuariojButton.setEnabled(true);
        selecionarUsuariojButton.setEnabled(true);
        tabelaUsuariojTable.setVisible(true);
    }

    public void selecionar() {
        if (tabelaUsuariojTable.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "ATENÇÂO!" + "\nSelecione uma linha na tabela!");
        } else {
            Usuario u = new Usuario(conn);

            u.pegarDadosFormularioUsuario(
                      tabelaUsuariojTable,
                      nomeUsuariojTextField,
                      telefoneUSuariojTextField,
                      emailUsuariojTextField,
                      loginUsuariojTextField,
                      senhaUsuariojTextField,
                      excluirUsuariojButton,
                      atualizarUsuariojButton,
                      selecionarUsuariojButton,
                      imprimirUsuariojButton,
                      CadastrarUsuariojButton,
                      novoCadastroUsuariojButton,
                      listarUsuariojButton
            );

            u.limparTabelaUsuarios(tabelaUsuariojTable);

            u.liberarCamposUsuarios(
                      tabelaUsuariojTable,
                      nomeUsuariojTextField,
                      telefoneUSuariojTextField,
                      emailUsuariojTextField,
                      loginUsuariojTextField,
                      senhaUsuariojTextField,
                      excluirUsuariojButton,
                      atualizarUsuariojButton,
                      selecionarUsuariojButton,
                      imprimirUsuariojButton,
                      CadastrarUsuariojButton,
                      novoCadastroUsuariojButton,
                      listarUsuariojButton
            );

            nomeUsuariojTextField.setEditable(false);

            atualizarUsuariojButton.setEnabled(true);
            excluirUsuariojButton.setEnabled(true);
            selecionarUsuariojButton.setEnabled(false);
            imprimirUsuariojButton.setEnabled(false);

            telefoneUSuariojTextField.requestFocus();
        }
    }

    public void imprimir() {

        Utilitario util = new Utilitario(conn);

        String relatorio = "src/financascasa/Usuario.jasper";

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
            java.util.logging.Logger.getLogger(UsuarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UsuarioJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarUsuariojButton;
    private javax.swing.JButton atualizarUsuariojButton;
    public javax.swing.JTextField emailUsuariojTextField;
    private javax.swing.JButton excluirUsuariojButton;
    private javax.swing.JButton imprimirUsuariojButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listarUsuariojButton;
    public javax.swing.JTextField loginUsuariojTextField;
    public javax.swing.JTextField nomeUsuariojTextField;
    private javax.swing.JButton novoCadastroUsuariojButton;
    private javax.swing.JButton selecionarUsuariojButton;
    public javax.swing.JTextField senhaUsuariojTextField;
    private javax.swing.JTable tabelaUsuariojTable;
    private javax.swing.JFormattedTextField telefoneUSuariojTextField;
    private javax.swing.JButton voltarjButton;
    // End of variables declaration//GEN-END:variables
}
