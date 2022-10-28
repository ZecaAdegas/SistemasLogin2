import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author hpaulo
 */
public class FormEditar extends javax.swing.JFrame {

    /**
     * Creates new form FormRegisto
     */
    public ArrayList<String> dados = new ArrayList<>(); 
    Login log;
    public FormEditar() throws SQLException {
        initComponents();
        if (log==null)
            log = new Login();
        lerFicheiro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblMorada = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmaPassword = new javax.swing.JLabel();
        lblNIF = new javax.swing.JLabel();
        ctxNome = new javax.swing.JTextField();
        ctxEmail = new javax.swing.JTextField();
        ctxMorada = new javax.swing.JTextField();
        ctxNIF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblTelefone = new javax.swing.JLabel();
        ctxTelefone = new javax.swing.JTextField();
        ctxPassword = new javax.swing.JPasswordField();
        ctxConfirmaPassword = new javax.swing.JPasswordField();
        ctxLogin = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSair.setBackground(new java.awt.Color(255, 0, 0));
        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEmail.setText("Email");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNome.setText("Nome");

        lblMorada.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblMorada.setText("Morada");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPassword.setText("Password");

        lblConfirmaPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblConfirmaPassword.setText("Reescreva Password");

        lblNIF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNIF.setText("NIF");

        ctxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxNomeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("VALIDAR DADOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTelefone.setText("Telefone");

        ctxLogin.setEditable(false);
        ctxLogin.setEnabled(false);
        ctxLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxLoginActionPerformed(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblLogin.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblConfirmaPassword)
                                .addGap(18, 18, 18)
                                .addComponent(ctxConfirmaPassword))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblMorada)
                                    .addComponent(lblNIF)
                                    .addComponent(lblTelefone)
                                    .addComponent(lblPassword)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblNome, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(131, 131, 131)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ctxNome)
                                    .addComponent(ctxTelefone)
                                    .addComponent(ctxNIF)
                                    .addComponent(ctxEmail)
                                    .addComponent(ctxMorada)
                                    .addComponent(ctxPassword)
                                    .addComponent(ctxLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ctxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ctxLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ctxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMorada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ctxMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNIF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ctxNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ctxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ctxPassword)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctxConfirmaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmaPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Login log = new Login();
        this.dispose();
        log.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void mensagemErro(String erro) {
        JOptionPane.showMessageDialog(null, erro, "Erro Validação", JOptionPane.ERROR_MESSAGE);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //pass e rePass têm de ser iguais
        //pass tem de ter 8 ou mais caracteres, 1 ou mais mais  maiúsculas, 1 ou mais algarismos
        //1 ou mais minúsculas e 1 ou mais caracteres especiais        
        String nome = ctxNome.getText();
        String email = ctxEmail.getText();
        String morada = ctxMorada.getText();
        String telefone = ctxTelefone.getText();
        String nif = ctxNIF.getText();
        String pass = ctxPassword.getText();
        String rePass = ctxConfirmaPassword.getText();
        if (nome.equals("") || email.equals("") || morada.equals("")
                || telefone.equals("") || nif.equals("")
                || pass.equals("") || rePass.equals("")) {
            mensagemErro("Preencha todos os campos!");
        } else {
            if (!validaCampoNumerico(telefone)) {
                mensagemErro("O campo telefone tem de ser numérico"
                        + " e ter 9 dígitos");
            } else if (!validaCampoNumerico(nif)) {
                mensagemErro("O campo NIF tem de ser numérico"
                        + " e ter 9 dígitos");
            } else if (!validaCampoAlfabetico(nome, "2")) {
                mensagemErro("O campo Nome não pode ter números "
                        + "e menos de 2 caracteres");
            } else if (morada.length() < 6) {
                mensagemErro("O campo Morada tem de ter mais "
                        + "do que 5 caracteres");
            } else if (!validaEmail(email)) {
                mensagemErro("O campo Email tem de ter um @, um . depois do @ "
                        + "e apenas um @");
            } else if (!validaPass(pass)) {
                mensagemErro("O campo Password tem de ter pelo menos 8 caracteres, "
                        + "1 maiúscula, 1 minúscula, 1 algarismo e 1 caracter especial");
            } else if (!pass.equals(rePass)) {
                mensagemErro("O campo Reescreva Password tem de ser igual "
                        + "ao campo Password");
            } else {
                try {
                    LigaBD.editarUtilizador(nome, email, morada, Integer.parseInt(telefone), Integer.parseInt(nif), Login.login, pass);
                    MenuOpcoes mo = new MenuOpcoes();
                    this.setVisible(false);
                    mo.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormRegisto.class.getName()).log(Level.SEVERE, null, ex);
                }                        
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ctxLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxLoginActionPerformed
        JTextField textField = new JTextField();        
        textField.setEnabled(false);
    }//GEN-LAST:event_ctxLoginActionPerformed

    private void ctxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxNomeActionPerformed

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
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegisto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JPasswordField ctxConfirmaPassword;
    private javax.swing.JTextField ctxEmail;
    private javax.swing.JTextField ctxLogin;
    private javax.swing.JTextField ctxMorada;
    private javax.swing.JTextField ctxNIF;
    private javax.swing.JTextField ctxNome;
    private javax.swing.JPasswordField ctxPassword;
    private javax.swing.JTextField ctxTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblConfirmaPassword;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMorada;
    private javax.swing.JLabel lblNIF;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTelefone;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @param valor
     * @return
     */
    public boolean validaCampoNumerico(String valor) {
        int x, contador = 0, v = valor.length();
        char c;
        if (v != 9) {
            return false;
        } else {
            for (x = 0; x < v; x++) {
                c = valor.charAt(x);
                if (isDigit(c)) {
                    contador++;
                }
            }
            if (v != contador) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param valor
     * @param minimo
     * @return
     */
    public boolean validaCampoAlfabetico(String valor, String minimo) {
        int x, contador = 0, v = valor.length(), z = Integer.parseInt(minimo);
        char c;
        if (v < z) {
            return false;
        } else {
            for (x = 0; x < v; x++) {
                c = valor.charAt(x);
                if (c == ' ' && x != 0) {
                    contador++;
                    continue;
                }
                if (isLetter(c)) {
                    contador++;
                }
            }
            if (v != contador) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param valor
     * @return
     */
    public boolean validaEmail(String valor) {
        int x, k, z, a;
        x = valor.indexOf("@");
        k = valor.indexOf(".", x);
        z = valor.indexOf("@", (x + 1));
        a = valor.indexOf(' ');
        if (x == -1 || k == -1 || a != -1 || z != -1) {
            return false;
        } else {
            return true;
        }
    }

    /**
     *
     * @param valor
     * @return
     */
    public boolean validaPass(String valor) {
        int x, contadorD = 0, contadorU = 0, contadorL = 0, contadorE = 0, v = valor.length();
        char c;
        if (v < 8) {
            return false;
        } else {
            for (x = 0; x < v; x++) {
                c = valor.charAt(x);
                if (c == ' ') {
                    return false;
                }
                if (isDigit(c)) {
                    contadorD++;
                }
                if (isLowerCase(c)) {
                    contadorL++;
                }
                if (isUpperCase(c)) {
                    contadorU++;
                }
                if (!isDigit(c) && !isLetter(c)) {
                    contadorE++;
                }
            }
            if ((contadorD > 0) && (contadorU > 0) && (contadorL > 0) && (contadorE > 0)) {
                return true;
            } else {
                return false;
            }

        }
    }

    private void EditarUtilizador(String nome, String email, String morada, String telefone, String nif, String pass) {
        File ficheiro = new File(log.login + ".txt");
            try {
                ficheiro.createNewFile();
                FileWriter fw = new FileWriter(ficheiro, false);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(pass);
                bw.newLine();
                bw.write(nome);
                bw.newLine();
                bw.write(email);
                bw.newLine();
                bw.write(morada);
                bw.newLine();
                bw.write(telefone);
                bw.newLine();
                bw.write(nif);
                bw.newLine();
                bw.close();
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }

    private void lerFicheiro() throws SQLException {
        Connection conn = LigaBD.ligacao();
        String sql = "SELECT * FROM utilizador WHERE login = '"+Login.login+"'";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            ctxLogin.setText(rs.getString(7));
            ctxNome.setText(rs.getString(2));
            ctxEmail.setText(rs.getString(3));
            ctxMorada.setText(rs.getString(4));
            ctxTelefone.setText(rs.getString(5));
            ctxNIF.setText(rs.getString(6));
        }
        
        
        
    }
}
