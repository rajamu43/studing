package org.chainsys.projecthospital.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.chainsys.projecthospital.implement.RegisterImpl;
import org.chainsys.projecthospital.model.Registrationpojo;
import org.chainsys.projecthospital.validation.Validation;

public class TestRegistar {

	public static void main(String[] args) throws Exception {

		RegisterImpl reg=new RegisterImpl();
		Registrationpojo reg1=new Registrationpojo();
		Validation val=new Validation();

		Scanner s=new Scanner(System.in);
		System.out.println("Welcome SuperClinic Healthcare");
		
    //	System.out.println("Select Your Option");
    	System.out.println("1.Registration");
    	System.out.println("2.Login");
    	int n=s.nextInt();
        switch(n)
       {

		case 1:

			System.out.println("Enter Register Id");
			int id=s.nextInt();
			val.idvalidation1(id);
			val.idvalidation(id);
			reg1.setRegid(id);

			System.out.println("Enter Register Name");
			String rname=s.next();
			val.namevalidation(rname);
			val.namevalidation1(rname);
			reg1.setName(rname);

			System.out.println("Enter Password");
			String pwd=s.next();
			val.pwdvalidation(pwd);
			reg1.setPassword(pwd);
			System.out.println("Enter your Role");
			String role=s.next();
			val.rolevalidation(role);
			reg1.setCatogories(role);
			reg.userRegister(reg1);
			break;
		case 2:
			System.out.println("---login part---");
			System.out.println("Enter Your Register Id");
			int id1 = s.nextInt();

			System.out.println("Enter Your Password");
			String pwd1 = s.next();
			
			boolean login=reg.login(id1, pwd1);
			if(login==true)
			{
				System.out.println("Log in Sucess!........");
				System.out.println("1.Add Profile(1st time login)");
				System.out.println("2.Update");
				System.out.println("3.Remove");
				System.out.println("4.Payment Process");
				System.out.println("5.Check Payment");
				int n1=s.nextInt();
				switch(n1) {
				case 1:
					System.out.println("Enter Register Id");
					int rid=s.nextInt();
					val.idvalidation(rid);
		            reg1.setRegistid(rid);
					System.out.println("Enter Admin Id ");
					int aid=s.nextInt();
					val.aidvalidation(aid);
		            reg1.setAdminid(aid);
					System.out.println("Enter Admin name");
					String aname=s.next();
					val.namevalidation(aname);
				    val.namevalidation1(aname);
	                reg1.setAdminName(aname);
				    System.out.println("Enter Gender");
					String gender1=s.next();
					val.gendervalidation(gender1);
					reg1.setGender(gender1);
					System.out.println("Enter Age");
					int age1=s.nextInt();
					val.agevalidation(age1);
					
		            reg1.setAge(age1);
					System.out.println("Enter Address");
					String address1=s.next();
					val.addressvalidation(address1);
					reg1.setAddress(address1);
					System.out.println("Enter mailid");
					String mailid=s.next();
					val.mailvalidation(mailid);
					val.mailvalidation2(mailid);
	                val.amailvalidation1(mailid);
					reg1.setMail(mailid);
					System.out.println("Enter MobileNo");
					String mno=s.next();
					val.mnovalidation(mno);
		            reg1.setMnumber(mno);
				    reg.userprofile(reg1);
				    break;
				case 2:
					System.out.println("Enter Your AdminId");
	    			int aid1 = s.nextInt();
	    			reg1.setAdminid(aid1);
	    			System.out.println("Enter Your adminname");
	    			String aname1 = s.next();
	    			reg1.setAdminName(aname1);
	    			reg.updateProfile(reg1);
	    			System.out.println("Update Suceesfull!...........");
					break;
				case 3:
					System.out.println("Enter ur Adminid");
	    			int pid2 = s.nextInt();
	    			reg1.setAdminid(pid2);
	    			reg.removeProfile(reg1);
	    			System.out.println("Removed Suceesfull......");
					break;
				case 4:	
					System.out.println("Enter Bill No");
					int bno=s.nextInt();
					reg1.setBillno(bno);
					System.out.println("Enter Patient Id");
					int pid=s.nextInt();
					reg1.setPid(pid);
					System.out.println("Enter Appointmentno");
					int ano=s.nextInt();
					reg1.setApno(ano);
					System.out.println("Enter Doctor Fees");
					int df=s.nextInt();
					reg1.setDfees(df);
					System.out.println("Enter Medicine Fees");
					int mf=s.nextInt();
					reg1.setMfees(mf);
					reg.billAmount(reg1);
					break;
				case 5:
					reg.checkPayment(reg1);
					System.out.println("Enter BillNo");
					int bno1=s.nextInt();
					reg1.setBillno(bno1);
					reg.updatePayment(reg1);
					break;
				default:
				    
				    System.out.println("Give Correct Choice");
				   	break;
			}
		
			}
			else
			{
				System.out.println("Log in failed");
			}
			
			break;
		default:
			System.out.println("Give correct option");
			break;
      }
        

	}
}		
