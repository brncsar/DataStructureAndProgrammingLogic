import java.io.*;
import java.util.Calendar;

class Result {


    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month -1, day);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        return days[dayOfWeek - 1];
    }
}

public class DateAndTime {
    public static void main(String[] args) throws IOException {
        // Leitura da entrada
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Gravação da saída para um arquivo local
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        // Encontrando o dia
        String res = Result.findDay(month, day, year);

        // Escrevendo o resultado no arquivo
        bufferedWriter.write(res);
        bufferedWriter.newLine();

        // Fechando os recursos
        bufferedReader.close();
        bufferedWriter.close();
    }
}
