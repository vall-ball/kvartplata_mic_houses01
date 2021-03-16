package ru.vallball.kvartplata_mic_houses01.service;

import java.util.List;

import ru.vallball.kvartplata_mic_houses01.model.House;

public interface HouseService {
	
	void save(House house);

	List<House> list();

	void delete(Long id);

	House findHouseById(Long id);
	
	public void create(House house);

}
