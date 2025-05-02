package com.thinkbig.rest_d.service;

import java.util.List;

import com.thinkbig.rest_d.model.StoreSeller;

public interface StoreSellerService {
	public String createStoreSeller(StoreSeller storeSeller);
	public String updateStoreSeller(StoreSeller storeSeller);
	public String deleteStoreSeller(String storeSellerId);
	public StoreSeller getStoreSeller(String storeSellerId);
	public List<StoreSeller> getAllStoreSellers();
}