package statictest;

/***
 * Java��̬������ʼ����ѭ���¹���:

    1\��̬�����ᰴ��������˳������������������Ϊ�����͵�Ĭ��ֵ��������ֵΪ��ʼ����ֵ��
    2\������Ϻ�,�ٰ�������˳����������Ϊ��ʼ����ֵ�����û�г�ʼ����ֵ��������
 * 
 * 
 * */
public class Test
{
	 public static Test1 t = new Test1();
	 public static int a = 0;
	 public static int b;
	 
	 public static void main(String[] arg)
	 {
//		 �ֲ����������ʼ���ſ��� ʹ�á�
		
	  System.out.println(Test.a);
	  System.out.println(Test.b);
	 }
}
 
class Test1
{
 public Test1()
 {
  Test.a++;
  Test.b++;
 }
}