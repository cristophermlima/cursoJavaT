package application;

import java.util.Scanner;

import entities.RentHotel;

public class ProgramRent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		RentHotel[] vect = new RentHotel[10];

		System.out.println("how many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();

			RentHotel rent = new RentHotel(name, email);
			vect[roomNumber] = new RentHotel(name, email);
			
		}
		System.out.println();
		System.out.println("busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
			System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
