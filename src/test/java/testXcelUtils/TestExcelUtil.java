package testXcelUtils;

import utilities.ExcelUtils;

public class TestExcelUtil {

	public static void main(String[] args) {
		ExcelUtils xl = new ExcelUtils("./testExcelData/testExcelData.xlsx");
		int count = xl.getRowCount(0);
		System.out.println(count);
		
		for (int i = 0; i<count; i++)
		{
			String row = xl.getCellData(0, i, 0);
			String col = xl.getCellData(0, i, 1);
			String col1 = xl.getCellData(0, i, 2);
			System.out.println(row + " " + col + " "+ col1);
		}
	}

}
