public class IfStatement {
    public static void main (String [] args) {

        int number = 10;
        
        // checks if number is less than 0
        if (number < 0) {
            System.out.println("The number is positive.");
        }
        // excute this block
        // if number is not greater than 0
        else {
        System.out.println("The number is not positive.");
    }

    System.out.println("Statement outside if...else block");
  }

}