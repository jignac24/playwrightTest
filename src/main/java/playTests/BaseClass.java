package playTests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
	    Playwright playwright = Playwright.create();
	    Browser browser = playwright.chromium().launch();
	    // Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	    Page page = browser.newPage();
	    page.navigate("https://opensource-demo.orangehrmlive.com/");
	    
	    String title = page.title();
	    System.out.println("page title is: " + title);
	    System.out.println("page URL is: " + page.url());
	    
	    browser.close();
	    playwright.close();  

	}

}
