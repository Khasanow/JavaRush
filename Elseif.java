import java.util.Scanner;

public class Elseif {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int temp = s.nextInt(), a= s.nextInt(), b= s.nextInt();
//        if (temp>20)
//            System.out.println("надеть рубашку");
//        else {
//            if (temp>10)
//                System.out.println("надеть свитер");
//            else {
//                if (temp>0)
//                    System.out.println("надеть плащ");
//                else {
//                    System.out.println("надеть пальто");
//                }
//            }
//        }

//        if (temp>20)
//            System.out.println("надеть рубашку");
//        else
//            if (temp>10)
//                System.out.println("надеть свитер");
//            else
//                if (temp>0)
//                    System.out.println("надеть плащ");
//                else
//                    System.out.println("надеть пальто");

      if (temp>20)
          System.out.println("надеть рубашку");
      else if (temp>10)
          System.out.println("надеть свитер");
      else if (temp>0)
          System.out.println("надеть плащ");
      else
          System.out.println("надеть пальто");

      if (a<b)
          System.out.println(a);
      else
          System.out.println(b);

    }
}
