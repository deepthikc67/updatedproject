package com.niit.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {

@Id
@GeneratedValue
private int cid;

private String name;
private String description;
 


public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@OneToMany(targetEntity=Product.class,  fetch=FetchType.EAGER, mappedBy="category")
private Set<Product> products = new HashSet<Product>(0);


public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<Product> getProducts() {
	return products;
}
public void setProducts(Set<Product> products) {
	this.products = products;
}


}