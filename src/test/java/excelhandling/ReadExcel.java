package excelhandling;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		//where we are getting the data from - source
		//In java when we want to make use of any class we create an object. For getting the 
		//source of any class there is a File class
		//source from where you are fetching the data
		//thos is to read the file in java
		File file = new File("./src/test/resources/testdata/testdata.xlsx");
		//this is used to input the streaming from like video streaming
		//to read the data from the file
		FileInputStream fis = new FileInputStream(file);
		//this is type of file
		
		XSSFWorkbook excel  = new XSSFWorkbook(fis);
		String row = excel.getSheet("Users").getRow(0).getCell(0).toString();
		System.out.println(row);
		
		String col = excel.getSheet("Users").getRow(0).getCell(1).toString();
		System.out.println(col);
		
		String row0 = excel.getSheet("Users").getRow(0).getCell(2).toString();
		System.out.println(row0);

		String row1 = excel.getSheet("Users").getRow(1).getCell(0).toString();
		String col1 = excel.getSheet("Users").getRow(1).getCell(1).toString();
		String col2 = excel.getSheet("Users").getRow(1).getCell(2).toString();
		System.out.println(row1 + " " + col1 + " " + col2 );
		
		int count = excel.getSheetAt(0).getLastRowNum()+1;//this gives you the total no of active rows
		System.out.println("Total count" + count);
		
		for (int i =0; i <count; i++)
		{
			String row5 = excel.getSheet("Users").getRow(i).getCell(0).toString();
			String col5 = excel.getSheet("Users").getRow(i).getCell(1).toString();
			String col6 = excel.getSheet("Users").getRow(i).getCell(2).toString();
			System.out.println(row5 + " " + col5 + "" + col6);
		}
		excel.close();
		
		}
}
