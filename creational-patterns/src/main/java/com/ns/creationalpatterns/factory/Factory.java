package com.ns.creationalpatterns.factory;

import java.util.Calendar;

public class Factory {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		
		System.out.println("------------------------------------------------------------------------");
		// WebsiteFactory
		
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		
		System.out.println("blog: "+site.getPages());
		
		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		
		System.out.println("shop: "+site.getPages());
		
	}
}
