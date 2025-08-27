package victorexercicios1.javacore.data_hora.revisao;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Include date to format dd/MM/yyyy HH:mm:ss: ");
        String input = sc.nextLine();

        List<LocalDateTime> schedule = new ArrayList<>();
        try {
            LocalDateTime localDateTime1 = LocalDateTime.parse(input, dateTimeFormatter);

            if (!schedule.contains(localDateTime1)) {
                schedule.add(localDateTime1);
                System.out.println("Date added to schedule.");
            } else{
                System.out.println("Date unavailable.");
            }
            for (int i = 0; i < schedule.size(); i++) {
                System.out.println(schedule.get(i));
            }
        } catch (DateTimeException e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy HH:mm:ss.");
        }
        sc.close();

    }
}
