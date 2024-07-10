package com.browser.setup;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class setUp 
{
	Playwright playwright;
	Page page;
	Browser browser;
	BrowserContext browsercontext;
	
	public Page initBrowser(String browserName) {
		System.out.println("Selected browser is: " + browserName);
		playwright = Playwright.create();
		
		switch(browserName.toLowerCase()) {
		case "chromium":
			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "firefox":
			browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "chrome":
			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "webKit":
			browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
			
		default:
			System.out.println("Please enter browser name...");
			break;
		}
		
		browsercontext = browser.newContext();
		page = browsercontext.newPage();
		page.navigate("https://naveenautomationlabs.com/opencart/");
		
		return page;
		
		
	}
}
