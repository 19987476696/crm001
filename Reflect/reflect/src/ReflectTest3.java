import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
验证反射机制的灵活性
    java代码只需要写一遍，不改源代码的基础上，可以做到不同对象的实例化
    符合OCP开闭原则
 */
public class ReflectTest3 {
    public static void main(String[] args) {
        //通过IO流读取classinfo.properties文件
        FileReader reader = null;
        try {
            reader = new FileReader("classinfo.properties");
            //创建属性类对象
            Properties properties = new Properties();
            //加载
            properties.load(reader);
            //通过key获取value
            String className = properties.getProperty("className");
            System.out.println(className);

            //通过反射实例化对象
            Class c = Class.forName(className);
            Object obj = c.newInstance();
            System.out.println(obj);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
