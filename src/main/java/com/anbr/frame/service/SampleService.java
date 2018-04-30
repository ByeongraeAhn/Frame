package com.anbr.frame.service;

import java.util.List;

import com.anbr.frame.domain.Sample;

public interface SampleService {
	
	Sample findById(Long id);

	Sample save(Sample sample);

	List<Sample> findAll();
	
	void clearCache();
	
	String cacheTest();
	
}
