
import java.util.Scanner;

public class IntScannerx3
{

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt()*3;
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        IntScannerx3 myScanner = new IntScannerx3();
        myScanner.run();
    }
}
