package ReadWriteExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDyanamicDataUsingScannerClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/WriteMultiData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.createSheet("DyanmicSheet3");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int totalRows=sc.nextInt();
		
		System.out.println("Enter number of Cell");
		int totalCells=sc.nextInt();
		
		System.out.println("Please Start Entering Data");
		
		for (int r = 0; r <=totalRows; r++) {
			Row rw=sh.createRow(r);
			
			for (int c = 0; c <=totalCells; c++) {
				Cell cell=rw.createCell(c);
				cell.setCellValue(sc.next());
				
			}
			FileOutputStream fos=new FileOutputStream("./data/WriteMultiData.xlsx");
			wb.write(fos);
		
		}
		System.out.println("Stop Entering Data");
	}

}
