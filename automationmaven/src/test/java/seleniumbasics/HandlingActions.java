package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	public void verify_mousehover() {
		WebElement home= driver.findElement(By.xpath("//a[text()='Home']"));
		Actions act =  new Actions(driver);
		act.moveToElement(home).build().perform(); //moveToElement()- hovering, .build()- preparing driver to perform an action, .perform()- execute
	}
	
	public void verifyRightClick()
	{
		WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		Actions act = new Actions(driver);
		act.contextClick(home).build().perform();
	}
	
	public void verifyDragAndDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
	}
	
	public void verifyKeyboardActions() throws AWTException
	{
		Robot robot = new Robot();
		//VK - Virtual key. keypress simulates key press activity.
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		//keyrelease to release the press of key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingActions action= new HandlingActions();
action.intializebrowser();
//action.verify_mousehover();
//action.verifyRightClick();
//action.verifyDragAndDrop();
try {
	action.verifyKeyboardActions();
} catch (AWTException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
