package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	public void handle_DropDown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown=driver.findElement(By.id("dropdowm-menu-1"));
		Select select= new Select(dropdown);
		//select.selectByIndex(1);
		select.selectByValue("python");
		select.selectByVisibleText("SQL");
		System.out.println(dropdown.isDisplayed());
		System.out.println(dropdown.isEnabled());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingDropDown handling_DropDown= new HandlingDropDown();
handling_DropDown.intializebrowser();
handling_DropDown.handle_DropDown();
	}

}
