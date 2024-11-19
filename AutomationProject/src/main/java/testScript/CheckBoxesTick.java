package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxesTick extends Base {
	public void checkBoxesCheck() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> ticking=driver.findElements(By.xpath("//input[@class='btn btn-primary']"));
		for(WebElement find:ticking) {
			find.click();
			
		}
		
	}

	public static void main(String[] args) {
		CheckBoxesTick checking=new CheckBoxesTick();
		checking.initializeBrowser();
		checking.checkBoxesCheck();
	}

}
