package com.anbr.frame.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anbr.frame.domain.Sample;
import com.anbr.frame.repository.SampleRepository;

@Service
@Transactional
public class SampleServiceImpl implements SampleService {

	@Autowired
	private SampleRepository repository;
	
	@Cacheable(value="sample", key="#id")
	@Override
	public Sample findById(Long id) {
		return repository.findOne(id);
	}
	
	@CachePut(value="sample", key="#sample.id")
	@Override
	public Sample save(Sample sample) {
		return repository.save(sample);
	}

	// 일반적으로 findall에 대한 cache는 하지 않는 편. key/value 형식에 맞지 않으며 cache 업데이트가 정상적으로 이루어지지 않음.  
	@Override
	public List<Sample> findAll() {
		return repository.findAll();
	}

	@CacheEvict(value="sample", allEntries=true)
	@Override
	public void clearCache() {
		// nothing
	}

}
