package daili.com;
//��̬�������ʵ��
//������ͱ������๲ͬʵ��ͬһ���ӿڡ�װ����ģʽ�ʹ���ģʽ
public class DLImpl implements Count {
	
	private CountImpl ci;
	
	public DLImpl(CountImpl cmp){
		this.ci=cmp;
	}

	@Override
	public void say() {
	System.out.println("���Ǵ���--say--");
	ci.say();
	System.out.println("���Ǵ���++say++");

	}

	@Override
	public void run() {
		System.out.println("���Ǵ���--run--");
		ci.run();
		System.out.println("���Ǵ���++run++");

	}

}
