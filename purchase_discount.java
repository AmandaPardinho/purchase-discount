package project2_purchase_discount;

import java.util.*;
import javax.swing.*;

public class Main{

	public static void main(String[] args) {
		
		int client;
		int total = purchaseAmount * discount;
		int discount;
		int purchaseAmount;

		String clientString ="";

		System.out.println("""
			A bookstore gives a 10% discount to employees and a 5% discount to VIP cutomer.
			Calculate the amount to be paid by someone.  
			The program should read the total amount to be paid and a code identifying 
			if the client is an employee, a VIP, or an ordinary person.
			""");

		switch (client){
			case 1:
				clientString = "employee";
				discount = 10%;
				total = purchaseAmount * 0.9;
				System.out.println(total);
			case 2:
				clientString = "vip";
				discount = 5%;
				total = purchaseAmount * 0.95;
				System.out.println(total);
				break;
			case 3:
				clientString = "ordinary customer";
				discount = 0;
				total = purchaseAmount;
				System.out.println(total);
				break;
			default:
				System.out.println("Invalid custumer.");	
		}

	}

}