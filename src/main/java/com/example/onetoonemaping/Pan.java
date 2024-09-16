package com.example.onetoonemaping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Pan {
@Id
private int panNumber;
private String address;
public int getPanNumber() {
	return panNumber;
}
public void setPanNumber(int panNumber) {
	this.panNumber = panNumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
