package Caso_Negocio;

public class ProductoDigital extends Producto{
    private int descuento;
    private String plataforma;

    public ProductoDigital(String nombre, int precioBase, int stock, int descuento, String plataforma){
        super(nombre, precioBase, stock);
        this.descuento = descuento;
        this.plataforma = plataforma;
    }

    @Override
    public int calcularprecioFinal() {
        // TODO Auto-generated method stub
        return this.getPrecioBase() - (this.getPrecioBase() * this.getDescuento()) / 100;
    }

    public int getDescuento() {
        return this.descuento;
    }

    public String getPlataforma() {
        return this.plataforma;
    }

    @Override
    public String mostrarInfo() {
        // TODO Auto-generated method stub
        return super.mostrarInfo() + " Plataforma: [" + this.getPlataforma() + "]" + "Descuento: %" + this.getDescuento();
    }

    
}
