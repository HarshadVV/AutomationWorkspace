package ReadWriteExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelMutipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		for(int i=0;i<11;i++) {
			FileInputStream fis=new FileInputStream("./data/DataDriven.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("Sheet1");
			Row rw=sh.getRow(i);
			Cell cell=rw.getCell(1);
			String data=cell.getStringCellValue();
			System.out.println(data);
		}

	}

}
