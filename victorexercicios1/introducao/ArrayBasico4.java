package victorexercicios1.introducao;

import java.util.Scanner;

public class ArrayBasico4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] idade = new int[2][2];

        System.out.println("Digite as idades: ");
        for (int i = 0; i < idade.length; i++) {
            for (int j = 0; j < idade[i].length; j++) {
                idade[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < idade.length; i++) {
            for (int j = 0; j < idade[i].length; j++) {
                System.out.println(idade[i][j]);
            }
        }
        sc.close();
    }
}