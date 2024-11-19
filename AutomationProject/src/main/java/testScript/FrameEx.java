package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx {
	public WebDriver driver;
	public void frameNavigation() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		/*driver.manage().window().maximize();
		WebElement framming=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(framming);
		WebElement nextFrame=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		nextFrame.click();*/
		
	}
	public void frameNavigate() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement youtube=driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
		driver.switchTo().frame(youtube);
		WebElement frames=driver.findElement(By.xpath("//div[@class='ytp-cued-thumbnail-overlay']"));
		frames.click();
		
	}

	public static void main(String[] args) {
		FrameEx frm=new FrameEx();
		//frm.frameNavigation();
		frm.frameNavigate();
				

	}

}
