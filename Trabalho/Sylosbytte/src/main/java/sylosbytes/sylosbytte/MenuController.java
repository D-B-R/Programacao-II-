
package sylosbytes.sylosbytte;
/**
 *
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */

import sylosbytes.sylosbytte.modelo.Usuario;
import sylosbytes.sylosbytte.util.Arquivo;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class MenuController {
    
    @FXML
    private TextField inputLogin;

    @FXML
    private TextField inputPassword;
    
    @FXML
    private Text erroText;
    
    @FXML
    private void cadastrarUsuario() throws IOException{
        App.setRoot("novoUsuario");
    }
    
     @FXML
    private void cadastrarPropriedade() throws IOException{
        App.setRoot("novaPropriedade");
    }
    
    @FXML
    private void goListUsuario() throws IOException{
        App.setRoot("listaUsuario");
    }
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
   
    
    @FXML
    private void entrar() throws IOException{
        
       ArrayList<Usuario> lista = Arquivo.listar();
        for(Usuario u : lista){
            if(u.getLogin().equals(inputLogin.getText())){
                if(u.getPassword().equals(inputPassword.getText())){
                    App.setRoot("menuPrincipal");
                }
            }else{
                erroText.setText("DADOS INVALIDOS ");
            }
        }
        
    }
}
  


/**/