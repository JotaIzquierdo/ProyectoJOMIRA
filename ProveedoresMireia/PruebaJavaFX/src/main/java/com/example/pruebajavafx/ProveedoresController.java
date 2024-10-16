package com.example.pruebajavafx;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class ProveedoresController {
    public void addProveedores(MouseEvent mouseEvent) {
        try {
            PrincipalMain.cambio("alta_proveedor");
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

    public void guardarAltaProveedor(ActionEvent actionEvent) {
        try{
            PrincipalMain.cambio("guardar_alta_proveedor");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void volverBuscarProveedores(ActionEvent actionEvent) {
        try{
            PrincipalMain.cambio("busqueda_proveedor");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void botonModificacion(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("modificacion_proveedores");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void guardarModificacionProveedores(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("guardar_modificacion_proveedores");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void buscadorProveedoresTotales(MouseEvent mouseEvent) {
        try{
            PrincipalMain.cambio("busqueda_proveedor_total");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void botonConsulta(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("consulta_proveedor");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void botonBaja(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("baja_proveedor");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void guardarBajaProveedores(ActionEvent actionEvent) {
        try {
            PrincipalMain.cambio("guardar_baja_proveedores");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
