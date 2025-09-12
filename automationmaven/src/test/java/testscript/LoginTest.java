package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumbasics.TestNGBase;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase {
@Test
public void verifyloginwithValidCredentials() throws IOException {
	String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");// 2nd row 1st coloumn- username
	String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");// 2nd row 2nd coloumn - password
	WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys(usernameValue);
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys(passwordValue);
	WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
	loginbutton.click();
}
@Test
public void verifyloginwithInvalidUsername() throws IOException {
	String usernameValue=ExcelUtility.getStringData(2, 0, "LoginPage");// 3rd row 1st coloumn- username
	String passwordValue=ExcelUtility.getStringData(2, 1, "LoginPage");// 3rd row 2nd coloumn - password
	WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys(usernameValue);
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys(passwordValue);
	WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
	loginbutton.click();
	
}

@Test
public void verifyloginwithInvalidPassword() throws IOException {
	String usernameValue=ExcelUtility.getStringData(3, 0, "LoginPage");// 4th row 1st coloumn- username
	String passwordValue=ExcelUtility.getStringData(3, 1, "LoginPage");// 4th row 2nd coloumn - password
	WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys(usernameValue);
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys(passwordValue);
	WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
	loginbutton.click();
	
}

@Test
public void verifyloginwithInvalidCredentials() throws IOException {
	String usernameValue=ExcelUtility.getStringData(4, 0, "LoginPage");// 5th row 1st coloumn- username
	String passwordValue=ExcelUtility.getStringData(4, 1, "LoginPage");// 5th row 2nd coloumn - password
	WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys(usernameValue);
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys(passwordValue);
	WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
	loginbutton.click();
	
}
}

