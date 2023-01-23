package org.chainsys.projecthospital.model;

public class Adminpojo {
	
	private Integer registid;
	private Integer adminid;
	private String adminName;
	private String gender;
	private Integer age;
	private String mail;
	private String mnumber;
	private String address;
	public Adminpojo() {
		
		
	}
	public Adminpojo(Integer registid, Integer adminid, String adminName, String gender, Integer age, String mail,
			String mnumber, String address) {

		this.registid = registid;
		this.adminid = adminid;
		this.adminName = adminName;
		this.gender = gender;
		this.age = age;
		this.mail = mail;
		this.mnumber = mnumber;
		this.address = address;
	}
	public Integer getRegistid() {
		return registid;
	}
	public void setRegistid(Integer registid) {
		this.registid = registid;
	}
	public Integer getAdminid() {
		return adminid;
	}
	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMnumber() {
		return mnumber;
	}
	public void setMnumber(String mnumber) {
		this.mnumber = mnumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Adminpojo [registid=" + registid + ", adminid=" + adminid + ", adminName=" + adminName + ", gender="
				+ gender + ", age=" + age + ", mail=" + mail + ", mnumber=" + mnumber + ", address=" + address + "]";
	}

	
}
