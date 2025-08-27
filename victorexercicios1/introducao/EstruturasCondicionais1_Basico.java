package victorexercicios1.introducao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasCondicionais1_Basico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();

        if (salario > 0 && salario <= 34.712) {
            salario *= 0.097;
            System.out.println(salario);
        } else if (salario > 34.713 && salario <= 68.507) {
            salario *= 0.3735;
            System.out.println(salario);
        } else {
            salario *= 0.050;
            System.out.println(salario);
        }

        sc.close();
    }
}
