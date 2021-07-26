package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;

public class HotelReservationSystem {
	private ArrayList<Hotel> hotelClassList = new ArrayList<>();

	public HotelReservationSystem() {
		this.hotelClassList = new ArrayList<Hotel>();
	}

	public void addHotel(Hotel hotelClass) {
		hotelClassList.add(hotelClass);
	}
}
