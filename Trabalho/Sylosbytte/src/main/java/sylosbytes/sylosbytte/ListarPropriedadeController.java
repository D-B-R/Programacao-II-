
package sylosbytes.sylosbytte;

/**
 *
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */ 

import sylosbytes.sylosbytte.modelo.Propriedade;
import sylosbytes.sylosbytte.util.ArquivoPropriedade;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;



public class ListarPropriedadeController {
    
    @FXML
    private TextArea inputPROPRIEDADE;
    
    @FXML
    private void listarPropriedade(){
        ArrayList<Propriedade> lista = ArquivoPropriedade.listar();
    
        for(Propriedade u : lista){
            inputPROPRIEDADE.appendText("USUARIO: "+u.getMunicipio()+"    ");
            inputPROPRIEDADE.appendText("PROPRIEDADE: "+u.getNomePropriedade()+"\n\n");
        }
    }
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
    
    
    @FXML
    private void voltarMenu() throws IOException{
        App.setRoot("menu");
    }
    
}


/**/
