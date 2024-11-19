package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseEx {
	public WebDriver driver;
	public void webOpen() {
		driver=new ChromeDriver();
		driver.get("https://www.battlegroundsmobileindia.com");
		driver.manage().window().maximize();
		}
	public void webclose() {
		driver.quit();
	}

	public static void main(String[] args) {
		BaseEx command=new BaseEx();
		command.webOpen();
		command.webclose();
		

	}

}
