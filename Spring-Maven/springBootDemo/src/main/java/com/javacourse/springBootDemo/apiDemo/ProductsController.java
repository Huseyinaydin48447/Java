package com.javacourse.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
@RestController
public class ProductsController {
	
	@GetMapping("/")
	public String get() {
		return "Laptop";
	}
	@GetMapping("/products")
	public String get2() {
		return "Laptop23";
	}
}
    