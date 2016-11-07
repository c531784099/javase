package Class��;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {

	public static void main(String[] args) throws Exception {
		Class cls1=null;
		Class cls2=null;
		Class cls3=null;
//		��һ�ַ�ʽ
		cls1=Class.forName("Class��.Book");
		System.out.println(cls1.toString());
//		�ڶ��ַ�ʽ
		cls2=Book.class;
		System.out.println(cls2.toString());
//		�����ַ�ʽ
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
//        ��ö����ֵ
//        t1.show1(b1);
//		������Ϣ
//		t1.show3(b1);
		t1.show4(b1);
		System.out.println(b1.getName());
	}
	
	public void show4(Object obj) throws NoSuchMethodException, SecurityException, Exception, IllegalArgumentException, InvocationTargetException{
		Class cls=obj.getClass();
		
//		���ָ���ķ���
		Method  m1=cls.getMethod("getName", null);
//		��������
		m1.invoke(obj, new Object[0]);
//		��������������
		Method m2=cls.getMethod("setName", String.class);
		m2.invoke(obj, "chengdsfs");
//		�������������
		Class[] cc={String.class,int.class};
		Method m3=cls.getMethod("test", cc);
		Object[] oo={"cheng",1};
		m3.invoke(obj, oo);
		
	}
	
	
	
	
//	��ʾ������Ϣ
	public void  show3(Object obj){
		Class cls=obj.getClass();
		
		Method[] m1=cls.getDeclaredMethods();
		for (Method m0 : m1) {
			System.out.println("��������"+m0.getName());
			System.out.println("�������η�"+Modifier.toString(m0.getModifiers()));
			System.out.println("��������ֵ����"+m0.getReturnType());
			System.out.println("���������б�");
			Class [] cll=m0.getParameterTypes();
			for (Class class1 : cll) {
				System.out.println(class1.getName());
			}
		}
		
		
		
		
	}
	
	
	
	
	
//	��ö�Ӧ���  ���Ժͷ�����Ϣ
	public void show(Class cls){
		Field[] fi=cls.getDeclaredFields();
		for (Field field : fi) {
			System.out.println(field.getType()+"   "+field.getName());
			
		}
		System.out.println("++++++++++++++++++++++++++++==");
		Field[] fi1=cls.getFields();  //��������
		for (Field field : fi1) {
			System.out.println(field.getType()+"   "+field.getName());
			
		}
		
	}
//	��ô�������  ���Ե�ֵ
	public void show1(Object obj) throws Exception, IllegalAccessException{
//		���class����
		Class cls=obj.getClass();
//		������е�����
		Field [] f1=cls.getDeclaredFields();
		for (Field f : f1) {
			f.setAccessible(true);
			System.out.println(f.getName()+"  "+f.get(obj));
		}
		
		
	}

}
