package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends Base {
	public void findElements() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> findEleMessage=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement listFind:findEleMessage) {
			listFind.sendKeys("Hey");
		}
		
	}

	public static void main(String[] args) {
		FindElements findE=new FindElements();
		findE.initializeBrowser();
		findE.findElements();

	}

}
