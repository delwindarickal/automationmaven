package seleniumbasics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	public void verifyFrames() {
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalframes= driver.findElements(By.tagName("iframe"));
		System.out.println(totalframes.size());
		//driver.switchTo().frame(1);// control will switch to the second frame at that time
		//driver.switchTo().frame("frame1");
		//driver.switchTo().parentFrame();
		WebElement frameelement= driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frameelement);
		WebElement heading= driver.findElement(By.xpath("//h1[text()='This is a sample page' and @id='sampleHeading']"));
		System.out.println(heading.getText());
		driver.switchTo().defaultContent();//releasing
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingFrames handlingframes= new HandlingFrames();
handlingframes.intializebrowser();
handlingframes.verifyFrames();	}

}
