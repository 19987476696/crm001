import java.lang.reflect.Constructor;

/*
反射机制调用构造方法
 */
public class ReflectTest12 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("bean.Vip");
        //调用无参构造方法
        Object obj = c.newInstance();
        System.out.println(obj);
        //获取无参构造方法
        Constructor obj1 = c.getDeclaredConstructor();
        System.out.println(obj1.newInstance());

        //调用有参构造方法
        //第一步：获取有参构造方法
        Constructor con = c.getDeclaredConstructor(int.class, String.class, String.class, boolean.class);
        //第二步：调用构造方法new对象
        Object newObj = con.newInstance(110, "jake", "1990" ,true);
        System.out.println(newObj);


    }
}
