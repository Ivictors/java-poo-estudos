package victorexercicios1.introducao;

import java.util.Scanner;

public class ArrayBasico7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] vec = new int[n];

        for (int i = 0; i < vec.length; i++){
          vec[i] = sc.nextInt();
          }

        for (int negativos : vec){
            if (negativos < 0){
                System.out.println(negativos);
            }
        }
        sc.close();
    }
}
