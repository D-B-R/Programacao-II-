
package sylosbytes.sylosbytte;


import sylosbytes.sylosbytte.modelo.Aluguel;
import sylosbytes.sylosbytte.util.ArquivoAluguel;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;



public class ArmazenamentoController {
     @FXML
    private TextArea inputElements;
    
   
    @FXML
    private void inputAberto(){
        clear();
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        for(Aluguel a:lista){
            if(a.getStatus().equals("Em aberto")){
                String dtFormatado = a.getDataInicial().format(formatter);
                inputElements.appendText("ID: "+a.getId()+"  Nome: "+a.getProdutor().getName()+"    ");
                inputElements.appendText("Data: "+dtFormatado+"\n\n");
            }
        }
        
    }
    @FXML
    private void inputCredito(){
        clear();
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("###,###.00");
        
        for(Aluguel a:lista){
            if(a.getStatus().equals("Credito")){
                String dtFormatado = a.getDataInicial().format(formatter);
                inputElements.appendText("ID: "+a.getId()+"  Nome: "+a.getProdutor().getName()+"    ");
                inputElements.appendText("Valor: R$ "+df.format(a.getValor())+"    ");
                inputElements.appendText("Data: "+dtFormatado+"\n\n");
            }
        }
        
    }
    
     @FXML
    private void inputPago(){
        clear();
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("###,###.00");
        
        for(Aluguel a:lista){
            if(a.getStatus().equals("Pago")){
                String dtFormatado = a.getDataInicial().format(formatter);
                inputElements.appendText("ID: "+a.getId()+"  Nome: "+a.getProdutor().getName()+"    ");
                inputElements.appendText("Valor: R$ "+df.format(a.getValor())+"    ");
                inputElements.appendText("Data: "+dtFormatado+"\n\n");
            }
        }
    }
    
    @FXML
    private void clear(){
        inputElements.setText("");
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