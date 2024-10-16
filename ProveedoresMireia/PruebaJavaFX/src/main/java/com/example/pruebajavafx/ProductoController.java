package com.example.pruebajavafx;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class ProductoController {
    public void accederProducto(ActionEvent evento){
        try {
            PrincipalMain.cambio("busqueda_producto");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addProducto(MouseEvent mouseEvent) {
        try {

            PrincipalMain.cambio("alta_producto");
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

    public void guardarAltaProducto(ActionEvent actionEvent) {
        try{
            PrincipalMain.cambio("guardar_alta_producto");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void volverBuscarProducto(ActionEvent actionEvent) {
        try{
            PrincipalMain.cambio("busqueda_producto");
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public void botonModificacion(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("modificacion_producto");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void guardarModificacionProducto(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("guardar_modificacion_producto");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void buscadorProductoTotales(MouseEvent mouseEvent) {
        try{
            PrincipalMain.cambio("busqueda_producto_total");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void botonConsulta(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("consulta_producto");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void botonBaja(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("baja_producto");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void guardarBajaProducto(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("guardar_baja_producto");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

