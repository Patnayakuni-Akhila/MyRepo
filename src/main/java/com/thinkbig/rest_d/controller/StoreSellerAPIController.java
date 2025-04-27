package com.thinkbig.rest_d.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkbig.rest_d.model.StoreSeller;

@RestController
@RequestMapping("/storeseller")
public class StoreSellerAPIController {
	
	StoreSeller storeSeller;
	
	@GetMapping("{sellerId}")
	public StoreSeller getStoreSellerDetails(String sellerId) {
		return storeSeller;
		//new StoreSeller("A1","Seller 1","Adress 1","93810");
	}
	
	@PostMapping
	public String createStoreSellerDetails(@RequestBody StoreSeller storeSeller) {
		this.storeSeller = storeSeller;
		return "Store Seller Created Successfully";
	}
	
	@PutMapping
	public String updateStoreSellerDetails(@RequestBody StoreSeller storeSeller) {
		this.storeSeller = storeSeller;
		return "Store Seller Updated Successfully";
	}
	
	@DeleteMapping("{sellerId}")
	public String deleteStoreSellerDetails(String sellerId) {
		this.storeSeller = null;
		return "Store Seller Deleted Successfully";
	}

}
