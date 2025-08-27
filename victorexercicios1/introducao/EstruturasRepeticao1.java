package victorexercicios1.introducao;

import java.util.Scanner;

public class EstruturasRepeticao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int i = 0;
        int num = sc.nextInt();

        while (i <= num) {
            if (i % 2 != 0) {
                System.out.println("impares: " + i);
            }
            i++;
        }
        sc.close();
    }
}
