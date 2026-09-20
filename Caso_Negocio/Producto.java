package Caso_Negocio;

public abstract class Producto {
    private String nombre;
    private int precioBase;
    private int stock;

    public Producto(String nombre, int precioBase, int stock) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPrecioBase() {
        return this.precioBase;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        if (stock < 0){
            System.out.println("El stock no puede ser negativo o 0");
        }
        else {
            this.stock = stock;
            System.out.println("Se actualizo el stock");
        }
    }

    public abstract int calcularprecioFinal();

    public String mostrarInfo() {
        return this.getNombre() + "$" + this.getPrecioBase() + " Cantidad [" + this.stock + "]";
    }

}