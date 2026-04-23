package SeleniumEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		        //Fetch the File
				File file = new File("C:\\NetTech\\Selenium\\Notes\\ExcelReadFile.xlsx");
				
				//Read the Excel File
				FileInputStream fis = new FileInputStream(file);
				
				//Fetch the workbook
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				
				//Fetch the Sheet
				XSSFSheet sheet = wb.getSheet("demo");
				//XSSFSheet sheet = wb.getSheetAt(0);
		
				   int rowCount = sheet.getLastRowNum();
				   //System.out.println(rowCount);
			        int colCount = sheet.getRow(0).getLastCellNum();
			       // System.out.println(colCount);
			        
			        for (int i = 0; i <= rowCount; i++) {
			            XSSFRow row = sheet.getRow(i);

			            // Loop through columns
			            for (int j = 0; j < colCount; j++) {
			                XSSFCell cell = row.getCell(j);
			                System.out.print(cell + " | ");
			            }
			            System.out.println();
			        }
			        wb.close();
			        fis.close();
		

	}

}
