package org.tms.model;

public class Traineecls {

	private int userid;
	private String hiredate;
	private String designation;
	private String vertical;
	private String location;
	private int phone;
	private String role;
	public Traineecls() {
		
	}
	
	public Traineecls(int userid, String hiredate, String designation, String vertical,
			String location, int phone, String role) {
		super();
		this.userid = userid;
		this.hiredate = hiredate;
		this.designation=designation;
		this.vertical = vertical;
		this.location = location;
		this.phone = phone;
		this.role = role;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getVertical() {
		return vertical;
	}

	public void setVertical(String vertical) {
		this.vertical = vertical;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
