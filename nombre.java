import java.util.Scanner;

public class Nombre {
    
    public static String leerNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = scanner.nextLine();
        return nombre;
    }

    public static void main(String[] args) {
        String nombre = leerNombre();
        System.out.println("Hola, " + nombre + "!");
    }
}

