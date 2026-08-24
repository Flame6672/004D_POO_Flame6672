import java.util.Scanner;



public class Main {



  public static void main(String[] args) {

    mostrarMenu();



  }



  static void mostrarMenu() {

    String opcion_menu;

    boolean mantener_menu = true;



    Personaje personaje_jugador = new Personaje();



    Scanner scanner = new Scanner(System.in);



    while (mantener_menu) {

      System.out.println("Elija su opción");

      System.out.println("1.- Crear personaje");

      System.out.println("2.- Ver personaje");

      System.out.println("3.- Cerrar");

      opcion_menu = scanner.nextLine();



      switch (opcion_menu) {

        case "1":

          crearPersonaje(scanner, personaje_jugador);



          break;

        case "2":

          verDatosDelPersonaje(scanner, personaje_jugador);

          break;

        case "3":

          System.out.println("Cosas de opcion 3");

          mantener_menu = false;

          break;



        default:

          System.out.println("Por favor ingrese una opción valida");

          break;

      }

    }

  }



  static void crearPersonaje(Scanner scanner, Personaje personaje_jugador) {

    System.out.println("Creación del Personaje");

    System.out.println("¿Cómo llamaras al personaje?");

    String nombre_sin_validar = scanner.nextLine();



    boolean bandera_ciclo_validar_nombre = true;



    while (bandera_ciclo_validar_nombre) {

      if (nombre_sin_validar.length() < 1) {

        System.out.println("Ingrese un nombre valido");

        nombre_sin_validar = scanner.nextLine();

      } else {

        bandera_ciclo_validar_nombre = false;

      }

    }



    personaje_jugador.validarNombre(nombre_sin_validar);



    System.out.println("¿Cómo llamaras al apellido del personaje?");

    personaje_jugador.apellido = scanner.nextLine();

    System.out.println("Asigna la vida del personaje");

    // personaje_jugador.vida = Integer.parseInt(scanner.nextLine());

    personaje_jugador.setVida(Integer.parseInt(scanner.nextLine()));

    // Pero haber creado el metodo no es suficiente, por que si el atributo sigue

    // publico, el encapsulamiento no tiene sentido. Revisemos con un ejemplo,

    // observa la siguiente linea

    // personaje_jugador.vida = -20;

    // Para que esto no sea posible, declararemos el atributo como privado

  }



  static void verDatosDelPersonaje(Scanner scanner, Personaje personaje_jugador) {

    System.out.println("Datos del personaje creado");

    System.out.println("Nombre personaje: " + personaje_jugador.mostrarNombre());

    System.out.println("Apellido personaje: " + personaje_jugador.apellido);



    // OJITO CON ESTO, ESTO ES LA LUZ!

    // REFLEXIONA, POR QUÉ ES MEJOR ESTO?

    // ENCAPSULANDO

    System.out.println("Vida personaje: " + personaje_jugador.getVida());

    System.out.println("¿Se encuentra vivo?: " + personaje_jugador.esta_vivo);

  }

}









public class Personaje {

  private String nombre;

  String apellido;

  private int vida;

  boolean esta_vivo = true;







  //Se va a comportar como un metodo seteador

  public void validarNombre(String nombre ){

    nombre = nombre.toUpperCase();

    if (nombre.length() < 1) {

      System.out.print("El nombre del personaje no puede quedar vacio");

    }

    switch (nombre) {

      case "WEON":

        this.nombre = "****";

        break;

      case "ESTUPIDO":

        this.nombre = "****";

        break;

      case "SOPENKO":

        this.nombre = "****";

        break;

      case "SOPENCO":

        this.nombre = "****";

        break;

      case "IDIOTA":

        this.nombre = "****";

        break;

    

      default:

        this.nombre = nombre;

        break;

    }

  }



  //Se le conoce como el metodo Getter. Sirve para obtener el valor de un atributo

  public String mostrarNombre(){

    return this.nombre;

  }



  public void setVida(int vida){

    if (vida < 0){

      System.out.print("La vida del personaje no puede ser negativa. Que demonios haces!");

      this.vida = 0;

    } else{

      this.vida = vida;

    }

  }



  public int getVida(){

    return vida;

  }

}

