import java.io.*;
public class ass10is
{
    public static void main() throws IOException
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader b= new BufferedReader(r);
        System.out.println("enter your ascii code");
        int a=Integer.parseInt(b.readLine());
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
