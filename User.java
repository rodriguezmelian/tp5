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
public class User {
    private String nombre,apellido,estado;
    
    public User (String nombre,String apellido, String estado)
    {
        this.apellido=apellido;
        this.estado=estado;
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    public String getapellido(){
        return apellido;
    }
    public String getestado(){
        return estado;
    }
}
