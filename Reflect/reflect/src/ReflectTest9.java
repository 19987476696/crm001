import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
反编译
 */
public class ReflectTest9 {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();
        Class userServiceClass = Class.forName("bean.UserService");
        s.append(Modifier.toString(userServiceClass.getModifiers()) + " class " + userServiceClass.getSimpleName() + " {\n");

        Method[] methods = userServiceClass.getDeclaredMethods();

        for (Method method : methods) {
            s.append("\t");
            s.append(Modifier.toString(method.getModifiers()));
            s.append(" ");
            s.append(method.getReturnType().getSimpleName());
            s.append(" ");
            s.append(method.getName());
            s.append("(");
            //参数
            for (Class parameterType : method.getParameterTypes()){
                s.append(parameterType.getSimpleName());
                s.append(", ");
            }
            //截取指定下标的字符
            s.deleteCharAt(s.length() - 1);
            s.deleteCharAt(s.length() - 1);
            s.append("){}\n");
        }
        s.append("}");

        System.out.println(s);
    }
}
