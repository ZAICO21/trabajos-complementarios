
// ENUNCIADO

/*
Crea un programa en Java que haga lo siguiente:

1. Crea un método vacío llamado "edadEn2100" que reciba el nombre del usuario,
    su anio de nacimiento y que imprima cuántos anios tendría en el anio 2100

3. En el main:
   - Pídele al usuario (con Scanner) su nombre.
   - Crea una variable de tipo int llamada "anioNacimiento" y dale un valor
   - Llama al método edadEn2100 enviando el nombre y anioNacimiento.
*/



// RESPUESTA

import java.util.Scanner;

class Main {

    // MÉTODO CON PARÁMETROS
    public static void edadEn2100(String nombre, int anioNacimiento){
        int edad = 2100 - anioNacimiento;
        System.out.println(nombre + ", en el anio 2100 tendras " + edad + " anios.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // PEDIR NOMBRE
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        // VARIABLE DE AÑO DE NACIMIENTO
        int anioNacimiento = 2005;  // Puedes cambiarlo o hacerlo fijo

        // LLAMADA AL MÉTODO
        edadEn2100(nombre, anioNacimiento);
    }
}

