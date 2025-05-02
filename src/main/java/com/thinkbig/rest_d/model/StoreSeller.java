package com.thinkbig.rest_d.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="store_seller_details")
public class StoreSeller {
	
	@Id
	private String sellerId;
	private String sellerName;
	private String sellerAddress;
	private String sellerPhoneNumber;
	
	
	
	public StoreSeller() {
		
	}
	
	public StoreSeller(String sellerId, String sellerName, String sellerAddress, String sellerPhoneNumber) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerAddress = sellerAddress;
		this.sellerPhoneNumber = sellerPhoneNumber;
	}
	
	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerAddress() {
		return sellerAddress;
	}

	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	public String getSellerPhoneNumber() {
		return sellerPhoneNumber;
	}

	public void setSellerPhoneNumber(String sellerPhoneNumber) {
		this.sellerPhoneNumber = sellerPhoneNumber;
	}


}
