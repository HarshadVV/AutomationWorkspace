package ReadWriteExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class WriteMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/WriteMultiData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row rw=sh.createRow(0);
		rw.createCell(0).setCellValue("Name");
		rw.createCell(1).setCellValue("Mobile no");
		rw.createCell(2).setCellValue("City");
		
		Row rw1=sh.createRow(1);
		rw1.createCell(0).setCellValue("Manish");
		rw1.createCell(1).setCellValue("9876543210");
		rw1.createCell(2).setCellValue("Pune");
		
		FileOutputStream fos=new FileOutputStream("./data/WriteMultiData.xlsx");
		wb.write(fos);
		
		
		
		

	}

}
