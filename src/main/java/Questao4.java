import java.util.Scanner;

public class Questao4 {

        public static boolean numeroPrimo(int num){

            if (num <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            int num = sc.nextInt();

            if (numeroPrimo(num)) {
                System.out.println("Primo");
            }
            else {
                System.out.println("Nao Primo");
            }

            sc.close();
        }
}
