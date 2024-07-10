package com.webPage;

import com.microsoft.playwright.Page;

public class HomePage{
	
	Page page;
	private String search = "input[name='search']";
	private String searchIcon = "div#search button";
	private String searchPageHeader = "div#content h1";
	
	public HomePage(Page page)
	{
		this.page = page;
	}

	public String getTitle() {
		return page.title();
		
	}
	
	public String getUrl() {
		return page.url();
		
	}
	
	public String doSearch(String Pname) {
		page.fill(search, Pname);
		page.click(searchIcon);
		return page.textContent(searchPageHeader);
		
	}
}
