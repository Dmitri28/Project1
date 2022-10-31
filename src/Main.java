import java.io.FileNotFoundException;
import java.util.Scanner;
import  java.io.File;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String separator=File.separator;
        String файл = "C:\\Users\\admin\\Desktop";
        File file = new File(файл);

        Scanner scanner = new Scanner(файл);
    String line=scanner.nextLine();
    System.out.println(line);

    }

}
