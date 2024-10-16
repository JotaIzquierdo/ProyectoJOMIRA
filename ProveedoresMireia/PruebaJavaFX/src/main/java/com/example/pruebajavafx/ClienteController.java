package com.example.pruebajavafx;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class ClienteController {
    public void addCliente(MouseEvent mouseEvent) {
        try {
            PrincipalMain.cambio("alta_cliente");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void inicio(MouseEvent mouseEvent) {
        try {
            PrincipalMain.cambio("Pagina_Principal");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void inicioBoton(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("Pagina_Principal");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void guardarAltaCliente(ActionEvent actionEvent) {
        try{
            PrincipalMain.cambio("guardar_alta_cliente");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void volverBuscarCliente(ActionEvent actionEvent) {
        try{
            PrincipalMain.cambio("busqueda_cliente");
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public void botonModificacion(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("modificacion_cliente");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void guardarModificacionCliente(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("guardar_modificacion_cliente");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void buscadorClientesTotales(MouseEvent mouseEvent) {
        try{
            PrincipalMain.cambio("busqueda_cliente_total");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void botonConsulta(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("consulta_cliente");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void botonBaja(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("baja_cliente");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void guardarBajaCliente(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("guardar_baja_cliente");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

