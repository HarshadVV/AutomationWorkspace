package ReadWriteExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.excelant.util.ExcelAntWorkbookUtilFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleRowColumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/DataDriven.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int totalRows=sh.getLastRowNum();
		int totalCells=sh.getRow(1).getLastCellNum();
		System.out.println("Total Rows= "+totalRows);//row counted from 0
		System.out.println("Total Cells= "+totalCells);//cell counted from 1
		
		for(int r=0;r<=totalRows;r++) {
			 Row currentRow=sh.getRow(r);
			 System.out.println();
			
			for(int c=0;c<totalCells;c++) {
				Cell currentCell=currentRow.getCell(c);
				 System.out.print(currentCell.toString()+"\t");//\t use for tabspace 
			}
			System.out.println();
			
		}
		
		wb.close();//to clear the memory occupied by workbook
		fis.close();
	}

}
