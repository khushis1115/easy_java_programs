import java.io.*;
public class ass13is
{
    public static void main() throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        System.out.println("enter marks in three subjects");
        double a= Double.parseDouble(in.readLine());
        double b= Double.parseDouble(in.readLine());
        double c= Double.parseDouble(in.readLine());
        double percentage=((a+b+c)/300)*100;
        String grade="";
        if(percentage>=90)
        grade="A+";
        else if (percentage<90 && percentage>=80)
        grade="A"; //hi
        else if (percentage<80 && percentage>=70)
        grade="B+";
        else if (percentage<70 && percentage>=60)
        grade="B";
        else if (percentage<60 && percentage>=50)
        grade="C+";
        else if (percentage<50 && percentage>=40)
        grade="C";
        else
        grade="no grade";
        System.out.println("percentage="+percentage);
        System.out.println("grade="+grade);
    }
}
    