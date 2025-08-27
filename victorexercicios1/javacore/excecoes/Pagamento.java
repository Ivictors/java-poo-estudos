package victorexercicios1.javacore.excecoes;

public class Pagamento extends PagamentoInvalidoException{
    public static void efetuarPagamento (double saldo, double valor ){
        if (valor > saldo){
            throw new IllegalArgumentException(" Saldo insuficiente");
        } else {
            System.out.println("Pagamento realizado com sucesso");
        }
    }
}
