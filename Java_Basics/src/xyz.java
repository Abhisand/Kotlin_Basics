interface  I1
{
  default void show()
  {
      System.out.println("I1");
  }
}
interface  I2
{
    int x=10;
   void show();
}
class B implements I1,I2
{

    @Override
    public void show() {

        System.out.println("No more I1 and I2");
    }

    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
}