package Class包;

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
// 表格导出
	public void exlOut(List<Book> list) throws Exception{
		WritableWorkbook  book=null; //ecel对象
//		创建表对象
		book=Workbook.createWorkbook(new File("D:/jikexueyuan/book.xls"));
//		通过表对象  创建选项卡
		WritableSheet ws=book.createSheet("sheet1", 0);
//		创建单元格对象
		for (int i=0;i<list.size();i++) {
			Book kk=list.get(i);
			Label l1=new Label(0,i,String.valueOf(kk.getId()));
			Label l2=new Label(1,i,kk.getName());
			Label l3=new Label(2,i,kk.getType());
			ws.addCell(l1);
			ws.addCell(l2);
			ws.addCell(l3);
		}
		
//		选项卡中添加单元格对象
//		ws.addCell(ll);
//		表格对象 写入到表格
		book.write();
//		表格关闭
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
//		表格的导入到集合中
		ArrayList<Book> list=e1.ExlIn();
		for (Book book : list) {
			System.out.println(book.getId()+"  "+book.getName()+" "+book.getType());
		}
		
	}
//	表格导入
	public  ArrayList<Book> ExlIn() throws Exception, Exception{
//		创建数组
		ArrayList<Book> list=new ArrayList<Book>();
//		指定文件
		File file=new File("D:/jikexueyuan/book.xls");
//		获得表格对象
		Workbook book=Workbook.getWorkbook(file);
//		获得选项卡
		Sheet sheet=book.getSheet(0);
		for (int i = 0; i < sheet.getRows(); i++) {
//			创建承载对象
			Book b1=new Book();
//			获得cell对象
//			Cell c1=sheet.getCell(0,i);
//			获得数据  封装到  book对象中
			b1.setId(Integer.valueOf(sheet.getCell(0, i).getContents()));
			b1.setName(sheet.getCell(1, i).getContents());
			b1.setType(sheet.getCell(2, i).getContents());		
			list.add(b1);	
		}		
		book.close();				
		return list;
	
	}

}
