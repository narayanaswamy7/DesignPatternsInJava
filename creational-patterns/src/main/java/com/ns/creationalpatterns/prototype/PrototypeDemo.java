package com.ns.creationalpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

	public static void main(String[] args) {
		
		String sql = "select * from movies where title = ?";
		
		List<String> parameters = new ArrayList<>();
		parameters.add("Star Wars");
		
		Record record = new Record();
		
		Prototype firstPrototype = new Prototype(sql, parameters, record);
		
		System.out.println("firstPrototype: "+firstPrototype+"\n\n");
		
		Prototype secondPrototype = firstPrototype.clone();
		
		System.out.println("secondPrototype: "+secondPrototype);		
		
	}
	
}
