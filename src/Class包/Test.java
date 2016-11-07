package Class包;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {

	public static void main(String[] args) throws Exception {
		Class cls1=null;
		Class cls2=null;
		Class cls3=null;
//		第一种方式
		cls1=Class.forName("Class包.Book");
		System.out.println(cls1.toString());
//		第二种方式
		cls2=Book.class;
		System.out.println(cls2.toString());
//		第三种方式
		Book b1=new Book();
		b1.setId(23);
		b1.setName("cheng");
		b1.setType("wen");
		cls3=b1.getClass();
		System.out.println(cls3);
		
		Book no1=(Book) cls3.newInstance();
		System.out.println(no1+"  "+b1);
//		System.out.println(no1.getName());
		System.out.println("===========================================================");
		Test t1=new Test();
//        t1.show(Book.class);
//        获得对象的值
//        t1.show1(b1);
//		方法信息
//		t1.show3(b1);
		t1.show4(b1);
		System.out.println(b1.getName());
	}
	
	public void show4(Object obj) throws NoSuchMethodException, SecurityException, Exception, IllegalArgumentException, InvocationTargetException{
		Class cls=obj.getClass();
		
//		获得指定的方法
		Method  m1=cls.getMethod("getName", null);
//		方法调用
		m1.invoke(obj, new Object[0]);
//		单参数方法调用
		Method m2=cls.getMethod("setName", String.class);
		m2.invoke(obj, "chengdsfs");
//		多参数方法调用
		Class[] cc={String.class,int.class};
		Method m3=cls.getMethod("test", cc);
		Object[] oo={"cheng",1};
		m3.invoke(obj, oo);
		
	}
	
	
	
	
//	显示方法信息
	public void  show3(Object obj){
		Class cls=obj.getClass();
		
		Method[] m1=cls.getDeclaredMethods();
		for (Method m0 : m1) {
			System.out.println("方法名称"+m0.getName());
			System.out.println("方法修饰符"+Modifier.toString(m0.getModifiers()));
			System.out.println("方法返回值类型"+m0.getReturnType());
			System.out.println("方法参数列表");
			Class [] cll=m0.getParameterTypes();
			for (Class class1 : cll) {
				System.out.println(class1.getName());
			}
		}
		
		
		
		
	}
	
	
	
	
	
//	获得对应类的  属性和方法信息
	public void show(Class cls){
		Field[] fi=cls.getDeclaredFields();
		for (Field field : fi) {
			System.out.println(field.getType()+"   "+field.getName());
			
		}
		System.out.println("++++++++++++++++++++++++++++==");
		Field[] fi1=cls.getFields();  //公有属性
		for (Field field : fi1) {
			System.out.println(field.getType()+"   "+field.getName());
			
		}
		
	}
//	获得传入对象的  属性的值
	public void show1(Object obj) throws Exception, IllegalAccessException{
//		获得class对象
		Class cls=obj.getClass();
//		获得所有的属性
		Field [] f1=cls.getDeclaredFields();
		for (Field f : f1) {
			f.setAccessible(true);
			System.out.println(f.getName()+"  "+f.get(obj));
		}
		
		
	}

}
