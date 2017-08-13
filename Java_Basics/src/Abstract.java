/**
 * Created by Abhishek on 7/29/2017.
 */
abstract public class Abstract {
    abstract void show();

Abstract()
{
    System.out.println("I am inside the constructor");
}

     void display()
     {
         System.out.println("Display");
     }
}
 class normal extends  Abstract
 {

     @Override

     void show() {
         System.out.println(name);
     }
     String name="Abhi";
     normal()
     {
         super();
         System.out.println("I am inside the derived class normal");
     }

     public static void main(String[] args) {
      normal obj=new normal();

     }

 }
