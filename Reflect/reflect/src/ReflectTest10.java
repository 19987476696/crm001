import java.lang.reflect.Method;

/*
通过反射机制怎么调用方法:
    1.对象创建
    2.方法名
    3.实际参数列表    (invoke())
    4.返回值


 */
public class ReflectTest10 {
    public static void main(String[] args) throws Exception{
        //使用反射机制怎么调用方法
        /*
        1.对象userService
        2.login方法名
        3.实际参数列表
        4.返回值
         */
        Class userServiceClass = Class.forName("bean.UserService");
        //创建对象
        Object obj = userServiceClass.newInstance();
        //获取Method
        Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
        //反射机制最重要的方法：invoke()
        Object retValue = loginMethod.invoke(obj, "admin", "123");
        System.out.println(retValue);
    }
}
