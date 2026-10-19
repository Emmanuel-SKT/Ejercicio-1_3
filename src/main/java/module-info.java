module com.main.ejercicio1_3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.main.ejercicio1_3 to javafx.fxml;
    exports com.main.ejercicio1_3;
}
