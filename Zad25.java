import java.util.Scanner;

public class Zad25 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        double glass=0.5;
        boolean pisOpt=scan.nextBoolean();
        if (!(pisOpt)==true)
            System.out.println((int)(Math.floor(glass)));
        else
            System.out.println((int)(Math.ceil(glass)));

    }
}

