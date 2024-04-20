import java.util.*;
public class ass10sc
{
    public static void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your ascii code");
        int a=s.nextInt();
        if(a>=48 && a<=57)
        System.out.println("digit");
        else if(a>=65 && a<=90)
        System.out.println("upper case character");
        else if(a>=97 && a<=122)
        System.out.println("lower case character");
        else
        System.out.println("special character");
    }
}
