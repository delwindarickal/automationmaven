package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables extends Base {
	public void verifyhandling_Table() {
	driver.navigate().to("https://money.rediff.com/indices/nse");
	WebElement table= driver.findElement(By.xpath("//table[@id='dataTable']"));
	System.out.println(table.getText());
	System.out.println("\n\n");
	WebElement row= driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[4]"));
	System.out.println(row.getText());
	WebElement coloumn= driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[4]/td[2]"));
	System.out.println(coloumn.getText());
	WebElement lastrow= driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[last()]"));
	System.out.println(lastrow.getText());
	WebElement lastcolumn= driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[4]/td[last()]"));
	System.out.println(lastcolumn.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingTables handlingtables=new HandlingTables();
handlingtables.intializebrowser();
handlingtables.verifyhandling_Table();
	}

}
