/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnect;


import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author gabrielrodriguez
 */
public class add_user2 extends javax.swing.JFrame {
    

    /**
     * Creates new form add_user2
     */
    public add_user2() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textuser = new javax.swing.JTextField();
        textnombre = new javax.swing.JTextField();
        textpasswd = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Nombre");

        jLabel3.setText("Contraseña");

        jButton2.setText("VALIDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("AGREGAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("SALIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textnombre)
                            .addComponent(textpasswd)
                            .addComponent(textuser, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textpasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try {
            String username = textuser.getText();
            String passwd = textpasswd.getText();
            String nombre = textnombre.getText();

            Adduser(username,passwd,nombre);


    } catch (Exception e1) {
    System.out.println("Revise lo ingresado"+ e1); //TODO: handle exception
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try {
            String username = textuser.getText();
            String passwd = textpasswd.getText();
            String nombre = textnombre.getText();

            Validateuser(username);


    } catch (Exception e1) {
    System.out.println("Revise lo ingresado"+ e1); //TODO: handle exception
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(add_user2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_user2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_user2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_user2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_user2().setVisible(true);
            }
        });
    }
	public static void Validateuser(String username) {	

	String userv = "";
	String contrasenav = "";
	boolean ingreso = true;
    
	if (ingreso == true) {   
	try {
        //get connection to Database
        dbconnect s = dbconnect.getInstance();
        ResultSet loginu = s.st.executeQuery("select Username from usuarios where Username = '"+ username + "';");
        
        while (loginu.next()){
        	userv = (loginu.getString("Username"));
        	System.out.println(userv);
        }

        
        if(userv.equals(username)) {
        	JOptionPane.showMessageDialog(null, "USUARIO " + username.toUpperCase() + " "+ "NO DISPONIBLE"); 

        }
        else
        { 
        	JOptionPane.showMessageDialog(null, "USUARIO "+ username.toUpperCase() +" "+ "DISPONIBLE");
        }
	} catch (Exception e) {
		System.out.println("Revise lo ingresado"+ e); //TODO: handle exception
		     }	 
		}
	
	}
	public static void Adduser(String username, String passwd,String nombre ) {	
		String userc = "";
		String usuarioc = username;
		String passwdc = passwd;
		String nombrec = nombre;
		boolean ingreso = true;
		
		if (ingreso == true) {   
		try {
             
                dbconnect s = dbconnect.getInstance();
                //Statement mylog = s.st.createStatement();
                ResultSet loginu2 = s.st.executeQuery("select Username from usuarios where Username = '"+ username +"';");
	        //ResultSet loginu = mylog.executeQuery("select Username from usuarios where Username = '"+ usuario +"';");
	        
	        while (loginu2.next()){
	        	userc = (loginu2.getString("Username"));
	        }
	        
	        if(userc.equals(username)) {                
	        	JOptionPane.showMessageDialog(null, "USUARIO "+ username.toUpperCase() +" "+ "NO DISPONIBLE");
                }
                else if (nombre.equals("")){
                JOptionPane.showMessageDialog(null, "EL CAMPO NOMBRE NO SE ENCUENTRA CARGADO");
                }
                else if (passwd.equals("")){
                JOptionPane.showMessageDialog(null, "EL CAMPO CONTRASEÑA NO SE ENCUENTRA CARGADO");
                }
	        else
	        { 		        
	        	s.st.executeUpdate("INSERT INTO usuarios VALUES ('"+ username + "','" + nombre +"','"+ passwd + "','activo',1)"); 
	        	JOptionPane.showMessageDialog(null, "USUARIO " + username.toUpperCase() + " "+ "DADO DE ALTA"); 
	        }
	        
		} catch (Exception e) {
			System.out.println("Revise lo ingresado"+ e); //TODO: handle exception
			JOptionPane.showMessageDialog(null, "LOS TRES VALORES DEBEN SER CARGADOS");
			     }	 
			}	
		}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textnombre;
    private javax.swing.JTextField textpasswd;
    private javax.swing.JTextField textuser;
    // End of variables declaration//GEN-END:variables
}
