package robotactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class CopyString_Selection 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		
				
		String text="create robust, browser-based regression automation suites and tests";
		
		//Select String
		StringSelection Stext=new StringSelection(text);
		//Get default system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//set content to clipboard at runtime.
		clipboard.setContents(Stext, Stext);
		
		

		//Launch Notepad file at runtime..
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Crate object for Robot class
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Press Ctrl+V to paste copied text into notepad file
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Use Ctrl+S to save file  [Already ctrl down at previous line]
		robot.keyPress(KeyEvent.VK_S);
		
		
		String path="C:\\Users\\Administrator\\git\\29th_Apr_7-30AM_2019\\Project_165\\src\\robotactions\\OP.txt";
		//Path Selecton
		StringSelection spath=new StringSelection(path);
		//Set content to clipboard
		clipboard.setContents(spath, spath);
		
		
		//Press Cntrl+V to copy path to filename locaton
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		
		//Press enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//Release Control key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		

	}

}
