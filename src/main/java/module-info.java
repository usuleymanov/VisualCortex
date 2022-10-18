module com.example.visualcortex {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.visualcortex to javafx.fxml;
    exports com.example.visualcortex;
}