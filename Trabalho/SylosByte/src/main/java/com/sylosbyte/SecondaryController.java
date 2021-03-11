package com.sylosbyte;
/**
 * 
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */
import com.sylosbyte.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}