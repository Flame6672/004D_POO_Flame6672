package Caso_Negocio;

public class ProductoFisico extends Producto {
    int costoEnvio;

    public ProductoFisico(String nombre, int precioBase, int stock, int costoEnvio) {
        super(nombre, precioBase, stock);
        this.costoEnvio = costoEnvio;
    }

    public int getCostoEnvio() {
        return costoEnvio;
    }

    


}
