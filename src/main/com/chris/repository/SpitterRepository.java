package com.chris.repository;

import com.chris.entity.Spitter;
import com.chris.entity.Spittle;

import java.util.List;

/**
 * @Auther Chris Lee
 * @Date 7/25/2018 17:20
 * @Description
 */
public interface SpitterRepository {
	
	List<Spittle> findSpittles(int max, int count);
	
	Spitter save(Spitter spitter);
	
	Spitter findByUsername(String username);
}
