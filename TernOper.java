import java.util.Scanner;

public class TernOper {
    public static void main(String[]args){
//        Условие ? Выражение1 : Выражение2;
//        Если условие истинно, то выполняется выражение1 иначе выполняется выражение2.
//        После условия следует знак вопроса, а два выражения разделены двоеточием.
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        int money = age > 30 ? 100 : 50;
        System.out.println(money);


    }
}
