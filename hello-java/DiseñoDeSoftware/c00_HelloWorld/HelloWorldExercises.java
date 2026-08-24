package DiseñoDeSoftware.c00_HelloWorld;

public class HelloWorldExercises {

    public static void main(String[] args) {

//1. Imprime un mesaje que diga tu nombre en lugar de "Hola mundo"
        System.out.println("Zara");
//2. Imprime dos lines: "Hola" y luego "Mundo" con un solo print
        System.out.println("Hola/nMundo");
//3. Añade un comentario sobre lo que hace cada linea del programa
        // Imprime el texto "Hola mundo"
        System.out.println("Hola mundo");
//4. Crea un comentario en varias lineas
        /*
Este es un comentario
que ocupa varias líneas.
Java no ejecutará este texto.
*/
//5. Imprime tu edad, tu colo favorito y tu ciudad
        System.out.println("Edad: 18");
        System.out.println("Color favorito: Morado");
        System.out.println("Ciudad: Mocoa");
//6. Explora los diferenter System.xxx.println(); mas alla de "out"
        System.err.println("Esto es un mensaje de error");

        System.out.print("Hola");
        System.out.printf("Edad: %d", 18);
//7. Utiliza varios printl para imprimir una frase
        System.out.print("Hola ");
        System.out.print("mi nombre ");
        System.out.print("es Zara.");
//8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando simbolos)
        System.out.println("  :)");
        System.out.println(" /   \\");
        System.out.println("| o o |");
        System.out.println("|  ^  |");
        System.out.println(" \\___/");
//9. Intenta ejecutar el programa sin el metodo main y observa el error
      // el mansaje de error es "Error: Main method not found in class basic.c00_HelloWord.HelloWorldExercises"
//10. Intenca cambiar el nombre del archivo por uno diferente al de la clase
      //Java da un error porque una clase public debe tener el mismo nombre que el archivo, la solucion seria cambiar tambien el nobmre de la clase

    }
}