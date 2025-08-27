package victorexercicios2.introducao;

import java.util.Scanner;

public class GradeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];

        double media = 0;
        int i;
        for (i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota final do aluno " + (i + 1) + " de (0.0 a 10.00):");

            notas[i] = sc.nextDouble();
            if (notas[i] >= 0.0 && notas[i] <= 10.00) {
                media += notas[i];
            } else {
                System.out.println("Programa encerrado. Insira uma nota valida de 0.0 a 10.00 e tente novamente.");
                break;
            }
        }
        if (notas.length == i) {
            media = media / notas.length;
            System.out.println("a media da sala é : " + media);
        }
        sc.close();
    }
}

