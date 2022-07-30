import java.lang.reflect.Field;

/*
反射机制访问一个java对象的属性:
    给属性赋值set
    获取属性
    获取属性的值get
 */
public class ReflectTest7 {
    public static void main(String[] args) throws Exception{
        Class studentClass = Class.forName("bean.Student");
        Object obj = studentClass.newInstance();//obj就是student对象（底层调用无参构造）

        //获取no属性,根据属性名称获取Field
        Field noField = studentClass.getDeclaredField("no");
        System.out.println(noField.getName());

        //给obj对象（student对象）的no赋值
        /*
            要素1：obj对象
            要素2：no属性
            要素3：2222值
        注意：反射机制更灵活
         */
        noField.set(obj, 2222);

        //读取(获取obj)
        System.out.println(noField.get(obj));

        //私有的属性访问
        Field nameField = studentClass.getDeclaredField("name");

        //打破封装（反射机制缺点）
        //这样在外部才能访问
        nameField.setAccessible(true);

        nameField.set(obj, "lisi");
        System.out.println(nameField.get(obj));
    }
}
