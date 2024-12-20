package practice.second;
import java.util.*;


public class OrderFood {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			// Get the address
			System.out.println("Enter address:");
			String address = sc.nextLine();

			System.out.println("Confirm the address:");
			String confirmAddress = sc.nextLine();

			if (!address.equalsIgnoreCase(confirmAddress)) {
				System.out.println("The order is cancelled because of address mismatch.");
				return;
			}

			// Get the order
			System.out.println("Order: 1.Pizza 2.Burger 3.Sandwich 4.Fries");
			int order = sc.nextInt();
			int price = 0;
			String item = "";

			switch (order) {
			case 1:
				item = "Pizza";
				price = 150;
				break;
			case 2:
				item = "Burger";
				price = 80;
				break;
			case 3:
				item = "Sandwich";
				price = 60;
				break;
			case 4:
				item = "Fries";
				price = 50;
				break;
			default:
				System.out.println("Invalid order selection!");
				return;
			}

			System.out.println(item);
			System.out.println("Select qty:");
			int qty = sc.nextInt();
			int total = qty * price;
			System.out.println("Total bill is: " + total);

			// Payment process
			System.out.println("Make payment:");
			System.out.println("Choose options for payment: 1.UPI 2.Card 3.NetBanking 4.COD");
			int paymentOption = sc.nextInt();

			String paymentMethod;
			switch (paymentOption) {
			case 1:
				paymentMethod = "UPI";
				break;
			case 2:
				paymentMethod = "Card";
				break;
			case 3:
				paymentMethod = "NetBanking";
				break;
			case 4:
				paymentMethod = "COD";
				break;
			default:
				System.out.println("Invalid payment option!");
				return;
			}

			System.out.println(paymentMethod);

			System.out.println("Pay the amount:");
			int bill = sc.nextInt();

			if (bill == total) {
				System.out.println("Order placed successfully.");
			} else {
				System.out.println("Please enter the correct amount.");
			}
		}

	}
