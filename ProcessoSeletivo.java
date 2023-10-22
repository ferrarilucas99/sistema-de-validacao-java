import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();

        int aprovados = 0;
        int reprovados = 0;

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.print("Informe a quantidade de respostas corretas do aluno " + i + ": ");
            int respostasCorretas = scanner.nextInt();

            if (respostasCorretas >= 7) {
                System.out.println("Aluno " + i + " aprovado!");
                aprovados++;
            } else {
                System.out.println("Aluno " + i + " reprovado.");
                reprovados++;
            }
        }

        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        System.out.println("Quantidade de alunos reprovados: " + reprovados);

        scanner.close();
    }
}
