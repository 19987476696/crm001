/*
给你一个类，获取这个类的父类以及实现的接口
 */
public class ReflectTest13 {
    public static void main(String[] args) throws Exception{
        //String类型
        Class stringClass = Class.forName("java.lang.String");
        //获取String的父类
        Class superClass = stringClass.getSuperclass();
        System.out.println(superClass.getSimpleName());

        //获取String的接口
        Class[] interfaces = stringClass.getInterfaces();
        for (Class in : interfaces) {
            System.out.println(in.getSimpleName());
        }
    }
}
