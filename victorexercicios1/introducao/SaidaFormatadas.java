package victorexercicios1.introducao;

public class SaidaFormatadas {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;
        int total1 = number1+number2;

        number1+=number2;

        double number3 = 40.00;
        double number4 = 50.00;
        double total2 = number3-number4;

        System.out.println("O total é "+ total1);
        System.out.printf("o total é %d%n", total1);
        System.out.printf("o total é %.2f%n", total2);
        System.out.println(number1);
    }
}
