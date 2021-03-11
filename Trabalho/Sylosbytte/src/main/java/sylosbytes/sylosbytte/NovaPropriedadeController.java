
package sylosbytes.sylosbytte;

import java.io.IOException;
import javafx.fxml.FXML;


public class NovaPropriedadeController {
    
    @FXML
    private void cadastrarPropriedade() throws IOException{
        App.setRoot("novoUsuario");
    }
    
    @FXML
    private void voltarMenu1() throws IOException{
        App.setRoot("menuPrincipal");
    }
}
