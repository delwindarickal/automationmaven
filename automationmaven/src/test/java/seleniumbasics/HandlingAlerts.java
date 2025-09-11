package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base {
	public void verifysimplealert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleclick= driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleclick.click();
		Alert simplealert= driver.switchTo().alert();// Switching to alert
		System.out.println(simplealert.getText());
		simplealert.accept();
	}
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
	WebElement confirmclick = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	confirmclick.click();
	Alert confirmalert = driver.switchTo().alert();
	System.out.println(confirmalert.getText());
	//confirmalert.accept();
	confirmalert.dismiss();
	}
	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptclick = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptclick.click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Hello");
		//promptalert.accept();
		promptalert.dismiss();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingAlerts handlingalerts= new HandlingAlerts();
		handlingalerts.intializebrowser();
		handlingalerts.verifysimplealert();
		//handlingalerts.verifyConfirmAlert();
		//handlingalerts.verifyPromptAlert();
		
	}

}
