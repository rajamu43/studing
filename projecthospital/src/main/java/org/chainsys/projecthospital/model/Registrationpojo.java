package org.chainsys.projecthospital.model;

public class Registrationpojo {
	
	  private Integer regid,billno;
	  private String name;
	  private String password;
	  private String catogories;
	  private Integer registid;
		private Integer adminid,pid,apno;
		private String adminName;
		private String gender;
		private Integer age,dfees,mfees,amount;
		private String mail;
		private String mnumber;
		private String address,paymode;
		private long payno;
	public Registrationpojo() {
	
		
	}

	public Registrationpojo(Integer regid, Integer billno, String name, String password, String catogories,
			Integer registid, Integer adminid, Integer pid, Integer apno, String adminName, String gender, Integer age,
			Integer dfees, Integer mfees, Integer amount, String mail, String mnumber, String address, String paymode,
			long payno) {
		this.regid = regid;
		this.billno = billno;
		this.name = name;
		this.password = password;
		this.catogories = catogories;
		this.registid = registid;
		this.adminid = adminid;
		this.pid = pid;
		this.apno = apno;
		this.adminName = adminName;
		this.gender = gender;
		this.age = age;
		this.dfees = dfees;
		this.mfees = mfees;
		this.amount = amount;
		this.mail = mail;
		this.mnumber = mnumber;
		this.address = address;
		this.paymode = paymode;
		this.payno = payno;
	}
	public Integer getRegid() {
		return regid;
	}

	public void setRegid(Integer regid) {
		this.regid = regid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCatogories() {
		return catogories;
	}

	public void setCatogories(String catogories) {
		this.catogories = catogories;
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

	public Integer getBillno() {
		return billno;
	}
	public void setBillno(Integer billno) {
		this.billno = billno;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getApno() {
		return apno;
	}
	public void setApno(Integer apno) {
		this.apno = apno;
	}
	public Integer getDfees() {
		return dfees;
	}
	public void setDfees(Integer dfees) {
		this.dfees = dfees;
	}
	public Integer getMfees() {
		return mfees;
	}
	public void setMfees(Integer mfees) {
		this.mfees = mfees;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public String getPaymode() {
		return paymode;
	}

	public void setPaymode(String paymode) {
		this.paymode = paymode;
	}

	public long getPayno() {
		return payno;
	}

	public void setPayno(long payno) {
		this.payno = payno;
	}

	@Override
	public String toString() {
		return "Registrationpojo [regid=" + regid + ", billno=" + billno + ", name=" + name + ", password=" + password
				+ ", catogories=" + catogories + ", registid=" + registid + ", adminid=" + adminid + ", pid=" + pid
				+ ", apno=" + apno + ", adminName=" + adminName + ", gender=" + gender + ", age=" + age + ", dfees="
				+ dfees + ", mfees=" + mfees + ", amount=" + amount + ", mail=" + mail + ", mnumber=" + mnumber
				+ ", address=" + address + ", paymode=" + paymode + ", payno=" + payno + "]";
	}




	  
	  

}
