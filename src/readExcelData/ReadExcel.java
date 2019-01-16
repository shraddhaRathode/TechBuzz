package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel
{

	public static void main(String[] args) throws IOException 
	{
        File f=new File("C:\\Users\\VSR\\Desktop\\testdata.xlsx");
        
        FileInputStream fi=new FileInputStream(f);
        System.out.println(fi);
       // @SuppressWarnings("resource")
		//XSSFWorkbook w=new XSSFWorkbook(fi);
        Workbook workbook = null;
        
        workbook = new XSSFWorkbook(fi);
        System.out.println(workbook);
        //Sheet sheet = workbook.getSheetAt(0);
        //System.out.println(sheet);
        //String data0=sheet.getRow(0).getCell(0).getStringCellValue();
        //System.out.println("data from excel"+data0);
        
        
	}

}
