package aboutpath;

import java.util.ResourceBundle;

/*
java.util包下提供一个资源绑定器，便于获取属性文件中的内容
使用这种方式，属性配置文件xxx.properties必须方法类路径下
 */
public class ResourceBundleTest1 {
    public static void main(String[] args) {
        //资源绑定器，只能绑定properties扩展名文件，写路径时不能写扩展名
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo1");
        String className = bundle.getString("className");
        System.out.println(className);
    }
}
