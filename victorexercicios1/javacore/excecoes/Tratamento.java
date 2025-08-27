package victorexercicios1.javacore.excecoes;

public class Tratamento {
    public static void main(String[] args) {
        divisao(4, 2);
        TratamentoNumero(8,0);
    }

    private static int divisao(int a, int b) {
        try {
            System.out.println(a/b);
            return a / b;
        } catch (RuntimeException e) {
            System.out.println("ENTRADA DE NUMERO INVALIDO -> 0");
            throw new RuntimeException(e);
        }
    }

    public static int TratamentoNumero(int x, int y){
        if (y == 0){
            throw new IllegalArgumentException("Numero 0 é invalido");
        } return x/y;
    }
}
