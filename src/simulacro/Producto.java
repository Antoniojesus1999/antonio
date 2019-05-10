/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro;

/**
 *
 * @author Antonio Jesus
 */
public class Producto {
    private String Codigo;
    private String nombre;
    private double precio;
    private int stock;
    private static double total;

    public Producto(String Codigo, String nombre, double precio, int stock) {
        this.Codigo = Codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        total+=precio*stock;
    }

    public String getCodigo() {
        return Codigo;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return  "Codigo=" + Codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock ;
    }
    
    public  static void total(){
        System.out.println("El total es: "+total);
    }
    
    
    
    
    //version 6
    //version 7
    //version 8
}
