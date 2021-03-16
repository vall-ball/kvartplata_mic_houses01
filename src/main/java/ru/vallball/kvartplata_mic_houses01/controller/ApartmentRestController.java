package ru.vallball.kvartplata_mic_houses01.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.vallball.kvartplata_mic_houses01.model.Apartment;
import ru.vallball.kvartplata_mic_houses01.model.ApartmentConverter;
import ru.vallball.kvartplata_mic_houses01.model.ApartmentDTO;
import ru.vallball.kvartplata_mic_houses01.service.ApartmentService;

@RestController
@RequestMapping(value = "/apartments")
public class ApartmentRestController {

	@Autowired
	ApartmentService apartmentService;
	
	@GetMapping
	public List<ApartmentDTO> list() {
		List<ApartmentDTO> list = new ArrayList<>();
		for (Apartment a : apartmentService.list()) {
			list.add(ApartmentConverter.convertToDto(a));
		}
		return list;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object>  get(@PathVariable(value = "id") Long id) {
		try {
			Apartment apartment = apartmentService.findApartmentById(id);
			return new ResponseEntity<>(ApartmentConverter.convertToDto(apartment), HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("The apartment not found", HttpStatus.NOT_FOUND);
		}
	}
	
}
