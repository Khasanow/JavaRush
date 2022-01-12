import java.util.Locale;

public class FirstProgramm {
    public static void main (String[] args){
        String s = "amigo";
        String ss="smartbuy", sss="logitech", ssss="legion";
        int a=22, b=3, c=12;
        System.out.println(a%b);
        System.out.println(c/b);
        System.out.println((a/c)*b);
        System.out.println(a+b+c);
        System.out.println(a-b-c);
        System.out.println(s);
        System.out.println("amigo");
        System.out.println(a=a+1);
        System.out.println(ss);
        System.out.println(ss+sss);//конкатенация
        System.out.println(ssss+" pro");

        String str = ""+ 7;//преобразование число в строку
        System.out.println(str);

        String zz = "12345";
        int zzz = Integer.parseInt(zz);//преобразование строки в число
        System.out.println(zzz);

        int xxxx = Integer.parseInt("321");
        System.out.println(xxxx);

        String name = "AlEx";
        int cc = name.length();
        System.out.println(cc);

        int ccc="".length();
        System.out.println(ccc);

        String name2="RoMaN";
        int cccc = (name2 + name).length();
        System.out.println(cccc);

        String name3=name.toLowerCase();
        String name4=name2.toUpperCase();
        System.out.println(name3+" "+name4);
    }
}
