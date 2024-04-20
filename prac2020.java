 import java.util.Scanner;

public class prac2020
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows (M): ");
        int m = in.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int n = in.nextInt();
        
        if (m <= 0 || m >= 10 || n <= 2 || n >= 6) 
        {
            System.out.println("not in range");
            return;
        }
        
        int a[][] = new int[m][n];
        
        for (int i = 0; i < m; i++)
        {
            System.out.println("ENTER ELEMENTS FOR ROW " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
                if (a[i][j] < 0 || a[i][j] > 7) {
                    System.out.println("INVALID INPUT");
                    return;
                }
            }
        }
        
        System.out.println("FILLED MATRIX \t DECIMAL EQUIVALENT");
        
        for (int i = 0; i < m; i++) {
            int d = 0;
            for (int j = 0; j < n; j++) {
                d += a[i][j] * Math.pow(8, n - j - 1 );
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\t\t" + d);
            System.out.println();
        }
    }
}