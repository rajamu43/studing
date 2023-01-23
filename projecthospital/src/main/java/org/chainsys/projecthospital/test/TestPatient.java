package org.chainsys.projecthospital.test;

import java.util.List;
import java.util.Scanner;

import org.chainsys.projecthospital.implement.DoctorImpl;
import org.chainsys.projecthospital.implement.PatientImpl;
import org.chainsys.projecthospital.implement.RegisterImpl;
import org.chainsys.projecthospital.model.Doctorpojo;
import org.chainsys.projecthospital.model.Patientpojo;
import org.chainsys.projecthospital.model.Registrationpojo;
import org.chainsys.projecthospital.validation.Validation;

public class TestPatient {

	public static void main(String[] args) throws Exception {
		
		PatientImpl pi=new PatientImpl();
		Patientpojo p=new Patientpojo();
		Validation val=new Validation();
		DoctorImpl di=new DoctorImpl();
		RegisterImpl ri=new RegisterImpl();
		Registrationpojo rp=new Registrationpojo();
		Scanner s=new Scanner(System.in);
		System.out.println("---Patient login part---");
		 System.out.println("Enter Your Id");
		  int id = s.nextInt();

		System.out.println("Enter Your Password");
		String pwd1 = s.next();
		boolean login=pi.login(id, pwd1);
		if(login==true)
		{
			System.out.println("Log in sucess.....");
			System.out.println("Select Your Choice");
			System.out.println("1.Profile");
			System.out.println("2.Apply appointment");
			System.out.println("3.Billpayment");
			System.out.println("4.Prescription Details");
			int n=s.nextInt();
			switch(n) {
			 case 1:
				System.out.println("1.Addprofile(1sttime login)");
				System.out.println("2.Update");
				System.out.println("3.Delete");
				int n1=s.nextInt();
				switch(n1) {
				case 1:
					System.out.println("Enter Regist Id");
					int rid=s.nextInt();
					val.idvalidation(rid);
					p.setRegistid(rid);
					System.out.println("Enter Patient Id ");
					int pid=s.nextInt();
					val.pidvalidation(pid);
					p.setPatientid(pid);
					System.out.println("Enter Patient Name");
					String pname=s.next();
					val.namevalidation(pname);
					 val.namevalidation1(pname);
                    p.setPatientName(pname);
					System.out.println("Enter Gender");
					String gender1=s.next();
					val.gendervalidation(gender1);
					p.setGender(gender1);
					System.out.println("Enter Age");
					int age1=s.nextInt();
					val.agevalidation(age1);
					
					p.setAge(age1);
					System.out.println("Enter Address");
					String address1=s.next();
					p.setAddress(address1);
					System.out.println("Enter Mailid");
					String mailid=s.next();
					val.mailvalidation(mailid);
					val.mailvalidation2(mailid);
					val.mailvalidation1(mailid);
					p.setMail(mailid);
					System.out.println("Enter MobileNo");
					String mno=s.next();
					val.mnovalidation(mno);
					p.setMnumber(mno);
					System.out.println("Enter Diseaes");
					String diseae=s.next();
					p.setDiseaes(diseae);
					pi.userprofile(p);
					break;
				case 2:
					System.out.println("Enter Your pid");
	    			int pid1 = s.nextInt();
	    			p.setPatientid(pid1);;
	    			System.out.println("Enter Your pname");
	    			String pname1 = s.next();
	    			p.setPatientName(pname1);
	    			pi.updateProfile(p);
	    			System.out.println("update suceesfull....");
	    			break;
				case 3:
		            	System.out.println("Enter ur pid");
		    			int pid2 = s.nextInt();
		    			p.setPatientid(pid2);
		    			pi.removeProfile(p);
		    			System.out.println("removed suceesfull....");
		    			break;
		    		default:
		    			System.out.println("give correct choice");
		    			break;
				}
				break;
			 case 2:
				 System.out.println("****Doctor details****");
			       di.listofdoctors();
					System.out.println("Enter appointmentreq no");
					int arn=s.nextInt();
					p.setPreqno(arn);
					System.out.println("Enter appointment date");
					String adate=s.next();
					val.appdateValidation(adate);
					//val.appdateValidation1(adate);
					p.setDate(adate);
					System.out.println("Enter patient id");
					int pid=s.nextInt();
					p.setPatientid(pid);
					boolean login1=pi.pidcheck(id, pid);
					if(login1==true) {
//						System.out.println("pid verfied");
					System.out.println("Enter patient name");
					String pname=s.next();
					p.setPatientName(pname);
					System.out.println("Enter doctor id");
					int did=s.nextInt();
					p.setDoctorid(did);
					System.out.println("Enter doctor name");
					String dname=s.next();
					p.setDoctorName(dname);
					System.out.println("Enter disease");
					String di1=s.next();
					p.setDiseaes(di1);
					pi.applyappointment(p);
					}
					else {
						System.out.println("give Your Patientid");
					}
					break;
			 case 3:
				 pi.billdetails(rp);
				 System.out.println("Enter Your BillNo");
				 int bill=s.nextInt();
				 rp.setBillno(bill);
				 System.out.println("Select Payment mode"+"\n"+"1.Upipayment"+"\n"+"2.cardpayment");
				 int choose=s.nextInt();
				 if(choose==1)
				 {
					 rp.setPaymode("upipayment");
					 System.out.println("Enter Upi no");
					 long uno=s.nextLong();
					 
					 rp.setPayno(uno);
					 System.out.println("Enter Bill Amount");
					 int ba=s.nextInt();
					 rp.setAmount(ba);
					 ri.paymentdetails(rp);
				 }
				 else if(choose==2)
				 {
					 rp.setPaymode("cardpayment");
					 System.out.println("Enter card no");
					 long cno=s.nextLong();
					 val.cardvalidation(cno);
					 rp.setPayno(cno);
					 System.out.println("Enter Bill Amount");
					 int ba=s.nextInt();
					 rp.setAmount(ba);
					 ri.paymentdetails(rp);
				 }
				 
				 else {
					 System.out.println("Choose Correct Payment Mode");
				 }
				 
				 break;
			 case 4:
				 pi.listofprescription();
				 break;
			 default:
				 System.out.println("give correct option");
				 break;
			}
			
		}
		else
		{
				System.out.println("log in failed");
		}

	}

}
