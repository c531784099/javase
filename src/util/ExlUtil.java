package util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import Class包.Book;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExlUtil {
	// 导出
	public static void exlOut(ArrayList list, String str) {
//		创建表格
		WritableWorkbook book = null;

		try {
			book = Workbook.createWorkbook(new File(str));
			// 获得选项卡
			WritableSheet sheet = book.createSheet("sheet", 0);
			// 遍历集合 多行对应多个数组元素
			for (int i = 0; i < list.size(); i++) {
//				获得容器对象
				Object obj = list.get(i);
				Class cls = obj.getClass();
				// 获得对象对应的属性
				Field[] field = cls.getDeclaredFields();
//				根据对象的属性对单元格进行数据的填充
				for (int j = 0; j < field.length; j++) {
					field[j].setAccessible(true);
					// 创建单元格
					Label ll = new Label(j, i, String.valueOf(field[j].get(obj)));
					// 添加到sheet、中
					sheet.addCell(ll);
				}

			}
//         写入到表格中
			book.write();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
//				关闭表
				book.close();
			} catch (WriteException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws Exception, Exception {
		ArrayList list = new ArrayList();
		Book b1 = new Book();
		b1.setId(1);
		b1.setName("中国");
		b1.setType("美国");
		Book b2 = new Book();
		b2.setId(2);
		b2.setName("日本");
		b2.setType("德国");
		list.add(b1);
		list.add(b2);
		// ExlUtil.exlOut(list, "D:/jikexueyuan/book1.xls");

		ArrayList<Book> ll = ExlUtil.ExlIn(Book.class, "D:/jikexueyuan/book1.xls");
		for (Book bb : ll) {
			System.out.println(bb.getId() + "  " + bb.getName() + "  " + bb.getType());
		}

	}

	// 输入的导入

	public static ArrayList ExlIn(Class cls, String str) throws Exception, IllegalAccessException {
//		创建 数组对象 存放数据
		ArrayList list = new ArrayList();
		// 获得表格
		Workbook book = null;
		try {
			// 获得表格
			book = Workbook.getWorkbook(new File(str));
			// 获得sheet
			Sheet sheet = book.getSheet(0);
			// 获得类 域
			Field[] field = cls.getDeclaredFields();
			// 多少行
			for (int i = 0; i < sheet.getRows(); i++) {
				// 获得对象 创建的是具体的子类的实际对象
				Object obj = cls.newInstance();
				for (int j = 0; j < field.length; j++) {
//					不使用java检查
					field[j].setAccessible(true);
//					获得单元格对象的内容
					String con = sheet.getCell(j, i).getContents();
					
					// 判断属性类型  根据类型赋值
					if (field[j].getType().toString().equals("class java.lang.String")) {
//						设置属性的赋值
						field[j].set(obj, con);

					} else if (field[j].getType().toString().equals("int")) {
						field[j].set(obj, Integer.valueOf(con));
					}

				}
//				将封装好的对象添加到list集合中
				list.add(obj);
			}

		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//           关闭文件流
			book.close();
		}
//		返回数据
		return list;

	}

}
