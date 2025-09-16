package application;

import java.util.HashMap;
import java.util.Map;


import entities.ProductHashMap;

public class ProgramHashMap {

	public static void main(String[] args) {

		Map<ProductHashMap, Double> stock = new HashMap<>();
		
		ProductHashMap p1 = new ProductHashMap("Tv", 900.0);
		ProductHashMap p2 = new ProductHashMap("Notebook", 1200.0);
		ProductHashMap p3 = new ProductHashMap("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		ProductHashMap ps = new ProductHashMap("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}

}
