module com.example.healthtech {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.healthtech to javafx.fxml;
    exports com.example.healthtech;
    opens com.example.healthtech.Controllers to javafx.fxml;
    exports com.example.healthtech.Controllers;
    opens com.example.healthtech.Models to javafx.fxml;
    exports com.example.healthtech.Models;

}