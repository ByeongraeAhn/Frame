package com.anbr.frame.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Sample implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name ="MENU_ID") //데이터베이스 컬럼명
	private long id;

	@NotNull(message="name is required.")
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sample [id=" + id + ", name=" + name + "]";
	}
	
}
