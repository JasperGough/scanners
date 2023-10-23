
import java.util.Scanner;

public class IntScanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        IntScanner myScanner = new IntScanner();
        myScanner.run();
    }
}