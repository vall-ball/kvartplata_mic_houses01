package ru.vallball.kvartplata_mic_houses01.model;

import java.util.ArrayList;
import java.util.List;

public class HouseConverter {
	
	public static HouseDTO convertToDto(House house) {
		List<ApartmentDTO> list = new ArrayList<>();
		for (Apartment a : house.getApartments()) {
			list.add(ApartmentConverter.convertToDto(a));
		}
		return new HouseDTO(house.getId(), house.getStreet(), house.getNumber(), house.getEntrances(), house.getLevels(),  list);
	}
	
	public static House convertToEntity(HouseDTO dto) {
		List<Apartment> list = new ArrayList<>();
		for (ApartmentDTO a : dto.getApartments()) {
			list.add(ApartmentConverter.convertToEntity(a));
		}
		return new House(dto.getStreet(), dto.getNumber(), dto.getEntrances(), dto.getLevels(), list);
	}

}
