package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlerSlider extends BaseEx {
	public void simpleAlert() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement salert=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		salert.click();
		driver.switchTo().alert().accept();
			
	}
	public void confirmationAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement calert=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		calert.click();
		driver.switchTo().alert().dismiss();
	
		}
	public void promptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement palert=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		palert.click();
		driver.switchTo().alert().sendKeys("Hello Subin,WELCOME");
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		AlerSlider alt=new AlerSlider();
		alt.webOpen();
		alt.promptAlert();
		

	}

}
