package project2_purchase_discount;

import java.util.*;

public class Main{

	public static void main(String[] args) {
		
		int client;
		double discountEmploeey = 0.9;
		double discountVip = 0.95;
		double discountOrdinary = 1.0;
		double discount;
		double purchaseAmount = 0;
		double total = 0;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("""
			A bookstore gives a 10% discount to employees and a 5% discount to VIP customer.
			Calculate the amount to be paid by someone.  
			The program should read the total amount to be paid and a code identifying if the
			client is an employee, a VIP, or an ordinary person.
			""");

		System.out.println("Enter the purchase amount: ");
		purchaseAmount = scanner.nextInt();

		System.out.println("Choose a customer code: ");
		client = scanner.nextInt();


		switch (client){
			case 1:
				discount = discountEmploeey;
				total = purchaseAmount * discountEmploeey;
				System.out.println(total);
				break;
			case 2:
				discount = discountVip;
				total = purchaseAmount * discountVip;
				System.out.println(total);
				break;
			case 3:
				discount = discountOrdinary;
				total = purchaseAmount;
				System.out.println(total);
				break;
			default:
				System.out.println("Invalid custumer.");	
		}

	}

}