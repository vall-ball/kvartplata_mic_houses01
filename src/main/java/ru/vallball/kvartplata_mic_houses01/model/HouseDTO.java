package ru.vallball.kvartplata_mic_houses01.model;

public class HouseDTO {

	private Long id;
	
	private String street;

	private int number;

	private int entrances;

	private int levels;

	private int apartmentsByLevel;
	
	public HouseDTO() {
		
	}
	
	public HouseDTO(Long id, String street, int number, int entrances, int levels, int apartmentsByLevel) {
		this.id = id;
		this.street = street;
		this.number = number;
		this.entrances = entrances;
		this.levels = levels;
		this.apartmentsByLevel = apartmentsByLevel;
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

	public int getApartmentsByLevel() {
		return apartmentsByLevel;
	}

	public void setApartmentsByLevel(int apartmentsByLevel) {
		this.apartmentsByLevel = apartmentsByLevel;
	}
	
	

}
