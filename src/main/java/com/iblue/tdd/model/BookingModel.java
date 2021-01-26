package com.iblue.tdd.model;

import java.time.LocalDate;

public class BookingModel {

	private Long id;
	private String reserveName;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private Integer numberGuests;

	public BookingModel() {
	}

	public BookingModel(Long id, String reserveName, LocalDate checkIn, LocalDate checkOut, Integer numberGuests) {
		super();
		this.id = id;
		this.reserveName = reserveName;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.numberGuests = numberGuests;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReserveName() {
		return reserveName;
	}

	public void setReserveName(String reserveName) {
		this.reserveName = reserveName;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}

	public Integer getNumberGuests() {
		return numberGuests;
	}

	public void setNumberGuests(Integer numberGuests) {
		this.numberGuests = numberGuests;
	}

}
