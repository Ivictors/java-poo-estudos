package victorexercicios1.introducao;

import java.util.Scanner;

public class ArrayBasico3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite as notas rodada " + (i + 1));
            notas[i] = sc.nextDouble();
            media += notas[i];
        }

        media= media / notas.length;
        System.out.println("a media do aluno é: " + media);

        sc.close();
    }
}
