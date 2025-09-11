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
	public void handle_Checkbox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox1= driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox1.click();
		System.out.println(checkbox1.isSelected());
		System.out.println(checkbox1.isEnabled());
		System.out.println(checkbox1.isDisplayed());
	}
	public void handle_Radiobutton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton1= driver.findElement(By.xpath("//input[@value='blue']"));
		radiobutton1.click();
		System.out.println(radiobutton1.isSelected());
		System.out.println(radiobutton1.isEnabled());
		System.out.println(radiobutton1.isDisplayed());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingDropDown handling_DropDown= new HandlingDropDown();
handling_DropDown.intializebrowser();
//handling_DropDown.handle_DropDown();
//handling_DropDown.handle_Checkbox();
handling_DropDown.handle_Radiobutton();
	}

}
