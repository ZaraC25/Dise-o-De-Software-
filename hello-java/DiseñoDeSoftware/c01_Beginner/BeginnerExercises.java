package DiseñoDeSoftware.c01_Beginner;

public class BeginnerExercises {

    public static void main(String[] args) {

//1. Declara una variable de tipo String y asignale tu nombre
    String name = "Zara Julieth" ;
//2. Crea una variable de tipo int y asignale tu edad
    int age = 18;
//3. Crea una variable double con tu altura en metros
    double height = 1.60;
//4. Declara una variable de tipo boolean que indique si te gusta programar
    boolean gustaProgramar = true;
//5.  declara una constante con tu email
    final String EMAIl = "zzaraccalvache25@gmail.com" ;
//6. Crea una variable de tipo char y guardale tu inicial
    char initial = 'z' ;
//7. Declara una variable de tipo String con tu localidad, y a continuacion cambai su valor y vuelve a imprimirla
    String locality = "Mocoa" ;
    System.out.println("Localidad inicial: " + locality);

    locality = "Chorrillo" ;
    System.out.println("Nueva localidad: " + locality);
//8. crea una variable int llamada a, otra b, e imprime la suma de ambas
    int a = 2;
    int b = 5;

    System.out.println("La suma es: " + (a + b));
//9. Imprime el tipo de dos variables creadas anteriormente
    System.out.println("Tipo de nombre: " + name.getClass().getSimpleName());
    System.out.println("Tipo de localidad: " + locality.getClass().getSimpleName());

    }
}
