import java.util.Scanner;

public class prac2019
{
    public static void sortArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            } 
        }
    }
    
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER VALUE OF N: ");
        int n = in.nextInt();
        
        if (n <= 2 || n >= 10) 
        {
            System.out.println("MATRIX SIZE OUT OF RANGE");
            return;
        }
        
        int a[] = new int[n];
        int b[][] = new int[n][n];
        
        System.out.println("ENTER ELEMENTS OF SINGLE DIMENSIONAL ARRAY:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        
        sortArray(a);
        System.out.println("SORTED ARRAY:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        for (int i = n - 1, r = 0; i >= 0; i--, r++) {
            for (int j = 0; j <= i; j++) {
                b[r][j] = a[j];
            }
            
            for (int k = n - 1; k > i; k--) {
                b[r][k] = a[k - i - 1];
            }
        }
        
        System.out.println();
        System.out.println("FILLED MATRIX:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}