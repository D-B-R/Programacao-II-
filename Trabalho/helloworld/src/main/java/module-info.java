module br {
    requires javafx.controls;
    requires javafx.fxml;

    opens br to javafx.fxml;
    exports br;
}
