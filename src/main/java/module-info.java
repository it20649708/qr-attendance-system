module com.example.sys2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.sys2 to javafx.fxml;
    exports com.example.sys2;
}