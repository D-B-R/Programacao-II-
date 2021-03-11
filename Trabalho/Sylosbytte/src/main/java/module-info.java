module sylosbytes.sylosbytte {
    requires javafx.controls;
    requires javafx.fxml;

    opens sylosbytes.sylosbytte to javafx.fxml;
    exports sylosbytes.sylosbytte;
}
