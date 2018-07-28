package com.chris.service.Impl;

import com.chris.entity.Spittle;
import com.chris.repository.SpittleRepository;
import com.chris.service.SpittleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpittleServiceImpl implements SpittleService {
	
	@Autowired
	SpittleRepository spittleRepository;
	
	@Override
	public List<Spittle> findSpittle(long max, int count) {
		return spittleRepository.findSpittles(max, count);
	}
	
	@Override
	public Spittle findOne(long id) {
		return spittleRepository.findOne(id);
	}
}
