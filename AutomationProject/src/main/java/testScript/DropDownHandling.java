package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling extends Base {
	public void dropDown() {
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropDown2=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select slt=new Select(dropDown2);
		//slt.selectByVisibleText("Red");
		//slt.selectByIndex(2);
		slt.selectByValue("Green");
		
	}

	public static void main(String[] args) {
		DropDownHandling drop=new DropDownHandling();
		drop.initializeBrowser();
		drop.dropDown();
		

	}

}
