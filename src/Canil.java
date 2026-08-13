public class Canil {
    public static void main(String[] args) {
        System.out.println("********Bienvenido al Caníl********");

        Perro perro_del_profe = new Perro();
        perro_del_profe.nombre = "Gimli";
        perro_del_profe.edad = 6;
        perro_del_profe.peso = 40;
        perro_del_profe.tiene_vacunas_al_dia = false;

        Perro perro_de_Tab = new Perro();
        perro_de_Tab.nombre = "Tadeo";
        perro_de_Tab.edad = 4;
        perro_de_Tab.peso = 15.452;
        perro_de_Tab.tiene_vacunas_al_dia = true;


        if (perro_de_Tab.edad > 2) {
            System.out.println("El perro indicado tiene más de 2 años");
    }
        else {
            System.out.println("El perro indicado no tiene más de 2 años");
    }

        if (perro_de_Tab.peso > 20) {
            System.out.println("El perro indicado es Pesado");
    }
        else {
            System.out.println("El perro indicado está en peso optimo");
    }
}

}