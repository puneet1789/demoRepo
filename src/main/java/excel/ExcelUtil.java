package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	// Main driver method
    public static void main(String[] args)
    {
  
        // Try block to check for exceptions
        try {
  
            // Reading file from local directory
            FileInputStream file = new FileInputStream(new File("c:\\Users\\Hp\\OneDrive\\Desktop\\test.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
  
            // Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
  
            // Till there is an element condition holds true
            while (rowIterator.hasNext()) {
  
                Row row = rowIterator.next();
  
                // For each row, iterate through all the
                // columns
                Iterator<Cell> cellIterator
                    = row.cellIterator();
  
                while (cellIterator.hasNext()) {
  
                    Cell cell = cellIterator.next();
                    cell.getCellType();
                    
                    
                    switch (cell.getCellType()) {
  
//                    // Case 1
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
//  
//                    // Case 2
                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
					default:
						break;
                    }
                    System.out.println("");
                }
  
                System.out.println("");
            }
  
            // Closing file output streams
            file.close();
        }
  
        // Catch block to handle exceptions
        catch (Exception e) {
  
            // Display the exception along with line number
            // using printStackTrace() method
            e.printStackTrace();
        }
    }
}
