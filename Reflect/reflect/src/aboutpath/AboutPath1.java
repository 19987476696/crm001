package aboutpath;


import java.io.InputStream;
import java.util.Properties;

/*
利用流的形式读取绝对路径，然后倒入
 */
public class AboutPath1 {
    public static void main(String[] args) throws Exception {
        /*String path = Thread.currentThread().getContextClassLoader().getResource("classinfo1.properties").getPath();
        //中文路径不可以
        FileReader reader = new FileReader(path);*/
        //以流的形式返回（中文可以）
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo1.properties");
        Properties pro = new Properties();
        pro.load(in);
        in.close();
        //通过key获取value
        String className = pro.getProperty("className");
        System.out.println(className);
    }
}
