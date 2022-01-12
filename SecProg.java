import jdk.jfr.StackTrace;

import java.util.Scanner;

public class SecProg {
    public static void main(String[] args){
//        Scanner c = new Scanner(System.in);
//        String name = c.nextLine();
//        int age = c.nextInt();//чтобы счистать дробное число double number = console.nextDouble()
//        System.out.println("Привет "+name+" твой возраст "+age);
//
//        Scanner cc=new Scanner(System.in);
//        int a= cc.nextInt();
//        int b= cc.nextInt();
//        System.out.println(a+b);

//        String str="10 20 30 40";
//        Scanner scan=new Scanner(str);
//        int a=scan.nextInt();
//        int b=scan.nextInt();
//        int c=scan.nextInt();
//        System.out.println(a+b+c);

        Scanner c = new Scanner(System.in);
        String name = c.nextLine();
        int age = c.nextInt();
        if (age>=18)
            System.out.println(name+", твой возраст "+age+" и ты совершеннолетний");
        else
            System.out.println(name+", твой возраст "+age+" и ты не совершеннолетний");
    }
}
