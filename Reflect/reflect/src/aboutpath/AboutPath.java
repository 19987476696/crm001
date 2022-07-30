package aboutpath;

/*
文件路径
    类路径下（src下）,从根路径开始写路径
 */
public class AboutPath {
    public static void main(String[] args) {
        //通用方式的路径，通用方式的前提是：这个文件必须在类路径下（src下）
        /*
        Thread.currentThread() 当前对象
        getContextClassLoader() 线程对象的方法，可以获取当前线程的类加载器对象
        getResource()   这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源
         */
        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo1.properties").getPath();
        System.out.println(path);//获取到了绝对路径
    }
}
