import java.util.Scanner;

class ABc
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of lines to be printed");
        int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
    for(int j=1;j<=n;j++)
    {
        if(i!=n/2+1)
        {
            if(j==n/2+1)
                System.out.print("  ");
            else
                System.out.print("* ");
        }
        else
            System.out.print(" ");


    }
    System.out.println();
}
    }
}
