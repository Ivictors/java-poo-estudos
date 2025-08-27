package victorexercicios2.introducao;

public class SomaPar {
    public static void main(String[] args) {
        int i;
        int soma = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
                System.out.println(i + " " + soma);
            }
        }
    }
}
