/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionu2;

/**
 *
 * @author Victor Rodriguez
 */
public class Departamento {
    private int clave;
    private double extension;
    private String ubicacion;
    private boolean disponible;
    private double precio;

    public Departamento(int clave, double extension, String ubicacion, boolean disponible, double precio) {
        this.clave = clave;
        this.extension = extension;
        this.ubicacion = ubicacion;
        this.disponible = disponible;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getClave() {
        return clave;
    }

    public double getExtension() {
        return extension;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    
}
