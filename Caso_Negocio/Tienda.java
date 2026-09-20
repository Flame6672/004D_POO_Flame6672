package Caso_Negocio;

public class Tienda {
    public static void main(String[] args) {
        mostrarMenu();
    }

    static void mostrarMenu(){
        System.out.println("Bienvenido a la tienda de videojuegos");

        System.out.println("1. Registrar producto");
        System.out.println("2. Listar inventario");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Vender producto");
        System.out.println("5. Resumen del inventario");
        System.out.println("6. Salir");
        System.out.println("7. Precargar datos de prueba");
    }

}