
package sylosbytes.sylosbytte;
/**
 *
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */
import sylosbytes.sylosbytte.modelo.Aluguel;
import sylosbytes.sylosbytte.util.ArquivoAluguel;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;


public class PagamentoController {
    @FXML
    private TextField inputID;
    
     @FXML
    private RadioButton credito;

    @FXML
    private RadioButton pago;
    
    @FXML
    private ToggleGroup grupo;
    
    @FXML
    private TextArea inputElements;
    
     @FXML
    private Label result;

    @FXML
    private DatePicker dateExit;

    @FXML
    private Label outDays;

    @FXML
    private Label outPrice;
    
    @FXML
    private Label txt;
    
   
    
   
    
    @FXML
    
    
    private void calcular() throws IOException{
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        
        RadioButton radio = (RadioButton) grupo.getSelectedToggle();
        
        int id = Integer.parseInt(inputID.getText());
        
        int index = -1;
        
        for(Aluguel a : lista){
            
            if(id == a.getId()){
                index = lista.indexOf(a);
            }
            
        }

        Aluguel a = lista.get(index);
        long dias = DAYS.between(a.getDataInicial(), dateExit.getValue());
        
        double price = dias * 2 * a.getQtd();
        
        String days = Long.toString(dias);
        String priceTotal = Double.toString(price);
        outDays.setText(days);
        outPrice.setText(priceTotal);
        
        
        if (radio.getText().equals("CONFRIMANDO PAGAMENTO")){
            ArquivoAluguel.alterar(a, a.getId(), "QUITADO", price);
            result.setText("REALIZADA QUITAÇÃO");
        }else{
            ArquivoAluguel.alterar(a, a.getId(), "Credito", price);
            result.setText("REALIZADA QUITAÇÃO");
        }
 
        
        
       
    }
    
    @FXML
    private void listar(){
        clear();
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        lista.stream().filter(a -> (a.getStatus().equals("PENDENTE"))).forEachOrdered(a -> {
            String dtFormatado = a.getDataInicial().format(formatter);
            inputElements.appendText("ID: "+a.getId()+"  Nome: "+a.getProdutor().getName()+"    ");
            inputElements.appendText("Data: "+dtFormatado+"\n\n");
        });
    }
    
    
   
    
    @FXML
    private void clear(){
        inputElements.setText("");
    }
    
    @FXML
    private void voltarMenu() throws IOException{
        App.setRoot("menuPrincipal");
    }
}





