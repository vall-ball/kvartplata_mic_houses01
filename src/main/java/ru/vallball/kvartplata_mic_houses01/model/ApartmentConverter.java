package ru.vallball.kvartplata_mic_houses01.model;

public class ApartmentConverter {
	
	public static ApartmentDTO convertToDto(Apartment apartment) {
		return new ApartmentDTO(apartment.getId(), apartment.getNumber(), apartment.getEntrance(), apartment.getLevel(), HouseConverter.convertToDto(apartment.getHouse()));
	}

}
