/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnect;

/**
 *
 * @author gabrielrodriguez
 */

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class tabla {
    
    public void ver_tabla(JTable tabla){
        
        //INTANCIAMOS EL RENDERIZADO DE LA CLASE: RENDER
        tabla.setDefaultRenderer(Object.class, new render());
        
        //CREAMOS LOS BOTONES Y LO AGREGO A LA FILA DE LA TABLA
        JButton btn1 = new JButton("detalles");

        
        DefaultTableModel d = new DefaultTableModel
        (
        //creo filas y columnas
        
        new Object[][]{{"1","pedro",btn1},{"2","Juan",btn1}},
        new Object[] {"Nombre","Apellido","Estado","Otros"}
                        
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        //CON SETMODEL(Modelo)Agrego el 
        //modelo a la tabla
        tabla.setModel(d);
        tabla.setRowHeight(30);
    }
}
