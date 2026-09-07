Asignación de variables:
Cuando se asigna una variable en Java, se tiene que especificar que tipo de dato va a guardar esa variable, a diferencia de python que solo se crea el nombre de la variable = su valor, en Java se tiene que especificar si es un String, char, int, boolean, double.

Codigo:
En Java a diferencia de Python, no suele importar mucho la indentación/tabulación, principalmente sería para un aspecto meramente visual, además de que las lineas de codigo deben terminar en ; ya que se podría decir que indica el final de la instrucción, de lo contrario, no funcionará correctamente el codigo.

Entradas y salidas:
En Python suelen hacerse la clasica salida print("Hola Mundo") y ya, pero en Java en algo más extenso, ya que además de crear un main, deberás escribir System.out.println("Hola mundo"), tambien hay que destacar de que el ln en el print es importante, evitará que nuestros prints se junten en la consola, aunque puede tener el proposito de un System.out.print("Ingrese algo: ") para posteriormente hacer una variable que reciba un dato.

En Python pedirle al usuario desde la consola un valor es tan sencillo como hacer lo siguiente:
Nombre_variable = input() 

En Java, esto es más complejo, ya que primero se tiene que importar aquella herramienta. Sí, no viene precargada como en Python. Por lo que escribiendo generalmente arriba en el archivo se escribe import java.util.Scanner; para posteriormente crear una instancia de esta mencionada, colocando Scanner nombre_cualquiera(Ej: preguntador) = new Scanner(System.in); para despues finalmente realizar una solicitud de valor al usuario de la siguiente forma: variable = preguntador.nextln()

Dato importante: En el "input" de Java tambien se tiene que especificar que tipo de dato va a recibir. ¿Donde? Tomando el ejemplo anterior, sería aquí en preguntador.next--->line<---(), si se quiere solicitar una cadena de texto, es con line, si es un numero, es un int, un booleano con boolean, un decimal con double y demás.

Condicionales:
Al momento de escribir condicionales, aquí reciben una pequeña modificación en los nombres, en Python suelen ser los if, elif y else. Sin embargo, en Java son los if, else if y else. Tambien al momento de escribir los condicionales cambia, en Python se plantea de este modo:
if variable | operador logico(Ej: ==, >=, <=) | valor:
    print("Hello World")

En cambio, en Java se plantea del siguiente modo:
if (variable | operador | valor) {
    System.out.println("Hello world")
}

