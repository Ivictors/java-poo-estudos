package victorexercicios2.introducao;

import java.util.Scanner;

public class SomaArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] somaArray= new int[5];
        somaArray[0]= sc.nextInt();
        somaArray[1]= sc.nextInt();
        somaArray[2]= sc.nextInt();
        somaArray[3]= sc.nextInt();
        somaArray[4]= sc.nextInt();
        int soma = 0;
        for (int i = 0; i < somaArray.length; i++) {
            soma +=somaArray[i];
        }
        System.out.println("O total somado é :"+soma);
        sc.close();
    }
}
