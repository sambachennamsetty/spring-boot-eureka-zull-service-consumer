package com.example.consumer;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.balancer.ServiceProviderFeign;
import com.example.model.Cart;

@RestController
@RequestMapping("service-consumer")
public class ServiceConsumer {

	@Autowired
	ServiceProviderFeign serviceProviderFeign;

	@GetMapping("/get")
	public String getData() {

		return serviceProviderFeign.getProviderData();
	}

	@GetMapping("/data")
	public Cart getObj() {
		return serviceProviderFeign.getObj();
	}

	@GetMapping("/list")
	public List<Cart> getBulk() {
		return serviceProviderFeign.getBulkData();
	}

}
