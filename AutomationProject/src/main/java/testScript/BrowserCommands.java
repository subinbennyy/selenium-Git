package testScript;

public class BrowserCommands extends Base {
	
	public void browserCommands() {
		String title=driver.getTitle();  //to get title
		System.out.println(title);
		String url=driver.getCurrentUrl();    //to get current page u r l
		System.out.println(url);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}

	public static void main(String[] args) {
		
		BrowserCommands bcommands=new BrowserCommands();
		bcommands.initializeBrowser(); 
		bcommands.browserCommands(); 
		//bcommands.quitClose();  //to close

	}

}
