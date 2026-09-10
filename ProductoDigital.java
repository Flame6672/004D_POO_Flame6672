public class ProductoDigital extends Producto {
    private int descuento;
    private String plataforma;

    ProductoDigital(String nombre, int precioBase, int stock, int descuento, String plataforma) {
        super(nombre, precioBase, stock);
        this.descuento = descuento;
        this.plataforma = plataforma;
    }

    public int getdescuento() {
        return this.descuento;
    }

    public String getplataforma() {
        return this.plataforma;
    }

    @Override
    public int calcularPrecioFinal() {
        // TODO Auto-generated method stub
        return (getprecioBase() * this.descuento) / 100;
    }
}
