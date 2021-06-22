package com.ns.creationalpatterns.singleton;

public class DbSingletonLazyLoading {
	
	// make this null and create the instance in the getInstance()
	private static DbSingletonLazyLoading instance = null;
	
	private DbSingletonLazyLoading() {}
	
	public static DbSingletonLazyLoading getInstance() {
		if(instance==null) {			
			instance = new DbSingletonLazyLoading();
		}
		return instance;
	}
}
