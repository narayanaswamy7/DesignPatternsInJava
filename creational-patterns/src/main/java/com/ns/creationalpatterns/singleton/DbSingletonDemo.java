package com.ns.creationalpatterns.singleton;

public class DbSingletonDemo {

	public static void main(String[] args) {

		DbSingleton instance = DbSingleton.getInstance();

		System.out.println(instance);

		DbSingleton anotherInstance = DbSingleton.getInstance();

		System.out.println(anotherInstance);

		// Lazy Loading below
		System.out.println("\nLazyLoading Below");
		DbSingletonLazyLoading instanceLazyL = DbSingletonLazyLoading.getInstance();

		System.out.println(instanceLazyL);

		DbSingletonLazyLoading anotherInstanceLazyL = DbSingletonLazyLoading.getInstance();

		System.out.println(anotherInstanceLazyL);

		// threadSafe below
		System.out.println("\nthreadSafe below");
		DbSingletonThreadSafe instanceThreadSafe = DbSingletonThreadSafe.getInstance();

		System.out.println(instanceThreadSafe);

		DbSingletonThreadSafe anotherInstanceThreadSafe = DbSingletonThreadSafe.getInstance();

		System.out.println(anotherInstanceThreadSafe);

	}
}
