package victorexercicios2.introducao;

import java.util.Scanner;

public class Parimpar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numeros pares ou impares:");

        int[] numeros = new int[3];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] % 2 == 0) {
                System.out.println("numeros pares na posição " + (j + 1) + " = " + numeros[j]);
            } else {
                System.out.println("numeros impares na posição " + (j + 1) + " = " + numeros[j]);
            }
        }
        sc.close();
    }
}
