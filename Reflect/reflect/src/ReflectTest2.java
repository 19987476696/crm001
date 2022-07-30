/*
通过反射机制获取Class：
    通过Class的newInstance()方法实例化对象
    newInstance()方法内部调用了无参构造的方法，必须保证无参构造方法存在
 */
public class ReflectTest2 {
    public static void main(String[] args) {
        try {
            //通过反射机制，获取Class，通过Class来实例化对象
            Class c = Class.forName("bean.User");
            //newInstance()会调用这个类无参构造方法
            //保证类的无参构造方法存在才能运行
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
