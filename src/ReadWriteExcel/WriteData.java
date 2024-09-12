package ReadWriteExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/DataDriven.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row rw=sh.getRow(0);
		//------------------------------------------------
		
		Cell cell=rw.createCell(3);
		cell.setCellValue("Status");
		//-----------------------------------------------
		
		FileOutputStream fos=new FileOutputStream("./data/DataDriven.xlsx");
		wb.write(fos);
		

	}

}
