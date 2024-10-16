package com.example.pruebajavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PrincipalMain extends Application {
    public static Scene escena;
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalMain.class.getResource("Pagina_Principal.fxml"));
        Parent root = fxmlLoader.load();

        escena= new Scene(root, 1280, 720);
        stage.setTitle("Aplicación");
        stage.setScene(escena);
        stage.show();
    }
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalMain.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void cambio(String fxml) throws IOException {
        escena.setRoot(loadFXML(fxml));
    }

    public static void main(String[] args) {
        launch();
    }


}