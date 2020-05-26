/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnect;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author gabrielrodriguez
 */
public class agendados extends javax.swing.JFrame {
    
    //String [] jTable_Display_contacto = {};
    //DefaultTableModel model2 = new DefaultTableModel(null,jTable_Display_contacto);


    
    public agendados() {
        initComponents();  
        show_contact();
        
       
    }
    public ArrayList<User> userlist(){
        ArrayList<User> userList = new ArrayList<>();
        try{
        Configurador c = Configurador.getInstance();
        System.out.println(c.getUsername());
        dbconnect s = dbconnect.getInstance();
        ResultSet loginu = s.st.executeQuery("select nombre,apellido,estado from DATOSCON where estado = 'Habilitado' and  Username = '"+ c.getUsername() + "' order by nombre;");
        User user;
        while (loginu.next()){
            user =new User(loginu.getString("nombre"),loginu.getString("apellido"),loginu.getString("estado"));
            userList.add(user);
        }
                
        } catch (Exception e) {
	System.out.println("Revise el contacto cargado en la lista"+ e); //TODO: handle exception
        	}
        return userList;
    }
    public void show_contact(){
        ArrayList<User> list = userlist();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_contacto.getModel();
        Object [] row = new Object [3];
        for(int i=0;i<list.size ();i++){
            row[0]=list.get(i).getnombre();
            row[1]=list.get(i).getapellido();
            row[2]=list.get(i).getestado();          
            model.addRow(row);
        }
    }   
        
     //////////////////////////////////
        public ArrayList<User> userlist2(){
        ArrayList<User> userList2 = new ArrayList<>();
        try{
        Configurador c = Configurador.getInstance();
        System.out.println(c.getUsername());
        dbconnect s = dbconnect.getInstance();
        ResultSet loginu = s.st.executeQuery("select nombre,apellido,estado from DATOSCON where estado = 'Habilitado' and  Username = '"+ c.getUsername() + "'order by apellido;");
        User user;
        while (loginu.next()){
            user =new User(loginu.getString("nombre"),loginu.getString("apellido"),loginu.getString("estado"));
            userList2.add(user);
        }
                
        } catch (Exception e) {
	System.out.println("Revise el contacto cargado en la lista"+ e); //TODO: handle exception
        	}
        return userList2;
    }
        public void show_order(){
        ArrayList<User> list = userlist2();
        DefaultTableModel model2 = (DefaultTableModel)jTable_Display_contacto.getModel();
        Object [] row = new Object [3];
        for(int i=0;i<list.size ();i++){
            row[0]=list.get(i).getnombre();
            row[1]=list.get(i).getapellido();
            row[2]=list.get(i).getestado();
            model2.addRow(row);
        }

} 
        
        
        public ArrayList<User> ListUsers (String nombre, String apellido)
        {
            ArrayList<User> usersList3 = new ArrayList<User>();
 
           
            try{
            dbconnect s = dbconnect.getInstance();
            String searchQuery = "select nombre,apellido,estado from DATOSCON WHERE nombre ='"+ nombre +"' and apellido ='" + apellido + "'" ;
            ResultSet loginu = s.st.executeQuery(searchQuery);
            //System.out.println(searchQuery);
            //System.out.println(ValtoSearch);
            User User;
            
            while (loginu.next()){
            User =new User(loginu.getString("nombre"),loginu.getString("apellido"),loginu.getString("estado"));
            usersList3.add(User);
            
            }
            }catch (SQLException ex) {   
                System.out.println(ex.getMessage());
            }
               return usersList3;
            }   
         
        public void findUsers()
        {
            ArrayList<User> users = ListUsers(textnomdis.getText(),textapedis.getText());
            DefaultTableModel model3 = new DefaultTableModel();
            model3.setColumnIdentifiers(new Object []{"nombre","apellido","estado"});
            Object [] row = new Object [3];
            for(int i=0;i<users.size ();i++)
            {
            row[0]=users.get(i).getnombre();
            row[1]=users.get(i).getapellido();
            row[2]=users.get(i).getestado();
            model3.addRow(row);
            }
            jTable_Display_contacto.setModel(model3);
        }
    ////////////////////////////////////    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textnombre = new javax.swing.JTextField();
        textapellido = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        btnclean = new javax.swing.JButton();
        textdireccion = new javax.swing.JTextField();
        texttelefono = new javax.swing.JTextField();
        textmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_contacto = new javax.swing.JTable();
        btnexit = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        textnomdis = new javax.swing.JTextField();
        textapedis = new javax.swing.JTextField();
        nombredisable = new javax.swing.JLabel();
        apellidodisable = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        textnombre.setText("pepe");
        textnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnombreActionPerformed(evt);
            }
        });

        textapellido.setText("rodriguez");

        btnadd.setText("AGREGAR");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jLabel4.setText("Dirección");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PERSONAL", "LABORAL" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PERSONAL", "LABORAL" }));

        jLabel6.setText("Mail");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PERSONAL", "LABORAL" }));

        btnclean.setText("LIMPIAR");
        btnclean.setToolTipText("");
        btnclean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncleanActionPerformed(evt);
            }
        });

        textdireccion.setText("casa");

        texttelefono.setText("112012202");
        texttelefono.setToolTipText("");

        textmail.setText("casa@hotmail.com");

        jTable_Display_contacto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable_Display_contacto);

        btnexit.setText("SALIR");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnrefresh.setText("RESTABLECER");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        jButton1.setText("DESHABILITAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textnomdis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textnomdisKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textnomdisKeyTyped(evt);
            }
        });

        nombredisable.setText("Nombre");

        apellidodisable.setText("Apellido");

        jButton2.setText("ORDENAR APELLIDO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("FILTRAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textmail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnrefresh)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnadd)
                .addGap(37, 37, 37)
                .addComponent(btnclean)
                .addGap(254, 254, 254)
                .addComponent(jLabel3)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombredisable)
                    .addComponent(apellidodisable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textnomdis, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textapedis, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnexit))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(textapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(textdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(texttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(textmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnrefresh)
                        .addGap(71, 71, 71)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnadd))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnclean))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(1, 1, 1)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombredisable)
                        .addGap(24, 24, 24)
                        .addComponent(apellidodisable))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textnomdis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(textapedis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(1, 1, 1)
                        .addComponent(btnexit))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnombreActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
    String nombre = textnombre.getText();
    String apellido = textapellido.getText();
    String direccionf = textdireccion.getText(); 
    String mailf = textmail.getText();
    String telefonof = texttelefono.getText();  
    String mail = jComboBox1.getSelectedItem().toString();
    int mailc = 0;
    String direccion = jComboBox2.getSelectedItem().toString();
    int direccionc = 0;
    String telefono = jComboBox3.getSelectedItem().toString();
    int telefonoc = 0;  
    Configurador c = Configurador.getInstance();
    System.out.println(c.getUsername());
    

    if (direccion.equals("LABORAL")){
         direccionc = 1;
       }  
    else {
         direccionc = 2;
    }
        if (direccion.equals("LABORAL")){
         mailc = 1;
       }  
    else {
         mailc = 2;
    }
        if (direccion.equals("LABORAL")){
         telefonoc = 1;
       }  
    else {
         telefonoc = 2;
    }
 
                            
                try{
                String nombrev ="";
                String apellidov ="";
                dbconnect sa = dbconnect.getInstance();
                ResultSet loginu = sa.st.executeQuery("select nombre,apellido from DATOSCON where nombre = '"+ nombre + "'AND apellido = '" + apellido + "';");
                //System.out.println(loginu);
                	while (loginu.next()){
	        	nombrev = (loginu.getString("nombre"));
                
	        }
                while (loginu.next()){
	        	apellidov = (loginu.getString("apellido"));
                System.out.println(apellidov);
	        }
                if (nombrev.equals(nombre)||apellidov.equals(apellido)) {
                JOptionPane.showMessageDialog(null, "EL CONTACTO " + nombre +" "+ apellido +" EXISTENTE"); 
                }
                else if(nombre.equals("") || apellido.equals("")|| direccionf.equals("")|| mailf.equals("")|| telefonof.equals("")|| mail.equals("")) {
                JOptionPane.showMessageDialog(null, "DEBE CARGAR TODOS LOS CAMPOS"); 
                }
                else{
                //
                	//Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda","root","password");
	        //Statement mylog = mycon.createStatement();
               	//mylog.executeUpdate("UPDATE usuarios SET Contrasena_u = '"+ passwd +"' WHERE Username = '"+ usuario + "';");
                //mylog.executeUpdate("INSERT INTO DATOSCON VALUES ('0','"+ usuario + "','1','" + direccionc + "','"+ mailc + "','"+ telefonoc + "','Ex compañero de trabajo2','" + nombre + "','"+ apellido + "','" + mailf + "','"+ direccionf + "','"+ telefonof + "')");
                dbconnect s = dbconnect.getInstance();
                s.st.executeUpdate("INSERT INTO DATOSCON VALUES ( 0,'"+ c.getUsername() + "','1','" + direccionc + "','"+ mailc + "','"+ telefonoc + "','Ex compañero de trabajo2','" + nombre + "','"+ apellido + "','" + mailf + "','"+ direccionf + "','"+ telefonof + "','Habilitado')");
                	JOptionPane.showMessageDialog(null, "EL CONTACTO " + nombre.toUpperCase() + " "+ " FUE AGREGADO"); 
                textnombre.setText(null);
                textapellido.setText(null);
                textdireccion.setText(null);
                texttelefono.setText(null);
                textmail.setText(null);
                jComboBox1.setSelectedIndex(WIDTH);
                jComboBox2.setSelectedIndex(WIDTH);
                jComboBox3.setSelectedIndex(WIDTH);
                }

  		} catch (Exception e) {
			System.out.println("Revise el contacto cargado al agregar"+ e); //TODO: handle exception
        	}
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void btncleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncleanActionPerformed

    textnombre.setText(null);
    textapellido.setText(null);
    textdireccion.setText(null);
    texttelefono.setText(null);
    textmail.setText(null);
    jComboBox1.setSelectedIndex(WIDTH);
    jComboBox2.setSelectedIndex(WIDTH);
    jComboBox3.setSelectedIndex(WIDTH);
    }//GEN-LAST:event_btncleanActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
    jTable_Display_contacto.setModel(new DefaultTableModel(null, new String []{"nombre","apellido","estado"}));
    show_contact();

    }//GEN-LAST:event_btnrefreshActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    //DISABLE
     try {
            String nombredisable = textnomdis.getText();
            String apellidodisable = textapedis.getText();
            
            Configurador c = Configurador.getInstance();
            //System.out.println(c.getUsername());
        
            //System.out.println(nombredisable);
            //System.out.println(apellidodisable);
            dbconnect s = dbconnect.getInstance();
            if(nombredisable.equals("") || apellidodisable.equals("")){
            JOptionPane.showMessageDialog(null, "DEBE CARGAR AMBOS CAMPOS");
            
            }else{
               s.st.executeUpdate("UPDATE DATOSCON SET estado = 'Inhabilitado' WHERE nombre ='"+ nombredisable +"' and apellido ='" + apellidodisable +"' and Username ='"+ c.getUsername() +"';");
            JOptionPane.showMessageDialog(null, "EL CONTACTO FUE INAHABILITADO");
            }
            
        } catch (Exception e1) {
        System.out.println("Revise lo ingresado en la consulta"+ e1); //TODO: handle exception
                }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textnomdisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textnomdisKeyReleased

    }//GEN-LAST:event_textnomdisKeyReleased

    private void textnomdisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textnomdisKeyTyped
    
    }//GEN-LAST:event_textnomdisKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jTable_Display_contacto.setModel(new DefaultTableModel(null, new String []{"nombre","apellido","estado"}));
    show_order();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nombredisable = textnomdis.getText();
        String apellidodisable = textapedis.getText();
        
        if(nombredisable.equals("") || apellidodisable.equals("")){
        JOptionPane.showMessageDialog(null, "DEBE CARGAR AMBOS CAMPOS");
        }
        else {
        findUsers();
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(agendados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agendados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agendados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agendados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agendados().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidodisable;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclean;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Display_contacto;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nombredisable;
    private javax.swing.JTextField textapedis;
    private javax.swing.JTextField textapellido;
    private javax.swing.JTextField textdireccion;
    private javax.swing.JTextField textmail;
    private javax.swing.JTextField textnombre;
    private javax.swing.JTextField textnomdis;
    private javax.swing.JTextField texttelefono;
    // End of variables declaration//GEN-END:variables

}
