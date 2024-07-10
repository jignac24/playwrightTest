package com.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.browser.setup.setUp;
import com.microsoft.playwright.Page;
import com.webPage.HomePage;

public class HomePageTest {
	
	setUp testPage;
	Page page;
	HomePage homepage;
	
	@BeforeTest
	public void setup() {
		testPage = new setUp();
		page = testPage.initBrowser("chromium");
		homepage = new HomePage(page);
		
	}
	
	@Test
	public void testPageTitle() {
		String title = homepage.getTitle();
		Assert.assertEquals(title, "Your Store");
		
	}
	
	@Test
	public void testPageUrl() {
		String url = homepage.getUrl();
		Assert.assertEquals(url, "https://naveenautomationlabs.com/opencart/");
	}
	
	@Test
	public void testSearch() {
		String search = homepage.doSearch("Macbook");
		Assert.assertEquals(search, "Search - Macbook");
		
	}
	
	@AfterTest
	public void tearDown() {
		page.context().browser().close();
	}	

}
