module com.sylosbyte {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.sylosbyte to javafx.fxml;
    exports com.sylosbyte;
}
