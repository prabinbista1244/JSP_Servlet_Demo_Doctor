package com.model;

public class Doctor {
	private String Name;
	private String Email;
	private String Specialization;
	private String address; 
	private Double phone;
	private String Gender;
	private String Note;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getPhone() {
		return phone;
	}
	public void setPhone(Double phone) {
		this.phone = phone;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	
	

}
