import java.util.Date;

/*
获取java.lang.Class，获取这个类的字节码：
    三种方式：
        第一种：Class c = Class.forName("完整类名加包名");
        第二种：Class c = 对象.getClass();
        第三种：Class c = 任何类型.class;
 */
public class ReflectTest1 {
    public static void main(String[] args) {
        /*
        Class.forName()
            1.静态方法
            2.方法的参数是一个字符串
            3.字符串需要一个完整的类名
            4.完整类名必须带有包名java.lang包也不能省略
         */
        Class c1 = null;
        try {
            c1 = Class.forName("java.lang.String");//表示String类型
            Class c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.util.Date");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //java中任何一个对象都有一个方法：getClass()
        String s = "abc";
        Class x = s.getClass();//x代表String.Class字节码文件,x代表String类型
        //地址一样，都指向方法区里的String.Class字节码
        System.out.println(c1 == x);//true

        //第三种方式：JAVA语言中任何一种类型，包括基本数据类型，都有.class属性
        Class z = String.class;
        Class k = Date.class;
        System.out.println(z == c1);//true
    }
}
