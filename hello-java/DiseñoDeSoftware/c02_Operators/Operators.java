package DiseñoDeSoftware.c02_Operators;

public class Operators {

    public static void main(String[] args) {


        // Operadores

        //Aritmeticos

        var a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // asignacion

        a = 15;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 2; // a = a + 2
        // Se usa con todas las operacio9nes

        // Condicionales

        System.out.println(a == b);

        System.out.println(a != b); // se puede usar operadores de < o > y sus iguales

        // Logicos

        // y (AND)
        System.out.println(true && true);
        // usa tablas de verdad

        //o (or)
        System.out.println(true || true);
        // solo se necesita una verdadera o una falsa dependiendo del caso

        //no (NOT)
        System.out.println(!true);

        //unarios
        System.out.println(+b);
        //Se puese usasr para incrementar el valor dependiendo de don de este ubicado

    }

}
