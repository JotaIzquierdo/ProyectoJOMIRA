package com.example.pruebajavafx;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class PaginaPrincipalController {
    public void accederCliente(ActionEvent evento) {
        try {
            PrincipalMain.cambio("busqueda_cliente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void accederProveedores(ActionEvent evento) {
        try {
            PrincipalMain.cambio("busqueda_proveedor");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void accederProducto(ActionEvent evento) {
        try {
            PrincipalMain.cambio("busqueda_producto");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

