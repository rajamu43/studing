package org.chainsys.projecthospital.model;

public class Doctorpojo {

	private Integer registid,ano,arno,pid;
	private Integer doctortid,preno;
	private String doctorName,adate,atime;
	private String gender;
	private Integer age,qty;
	private String mail;
	private String mnumber;
	private String address;
	private String specialization,status,precription;
	public Doctorpojo() {
		
	}
	
	public Doctorpojo(Integer registid, Integer ano, Integer arno, Integer pid, Integer doctortid, Integer preno,
			String doctorName, String adate, String atime, String gender, Integer age, Integer qty, String mail,
			String mnumber, String address, String specialization, String status, String precription) {
		this.registid = registid;
		this.ano = ano;
		this.arno = arno;
		this.pid = pid;
		this.doctortid = doctortid;
		this.preno = preno;
		this.doctorName = doctorName;
		this.adate = adate;
		this.atime = atime;
		this.gender = gender;
		this.age = age;
		this.qty = qty;
		this.mail = mail;
		this.mnumber = mnumber;
		this.address = address;
		this.specialization = specialization;
		this.status = status;
		this.precription = precription;
	}


	public Integer getRegistid() {
		return registid;
	}
	public void setRegistid(Integer registid) {
		this.registid = registid;
	}
	public Integer getDoctortid() {
		return doctortid;
	}
	public void setDoctortid(Integer doctortid) {
		this.doctortid = doctortid;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public Integer getAno() {
		return ano;
	}


	public void setAno(Integer ano) {
		this.ano = ano;
	}


	public Integer getArno() {
		return arno;
	}


	public void setArno(Integer arno) {
		this.arno = arno;
	}


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public String getAdate() {
		return adate;
	}


	public void setAdate(String adate) {
		this.adate = adate;
	}


	public String getAtime() {
		return atime;
	}


	public void setAtime(String atime) {
		this.atime = atime;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Integer getPreno() {
		return preno;
	}

	public void setPreno(Integer preno) {
		this.preno = preno;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getPrecription() {
		return precription;
	}

	public void setPrecription(String precription) {
		this.precription = precription;
	}

	@Override
	public String toString() {
		return "Doctorpojo [registid=" + registid + ", ano=" + ano + ", arno=" + arno + ", pid=" + pid + ", doctortid="
				+ doctortid + ", preno=" + preno + ", doctorName=" + doctorName + ", adate=" + adate + ", atime="
				+ atime + ", gender=" + gender + ", age=" + age + ", qty=" + qty + ", mail=" + mail + ", mnumber="
				+ mnumber + ", address=" + address + ", specialization=" + specialization + ", status=" + status
				+ ", precription=" + precription + "]";
	}

    

	
	
	

}
