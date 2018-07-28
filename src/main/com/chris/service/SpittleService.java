package com.chris.service;

import com.chris.entity.Spittle;

import java.util.List;

public interface SpittleService {
	
	List<Spittle> findSpittle(long max, int count);
	
	Spittle findOne(long id);
}
