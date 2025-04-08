import java.util.Scanner;

public class ScannerReadLine {
    public static void main(String[] args) {
        Scanner line_text = new Scanner(System.in);
        int line_number = 1;

        while (line_text.hasNext()){

            String line = line_text.nextLine();

            System.out.println(line_number + " " + line);

            line_number ++;

        }

    }
}
