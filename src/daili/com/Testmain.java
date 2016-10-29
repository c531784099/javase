package daili.com;
//²âÊÔ¾²Ì¬´úÀíÀà
public class Testmain {

	public static void main(String[] args) {
		CountImpl cout=new CountImpl();
		
		DLImpl dli=new DLImpl(cout);
		
		dli.say();
		dli.run();

	}

}
