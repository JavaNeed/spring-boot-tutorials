package com.javainuse.swaggertest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "HelloController", description = "Hello My Controller")
public class HelloController {

	@RequestMapping(value = "/api/javainuse", method = RequestMethod.GET)
	@ApiOperation(value = "Say Hello", notes = "Say Hello", response = String.class, responseContainer = "String")
	public String sayHello() {
		return "Swagger Hello World From Developer !!!";
	}
}
