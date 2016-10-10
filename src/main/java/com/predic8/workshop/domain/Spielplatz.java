package com.predic8.workshop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
@Entity
public class Spielplatz {
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private Integer locationX;
	private Integer locationY;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLocationX() {
		return locationX;
	}

	public void setLocationX(Integer locationX) {
		this.locationX = locationX;
	}

	public Integer getLocationY() {
		return locationY;
	}

	public void setLocationY(Integer locationY) {
		this.locationY = locationY;
	}
}