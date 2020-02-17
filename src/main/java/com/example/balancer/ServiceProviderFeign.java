package com.example.balancer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Cart;

@FeignClient("SERVICE-PROVIDER")
public interface ServiceProviderFeign {

	@GetMapping("/service-provider/get")
	public String getProviderData();

	@GetMapping("/service-provider/data")
	public Cart getObj();

	@GetMapping("/service-provider/list")
	public List<Cart> getBulkData();

}
