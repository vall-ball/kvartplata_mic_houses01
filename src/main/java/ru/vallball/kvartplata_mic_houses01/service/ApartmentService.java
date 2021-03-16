package ru.vallball.kvartplata_mic_houses01.service;

import java.util.List;

import ru.vallball.kvartplata_mic_houses01.model.Apartment;

public interface ApartmentService {
	
	void save(Apartment apartment);

	List<Apartment> list();

	void delete(Long id);

	Apartment findApartmentById(Long id);

}
