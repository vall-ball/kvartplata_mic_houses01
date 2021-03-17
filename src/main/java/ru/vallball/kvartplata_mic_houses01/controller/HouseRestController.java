package ru.vallball.kvartplata_mic_houses01.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.vallball.kvartplata_mic_houses01.model.House;
import ru.vallball.kvartplata_mic_houses01.model.HouseConverter;
import ru.vallball.kvartplata_mic_houses01.model.HouseDTO;
import ru.vallball.kvartplata_mic_houses01.service.HouseService;

@RestController
@RequestMapping(value = "/houses")
public class HouseRestController {
	
	@Autowired
	HouseService houseService;
	
	@GetMapping
	public List<HouseDTO> list() {
		List<HouseDTO> list = new ArrayList<>();
		for (House h : houseService.list()) {
			list.add(HouseConverter.convertToDto(h));
		}
		return list;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object>  get(@PathVariable(value = "id") Long id) {
		try {
			House house = houseService.findHouseById(id);
			return new ResponseEntity<>(HouseConverter.convertToDto(house), HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("The house not found", HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<Object> create(@Valid @RequestBody HouseDTO houseDto) {
		System.out.println("@PostMapping");
		houseService.create(HouseConverter.convertToEntity(houseDto));
		return new ResponseEntity<>("The hotel is created successfully", HttpStatus.CREATED);
	}
	

}
