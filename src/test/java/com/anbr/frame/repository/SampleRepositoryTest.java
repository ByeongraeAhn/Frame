package com.anbr.frame.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anbr.frame.domain.Sample;
import com.anbr.frame.repository.SampleRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/context-*.xml")
public class SampleRepositoryTest {
	
	@Autowired
	private SampleRepository repository;
	
	@Test
	public void addSample() {
		Sample sample = new Sample();
		sample.setName("sam");
		Sample savedSample = repository.save(sample);
		Assert.assertNotNull(savedSample);
	}

}
