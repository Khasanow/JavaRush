public class ForWhile {
    public static void main(String[]args){
        for (int i=1;i<=15;i++){
                if (i%2==0){
                    System.out.println(i);
                }
        }

        System.out.println();

        for (int q =1;q<=19;q++)
        {
            if ((q%2)==0) continue;
            System.out.println(q);
        }
    }
}
