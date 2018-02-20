package com.training.samples;

import java.util.Arrays;

public class TheArrayProblem {

	public static void main(String[] args)
	{
		Product door = new Product("Wooden Door", 35);
		Product floorPanel = new Product("Floor Panel", 25);
		
		Product products[] = {door, floorPanel};
		
		System.out.println(Arrays.toString(products));
		System.out.println(products[1]);
		
		Product window = new Product("window", 15);
		//products[2] = window;
		products = addArray(window, products);
		products = addArray(window, products);
		
		System.out.println(Arrays.toString(products));
	}
	
	public static Product[] addArray(Product product, Product products[]) {
		int length = products.length;
		Product[] newproducts = Arrays.copyOf(products, length+1);
		newproducts[length] = product;
		return newproducts;
	}
}
