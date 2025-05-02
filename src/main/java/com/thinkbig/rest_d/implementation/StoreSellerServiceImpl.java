package com.thinkbig.rest_d.implementation;

import java.util.List;
import org.springframework.stereotype.Service;
import com.thinkbig.rest_d.model.StoreSeller;
import com.thinkbig.rest_d.repository.StoreSellerRepository;
import com.thinkbig.rest_d.service.StoreSellerService;

@Service
public class StoreSellerServiceImpl implements StoreSellerService{

	StoreSellerRepository storeSellerRepository;
	
	public StoreSellerServiceImpl(StoreSellerRepository storeSellerRepository) {
		super();
		this.storeSellerRepository = storeSellerRepository;
	}

	@Override
	public String createStoreSeller(StoreSeller storeSeller) {
		storeSellerRepository.save(storeSeller);
		return "Success";
	}

	@Override
	public String updateStoreSeller(StoreSeller storeSeller) {
		storeSellerRepository.save(storeSeller);
		return "Success";
	}

	@Override
	public String deleteStoreSeller(String storeSellerId) {
		storeSellerRepository.deleteById(storeSellerId);
		return "Success";
	}

	@Override
	public StoreSeller getStoreSeller(String storeSellerId) {
		return storeSellerRepository.findById(storeSellerId).get();
	}

	@Override
	public List<StoreSeller> getAllStoreSellers() {
		return storeSellerRepository.findAll();
	}

}
