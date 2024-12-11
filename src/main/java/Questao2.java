import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos alunos tem na clase?");
        int n = scanner.nextInt();

        List<String> nomes = new ArrayList<>();
        List<Float> notas = new ArrayList<>();

        float somaNotas = 0;


        for (int i = 0; i < n; i++) {
            System.out.println("Nome do Aluno " + (i+1) + ":");
            String nome = scanner.next();
            System.out.println("Nota do " + nome);
            float nota = scanner.nextFloat();

            System.out.println("O aluno " + nome + " tem " + nota + ".");

            nomes.add(nome);
            notas.add(nota);
            somaNotas += (nota);
        }

        float media = somaNotas / n;

        System.out.println("Media: " + media);

        System.out.print("Alunos com nota acima da média:");

        boolean alunosAcimaDaMedia = false;

        for (int i = 0; i < n; i++) {
            if (notas.get(i) > media) {
                System.out.println(nomes.get(i) + " - Nota: " + notas.get(i));
                alunosAcimaDaMedia = true;
            }
        }

        if (alunosAcimaDaMedia == false) {
            System.out.println("Nenhum aluno teve a nota acima da media.");
        }

        scanner.close();
    }
}
