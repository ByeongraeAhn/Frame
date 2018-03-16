package com.anbr.frame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anbr.frame.domain.Sample;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long> {
	
	Sample findByName(@Param("name") String name); 

}
