package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void fileuploadusingsendkeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choosefile= driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		choosefile.sendKeys("C:\\Users\\user\\git\\automationmaven\\automationmaven\\src\\test\\resources\\Biotechnology and Biochemical Engineering (1).pdf");
		WebElement terms = driver.findElement(By.xpath("//input[@id='terms']"));
		terms.click();
		WebElement submitbutton = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitbutton.click();
		
	}
	public void fileuploadusingkeyboard() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement upload = driver.findElement(By.id("pickfiles"));
		upload.click();
		StringSelection selection =  new StringSelection("C:\\Users\\user\\git\\automationmaven\\automationmaven\\src\\test\\resources\\Biotechnology and Biochemical Engineering (1).pdf");
		//Assigning path to string selection class- copying
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);// Toolkit- abstract class-  copied path is places in system clipboard
		Robot robot= new Robot();
		//For handling the operating time and no error occur
		robot.delay(2500);
		robot.keyPress (KeyEvent.VK_ENTER);//enabling enter file name- keypress
		robot.keyRelease (KeyEvent.VK_ENTER);// keyrelease
		robot.keyPress (KeyEvent.VK_CONTROL);// ctrl
		robot.keyPress (KeyEvent.VK_V);// paste- keypress
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);// key release
		robot.keyPress (KeyEvent.VK_ENTER);// enter keypress
		robot.keyRelease(KeyEvent.VK_ENTER);// keyrelease
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload fileupload = new FileUpload();
		fileupload.intializebrowser();
		//fileupload.fileuploadusingsendkeys();
		try {
			fileupload.fileuploadusingkeyboard();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
