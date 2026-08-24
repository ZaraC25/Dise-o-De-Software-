package DiseñoDeSoftware.c04_Conditionals;

public class ConditionalsExercises {

    public static void main(String[] args) {

//1. Extablece la edad de un usuario y muestra si puede votar
        int edad = 20;

        if (edad >= 18) {
            System.out.println("Puede votar");
        } else {
            System.out.println("No puede votar");
        }
//2. Declara dos numeros y muestra cual es mayor o si son iguales
        int numero1 = 15;
        int numero2 = 10;

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor");
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es mayor");
        } else {
            System.out.println("Los números son iguales");
        }
//3. Dado un numero, verifica si es positivo, negativo o cero
        int numero = -5;

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
//4. Crea un programa que duga si un numero es par o impar
        int numeroParImpar = 7;

        if (numeroParImpar % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
//5. Verifica si un numero esta en el rango de 1 a 100
        int numeroRango = 50;

        if (numeroRango >= 1 && numeroRango <= 100) {
            System.out.println("El número está entre 1 y 100");
        } else {
            System.out.println("El número está fuera del rango");
        }
//6. Declara una variable con el dia de la semana (1-7) y muestra su nombre con switch
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido");
        }
//7. Simula un sistema de notas: muestra "Sobresaliente", "Aprovado" o "Suspenso" segun la nota (0-100)
        int nota = 95;

        if (nota >= 90) {
            System.out.println("Sobresaliente");
        } else if (nota >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
//8. Escribe un programa que determine si puedes entras al cine: debes tener al menos 15 o ir acompañado
        int edadCine = 14;
        boolean vaAcompañado = true;

        if (edadCine >= 15 || vaAcompañado) {
            System.out.println("Puedes entrar al cine");
        } else {
            System.out.println("No puedes entrar al cine");
        }
//9. Crea un programa que diga si una letra es vocal o consonate (char)
        char letra = 'a';

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {

            System.out.println("Es una vocal");
        } else {
            System.out.println("Es una consonante");
        }
//10. Usa tres variables a, b, c y muestra cual es el mayor de las tres
        int a = 25;
        int b = 40;
        int c = 15;

        if (a >= b && a >= c) {
            System.out.println("El mayor es: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es: " + b);
        } else {
            System.out.println("El mayor es: " + c);
        }

    }

}
