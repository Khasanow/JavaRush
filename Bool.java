import java.util.Scanner;

public class Bool {
    public static void main(String[]args){
//  && - И
//  || - ИЛИ
//  !  - НE
        Scanner c=new Scanner(System.in);
        int age= c.nextInt();
        boolean candrive=(age>=16);
        boolean cantdrive=(age<=15);

        if(age>=18&&age<=65)
            System.out.println("вы можете работать");
        else
            System.out.println("не можете работать");

        if (candrive&&(!cantdrive))
            System.out.println("может водить");
        else
            System.out.println("не может водить");
//ЛОГИЧСКАЯ АРИФМЕТИКА:
//        true && true        true
//        true && false        false
//        false && true        false
//        false && false        false
//
//        true || true        true
//        true || false        true
//        false || true        true
//        false || false        false
//
//        !true        false
//        !false        true


    }
}
