module com.example.pruebajavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.pruebajavafx to javafx.fxml;
    exports com.example.pruebajavafx;
}