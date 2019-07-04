package datadriven_framework.POI.keywords;

public class Run_Excel_Keywords 
{

	public static void main(String[] args)
	{
		
		ExcelKeywords.getExcel_connection("InputData.xlsx", "Sheet3");
		//Iterate for number of rows
		for (int i = 5; i < ExcelKeywords.sht.getLastRowNum(); i++) 
		{
			//Read Data frome sheet
			String UID=ExcelKeywords.getcelldata(i, 0);
			//Write CellData
			ExcelKeywords.write_celldata(i, 2, "TestPass");
		}
		//Create output file
		ExcelKeywords.Create_excel_output("MyOutput.xlsx");

	}

}
