import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float consumoMedio = 12;
        float distancia = 360;
        float litrosConsumidos = distancia / consumoMedio;

        System.out.println("Digite o valor da litro de combustível: ");

        float valorLitro = scanner.nextFloat();
        float valorTotal = valorLitro * litrosConsumidos;

        System.out.println("O custo total da viagem é de R$ " + valorTotal + " e serão consumidos o total de " + litrosConsumidos + " litros");

        scanner.close();
    }
}
