package com.springweb1.command;

public class StudentEnrollCommand {

	private String name;

	private String qualification;

	private String gender;

	private String address;

	private String course;

	private String duration;

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	

	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "StudentEnrollCommand [name=" + name + ", qualification=" + qualification + ", gender=" + gender
				+ ", address=" + address + ", course=" + course + ", duration=" + duration + "]";
	}
	
	

}
