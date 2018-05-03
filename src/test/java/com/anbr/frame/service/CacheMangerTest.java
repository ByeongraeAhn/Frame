package com.anbr.frame.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.sf.ehcache.Element;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/context-*.xml")
public class CacheMangerTest {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleServiceCacheTest.class);
	
	@Autowired 
	private CacheManager cacheManager;

	@Autowired
	private SampleService sampleService;
	
	@Test
	public void testCachable() throws InterruptedException {
		System.out.println("시작한다★★★★★★★★★★");
		System.out.println("첫번째 캐싱 메서드 : " + sampleService.cacheTest());
		Cache cache = cacheManager.getCache("sample");
		//cache.put("sample", "testitem1"); 
		//System.out.println("캐싱된 아이템 : " + cache.get;
		Thread.sleep(2000);
		System.out.println("두번째 캐싱 메서드 : " + sampleService.cacheTest());
	}
	

}
