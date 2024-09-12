package ReadWriteExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/DataDriven.xlsx");//provide the path of the file
		Workbook wb = WorkbookFactory.create(fis);//make the file ready for read operation
		Sheet sh = wb.getSheet("Sheet1");//get into the sheet
		Row rw=sh.getRow(4);//get the desired row
		Cell cell=rw.getCell(0);//get the desired col/cell
		String data=cell.getStringCellValue();//read the data from that cell
		System.out.println(data);//print the data
		
	}
}
