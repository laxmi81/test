package testapp2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test1 {
	public static void main(String[] args) throws Exception {
		File fl1=new File("C:\\AC.Microui\\sales.xlsx");
	    FileInputStream fil=new FileInputStream(fl1);
	    XSSFWorkbook wb=new XSSFWorkbook(fil);
	    XSSFSheet sheet1= wb.getSheetAt(0);
	    String text1=sheet1.getRow(0).getCell(1).getStringCellValue();
	    System.out.println(text1);
	}
	

}
