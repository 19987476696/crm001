/*
可变长度参数
    int... args 这里是可变长度参数
    语法类型：类型...  （三个点）

   1.可变长度参数要求的个数为0~n个
   2.可变长度参数在参数列表中必须在最后一个位置上，而且只有一个
   3.可变长度参数可以看成一个数组
 */
public class ArgsTest {
    public static void main(String[] args) {
        m(10);
        m(10, 20);
        m1("lisi", "zahnsgan");
        //可以传数组
        String[] strs = {"1", "3", "4"};
        m1(strs);
    }
    public static void m(int... args) {
        System.out.println("m方法执行了！");
    }
    public static void m1(String... args) {
        //可以将可变长度数组当成数组，并且可以遍历出来
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
