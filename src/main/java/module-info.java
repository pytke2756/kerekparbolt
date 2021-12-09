module com.example.kerekparbolt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kerekparbolt to javafx.fxml;
    exports com.example.kerekparbolt;
}