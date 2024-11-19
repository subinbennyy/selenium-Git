package seleniumTest;

public class NavigationEx extends BaseEx {
	public void webNavigate() {
		driver.navigate().to("https://www.konami.com/efootball/en");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) {
		NavigationEx navigate=new NavigationEx();
		navigate.webOpen();
		navigate.webNavigate();
		navigate.webclose();
		
		
		

	}

}
