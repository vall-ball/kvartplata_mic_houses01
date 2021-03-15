package ru.vallball.kvartplata_mic_houses01.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.vallball.kvartplata_mic_houses01.model.House;

public interface HouseRepository extends JpaRepository<House, Long>{

}
