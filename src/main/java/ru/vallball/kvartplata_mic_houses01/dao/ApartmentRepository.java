package ru.vallball.kvartplata_mic_houses01.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.vallball.kvartplata_mic_houses01.model.Apartment;

public interface ApartmentRepository extends JpaRepository<Apartment, Long>{

}
