package com.thinkbig.rest_d.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkbig.rest_d.model.StoreSeller;
import com.thinkbig.rest_d.service.StoreSellerService;

@RestController
@RequestMapping("/storeseller")
public class StoreSellerAPIController {
	
	StoreSellerService storeSellerService;
	
	public StoreSellerAPIController(StoreSellerService storeSellerService) {
		super();
		this.storeSellerService = storeSellerService;
	}

	@GetMapping("{sellerId}")
	public StoreSeller getStoreSellerDetails(@PathVariable("sellerId") String sellerId) {
		
		return storeSellerService.getStoreSeller(sellerId);
		//new StoreSeller("A1","Seller 1","Adress 1","93810");
	}
	
	@GetMapping()
	public List<StoreSeller> getAllStoreSellerDetails() {
		
		return storeSellerService.getAllStoreSellers();
		//new StoreSeller("A1","Seller 1","Adress 1","93810");
	}
	
	@PostMapping
	public String createStoreSellerDetails(@RequestBody StoreSeller storeSeller) {
		storeSellerService.createStoreSeller(storeSeller);
		return "Store Seller Created Successfully";
	}
	
	@PutMapping
	public String updateStoreSellerDetails(@RequestBody StoreSeller storeSeller) {
		storeSellerService.updateStoreSeller(storeSeller);
		return "Store Seller Updated Successfully";
	}
	
	@DeleteMapping("{sellerId}")
	public String deleteStoreSellerDetails(@PathVariable String sellerId) {
		storeSellerService.deleteStoreSeller(sellerId);
		return "Store Seller Deleted Successfully";
	}

}
