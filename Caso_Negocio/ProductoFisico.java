package Caso_Negocio;

public class ProductoFisico extends Producto {
    private int costoEnvio;

    public ProductoFisico(String nombre, int precioBase, int stock, int costoEnvio) {
        super(nombre, precioBase, stock);
        this.costoEnvio = costoEnvio;
    }

    public int getCostoEnvio() {
        return this.costoEnvio;
    }

    @Override
    public int calcularprecioFinal() {
        // TODO Auto-generated method stub
        return this.getPrecioBase() + this.costoEnvio;
    }

    @Override
    public String mostrarInfo() {
        // TODO Auto-generated method stub
        return super.mostrarInfo() + " Costo envio: " + this.getCostoEnvio();
    }

    


}
