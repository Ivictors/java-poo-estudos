package victorexercicios2.introducao;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        int[] numeros = {-10,-45345,1, 18, 455, 587, 954};


        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("------------------------------");
        }
        sc.close();
    }
}
