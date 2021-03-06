package com.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shipwreck {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	String shipwreckname;

	String description;
	String conditions;
	Integer depth;
	Double latitude;
	Double longitude;
	Integer yearDiscovered;

	public Shipwreck() {
		
	}

	public Shipwreck(Long id, String shipwreckname, String description,
			String conditions, Integer depth, Double latitude,
			Double longitude, Integer yearDiscovered) {
		super();
		this.id = id;
		this.shipwreckname = shipwreckname;
		this.description = description;
		this.conditions = conditions;
		this.depth = depth;
		this.latitude = latitude;
		this.longitude = longitude;
		this.yearDiscovered = yearDiscovered;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShipwreckname() {
		return shipwreckname;
	}

	public void setShipwreckname(String shipwreckname) {
		this.shipwreckname = shipwreckname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getYearDiscovered() {
		return yearDiscovered;
	}

	public void setYearDiscovered(Integer yearDiscovered) {
		this.yearDiscovered = yearDiscovered;
	}

}
