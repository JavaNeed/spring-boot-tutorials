package com.common.main;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.common.model.Category;
import com.common.model.Customer;
import com.common.model.EmployeeTerritory;
import com.common.service.CategoriesService;
import com.common.service.CustomersService;
import com.common.service.EmployeeTerritoryService;

@Controller
public class MainController implements CommandLineRunner {
    private Logger LOGGER = Logger.getLogger(MainController.class);
    
    @Autowired
    private CategoriesService categoriesService;
    
    @Autowired
    private CustomersService customersService;
    @Autowired
    private EmployeeTerritoryService etService;

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("~~ STARTED ~~");
		Iterable<Category> categoryList = categoriesService.findAllCategories();
		for (Category category : categoryList) {
			LOGGER.info("--------------------------------------------");
			LOGGER.info("CategoryName   : "+category.getCategoryName());
			LOGGER.info("Description    : "+category.getDescription());
			LOGGER.info("CategoryID     : "+category.getCategoryID());
		}
		
		List<Customer> customers =customersService.findByCompanyName("Alfreds Futterkiste");
		for (Customer customer : customers) {
			LOGGER.info("**********************************");
			LOGGER.info("ContactName   : "+customer.getContactName());
			LOGGER.info("CustomerID    : "+customer.getCustomerID());
			LOGGER.info("ContactTitle  : "+customer.getContactTitle());
			LOGGER.info("PostalCode    : "+customer.getPostalCode());
		}
		
		// Find employee-territories
		EmployeeTerritory et = etService.findByTerritoryID(19713);
		LOGGER.info("~~~~~~~~~~~~~~~~~~~~~~~~");
		LOGGER.info("EmployeeID    : "+et.getEmployeeID());
		LOGGER.info("TerritoryID   : "+et.getTerritoryID());
	}
}
