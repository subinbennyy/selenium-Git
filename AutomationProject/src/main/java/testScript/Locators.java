package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void idLocator() {
		WebElement Message=driver.findElement(By.id("single-input-field"));//WebElement ElementName=driver.findElement(//this is a method)(By.Locatorname));
		WebElement DateRange=driver.findElement(By.id("message-two"));	
		WebElement StartDownload=driver.findElement(By.id("downloadButton"));
		WebElement DroppedItemsListItems=driver.findElement(By.id("mydropzone"));
		WebElement GetNewUser=driver.findElement(By.id("save"));
		WebElement GetTotal=driver.findElement(By.id("button-two"));
		
	}
	public void classLocator() {
		WebElement Section=driver.findElement(By.className("clearfix"));	
		WebElement Submit=driver.findElement(By.className("btn btn-success btn-block"));
		WebElement Card=driver.findElement(By.className("card-body"));
	}
	public void nameLocator() {
		WebElement Name=driver.findElement(By.name("viewport"));
		WebElement NameDes=driver.findElement(By.name("description"));
	    WebElement Namekey=driver.findElement(By.name("keywords"));
	    WebElement NameAuthor=driver.findElement(By.name("author"));
	}
	public void linktextLocator() {
		WebElement LinkValue=driver.findElement(By.linkText("simple-form-demo.php"));
		WebElement Icon=driver.findElement(By.linkText("check-box-demo.php"));
		WebElement Ajax=driver.findElement(By.linkText("ajax-form-submit.php"));		
	}public void partialLinkText() {
		WebElement CheckBoxDemo=driver.findElement(By.partialLinkText("check-box"));
		WebElement Ajaxx=driver.findElement(By.partialLinkText("ajax-form"));
		WebElement Form=driver.findElement(By.partialLinkText("simple-form"));
	}
	public void cssSelectorTagandid() {
		WebElement Message=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement Collapse=driver.findElement(By.cssSelector("div#collapsibleNavbar"));
		WebElement NavLink=driver.findElement(By.cssSelector("a#progress-bars"));
		WebElement NavigatorLink=driver.findElement(By.cssSelector("a#alert-modal"));
		
	}
	public void tagandAttribute() {
		WebElement TandA=driver.findElement(By.cssSelector("input[id=value-a]"));
		WebElement TaANav=driver.findElement(By.cssSelector("a[id=progress-bars]"));
		WebElement NavbarCollapse=driver.findElement(By.cssSelector("div[id=collapsibleNavbar]"));
		WebElement Others=driver.findElement(By.cssSelector("a[id=others]"));
	}
	public void tagAndClass() {
		WebElement TandC=driver.findElement(By.cssSelector("ul.navbar-nav"));
		WebElement TopLogo=driver.findElement(By.cssSelector("div.top-logo"));
		WebElement Bootstrap=driver.findElement(By.cssSelector("div.mb-sec"));
		WebElement NavBrand=driver.findElement(By.cssSelector("a.navbar-brand"));
	}
	public void tagClassAttribute() {
		WebElement Tca=driver.findElement(By.cssSelector("div.my-2[id=message-one]"));
		WebElement Collapsible=driver.findElement(By.cssSelector("div.collapse navbar-collapse[id=collapsibleNavbar]"));
		WebElement Collapsibleid=driver.findElement(By.cssSelector("a.nav-link[id=alert-modal]"));

		
	}
	
	public void xpathLoctaor() {
		WebElement xpathLoc=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));  //absolute x path
		WebElement Alert=driver.findElement(By.xpath("//div[@class='alert alert-warning alert-autoclosable-warning']")); //tag name[@attribute="attribute value"] 
		WebElement DateRange=driver.findElement(By.xpath("//input[@name='daterange']"));
		
		WebElement Button=driver.findElement(By.xpath("//button[contains(@id,'autoclosable-btn-danger')]"));
		WebElement DatePicker=driver.findElement(By.xpath("//div[contains(@id,'message-two')]"));
		
		WebElement Table=driver.findElement(By.xpath("//td[text()='Tiger Nixon']"));
		WebElement BootStrapAlert=driver.findElement(By.xpath("//a[text()='Bootstrap Modal']"));
		WebElement FormGroup=driver.findElement(By.xpath("//input[@class='form-control']//parent::div"));//Axes method(relative syntax+parent name)
		WebElement Logo=driver.findElement(By.xpath("//a[@href='index.php']//child::img[@alt='logo']"));
				}
	
	// /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
