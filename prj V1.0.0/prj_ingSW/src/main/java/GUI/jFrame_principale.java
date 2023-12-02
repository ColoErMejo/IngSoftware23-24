/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;

/**
 *
 * @author Merlo
 */
public class jFrame_principale extends javax.swing.JFrame {

	
	
    /**
     * Creates new form jFrame_principale
     */
    public jFrame_principale() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton_IMieiCantieri = new javax.swing.JButton();
        jButton_Bilancio = new javax.swing.JButton();
        jButton_IlMioPersonale = new javax.swing.JButton();
        jButton_Inventario = new javax.swing.JButton();
        jComboBox_IMieiCantieri = new javax.swing.JComboBox<>();
        jButton_Fatture = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton_VediUser = new javax.swing.JButton();
        jButton_Impostazioni = new javax.swing.JButton();
        jButton_AggiungiCantiere = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_IMieiCantieri.setBackground(new java.awt.Color(255, 255, 255));
        jButton_IMieiCantieri.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton_IMieiCantieri.setForeground(new java.awt.Color(51, 51, 51));
        jButton_IMieiCantieri.setText("i miei cantieri");
       
        jPanel1.add(jButton_IMieiCantieri, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 240, 50));

        jButton_Bilancio.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Bilancio.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton_Bilancio.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Bilancio.setText("bilancio");
       
        jPanel1.add(jButton_Bilancio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 230, 50));

        jButton_IlMioPersonale.setBackground(new java.awt.Color(255, 255, 255));
        jButton_IlMioPersonale.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton_IlMioPersonale.setForeground(new java.awt.Color(51, 51, 51));
        jButton_IlMioPersonale.setText("il mio personale");
       
        jPanel1.add(jButton_IlMioPersonale, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 240, 50));

        jButton_Inventario.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Inventario.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton_Inventario.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Inventario.setText("inventario");
        
        jPanel1.add(jButton_Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 50));

        jComboBox_IMieiCantieri.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_IMieiCantieri.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jComboBox_IMieiCantieri.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox_IMieiCantieri.setMaximumRowCount(200);
       
        jPanel1.add(jComboBox_IMieiCantieri, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 170, -1));

        jButton_Fatture.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Fatture.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton_Fatture.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Fatture.setText("fatture");
       
        jPanel1.add(jButton_Fatture, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 230, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_VediUser.setText("user, manca png");
       
        jPanel2.add(jButton_VediUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jButton_Impostazioni.setText("impostazioni, manca png");
       
        jPanel2.add(jButton_Impostazioni, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jButton_AggiungiCantiere.setText("aggiungi cantiere menca png");
       
        jPanel2.add(jButton_AggiungiCantiere, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("aggiungi nuovo cantiere");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 510, 600));

        pack();
        setLocationRelativeTo(null);
        
        jComboBox_IMieiCantieri.setVisible(false);
        
       
    }
    
    //DA AGGIUNGERE AD initComponents()
    //jComboBox_IMieiCantieri.setVisible(false);
    //populatejComboBox(jComboBox_IMieiCantieri, items);
    

    //POPOLARE COMBOBOX CON ARRAY COME PARAMETRO, SECONDO PARAMETRO SOSTITUIBILE CON readDataArray()
    public void populatejComboBox(JComboBox<String> comboBox,String[] items)
    {
    	for (String item : items) {
            comboBox.addItem(item);
        }
    }
    
    //POPOLARE E RENDERE VISIBILE COMBOBOX
    public void comboBoxvisible(JComboBox<String> jComboBox)
    {
    	jComboBox.setVisible(true);
    	String[] items = readDataArray();
    	populatejComboBox(jComboBox, items);
    }
    
    //FUNZIONE PER IMPORTARE DA DB NOMI CANTIERI 
    private String[] readDataArray() {
    	String[] items = {"cant 1", "cant 2", "cant 3"};
		return items;
	}

    
    //GETTER AND SETTERS
	public javax.swing.JButton getjButton_AggiungiCantiere() {
		return jButton_AggiungiCantiere;
	}

	public void setjButton_AggiungiCantiere(javax.swing.JButton jButton_AggiungiCantiere) {
		this.jButton_AggiungiCantiere = jButton_AggiungiCantiere;
	}

	public javax.swing.JButton getjButton_Bilancio() {
		return jButton_Bilancio;
	}

	public void setjButton_Bilancio(javax.swing.JButton jButton_Bilancio) {
		this.jButton_Bilancio = jButton_Bilancio;
	}

	public javax.swing.JButton getjButton_Fatture() {
		return jButton_Fatture;
	}

	public void setjButton_Fatture(javax.swing.JButton jButton_Fatture) {
		this.jButton_Fatture = jButton_Fatture;
	}

	public javax.swing.JButton getjButton_IMieiCantieri() {
		return jButton_IMieiCantieri;
	}

	public void setjButton_IMieiCantieri(javax.swing.JButton jButton_IMieiCantieri) {
		this.jButton_IMieiCantieri = jButton_IMieiCantieri;
	}

	public javax.swing.JButton getjButton_IlMioPersonale() {
		return jButton_IlMioPersonale;
	}

	public void setjButton_IlMioPersonale(javax.swing.JButton jButton_IlMioPersonale) {
		this.jButton_IlMioPersonale = jButton_IlMioPersonale;
	}

	public javax.swing.JButton getjButton_Impostazioni() {
		return jButton_Impostazioni;
	}

	public void setjButton_Impostazioni(javax.swing.JButton jButton_Impostazioni) {
		this.jButton_Impostazioni = jButton_Impostazioni;
	}

	public javax.swing.JButton getjButton_Inventario() {
		return jButton_Inventario;
	}

	public void setjButton_Inventario(javax.swing.JButton jButton_Inventario) {
		this.jButton_Inventario = jButton_Inventario;
	}

	public javax.swing.JButton getjButton_VediUser() {
		return jButton_VediUser;
	}

	public void setjButton_VediUser(javax.swing.JButton jButton_VediUser) {
		this.jButton_VediUser = jButton_VediUser;
	}

	public javax.swing.JComboBox<String> getjComboBox_IMieiCantieri() {
		return jComboBox_IMieiCantieri;
	}

	public void setjComboBox_IMieiCantieri(javax.swing.JComboBox<String> jComboBox_IMieiCantieri) {
		this.jComboBox_IMieiCantieri = jComboBox_IMieiCantieri;
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AggiungiCantiere;
    private javax.swing.JButton jButton_Bilancio;
    private javax.swing.JButton jButton_Fatture;
    private javax.swing.JButton jButton_IMieiCantieri;
    private javax.swing.JButton jButton_IlMioPersonale;
    private javax.swing.JButton jButton_Impostazioni;
    private javax.swing.JButton jButton_Inventario;
    private javax.swing.JButton jButton_VediUser;
    private javax.swing.JComboBox<String> jComboBox_IMieiCantieri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
