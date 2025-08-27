package victorexercicios2.introducao;

import java.util.Scanner;

public class TabuadaCompleta {
    public static void main(String[] args) {
        int i, j, num, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero abaixo?");
        num = sc.nextInt();
        for (i = 0; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
        }
        sc.close();
    }
}
