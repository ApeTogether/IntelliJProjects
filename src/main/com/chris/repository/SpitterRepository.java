package com.chris.repository;

import com.chris.entity.Spitter;

/**
 * @Auther Chris Lee
 * @Date 7/25/2018 17:20
 * @Description
 */
public interface SpitterRepository {
	Spitter save(Spitter spitter);
	
	Spitter findByUsername(String username);
}
