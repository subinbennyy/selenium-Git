package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	public void simpleAlert() { //simple alert
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMe=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		clickMe.click();
		driver.switchTo().alert().accept();
		
		
		
	}
	public void confirmationAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMe=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		clickMe.click();
		driver.switchTo().alert().dismiss();
		
	}
	public void promptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMe=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		clickMe.click();
		driver.switchTo().alert().sendKeys("Subin");
		driver.switchTo().alert().accept();
		
	}

	public static void main(String[] args) {
		AlertHandling alt=new AlertHandling();
		alt.initializeBrowser();
		//alt.simpleAlert();
		//alt.confirmationAlert();
		alt.promptAlert();

	}

}
