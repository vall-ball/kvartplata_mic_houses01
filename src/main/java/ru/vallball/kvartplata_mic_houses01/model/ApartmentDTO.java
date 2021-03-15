package ru.vallball.kvartplata_mic_houses01.model;

public class ApartmentDTO {

	private Long id;
	
	private int number;
	
	private int entrance;
	
	private int level;

	private HouseDTO house;

	public ApartmentDTO() {
		
	}
	
	public ApartmentDTO(Long id, int number, int entrance, int level, HouseDTO house) {
		this.id = id;
		this.number = number;
		this.entrance = entrance;
		this.level = level;
		this.house = house;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getEntrance() {
		return entrance;
	}

	public void setEntrance(int entrance) {
		this.entrance = entrance;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public HouseDTO getHouse() {
		return house;
	}

	public void setHouse(HouseDTO house) {
		this.house = house;
	}
	
}
