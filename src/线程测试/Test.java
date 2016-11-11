package Ïß³Ì²âÊÔ;

public class Test {

	public static void main(String[] args) {
		Tread1 t0=new Tread1();
		Thread tt=new Thread(t0);
		Thread ttt=new Thread(t0);
		Thread tttt=new Thread(t0);
		Thread ttttt=new Thread(t0);
		tt.start();		
		ttt.start();	
		tttt.start();
		ttttt.start();

	}

}
