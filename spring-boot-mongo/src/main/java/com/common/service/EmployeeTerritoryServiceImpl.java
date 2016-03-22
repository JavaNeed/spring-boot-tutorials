package com.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.common.model.EmployeeTerritory;
import com.common.repository.EmployeeTerritoryRepository;

@Component
public class EmployeeTerritoryServiceImpl implements EmployeeTerritoryService{
	
	@Autowired
	private EmployeeTerritoryRepository employeeTerritoryRepository;

	@Override
	public EmployeeTerritory findByTerritoryID(Integer territoryID) {
		EmployeeTerritory et = employeeTerritoryRepository.findByTerritoryID(territoryID);
		return et;
	}
}
