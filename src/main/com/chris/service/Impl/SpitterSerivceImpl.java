package main.com.chris.service.Impl;

import main.com.chris.entity.Spitter;
import main.com.chris.repository.SpitterRepository;
import main.com.chris.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther Chris Lee
 * @Date 7/25/2018 17:52
 * @Description
 */
public class SpitterSerivceImpl implements SpitterService {
	
	@Autowired
	SpitterRepository spitterRepository;
	
	@Override
	public Spitter findSpitterById(String id) {
		
		return spitterRepository.findSpitterById(id);
	}
}
