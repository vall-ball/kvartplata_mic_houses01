package ru.vallball.kvartplata_mic_houses01.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.vallball.kvartplata_mic_houses01.dao.ApartmentRepository;
import ru.vallball.kvartplata_mic_houses01.dao.HouseRepository;
import ru.vallball.kvartplata_mic_houses01.model.Apartment;
import ru.vallball.kvartplata_mic_houses01.model.House;

@Service
@Transactional
public class HouseServiceImpl implements HouseService{
	
	@Autowired
	HouseRepository houseRepository;
	
	@Autowired
	ApartmentRepository apartmentRepository;

	@Override
	public void save(House house) {
		houseRepository.save(house);
	}

	@Override
	public List<House> list() {
		return houseRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		houseRepository.deleteById(id);
		
	}

	@Override
	public House findHouseById(Long id) {
		return houseRepository.findById(id).get();
	}
	
	@Override
	public void create(House house) {
		House h = houseRepository.save(house);
		List<Apartment> list = new ArrayList<>();
		int howManyApartmentsInHouse = house.getApartmentsByLevel() * house.getEntrances() * house.getLevels();
		int howManyApartmentsInEntrance = house.getApartmentsByLevel() * house.getLevels();
		for (int i = 1; i <= howManyApartmentsInHouse; i++) {
			int entrance = i / howManyApartmentsInEntrance + 1;
			int level = (i - (entrance - 1) * howManyApartmentsInEntrance) / house.getApartmentsByLevel() + 1;
			Apartment apartment = new Apartment(i, entrance, level, h);
			Apartment a = apartmentRepository.save(apartment);
			list.add(a);
		}
		h.setApartments(list);
		houseRepository.save(h);
	}

}
