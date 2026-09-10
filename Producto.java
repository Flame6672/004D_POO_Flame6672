public abstract class Producto {
    String nombre;
    int precioBase;
    int stock;

    Producto(String nombre, int precioBase, int stock) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getprecioBase() {
        return precioBase;
    }

    public void setprecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public int getstock() {
        return stock;
    }

    public void setstock(int stock) {
        this.stock = stock;
    }

    public abstract int calcularPrecioFinal();
}

// Me falta hacer el mostrarinfo()