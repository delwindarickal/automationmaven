package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMltipleWindows extends Base {
	public void windowHandle()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstWindowHandleId = driver.getWindowHandle();
		System.out.println(firstWindowHandleId);
		
		WebElement clickMe = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickMe.click();
		Set<String>handleIDs = driver.getWindowHandles();
		System.out.println(handleIDs);
		Iterator<String>values=handleIDs.iterator();
		while(values.hasNext())
		{
			String current_id=values.next();
			if(!current_id.equals(firstWindowHandleId))
			{
				driver.switchTo().window(current_id);
				WebElement email_fld=driver.findElement(By.xpath("//input[@name='emailid']"));
				email_fld.sendKeys("abc@gmail.com");
				WebElement submit_fld=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit_fld.click();
				driver.switchTo().defaultContent();
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingMltipleWindows multi_window = new HandlingMltipleWindows();
		multi_window.intializebrowser();
		multi_window.windowHandle();
	}

}
