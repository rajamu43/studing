package org.chainsys.projecthospital.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.chainsys.projecthospital.implement.AdminImpl;
import org.chainsys.projecthospital.model.Adminpojo;

public class TestAdmin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		AdminImpl ai=new AdminImpl();
		Adminpojo a=new Adminpojo();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ur id");
		int id = s.nextInt();

		System.out.println("Enter ur password");
		String pwd1 = s.next();
		
		boolean login=ai.login(id, pwd1);
		if(login==true)
		{
			System.out.println("log in sucess");
			System.out.println("Enter regist id");
			int rid=s.nextInt();
			a.setRegistid(rid);
			System.out.println("Enter admin id ");
			int aid=s.nextInt();
			a.setAdminid(aid);
			System.out.println("Enter admin name");
			String aname=s.next();
			a.setAdminName(aname);
			System.out.println("Enter gender");
			String gender1=s.next();
			a.setGender(gender1);
			System.out.println("Enter age");
			int age1=s.nextInt();
			a.setAge(age1);
			System.out.println("Enter address");
			String address1=s.next();
			a.setAddress(address1);
			System.out.println("Enter mailid");
			String mailid=s.next();
			a.setMail(mailid);
			System.out.println("Enter mobileno");
			String mno=s.next();
			a.setMnumber(mno);
		
			ai.userprofile(a);
		}
		else
		{
			System.out.println("log in failed");
		}
		System.out.println(login);
		System.out.println("check");

	}

}
