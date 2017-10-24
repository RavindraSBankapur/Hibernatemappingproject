package org.hibenate.dto;

public class CustomerEntity {
	private String customerid;
	private String customerName;
	private String contactName;
	private String address;
private String city;
	public void setCountry(String country) {
	this.country = country;
}
	private int postalCode;
	private String country;
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	@Override
	public String toString() {
		return "CustomerEntity [customerName=" + customerName + ", contactName=" + contactName + ", address=" + address
				+ ", city=" + city + ", country=" + country + "]";
	}
	
	}
	
