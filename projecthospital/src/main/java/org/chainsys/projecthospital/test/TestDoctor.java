package org.chainsys.projecthospital.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.chainsys.projecthospital.implement.DoctorImpl;
import org.chainsys.projecthospital.implement.PatientImpl;
import org.chainsys.projecthospital.model.Doctorpojo;
import org.chainsys.projecthospital.model.Patientpojo;
import org.chainsys.projecthospital.validation.Validation;

public class TestDoctor {

	public static void main(String[] args) throws Exception {
		
		DoctorImpl di=new DoctorImpl();
		PatientImpl pi=new PatientImpl();
		Doctorpojo d=new Doctorpojo();
		Validation val=new Validation();
		Scanner s=new Scanner(System.in);
		System.out.println("--login part---");
		System.out.println("Enter Your registration id");
		int id = s.nextInt();

		System.out.println("Enter Your password");
		String pwd1 = s.next();
		
		boolean login=di.login(id, pwd1);
		if(login==true)
		{
			System.out.println("log in sucess......");
			System.out.println("Select ur choice");
			System.out.println("1.Profile");
			System.out.println("2.Give Appoinment");
			System.out.println("3.prescriptiondetails");
			int n=s.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("1.addprofile(1sttime login)");
				System.out.println("2.update");
				System.out.println("3.delete");
				int n1=s.nextInt();
				switch(n1)
				{
				case 1:
					System.out.println("Enter regist id");
					int rid=s.nextInt();
					val.idvalidation(rid);
		            d.setRegistid(rid);
					System.out.println("Enter doctor id ");
					int did=s.nextInt();
					val.pidvalidation(did);
		            d.setDoctortid(did);
					System.out.println("Enter doctor name");
					String dname=s.next();
					val.namevalidation(dname);
				    val.namevalidation1(dname);
		            d.setDoctorName(dname);
					System.out.println("Enter gender");
					String gender1=s.next();
					val.gendervalidation(gender1);
					d.setGender(gender1);
					System.out.println("Enter age");
					int age1=s.nextInt();
					val.agevalidation(age1);
					
		            d.setAge(age1);
					System.out.println("Enter address");
					String address1=s.next();
					d.setAddress(address1);
					System.out.println("Enter mailid");
					String mailid=s.next();
					val.mailvalidation(mailid);
					val.mailvalidation2(mailid);

		            val.dmailvalidation1(mailid);
					d.setMail(mailid);
					System.out.println("Enter mobileno");
					String mno=s.next();
					val.mnovalidation(mno);
		            d.setMnumber(mno);
					System.out.println("Enter Specialization");
					String Specialization=s.next();
					d.setSpecialization(Specialization);
					di.userprofile(d);
					break;
				case 2:
					System.out.println("Enter ur doctorid");
	    			int pid1 = s.nextInt();
	    			d.setDoctortid(pid1);
	    			System.out.println("Enter ur doctorname");
	    			String pname1 = s.next();
	    			d.setDoctorName(pname1);
	    			di.updateProfile(d);
	    			System.out.println("update suceesfull");
	    			break;
				case 3:
					System.out.println("Enter ur doctorid");
	    			int pid2 = s.nextInt();
	    			d.setDoctortid(pid2);
	    			di.removeProfile(d);
	    			System.out.println("removed suceesfull");
	    			break;
	    		default:
	    			System.out.println("give valid choice");
	    			break;
				}
			break;
			case 2:
				System.out.println("Appointment Details");
				List<Patientpojo> appoinment=pi.listofappointmentapp();
				System.out.println("Enter Appointment no");
				int ano=s.nextInt();
				d.setAno(ano);
				System.out.println("Enter Appointmentreq no");
				int arno1=s.nextInt();
				d.setArno(arno1);
				System.out.println("Enter Doctor id");
				int did1=s.nextInt();
				d.setDoctortid(did1);
				boolean login1=di.didcheck(id, did1);
				if(login1==true) {
				System.out.println("Enter patient id");
				int pid1=s.nextInt();
				d.setPid(pid1);
				System.out.println("Enter appointmentdate");
				String adate1=s.next();
				d.setAdate(adate1);
				System.out.println("Enter appointment time");
				String atime1=s.next();
				d.setAtime(atime1);
				System.out.println("Enter status");
				String status=s.next();
				d.setStatus(status);
				di.giveAppointment(d);
				}
				else {
					System.out.println("give Your Doctorid");
				}
				break;
			case 3:
				di.listofappointment(d);
				System.out.println("Enter Prescription no");
				int prno=s.nextInt();
				d.setPreno(prno);
				System.out.println("Enter Appointment no");
				int apno=s.nextInt();
				d.setAno(apno);
				System.out.println("Enter Doctor id");
				int did11=s.nextInt();
				d.setDoctortid(did11);
				boolean login11=di.didcheck(id, did11);
				if(login11==true) {
				System.out.println("Enter Prescription");
				String pre=s.next();
				d.setPrecription(pre);
				System.out.println("Enter Qty");
				int pqty=s.nextInt();
				d.setQty(pqty);
				di.prescriptionsDetail(d);
				}
				else {
					System.out.println("Give Your doctorid ");
				}
				break;

			default:
				System.out.println("give valid choice");
				break;
			}
		
		}
		else
		{
			System.out.println("log in failed");
		}
		

	}

}
