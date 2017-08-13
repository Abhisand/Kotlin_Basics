interface i1
{
    default void show()
    {
        System.out.println("i1");
    }
}
interface i2
{
    default void show()
    {
        System.out.println("i2");
    }
    public void  display();


}
interface demo extends i1,i2
{

    @Override
    default void display() {

    }

    @Override
    default void show() {

        System.out.println("No more  i1 and i2");
    }
}
class A implements demo
{


    public static void main(String[] args) {
        A obj=new A();
        obj.display();
        obj.show();


    }

    @Override
    public void display() {
        System.out.println("Display");
    }
}