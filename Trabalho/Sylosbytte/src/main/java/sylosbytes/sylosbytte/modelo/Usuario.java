
package sylosbytes.sylosbytte.modelo;
/**
 *
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */
import java.io.Serializable;


public class Usuario implements Serializable{
    
   String login;
   
    String password;
   
   String name;
   
  
   
   public Usuario(){
       this.login = "";
       
        String password;
        
       this.name = "";
      
   }

    public Usuario(String login, String password, String name ) {
        
        this.login = login;
        
        this.password = password;
        
        this.name = name;
        
    }

    public String getLogin() {
        
        return login;
        
    }

    public String getName() {
        
        return name;
        
    }

    public String getPassword() {
        
        return password;
    }

    public void setLogin(String login) {
        
        this.login = login;
    }

    public void setName(String name) {
        
        this.name = name;
    }

    public void setPassword(String password) {
        
        this.password = password;
    }
   
   
    
}



