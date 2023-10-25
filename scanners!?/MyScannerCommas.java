import java.util.Scanner;

public class MyScannerCommas
{

    public void run() {
        Scanner scanner = new Scanner(System.in).useDelimiter(",|\n");
        while (true) {
            System.out.println(scanner.next()); 
        }
    }

    public static void main(String[] args) {
        MyScannerCommas myScanner = new MyScannerCommas();
        myScanner.run();
    }
}

