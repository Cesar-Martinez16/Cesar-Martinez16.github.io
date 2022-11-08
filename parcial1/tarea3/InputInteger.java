import java.util.Scanner;

class InputInteger {
    public static void main(String[] args) {
    	// Creamos una instancia de clase Scanner
        // Llamada Input 
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter an integer: ");
        int number = input.nextInt(); // Usameos Input para leer un entero 
        System.out.println("You entered " + number);

        // closing the scanner object
        input.close();
    }
}
