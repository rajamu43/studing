package org.chainsys.projecthospital.model;

public class Patientpojo {
	
	private Integer registid;
	private Integer patientid,preqno,doctorid;
	private String patientName,doctorName;
	private String gender;
	private String date;
	private Integer age;
	private String mail;
	private String mnumber;
	private String address;
	private String diseaes;
	public Patientpojo() {
	
	}
	
	
	public Patientpojo(Integer registid, Integer patientid, Integer preqno, Integer doctorid, String patientName,
			String doctorName, String gender, String date, Integer age, String mail, String mnumber, String address,
			String diseaes) {
		this.registid = registid;
		this.patientid = patientid;
		this.preqno = preqno;
		this.doctorid = doctorid;
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.gender = gender;
		this.date = date;
		this.age = age;
		this.mail = mail;
		this.mnumber = mnumber;
		this.address = address;
		this.diseaes = diseaes;
	}
	public Integer getRegistid() {
		return registid;
	}
	public void setRegistid(Integer registid) {
		this.registid = registid;
	}
	public Integer getPatientid() {
		return patientid;
	}
	public void setPatientid(Integer patientid) {
		this.patientid = patientid;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
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
	public String getDiseaes() {
		return diseaes;
	}
	public void setDiseaes(String diseaes) {
		this.diseaes = diseaes;
	}
	
	public Integer getPreqno() {
		return preqno;
	}


	public void setPreqno(Integer preqno) {
		this.preqno = preqno;
	}


	public Integer getDoctorid() {
		return doctorid;
	}


	public void setDoctorid(Integer doctorid) {
		this.doctorid = doctorid;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Patientpojo [registid=" + registid + ", patientid=" + patientid + ", preqno=" + preqno + ", doctorid="
				+ doctorid + ", patientName=" + patientName + ", doctorName=" + doctorName + ", gender=" + gender
				+ ", date=" + date + ", age=" + age + ", mail=" + mail + ", mnumber=" + mnumber + ", address=" + address
				+ ", diseaes=" + diseaes + "]";
	}


	
	
	

}
