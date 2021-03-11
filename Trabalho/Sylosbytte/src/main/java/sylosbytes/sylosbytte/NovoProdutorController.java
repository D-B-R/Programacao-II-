
package sylosbytes.sylosbytte;
/**
 *
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */

import sylosbytes.sylosbytte.modelo.Produtor;
import sylosbytes.sylosbytte.util.ArquivoProdutor;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;


public class NovoProdutorController {
    
    @FXML
    private TextField inputCPF;

    @FXML
    private DatePicker inputDate;

    @FXML
    private TextField inputName;
    
    @FXML
    private void cadastrar() throws IOException{
        Produtor p = new Produtor();
        p.setName(inputName.getText());
        p.setCpf(inputCPF.getText());
        p.setDataNascimento(inputDate.getValue());
        ArquivoProdutor.inserir(p);
        App.setRoot("menuPrincipal");
    }
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void voltarMenu() throws IOException{
        App.setRoot("menuPrincipal");
    }
    
}



/**/
