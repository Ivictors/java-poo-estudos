package victorexercicios2.introducao;

import java.util.Scanner;

public class ParOuImpar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("o numero digitado é par");
        } else{
            System.out.println("o numero digitado é impar");
        }
        sc.close();
    }
}

