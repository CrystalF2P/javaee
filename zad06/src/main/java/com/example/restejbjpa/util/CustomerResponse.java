package com.example.restejbjpa.util;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.example.restejbjpa.domain.Customer;

@XmlRootElement
public class CustomerResponse {
	
	private List<Customer> customer;

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

}
