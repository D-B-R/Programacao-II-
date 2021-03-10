package com;
/**
 * 
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */
import java.io.IOException;
import javafx.fxml.FXML;
/**
 * 
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */
public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
