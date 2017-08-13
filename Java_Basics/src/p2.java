import java.util.Scanner;

public class p2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter the no of lines of patern required ");
        int n=sc.nextInt();
        int sp=2*n-2;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i-1;j++)
                System.out.print(" ");
            for(int k=1;k<=2*i+1;k++)
                System.out.print("*");
            for(int j1=1;j1<=sp;j1++)
                System.out.print(" ");
            for(int k1=1;k1<=2*i+1;k1++)
                System.out.print("*");
            sp-=2;

            System.out.println();
        }
    }
}
