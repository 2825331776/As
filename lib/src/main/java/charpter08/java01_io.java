package charpter08;

import java.io.File;

public class java01_io {
    public static void main(String[] args) {

        // todo java 数据流操作
        String filePath = "D:\\As_jin1\\lib\\src\\main\\data\\helloword";
        File file = new File(filePath);
        System.out.println(file);

        //判断当前的文件对象是否为文件
        System.out.println(file.isFile());

    }
}
