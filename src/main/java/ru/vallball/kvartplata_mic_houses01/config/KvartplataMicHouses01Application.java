/*
 * Есть многоквартирный дом, модель должна позволять прописывать / выписывать жителей, начислять квартплату в зависимости от площади квартир, 
 * давать возможность платить жителям квартплату, формировать отчет по платежам и задолженности. Если возникает задолженность и ее срок превышает месяц 
 * с момента возникновения, должен начисляться штраф в размере 10 процентов от суммы ее суммы. Квартплата начисляется первого числа каждого месяца. 
 * Отчеты должны сортироваться и фильтроваться по разным критериям   
 */
package ru.vallball.kvartplata_mic_houses01.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KvartplataMicHouses01Application {

	public static void main(String[] args) {
		SpringApplication.run(KvartplataMicHouses01Application.class, args);
	}

}
