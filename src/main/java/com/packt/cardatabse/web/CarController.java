package com.packt.cardatabse.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packt.cardatabse.domain.Car;
import com.packt.cardatabse.domain.CarRepository;

@RestController
public class CarController {

	@Autowired
	private CarRepository repository;
	
	@RequestMapping("/cars")
	public Iterable<Car> getCars(){
		return repository.findAll();
	}
	
}
