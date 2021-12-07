package com.technoelevate.hibernate.mycontacts;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mycontacts")
public class MyContacts implements Serializable{
	@Id
	private int slno;
	private String name;
	private long phno;
	private String email;
	
	public int getSlno() {
		return slno;
	}

	public void setSlno(int slno) {
		this.slno = slno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MyContacts [slno=" + slno + ", name=" + name + ", phno=" + phno + ", email=" + email + "]";
	}
	
	

}
