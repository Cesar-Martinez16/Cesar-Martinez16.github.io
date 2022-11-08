public class IfElse {
    public static void main (String[] args) {
        double number = 0.0;
        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        // check if number is less than 0
        else if (number < 0) {
            System.out.println("The number is negative.");
        }
        // if both condition is false
        else {
            System.out.println("The number is 0.");
        } 
    }

}