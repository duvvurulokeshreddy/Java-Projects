package com.jsp.Spring.SpringProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int sId;
	private String sName;
	private int sContact;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsContact() {
		return sContact;
	}
	public void setsContact(int sContact) {
		this.sContact = sContact;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sContact=" + sContact + "]";
	}
	

}
