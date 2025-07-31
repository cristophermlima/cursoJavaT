package application;

import java.util.Scanner;

import entities.Product;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);

		System.err.println();
		System.out.println("Product data: " + product  );
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		 quantity = sc.nextInt();
		product.addproducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
		
		
	}
	

}
