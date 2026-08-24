package DiseñoDeSoftware.c02_Operators;

public class OperatorsExercises {

    public static void main(String[] args) {

//1. Crea una variable con el resultado de cada operacion aritmetica
        int suma = 10 + 5;
        int resta = 10 - 5;
        int multiplicacion = 10 * 5;
        int division = 10 / 5;
        int modulo = 10 % 3;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
//2. Crea una variable para cada tipo de operacion de asignacion
        int numero = 10;

        numero += 5;
        System.out.println("+= : " + numero);

        numero -= 3;
        System.out.println("-= : " + numero);

        numero *= 2;
        System.out.println("*= : " + numero);

        numero /= 4;
        System.out.println("/= : " + numero);

        numero %= 3;
        System.out.println("%= : " + numero);
//3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparacion
        System.out.println(10 > 5);
        System.out.println(10 == 10);
        System.out.println(5 <= 10);
//4. Imprime 3 comparaciones falsas con diferentes operadores de comparacion
        System.out.println(2 > 15);
        System.out.println(63 == 20);
        System.out.println(15 < 5);
//5. Utiliza el operador logico and
        boolean edadCorrecta = true;
        boolean tieneEntrada = true;

        System.out.println(edadCorrecta && tieneEntrada);
//6. Utiliza el operador logoco or
        boolean tieneEfectivo = false;
        boolean tieneTarjeta = true;

        System.out.println(tieneEfectivo || tieneTarjeta);
//7. Combina ambos operadores logicos
        boolean esEstudiante = true;
        boolean tieneDescuento = false;
        boolean esFinDeSemana = true;

        System.out.println((esEstudiante && tieneDescuento) || esFinDeSemana);
//8. Añade alguna negacion
        boolean llueve = false;

        System.out.println(!llueve);
//9. Imprime 3 ejemplos de uso de operadores unarios
        int contador = 5;

        contador++;
        System.out.println("Incremento: " + contador);

        contador--;
        System.out.println("Decremento: " + contador);

        System.out.println("Negación: " + (-contador));
//10. Combina operadores aritmeticos, de comparacion y logicos
        int edad = 20;
        int edadMinima = 18;
        boolean tieneDocumento = true;

        boolean puedeEntrar =
                (edad + 1 >= edadMinima) && tieneDocumento;

        System.out.println("¿Puede entrar?: " + puedeEntrar);


    }

}
