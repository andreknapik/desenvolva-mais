import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas pessoas comerão a pizza: ");
        int pessoas = sc.nextInt();

        System.out.println("Digite a quantidade de fatias que tem a pizza: ");
        int fatias = sc.nextInt();

        int fatiaPorPessoa = fatias / pessoas;
        int sobraDeFatias = fatias % pessoas;

        System.out.println("Fatias por pessoa: " + fatiaPorPessoa);

        if (sobraDeFatias > 0) {

            int fatiasNecessarias = pessoas - sobraDeFatias;
            System.out.println("Faltam " + fatiasNecessarias + " fatias para todos facaram com a mesma quantidade.");
            if (fatiasNecessarias < 0) {
                System.out.println("Sobram: " + sobraDeFatias + " fatias.");
            }
        }

        sc.close();
    }
}
