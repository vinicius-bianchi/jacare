package view;

import Controller.LoginController;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author ViniciusBianchi
 */
public class login extends javax.swing.JFrame {

    private final LoginController controller;

    
    public login() {
        initComponents();
        controller = new LoginController(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logotipo = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        InsereUsuario = new javax.swing.JTextField();
        InsereSenha = new javax.swing.JPasswordField();
        AcessoSistema = new javax.swing.JButton();
        BackgroundInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Nacional de Jacarés");
        setResizable(false);
        getContentPane().setLayout(null);

        Logotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logotipo.png"))); // NOI18N
        getContentPane().add(Logotipo);
        Logotipo.setBounds(90, 20, 300, 110);

        Usuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Usuario.setText("Senha");
        getContentPane().add(Usuario);
        Usuario.setBounds(120, 210, 40, 30);

        Senha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Senha.setText("Posto de Vacinação");
        getContentPane().add(Senha);
        Senha.setBounds(50, 170, 110, 30);

        InsereUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        InsereUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsereUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(InsereUsuario);
        InsereUsuario.setBounds(170, 170, 200, 30);

        InsereSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsereSenhaActionPerformed(evt);
            }
        });
        InsereSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InsereSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(InsereSenha);
        InsereSenha.setBounds(170, 210, 200, 30);

        AcessoSistema.setBackground(new java.awt.Color(0, 62, 43));
        AcessoSistema.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        AcessoSistema.setForeground(new java.awt.Color(0, 62, 43));
        AcessoSistema.setText("Acessar Sistema");
        AcessoSistema.setAlignmentY(0.0F);
        AcessoSistema.setBorder(null);
        AcessoSistema.setBorderPainted(false);
        AcessoSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AcessoSistema.setEnabled(false);
        AcessoSistema.setFocusPainted(false);
        AcessoSistema.setFocusTraversalPolicyProvider(true);
        AcessoSistema.setSelected(true);
        AcessoSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcessoSistemaActionPerformed(evt);
            }
        });
        getContentPane().add(AcessoSistema);
        AcessoSistema.setBounds(230, 260, 140, 40);

        BackgroundInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background.jpg"))); // NOI18N
        getContentPane().add(BackgroundInicio);
        BackgroundInicio.setBounds(0, 0, 780, 340);

        setSize(new java.awt.Dimension(775, 363));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InsereUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsereUsuarioActionPerformed
        
    }//GEN-LAST:event_InsereUsuarioActionPerformed

    private void AcessoSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcessoSistemaActionPerformed
        this.controller.Executado();
       
        
    }//GEN-LAST:event_AcessoSistemaActionPerformed

    private void InsereSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsereSenhaActionPerformed
        
    }//GEN-LAST:event_InsereSenhaActionPerformed

    private void InsereSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InsereSenhaKeyPressed
       
    }//GEN-LAST:event_InsereSenhaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcessoSistema;
    private javax.swing.JLabel BackgroundInicio;
    private javax.swing.JPasswordField InsereSenha;
    private javax.swing.JTextField InsereUsuario;
    private javax.swing.JLabel Logotipo;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Usuario;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);

    }

    public JPasswordField getInsereSenha() {
        return InsereSenha;
    }

    public void setInsereSenha(JPasswordField InsereSenha) {
        this.InsereSenha = InsereSenha;
    }

    public JTextField getInsereUsuario() {
        return InsereUsuario;
    }

    public void setInsereUsuario(JTextField InsereUsuario) {
        this.InsereUsuario = InsereUsuario;
    }

    
   
}
