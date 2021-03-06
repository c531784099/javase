package 类加载器;
/***
 * 
 * 1\运行时包：同一个定义类加载器、同一个包、
 * 2、命名空间：有同一个类加载器及父类加载器所加载的类组成。
 * 
 * 1、每个类的命名空间：加载器及父类加载器加载的类构成了 命名空间。
 * 2、运行时包：同一个包下、相同的 定义类加载器加载。
 * 
 * 1、相同命名空间的类可见、父类加载器不能看到子类加载器的类
 * 2、子类加载器可以看到父加载器的所有类。
 * 3、没有父子关系的类加载器 不可以互相看到各自空间下的类。
 * 
 * 1、基本机制：委托父类加载机制、每一个加载器首先调用父类的加载、父类能加载、就会是父类加载器加载。父类不能加载就交给子类加载。
 * 2、当虚拟中不在有类的Class对象的引用时、就会卸载方法区的二进制字节码。类就会被卸载。
 * 
 * 1、java中的反射利用的是 加载类时在堆内存中生成的Class对象提供的额API来操作 方法区的代码。
 * 
 * 1、获得Class对象   对象.getClass();   类.class 一个静态属性。
 * 2、类加载器：类加载器持有Class对象、Class对象持有ClassLoad对象。getClassLoad（）； *  
 * 
 * 
 * 
 * 
 * 
 * * */
public class 类加载器 {

}
