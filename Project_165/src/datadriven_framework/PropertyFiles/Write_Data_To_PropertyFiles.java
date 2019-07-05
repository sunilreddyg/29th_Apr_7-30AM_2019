package datadriven_framework.PropertyFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_Data_To_PropertyFiles
{

	public static void main(String[] args) throws IOException, IOException 
	{
		
		//Create object for Property files
		Properties repository=new Properties();
		
		repository.setProperty("Result1", "Tc001 Pass");
		repository.setProperty("Result2", "Tc002 Pass");
		repository.setProperty("Result3", "Tc003 Pass");
		repository.setProperty("Result4", "Tc004 Pass");
		repository.setProperty("Result5", "Tc005 Pass");
		
		String filepath="C:\\Users\\Administrator\\git\\29th_Apr_7-30AM_2019\\Project_165\\src\\datadriven_framework\\PropertyFiles\\";
		repository.store(new FileOutputStream(filepath+"Ouput.properties"), "Creating ouput for Tc001");
		

	}

}
