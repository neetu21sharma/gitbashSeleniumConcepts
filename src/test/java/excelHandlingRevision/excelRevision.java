package excelHandlingRevision;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelRevision {
	
	public static void main(String[] args) 
	{
	/*{
		File file = new File("/testdata/data");
		try
		{
		FileInputStream	 fs =new FileInputStream(file);
		XSSFWorkbook ws = new XSSFWorkbook(fs);
		String row = ws.getSheetAt(0).getRow(0).getCell(0).toString();
		String col = ws.getSheetAt(0).getRow(0).getCell(1).toString();
		String row1 = ws.getSheetAt(0).getRow(1)
		System.out.println(row+col);
		}
		catch(Exception e)
			{
			e.printStackTrace();
		}*/
		
		
		
			File file = new File("./testExcelData/testExcelData.xlsx");
			 try {
				FileInputStream fis = new FileInputStream(file);
				XSSFWorkbook workbook = new XSSFWorkbook(fis);//class coming from Apache poi to read the data from
				//String row = workbook.getSheetAt(0).getRow(0).getCell(0).toString();
				//System.out.println(row);
				//String col = workbook.getSheetAt(0).getRow(0).getCell(1).toString();
				//System.out.println(col);
				//Since the index starts fro one it will show total active rows as 4 and if you add 1 it shows total active rows as 5
			int count = workbook.getSheetAt(0).getLastRowNum()+ 1;
			System.out.println("Total no of Active rows : "+count);
				
					
					
					for (int i =0; i< count; i++)
					{
						String row1 = workbook.getSheetAt(0).getRow(i).getCell(0).toString();
						String col1 = workbook.getSheetAt(0).getRow(i).getCell(1).toString();
						System.out.println(row1+ " "+ col1);
					}
					workbook.close();
				 
			} catch (Exception e) {
				System.out.println("unable to read the excel sheet. Please check");
				e.printStackTrace();
			}
			 
			
			
			
		
		
		
	}
	
	

}
