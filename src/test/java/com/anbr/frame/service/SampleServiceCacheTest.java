package com.anbr.frame.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StopWatch;

import com.anbr.frame.domain.Sample;
import com.anbr.frame.service.SampleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/context-*.xml")
public class SampleServiceCacheTest {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleServiceCacheTest.class);
	
	@Autowired 
	private CacheManager cacheManager;

	@Autowired
	private SampleService sampleService;
	
	@Test
	public void testCachable() {
		
		StopWatch sw = new StopWatch();
		
		Sample sample = prepareSample();
		
		sw.start("search");
		sampleService.findById(sample.getId());
		sw.stop();
		
		Cache cache = cacheManager.getCache("sample");
		assertNotNull(cache);
		assertNotNull(cache.get(sample.getId()));
		
		sw.start("get cached data");
		sampleService.findById(sample.getId());
		sw.stop();
		
		logger.debug(sw.prettyPrint());
		
	}
	
	@Test
	public void testCacheEvict() {
		Sample sample = prepareSample();
		
		// prepare
		sampleService.findById(sample.getId());
		
		sampleService.clearCache();
		Cache cache = cacheManager.getCache("sample");
		assertNull(cache.get(sample.getId()));
	}
	
	private Sample prepareSample() {
		Sample sample = new Sample();
		sample.setName("sam");
		Sample savedSample = sampleService.save(sample);
		return savedSample;
	}
	

}
