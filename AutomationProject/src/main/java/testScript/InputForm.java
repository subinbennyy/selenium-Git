package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class InputForm extends Base {
	public void showMessage() {
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Hello");
		WebElement button=driver.findElement(By.id("button-one"));
		button.click();
	
		
		
		WebElement value=driver.findElement(By.id("value-a"));
		value.sendKeys("10");
		WebElement valueB=driver.findElement(By.id("value-b"));
		valueB.sendKeys("20");
		WebElement buttonT=driver.findElement(By.id("button-two"));
		buttonT.click();	
		
	}


	public static void main(String[] args) {
		InputForm button=new InputForm();
		button.initializeBrowser();
		button.showMessage();
		

	}

}
