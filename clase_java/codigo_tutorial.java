// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class Main {
    
    // MÉTODO SIN PARÁMETRO NI RETORNO
    public static void saludar(){
        System.out.println("!Hola! Bienvenido al programa");
        System.out.println("Espero que este tutorial te guste");
    }
    
    // MÉTODO CON PARÁMETRO
    public static void mostrarMensaje(String nombre, int edad){
        System.out.println("Hola " + nombre + " tienes " + edad + " anios");
    }
    
    // MÉTODO CON RETORNO
    public static int calcularDoble(int numero){
        int resultado = numero*2;
        return resultado;
    }
    
    // LECTURA DE DATOS CON SCANNER
    public static void lecturaDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Hola, tu nombre es " + nombre);
        
    }
    
    // MÉTODO FINAL
    public static void metodoFinal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu apodo: ");
        String apodo = scanner.nextLine();
        int edadUser = 15;
        mostrarMensaje(apodo,edadUser);
        int edadSuperior = calcularDoble(edadUser);
        System.out.println("Todavia te faltan anios para llegar a los " + edadSuperior + "anios");
        
    }
    
    
    
    public static void main(String[] args) {
        // MÉTODO 1
        saludar();
        
        // MÉTODO 2
        mostrarMensaje("Juan",22);
        
        // MÉTODO 3
        int prueba = calcularDoble(3);
        System.out.println(prueba);
        
        // MÉTODO 4
        lecturaDatos();
        
        // MÉTODO 5
        metodoFinal();
    }
}