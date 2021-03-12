package ru.vallball.kvartplata_mic_houses01.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "apartments")
public class Apartment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private int number;
	
	@NotNull
	private int entrance;
	
	@NotNull
	private int level;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "house_id", nullable = false)
	private House house;

	public Apartment(@NotNull int number, @NotNull int entrance, @NotNull int level, @NotNull House house) {
		super();
		this.number = number;
		this.entrance = entrance;
		this.level = level;
		this.house = house;
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

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public Long getId() {
		return id;
	}
	
}
