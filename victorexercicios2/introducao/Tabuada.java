package victorexercicios2.introducao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero de 1 a 10: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int tabuada = num * i;
            System.out.println(num + " X " + i + "= " + tabuada);
        }
        sc.close();
    }
}
