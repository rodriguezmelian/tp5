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
public class Configurador {

    private String username;
    private String password;
   
    private static Configurador single_instance = null;

    public static Configurador getInstance() {
        if (single_instance == null)
            single_instance = new Configurador();

        return single_instance;
    }
    
    public void setUsername(String username){
        this.username = username;
        System.out.println(username + "Setuser");
    }

    public String getUsername() {
        System.out.println(this.username + "Getuser");
        return this.username;
        
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
    
  //  public String getUsr(){
  //      return username;
 //   }
    
  //  public void setUsr(String username){
  //      this.username = username;
//    }
}