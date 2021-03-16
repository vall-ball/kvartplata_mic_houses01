package ru.vallball.kvartplata_mic_houses01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.vallball.kvartplata_mic_houses01.dao.ApartmentRepository;
import ru.vallball.kvartplata_mic_houses01.model.Apartment;

@Service
@Transactional
public class ApartmentServiceImpl implements ApartmentService{
	
	
	@Autowired
	ApartmentRepository apartmentRepository;

	@Override
	public void save(Apartment apartment) {
		apartmentRepository.save(apartment);		
	}

	@Override
	public List<Apartment> list() {
		return apartmentRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		apartmentRepository.deleteById(id);		
	}

	@Override
	public Apartment findApartmentById(Long id) {
		return apartmentRepository.findById(id).get();
	}

}
