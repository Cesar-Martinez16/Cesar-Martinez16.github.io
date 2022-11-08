public class ForNumbers {
    class Main {
        public static void main(String[] args) {
        
          int n = 10;
          // for loop
          System.out.println(" Tabla del 1");  
          for (int i = 1; i <= n; i=i+1) {
            System.out.println(i);
          }
          
          System.out.println(" Tabla del 2");  
          for (int i = 2; i <= n; i=i+2) {
            System.out.println(i);
          }
          
          System.out.println(" Tabla del 9");  
          for (int i = 9; i <= (n*9); i=i+9) {
            System.out.println(i);
          }

          System.out.println("Tabla del 9");
          for (int i = 1; i <= n; i=i+1) {
            System.out.println(i * 9);
          }

          System.out.println("Pares menores de 100");
          n=100;
          for (int i = 2; i <= (n); i=i+2) {
            System.out.println(i);
          }

          System.out.println("Impares entre 10 y 50");
          n=50;
          for (int i = 11; i <= (n); i=i+2) {
            System.out.println(i);
          }
          
          System.out.println("Pares menores de 100 orden descedente");
          n=0;
          for (int i = 98; i >= (n); i=i-2) {
            System.out.println(i);
          }
          
          System.out.println("Impares entre 10 y 50 orden descendente");
          n=11;
          for (int i = 49; i >= (n); i=i-3) {
            System.out.println(i);
          }
          }
      }
}
