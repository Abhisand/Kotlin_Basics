import java.util.*;

public class Wrapper_Classess
{


    public static void main(String[] args) throws CloneNotSupportedException {

        ArrayList v=new ArrayList();
        System.out.println();
//        v.add(10);
//        v.add(20);
//       v.add(1,100);
        LinkedList<Integer> lst=new LinkedList<>();
        lst.add(123);
        lst.add(141);
        lst.add(1,208);

       Collections.sort(lst, (o1, o2) -> {return o1%10<o2%10?1:-1;});
        lst.forEach(j-> System.out.println(j));


    }
}






