import java.util.Scanner;

public class Eq {
    public static void main(String[]args){
        String text="сООбщеНиЕ";
        String mass=text;
        String massage=text.toUpperCase();
        String massage2=text.toLowerCase();

        String str="5 10 15 20";
        Scanner s=new Scanner(str);
        int a=s.nextInt();
        int b=s.nextInt();
        String res=text.equals(massage2)?"одинаковые":"разные";

        System.out.println(text+" "+mass+" "+massage+" "+massage2);
        System.out.println(a*b);
        System.out.println(text==mass);
        System.out.println(mass==massage);
        System.out.println(massage2==text);
        System.out.println(b==a);
        System.out.println();
        System.out.println(massage.equals(massage2));//у типа String есть специальный метод — equals для сравнения строк
        System.out.println();
        System.out.println(massage.equalsIgnoreCase(massage2));//В Java у типа String есть еще один специальный метод — equalsIgnoreCase
        System.out.println();
        System.out.println(res);
    }
}
