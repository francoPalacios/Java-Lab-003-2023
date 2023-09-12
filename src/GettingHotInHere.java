import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");

        int x = scanner.nextInt();
        System.out.println(x+"°F");

        float y = (x - 32) * 5/9;
        System.out.println(y+"°C ");

        System.out.println("if it were 2°C warmer it would be "+(y+2)+"°C ");
    }
}
