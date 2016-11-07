package Class��;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class exlbook {
// ��񵼳�
	public void exlOut(List<Book> list) throws Exception{
		WritableWorkbook  book=null; //ecel����
//		���������
		book=Workbook.createWorkbook(new File("D:/jikexueyuan/book.xls"));
//		ͨ�������  ����ѡ�
		WritableSheet ws=book.createSheet("sheet1", 0);
//		������Ԫ�����
		for (int i=0;i<list.size();i++) {
			Book kk=list.get(i);
			Label l1=new Label(0,i,String.valueOf(kk.getId()));
			Label l2=new Label(1,i,kk.getName());
			Label l3=new Label(2,i,kk.getType());
			ws.addCell(l1);
			ws.addCell(l2);
			ws.addCell(l3);
		}
		
//		ѡ�����ӵ�Ԫ�����
//		ws.addCell(ll);
//		������ д�뵽���
		book.write();
//		���ر�
		book.close();
	}
	public static void main(String[] args) throws Exception {
		exlbook e1=new exlbook();
//		e1.exlOut();
//		List<Book> list=new ArrayList<Book>();
//		Book b1=new Book();
//		b1.setId(1);
//		b1.setName("chng");
//		b1.setType("good");
//		Book b2=new Book();
//		b2.setId(2);
//		b2.setName("cfsfshng");
//		b2.setType("gosfsfsod");
//		list.add(b1);
//		list.add(b2);
//		
//		e1.exlOut(list);
//		
//		���ĵ��뵽������
		ArrayList<Book> list=e1.ExlIn();
		for (Book book : list) {
			System.out.println(book.getId()+"  "+book.getName()+" "+book.getType());
		}
		
	}
//	�����
	public  ArrayList<Book> ExlIn() throws Exception, Exception{
//		��������
		ArrayList<Book> list=new ArrayList<Book>();
//		ָ���ļ�
		File file=new File("D:/jikexueyuan/book.xls");
//		��ñ�����
		Workbook book=Workbook.getWorkbook(file);
//		���ѡ�
		Sheet sheet=book.getSheet(0);
		for (int i = 0; i < sheet.getRows(); i++) {
//			�������ض���
			Book b1=new Book();
//			���cell����
//			Cell c1=sheet.getCell(0,i);
//			�������  ��װ��  book������
			b1.setId(Integer.valueOf(sheet.getCell(0, i).getContents()));
			b1.setName(sheet.getCell(1, i).getContents());
			b1.setType(sheet.getCell(2, i).getContents());		
			list.add(b1);	
		}		
		book.close();				
		return list;
	
	}

}
