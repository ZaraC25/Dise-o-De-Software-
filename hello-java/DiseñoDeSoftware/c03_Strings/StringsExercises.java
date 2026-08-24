package DiseñoDeSoftware.c03_Strings;

public class StringsExercises {

    public static void main(String[] args) {

//1. Concatena dos cadenas de texto
        String name = "Zara";
        String surname = "Calvache";

        String nombreCompleto = name + " " + surname;

        System.out.println("Nombre completo: " + nombreCompleto);
//2. Muestra la longitud de una cadena de texto
        String word = "Java";

        System.out.println("Longitud: " + word.length());
//3. Muestra el primer y ultimo caracter de un string
        String text = "Programacion";

        System.out.println("Primer carácter: " + text.charAt(0));
        System.out.println("Último carácter: " + text.charAt(text.length() - 1));
//4. Convierte a mayusculas y minusculas un string
        String phrase = "Hola Mundo";

        System.out.println("Mayúsculas: " + phrase.toUpperCase());
        System.out.println("Minúsculas: " + phrase.toLowerCase());
//5. Comprueba si una cadena de texto contiene una palabra concreta
        String menssage = "Me gusta programar en Java";

        System.out.println("¿Contiene Java?: " + menssage.contains("Java"));
//6. Formatea un string con un entero
        int age = 18;

        String mensajeEdad = String.format("Tengo %d años", age);

        System.out.println(mensajeEdad);
//7. Elimina los espacios en blanco al principio y al final de un string
        String textoConEspacios = "   Hola Mundo   ";

        System.out.println("Antes: [" + textoConEspacios + "]");
        System.out.println("Después: [" + textoConEspacios.trim() + "]");
//8. Sustituye todos los espacios en blanco de un dtring por un guion (-)
        String fraseConEspacios = "Hola mundo desde Java";

        String fraseConGuiones = fraseConEspacios.replace(" ", "-");

        System.out.println(fraseConGuiones);
//9. Comprueba si dos strings son iguales
        String word1 = "Holaaa";
        String word2 = "Holaa";

        System.out.println("¿Son iguales?: " + word1.equals(word2));
//10. Comprueba si dos strings tienen la misma longitud
        String text1 = "Hola";
        String text2 = "Java";

        System.out.println("¿Tienen la misma longitud?: " + (text1.length() == text2.length());


    }

}
