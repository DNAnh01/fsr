package javaot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javaot.bean.Customer;

@Controller
@RequestMapping("customer")
public class CustomerController {
	@GetMapping("showForm")
	public String showCustomerForm() {
		return "customer/customer-form"; 
	}
	
	@PostMapping("processForm")
	public String processCustomerForm(
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("age") int age,
			Model model) {
		
		Customer customer = new Customer(firstName, lastName, age);
		model.addAttribute("customer", customer);
		return "customer/customer"; 
	}
}
