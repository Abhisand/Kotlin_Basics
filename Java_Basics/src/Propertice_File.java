import org.omg.CORBA.Environment;

import java.io.*;
import java.util.Properties;

public class Propertice_File
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Properties p=new Properties();
//        OutputStream out=new FileOutputStream("myPropertyFile.pdf");
//        p.setProperty("url","jdbc:mysql:localhost://3306/project");
//        p.setProperty("name","Abhishek");
//        p.setProperty("passwd","12345");
//        System.out.println(p);
//        p.store(out,"DBMS Helper");
//        System.out.println(p.getProperty("url"));
//          InputStream inputStream=new FileInputStream("myPropertyFile.txt");
//          p.load(inputStream);
//        System.out.println(p.getProperty("name"));\
//        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(new File("obj.txt")));
//        Save obj=new Save();
//        obj.x=100;
//        objectOutputStream.writeObject(obj);
//
//        ObjectInputStream inputStream1=new ObjectInputStream(new FileInputStream("obj.txt"));
//        Save obj1= (Save) inputStream1.readObject();
//        System.out.println(obj1.x);
//        DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream(new File("SimpleFile.txt")));
//        dataOutputStream.writeUTF("Welecome to my file!\n\tAbhishek");
        DataInputStream dataInputStream=new DataInputStream(new FileInputStream("simpleFile.txt"));
        System.out.println( dataInputStream.readUTF());

    }
}
class Save implements Serializable
{
    int x;
}