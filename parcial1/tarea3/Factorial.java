public class Factorial {
  
    class Main {
        public static void main(String[] args) {
            
          double fac = 1;
          double n = 5;
      
          // for loop
          for (int i = 1; i <= n; ++i) {
            System.out.print(fac);
            // body inside for loop
    
            fac *= i;     // sum = sum + i
            System.out.println(fac);
          }
             
          System.out.println("n! = " + fac);
        }
      }  
    }