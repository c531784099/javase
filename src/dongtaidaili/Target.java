package dongtaidaili;

public class Target implements HellonWord ,HelloWord2{

	@Override
	public void sayHellon() {
		System.out.println("�����������ķ羰��������");

	}

	@Override
	public void sayHellon(String name) {
		
		System.out.println("hellon"+"<><>"+name);
		
	}

	@Override
	public void run() {
	System.out.println("����run=====");
		
	}

}
