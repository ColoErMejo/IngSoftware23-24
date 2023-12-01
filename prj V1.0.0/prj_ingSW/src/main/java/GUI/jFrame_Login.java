/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author merlo
 */
public class jFrame_Login extends javax.swing.JFrame {

	
	
        public void run() {
            new jFrame_Login().setVisible(true);
        }
    
    /**
     * Creates new form jFrame_Login
     */
    public jFrame_Login() {
    	
    	initComponents();
    	
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Left_Login = new javax.swing.JPanel();
        jLabel_Icon_Left = new javax.swing.JLabel();
        jPanel_Right_Login = new javax.swing.JPanel();
        jPasswordField = new javax.swing.JPasswordField();
        jTextField_Nome_Utente = new javax.swing.JTextField();
        jLabel_Nome_Utente = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jButton_Login = new javax.swing.JButton();
        jLabel1_Nuovo_Utente = new javax.swing.JLabel();
        jButton_Nuovo_Utente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Left_Login.setBackground(new java.awt.Color(0, 153, 255));
        jPanel_Left_Login.setMaximumSize(new java.awt.Dimension(500, 600));
        jPanel_Left_Login.setMinimumSize(new java.awt.Dimension(500, 600));
        jPanel_Left_Login.setName(""); // NOI18N
        jPanel_Left_Login.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel_Left_Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Icon_Left.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Con_Sfondo-removebg-preview.png"))); // NOI18N
        jPanel_Left_Login.add(jLabel_Icon_Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        getContentPane().add(jPanel_Left_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jPanel_Right_Login.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Right_Login.setMaximumSize(new java.awt.Dimension(500, 600));
        jPanel_Right_Login.setMinimumSize(new java.awt.Dimension(500, 600));
        jPanel_Right_Login.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel_Right_Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordField.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        
        jPanel_Right_Login.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 210, -1));

        jTextField_Nome_Utente.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_Nome_Utente.setForeground(new java.awt.Color(255, 255, 255));
        
        jPanel_Right_Login.add(jTextField_Nome_Utente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 210, -1));

        jLabel_Nome_Utente.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel_Nome_Utente.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Nome_Utente.setText("Nome Utente");
        jPanel_Right_Login.add(jLabel_Nome_Utente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, -1));

        jLabel_Password.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Password.setText("password");
        jPanel_Right_Login.add(jLabel_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, -1));

        jButton_Login.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Login.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton_Login.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Login.setText("Login");
       
        jPanel_Right_Login.add(jButton_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        jLabel1_Nuovo_Utente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1_Nuovo_Utente.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1_Nuovo_Utente.setText("nuovo utente?");
        jPanel_Right_Login.add(jLabel1_Nuovo_Utente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        jButton_Nuovo_Utente.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Nuovo_Utente.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton_Nuovo_Utente.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Nuovo_Utente.setText("Registrati");
       
        jPanel_Right_Login.add(jButton_Nuovo_Utente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        getContentPane().add(jPanel_Right_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Login;
    private javax.swing.JButton jButton_Nuovo_Utente;
    private javax.swing.JLabel jLabel1_Nuovo_Utente;
    private javax.swing.JLabel jLabel_Icon_Left;
    private javax.swing.JLabel jLabel_Nome_Utente;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JPanel jPanel_Left_Login;
    private javax.swing.JPanel jPanel_Right_Login;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_Nome_Utente;
    // End of variables declaration//GEN-END:variables
    
    public javax.swing.JButton getjButton_Login() {
		return jButton_Login;
	}

	public void setjButton_Login(javax.swing.JButton jButton_Login) {
		this.jButton_Login = jButton_Login;
	}

	public javax.swing.JButton getjButton_Nuovo_Utente() {
		return jButton_Nuovo_Utente;
	}

	public void setjButton_Nuovo_Utente(javax.swing.JButton jButton_Nuovo_Utente) {
		this.jButton_Nuovo_Utente = jButton_Nuovo_Utente;
	}

	public javax.swing.JLabel getjLabel1_Nuovo_Utente() {
		return jLabel1_Nuovo_Utente;
	}

	public void setjLabel1_Nuovo_Utente(javax.swing.JLabel jLabel1_Nuovo_Utente) {
		this.jLabel1_Nuovo_Utente = jLabel1_Nuovo_Utente;
	}

	public javax.swing.JLabel getjLabel_Icon_Left() {
		return jLabel_Icon_Left;
	}

	public void setjLabel_Icon_Left(javax.swing.JLabel jLabel_Icon_Left) {
		this.jLabel_Icon_Left = jLabel_Icon_Left;
	}

	public javax.swing.JLabel getjLabel_Nome_Utente() {
		return jLabel_Nome_Utente;
	}

	public void setjLabel_Nome_Utente(javax.swing.JLabel jLabel_Nome_Utente) {
		this.jLabel_Nome_Utente = jLabel_Nome_Utente;
	}

	public javax.swing.JLabel getjLabel_Password() {
		return jLabel_Password;
	}

	public void setjLabel_Password(javax.swing.JLabel jLabel_Password) {
		this.jLabel_Password = jLabel_Password;
	}

	public javax.swing.JPasswordField getjPasswordField() {
		return jPasswordField;
	}

	public void setjPasswordField(javax.swing.JPasswordField jPasswordField) {
		this.jPasswordField = jPasswordField;
	}

	public javax.swing.JTextField getjTextField_Nome_Utente() {
		return jTextField_Nome_Utente;
	}

	public void setjTextField_Nome_Utente(javax.swing.JTextField jTextField_Nome_Utente) {
		this.jTextField_Nome_Utente = jTextField_Nome_Utente;
	}

	
   
}
