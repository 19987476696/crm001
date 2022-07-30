/*
Class.forName()
    如果只希望一个类的静态代码块执行，其他代码不执行
       可以使用
        Class.forName(完整类名);
        这个方法会导致类加载，类加载时，静态代码块执行
 */
public class ReflectTest4 {
    public static void main(String[] args) {
        try {
            //类的静态代码块执行了
            Class.forName("MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    //静态代码块在类加载的时候执行，并且只执行一次
    static {
        System.out.println("静态代码块执行了!");
    }
}