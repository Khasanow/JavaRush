import java.util.Scanner;

public class While {
    public static void main(String[]args){

        Scanner console = new Scanner(System.in);
        int sum = 1;
        while (console.hasNextInt())
        {
            int x = console.nextInt();
            sum = sum + x;
            break;
        }
        System.out.println(sum);
    }
}
