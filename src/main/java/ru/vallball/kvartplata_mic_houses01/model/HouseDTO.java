package ru.vallball.kvartplata_mic_houses01.model;

import java.util.List;

public class HouseDTO {

	private Long id;
	
	private String street;

	private int number;

	private int entrances;

	private int levels;
	
	private List<ApartmentDTO> apartments;

	public HouseDTO(Long id, String street, int number, int entrances, int levels, List<ApartmentDTO> apartments) {
		this.id = id;
		this.street = street;
		this.number = number;
		this.entrances = entrances;
		this.levels = levels;
		this.apartments = apartments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getEntrances() {
		return entrances;
	}

	public void setEntrances(int entrances) {
		this.entrances = entrances;
	}

	public int getLevels() {
		return levels;
	}

	public void setLevels(int levels) {
		this.levels = levels;
	}

	public List<ApartmentDTO> getApartments() {
		return apartments;
	}

	public void setApartments(List<ApartmentDTO> apartments) {
		this.apartments = apartments;
	}
	
}
