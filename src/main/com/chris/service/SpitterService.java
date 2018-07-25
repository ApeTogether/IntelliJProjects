package main.com.chris.service;

import main.com.chris.entity.Spitter;

/**
 * @Auther Chris Lee
 * @Date 7/25/2018 17:51
 * @Description
 */
public interface SpitterService {
	
	Spitter findSpitterById(String id);
	
}
