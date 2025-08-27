package victorexercicios1.javacore.metodo.teste;

import victorexercicios1.javacore.metodo.dominio.Colaborador;
import victorexercicios1.javacore.metodo.dominio.ImpressoraExercicio;

import java.util.Scanner;

public class Colaboradorteste {
    public static void main(String[] args) {
        Colaborador collaborator = new Colaborador();
        ImpressoraExercicio printer1 = new ImpressoraExercicio();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        collaborator.name= sc.nextLine();

        System.out.println("Digite sua idade");
        collaborator.age= sc.nextInt();

        System.out.println("Digite o seu salario dos ultimos 3 meses:");
        collaborator.salary1= sc.nextDouble();
        collaborator.salary2= sc.nextDouble();
        collaborator.salary3= sc.nextDouble();

        printer1.printer(collaborator);
        printer1.media(collaborator.salary1, collaborator.salary2, collaborator.salary3);



        sc.close();
    }
}
