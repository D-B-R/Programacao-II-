
package sylosbytes.sylosbytte;

/**
 *
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */

import sylosbytes.sylosbytte.modelo.Propriedade;
import sylosbytes.sylosbytte.util.ArquivoPropriedade;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class NovaPropriedadeController {
    
    @FXML
    private TextField inputPROPRIEDADE;

    @FXML
    private TextField inputEstado;

    @FXML
    private TextField inputMunicipio;
    
    @FXML
    private void cadastrar() throws IOException{
        Propriedade p = new Propriedade();
        p.setMunicipio(inputMunicipio.getText());
        p.setNomePropriedade(inputPROPRIEDADE.getText());
        p.setEstado(inputEstado.getText());
        ArquivoPropriedade.inserir(p);
        App.setRoot("menuPrincipal");
    }
    
   
    
    @FXML
    private void voltarMenu() throws IOException{
        App.setRoot("menu");
    }
    
}
