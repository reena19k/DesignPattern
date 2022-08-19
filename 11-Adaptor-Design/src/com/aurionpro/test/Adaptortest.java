package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Biscuit;
import com.aurionpro.model.Hat;
import com.aurionpro.model.HatAdaptor;
import com.aurionpro.model.IItem;
import com.aurionpro.model.Pepsi;
import com.aurionpro.model.ShoppingCart;

public class Adaptortest {

	public static void main(String[] args) {
		Hat hat = new Hat("redhat", "roundredhat", 300, 0.01);
		HatAdaptor hatadaptor = new HatAdaptor(hat);
		Biscuit busciut = new Biscuit("parleg", 10);
		Pepsi pepsi = new Pepsi("coca cola", 20);
		
		ShoppingCart cart = new ShoppingCart();
		cart.addItemToCart(busciut);
		cart.addItemToCart(pepsi);
		cart.addItemToCart(hatadaptor);
		System.out.println(cart.getTotalCartPrice());
		System.out.println("_____________");
		printdetails(cart);
	}

	private static void printdetails(ShoppingCart cart) {
		List<IItem> cartlist = cart.getItems();
		for(IItem item:cartlist) {
			System.out.println("items" +item.getName());
			System.out.println("price " +item.getPrice());
			System.out.println("______________-");
		}
	}

}
