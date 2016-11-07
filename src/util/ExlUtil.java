package util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import Class��.Book;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExlUtil {
	// ����
	public static void exlOut(ArrayList list, String str) {
//		�������
		WritableWorkbook book = null;

		try {
			book = Workbook.createWorkbook(new File(str));
			// ���ѡ�
			WritableSheet sheet = book.createSheet("sheet", 0);
			// �������� ���ж�Ӧ�������Ԫ��
			for (int i = 0; i < list.size(); i++) {
//				�����������
				Object obj = list.get(i);
				Class cls = obj.getClass();
				// ��ö����Ӧ������
				Field[] field = cls.getDeclaredFields();
//				���ݶ�������ԶԵ�Ԫ��������ݵ����
				for (int j = 0; j < field.length; j++) {
					field[j].setAccessible(true);
					// ������Ԫ��
					Label ll = new Label(j, i, String.valueOf(field[j].get(obj)));
					// ��ӵ�sheet����
					sheet.addCell(ll);
				}

			}
//         д�뵽�����
			book.write();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
//				�رձ�
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
		b1.setName("�й�");
		b1.setType("����");
		Book b2 = new Book();
		b2.setId(2);
		b2.setName("�ձ�");
		b2.setType("�¹�");
		list.add(b1);
		list.add(b2);
		// ExlUtil.exlOut(list, "D:/jikexueyuan/book1.xls");

		ArrayList<Book> ll = ExlUtil.ExlIn(Book.class, "D:/jikexueyuan/book1.xls");
		for (Book bb : ll) {
			System.out.println(bb.getId() + "  " + bb.getName() + "  " + bb.getType());
		}

	}

	// ����ĵ���

	public static ArrayList ExlIn(Class cls, String str) throws Exception, IllegalAccessException {
//		���� ������� �������
		ArrayList list = new ArrayList();
		// ��ñ��
		Workbook book = null;
		try {
			// ��ñ��
			book = Workbook.getWorkbook(new File(str));
			// ���sheet
			Sheet sheet = book.getSheet(0);
			// ����� ��
			Field[] field = cls.getDeclaredFields();
			// ������
			for (int i = 0; i < sheet.getRows(); i++) {
				// ��ö��� �������Ǿ���������ʵ�ʶ���
				Object obj = cls.newInstance();
				for (int j = 0; j < field.length; j++) {
//					��ʹ��java���
					field[j].setAccessible(true);
//					��õ�Ԫ����������
					String con = sheet.getCell(j, i).getContents();
					
					// �ж���������  �������͸�ֵ
					if (field[j].getType().toString().equals("class java.lang.String")) {
//						�������Եĸ�ֵ
						field[j].set(obj, con);

					} else if (field[j].getType().toString().equals("int")) {
						field[j].set(obj, Integer.valueOf(con));
					}

				}
//				����װ�õĶ�����ӵ�list������
				list.add(obj);
			}

		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//           �ر��ļ���
			book.close();
		}
//		��������
		return list;

	}

}
