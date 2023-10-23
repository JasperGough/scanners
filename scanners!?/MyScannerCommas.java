import java.util.Scanner;

public class MyScannerCommas
{

    public void run() {
        Scanner scanner = new Scanner(System.in).useDelimiter(",");
        while (true) {
            if (scanner.hasNext()) {
               String str = scanner.next();
               System.out.println(str); 
            }
            scanner.close();
        }
    }

    public static void main(String[] args) {
        MyScannerCommas myScanner = new MyScannerCommas();
        myScanner.run();
    }
}

