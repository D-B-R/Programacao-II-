
package com.sylosbyte;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class TelaPrincipalController {
       @FXML
    private TextField campoEntrada;

    @FXML
    private TextField campoSaida;
    
    @FXML
    
    private void processar(){
        campoSaida.setText(campoEntrada.getText());
    }
    
    @FXML
    private void limpar(){
        campoEntrada.setText("");
        campoSaida.setText("");
    }
    
    @FXML
    private void sair(){
        
        System.exit(0);
    }
    
}
