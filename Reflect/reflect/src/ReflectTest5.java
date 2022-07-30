import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
反射student类中的Field
 */
public class ReflectTest5 {
    public static void main(String[] args ) throws ClassNotFoundException, NoSuchFieldException {
        //获取整个类
        Class studentClass = Class.forName("bean.Student");
        System.out.println("完整类名：" + studentClass.getName());
        System.out.println("简单类名：" + studentClass.getSimpleName());

        //获取类中所有的public修饰的Field
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);
        Field f = fields[0];
        //取出这个Field的名字
        String name = f.getName();
        System.out.println(name);

        //获取所有的Field
        Field[] fs = studentClass.getDeclaredFields();
        for (Field field : fs) {
            //获取属性修饰符列表 getModifiers()（int类型）
            int i = field.getModifiers();
            //转换成字符串
            String s1 = Modifier.toString(i);
            //获取属性类型    getType()（Class类型）
            Class c = field.getType();
            //获取属性名字    getName()（String类型）
            String s = field.getName();
            System.out.println("修饰符列表" + Modifier.toString(field.getModifiers()) +
                                "    属性类型" + field.getType().getSimpleName() +
                                "    属性名称" + field.getName());
        }
    }
}
