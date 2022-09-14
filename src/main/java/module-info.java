module com.example.firstfxapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstfxapp to javafx.fxml;
    exports com.example.firstfxapp;
}