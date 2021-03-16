package ru.vallball.kvartplata_mic_houses01.model;

public class HouseConverter {
	
	public static HouseDTO convertToDto(House house) {
		return new HouseDTO(house.getId(), house.getStreet(), house.getNumber(), house.getEntrances(), house.getLevels(), house.getApartmentsByLevel());
	}
	
	public static House convertToEntity(HouseDTO dto) {
		return new House(dto.getStreet(), dto.getNumber(), dto.getEntrances(), dto.getLevels(), dto.getApartmentsByLevel());
	}

}
