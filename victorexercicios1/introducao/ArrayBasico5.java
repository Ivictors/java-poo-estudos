package victorexercicios1.introducao;

import java.util.Scanner;

public class ArrayBasico5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre abaixo com a numero de pessoas que terão suas alturas inseridas:");
        int n = sc.nextInt();

        System.out.println("Entre com a altura abaixo:");
        double[] alturas = new double[n];

        double soma = 0;
        for (int i = 0; i < n; i++) {
            alturas[i] = sc.nextDouble();
            soma += alturas[i];
        }
        for (double nAlturas : alturas) {
            System.out.println(nAlturas);
        }
        double media = soma / n;
        System.out.printf("Media: %.2f %n", media);

        sc.close();
    }
}
