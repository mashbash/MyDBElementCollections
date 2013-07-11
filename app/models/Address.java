package models;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String streetaddr;
	private String country;
	private String zipcode;
	
	public void InitializeAddress(String streetadd, String country, String zipcode) {
		this.setStreetAddr(streetadd);
		this.setCountry(country);
		this.setZipCode(zipcode);
	}
	
	public String getStreetAddr() {
		return streetaddr;
	}
	
	public void setStreetAddr(String streetaddr) {
		this.streetaddr = streetaddr;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String setCountry(String country) {
		return country;
	}
	
	public String getZipCode() {
		return zipcode;
	}
	
	public void setZipCode(String zipcode) {
		this.zipcode = zipcode;
	}
}
