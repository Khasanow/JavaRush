import java.util.Scanner;

public class Zadachki {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        //напишите тут ваш код
            for (int i = start; i<end; i++)
            {
                if((i % multiple)==0)
                    sum+=i;
                continue;
            }

        System.out.println(sum);

    }
}