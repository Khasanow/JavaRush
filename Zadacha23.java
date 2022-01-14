import java.util.Scanner;

public class Zadacha23 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int number=s.nextInt();
        do {
            System.out.println(str);
            number--;

        } while (number>0&&number<4);
    }
}
