package com.common.repository;

import org.springframework.data.repository.CrudRepository;

import com.common.model.EmployeeTerritory;

public interface EmployeeTerritoryRepository extends CrudRepository<EmployeeTerritory, Integer>{
	EmployeeTerritory findByTerritoryID(Integer territoryID);
}
