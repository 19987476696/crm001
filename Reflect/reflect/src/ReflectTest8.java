import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
反射Method
 */
public class ReflectTest8 {
    public static void main(String[] args ) throws Exception{
        Class userServiceClass = Class.forName("bean.UserService");

        //获取所有的Method方法(包括私有)
        Method[] methods = userServiceClass.getDeclaredMethods();
        //System.out.println(methods.length);//2

        for(Method method : methods) {
            //获取修饰符列表
            System.out.println(Modifier.toString(method.getModifiers()));
            //获取方法的返回值类型
            System.out.println(method.getReturnType().getSimpleName());
            //获取方法名
            System.out.println(method.getName());
            //方法的修饰符列表（一个方法肯有多个）
            Class[] parameterTypes = method.getParameterTypes();
            System.out.println(parameterTypes.length);
            for (Class parameterType : parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }
        }
    }
}
