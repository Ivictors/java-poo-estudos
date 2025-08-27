package victorexercicios2.introducao;

public class SomaArray1 {
    public static void main(String[] args) {
        int[] somaArray = new int[]{1, 3, 5, 6, 6};
        int soma = 0;
        for (int i = 0; i < somaArray.length; i++) {
            soma += somaArray[i];
        }
        System.out.println(soma);
    }
}
