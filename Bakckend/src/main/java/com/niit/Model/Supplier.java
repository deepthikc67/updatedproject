package com.niit.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Supplier {

	@Id
	private int sid;
	
	
	private String supplierName;
	private String supplierAddress;
	private int supplierMobileNO;

	@OneToMany(targetEntity=Product.class,fetch=FetchType.EAGER,mappedBy="supplier")
	private Set<Product> product= new HashSet<Product>(0);

	
	


	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	

	

	public int getSupplierMobileNO() {
		return supplierMobileNO;
	}

	public void setSupplierMobileNO(int supplierMobileNO) {
		this.supplierMobileNO = supplierMobileNO;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
	

}