package mate;
import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
public class createExcel {
	WritableWorkbook wwb = null;
	wwb.Workbook.createWorkbook(filename); //�½�Excel�ļ�
	WritableSheet ws =wwb.createSheet("ͨѶ¼",0);//Excel�н��±�
	ws.mergeCells(0, 0, 7, 1);
	Label header = new Label(0, 0, "ͨѶ¼");
	ws.addCell(header);
	
	//����ͷ
	Label cell = new Label(0, 2, "����");
	ws.addCell(cell);
	Label cell = new Label(1, 2, "�绰");
	ws.addCell(cell);
	Label cell = new Label(2, 2, "��ַ");
	ws.addCell(cell);
	Label cell = new Label(3, 2, "QQ");
	ws.addCell(cell);
	Label cell = new Label(4, 2, "wechat");
	ws.addCell(cell);
	Label cell = new Label(5, 2, "��������");
	ws.addCell(cell);
	
	//��������
	int res;//���ݿⷵ�ر���
	for (int i = 0; i < res.size(); i++) {
		String name = "          ";//��������
		Label cell = new Label(0, i+2, name);
		ws.addCell(cell);
		String phone = "         ";
		Label cell = new Label(1, i+2, phone);
		ws.addCell(cell);
		String address = "       ";
		Label cell = new Label(2, i+2, address);
		ws.addCell(cell);
		String qq = "            ";
		Label cell = new Label(3, i+2, qq);
		ws.addCell(cell);
		String wechat = "        ";
		Label cell = new Label(4, i+2, wechat);
		ws.addCell(cell);
		String inform = "        ";
		Label cell = new Label(5, i+2, inform);
		ws.addCell(cell);
		
	}
	
	wwb.write();
	wwb.close();
	System.out.println("д��ɹ���\n");
}
