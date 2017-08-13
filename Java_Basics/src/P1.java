import java.util.Scanner;

class  P
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of lines of required");
        int n=sc.nextInt();
        int sp=1,p=0,star;
        for(int i=n-1;i>=0;i--)
        {
            star=2*n-1;
            for(int j=1;j<=star;j++)
            {
                if(j==i+2 && i!=n-1)
                {
                    for(int k=1;k<=sp;k++)
                        System.out.print(" ");
                    sp+=2;star-=p;p+=2;
                }
                else
                    System.out.print("*");

            }
            System.out.println();
        }
    }
}