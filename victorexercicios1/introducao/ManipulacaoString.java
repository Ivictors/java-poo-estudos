package victorexercicios1.introducao;

public class ManipulacaoString {
    public static void main(String[] args) {
        String nome = "10";
        int numero = Integer.parseInt(nome);

        if (numero % 2 == 0) {
            System.out.println(" O numero " + numero + " par");
        } else {
            System.out.println(" O numero" + numero + " é impar");
        }

        // Conversão + media
        double media = 0;
        String[] numeros = {"2.5", "3.15", "4.6"};
        for (int i = 0; i < numeros.length; i++) {
            double array = Double.parseDouble(numeros[i]);
            System.out.println(array);
            media += array;
        }
        System.out.println("A media dos numeros do array é " + media / numeros.length);

        String name = "Naruto";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        String newname = name.replace('a', '@');
        System.out.println(newname);

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace('0', '3'));
        System.out.println(nome.substring(0));

    }
}
