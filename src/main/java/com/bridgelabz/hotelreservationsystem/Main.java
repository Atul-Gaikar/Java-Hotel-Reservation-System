package com.bridgelabz.hotelreservationsystem;

public class Main {
	public class MainClass {
		public void main(String[] args) {
			System.out.println("Welcome to Hotel Reservation System!");

			HotelReservationSystem hotelSystem = new HotelReservationSystem();
			hotelSystem.addHotel(new Hotel("Lakewood", 110));
			hotelSystem.addHotel(new Hotel("Bridgewood", 160));
			hotelSystem.addHotel(new Hotel("Ridgewood", 220));
			System.out.println("Hotels are added!");
		}
	}

}
