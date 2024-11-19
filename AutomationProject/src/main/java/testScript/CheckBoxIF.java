package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxIF extends Base {
	public void checkBox() {
		WebElement check=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));  //to input form
		check.click();
		WebElement clickEx=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));  //to check box link
		clickEx.click();
		WebElement checkboxEx=driver.findElement(By.id("gridCheck"));  //to tick
		checkboxEx.click();
		
	}

	public static void main(String[] args) {
		CheckBoxIF box=new CheckBoxIF();
		box.initializeBrowser();
		box.checkBox();

	}

}
