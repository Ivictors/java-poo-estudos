package victorexercicios1.introducao;

public class ArrayBasico1_Introducao {
    public static void main(String[] args) {

        String[] nome = new String[2];
        nome[0] = "Jose";
        nome[1] = "Maria";

        int[] idade = new int[]{10, 20, 30};

        for(int i = 0; i < idade.length; i++) {
            System.out.println(idade[i]);
        }

        System.out.println("--------------------------------");

        int[][] notas = new int[2][2];
        notas[0][0] = 5;
        notas[0][1] = 7;

        notas[1][0] = 10;
        notas[1][1] = 7;

        for (int[] num : notas) {
            for (int notas1 : num) {
                System.out.println(notas1);
            }
        }
    }
}
