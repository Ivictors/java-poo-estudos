package victorexercicios1.javacore.polimorfismo.servico;

import victorexercicios1.javacore.polimorfismo.dominio.Computador;

public class CalculadoraImposto {
  public static void calcularImpostoComputador(Computador computador){
      System.out.println("Relatorio imposto: ");

      double imposto = computador.impostoProduto();

      System.out.println("Nome produto: " + computador.getNome());
      System.out.println("Valor produto: " + computador.getValor());
      System.out.println("Imposto produto: " + imposto);
  }

}
