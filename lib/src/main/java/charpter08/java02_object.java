package charpter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.imageio.IIOException;

public class java02_object {
    public static void main(String[] args) {

        // todo java 文件操作 ---序列化和反序列化

        //todo 数据文件对象
        File dataFile = new File("D:\\As_jin1\\lib\\src\\main\\data\\obj.dat");

        // todo 对象输出流（管道对象）
        ObjectOutputStream  objectout = null;
        FileOutputStream out = null;

        //TODO 对象输入流
        ObjectInputStream objectin = null;
        FileInputStream in = null;


        try {
//            out = new FileOutputStream(dataFile);
//            objectout = new ObjectOutputStream(out);

            // todo java 中只有增加了特殊标记的类，才能再写文件中进行序列化操作
            //这里的标记其实就是一个接口（implements Serializable）
//            user user = new user();
//            objectout.writeObject(user);
//            objectout.flush();

            //TOdo 从文件中读取数据转换为对象
            in = new FileInputStream(dataFile);
            objectin = new ObjectInputStream(in);
            Object o = objectin.readObject();
            System.out.println(o);

        }catch ( Exception e){
            throw new RuntimeException(e);
        }finally {
            if (objectin == null){
                try {
                    objectin.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
class  user implements Serializable {

}