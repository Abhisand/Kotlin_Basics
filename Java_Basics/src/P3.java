import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the no of lines of pattern to be printed(should be odd)");
        int n=SC.nextInt();

        int star=n,sp=0,p=1,q=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sp;j++)
                System.out.print(" ");
            for(int k=1;k<=star;k++)
                System.out.print("*");
            if(i>n/2)
            {
                sp--;
                star+=2;
            }
            else
            {
                sp++;
                star-=2;
            }
            System.out.println();
        }
    }
}
