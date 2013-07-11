//Playing around with elementcollection and embeddable to see how it works

package models;

import java.util.*;

import javax.persistence.*;

import play.db.jpa.Model;

@Entity
public class User extends Model{

	private String name;
	private Integer phoneNumber;
		
	@ElementCollection
	@CollectionTable(
			name="Addresses",
			joinColumns=@JoinColumn(name="User_ID")
			)
	private List<Address> addresses;
	
	public String getName() {
		if(name == null) {
			System.out.println("Please set a name");
		}
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getPhoneNumber() {
		if(phoneNumber == null) {
			System.out.println("Please set a phone number");
		}
		return phoneNumber;
	}
	
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;	
	}
	
	public List<Address> getAddresses(){
		return this.addresses;
		}

	public void addAddress(Address address) {
		if (this.addresses == null) {
			this.addresses = new ArrayList<Address>();
		}
		this.addresses.add(address);
	}
}		




