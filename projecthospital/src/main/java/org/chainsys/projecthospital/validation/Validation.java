package org.chainsys.projecthospital.validation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.chainsys.projecthospital.connection.Connecting;
import org.chainsys.projecthospital.model.Patientpojo;

public class Validation {
	
	public boolean idvalidation(Integer no) throws Exception
	{
		
		String num=Integer.toString(no);
		Pattern pat=Pattern.compile("^\\d{4}$");
		Matcher mat=pat.matcher(num);
		boolean matches=mat.matches();
		if(matches==false)
		{
			throw new Idvalidation();
		}
		return true;
	}
	public boolean idvalidation1(int no) throws Exception
	{
		if(no>0)
		{
			return true;

		}
		else {
			throw new Idvalidation1();
		}
	}
	public boolean agevalidation(int no) throws Exception
	{
		if(no>0)
		{
			return true;

		}
		else {
			throw new AgeValidation();
		}
	}
	public boolean agevalidation1(Integer no) throws Exception
	{
		
		String num=Integer.toString(no);
		Pattern pat=Pattern.compile("^\\d{3}$");
		Matcher mat=pat.matcher(num);
		boolean matches=mat.matches();
		if(matches==false)
		{
			throw new AgeValidation();
		}
		return true;
	}
	public boolean pidvalidation(int no) throws Exception
	{
		String num=Integer.toString(no);
		Pattern pat=Pattern.compile("^\\d{3}$");
		Matcher mat=pat.matcher(num);
		boolean matches=mat.matches();
		if(matches==false)
		{
			throw new PidValidation();
		}
		return true;
	}
	public boolean aidvalidation(Integer no) throws Exception
	{
		String num=Integer.toString(no);
		Pattern pat=Pattern.compile("^\\d{3}$");
		Matcher mat=pat.matcher(num);
		boolean matches=mat.matches();
		if(matches==false)
		{
			throw new Aidvalidation();
		}
		return true;
	}
	
	public boolean namevalidation(String name) throws Exception
	{
		String regex="[a-zA-Z]+";
		Pattern pat1=Pattern.compile(regex);
		Matcher mat1=pat1.matcher(name);
		boolean mat2=mat1.matches();
		if(mat2) {
		return mat2;
		}
		else
		{
			throw new InvalidName();
		}
		
	}
	public boolean namevalidation1(String name) throws Exception
	{
		if(name.length()>=3)
		{
			return true;
		}
		else
		{
			throw new NamelengthValidation();
		}
		
	}
	public boolean addressvalidation(String address)throws Exception
	{
		String regex="^[0-9a-zA-Z\\s,-]+$";
		Pattern pat1=Pattern.compile(regex);
		Matcher mat1=pat1.matcher(address);
		boolean mat2=mat1.matches();
		if(mat2)
		{
			return true;
		}
		else
		{
			throw new AddressValidation();
		}
	}
	public boolean pwdvalidation(String name) throws Exception
	{
		String regex="[a-zA-Z0-9]+";
		Pattern pat1=Pattern.compile(regex);
		Matcher mat1=pat1.matcher(name);
		boolean mat2=mat1.matches();
		if(mat2) {
		return mat2;
		}
		else
		{
			throw new PasswordValidation();
		}
		
	}
	public boolean rolevalidation(String name) throws Exception
	{
		String regex="^admin$|^patient$|^doctor$";
		Pattern pat1=Pattern.compile(regex);
		Matcher mat1=pat1.matcher(name);
		boolean mat2=mat1.matches();
		if(mat2) {
		return mat2;
		}
		else
		{
			throw new Rolevalidation();
		}
		
	}
	public boolean mailvalidation(String mail) throws Exception
	{
		final String EMAIL_PATTERN="^(.+)@(.+)$";
		Pattern pat=Pattern.compile(EMAIL_PATTERN);
		Matcher mat=pat.matcher(mail);
		boolean matches=mat.matches();
		if(matches)
		{
		return matches;
		}
		else {
			throw new MailidValidation();
		}
	}
	public boolean mailvalidation2(String mail) throws Exception
	{
		final String EMAIL_PATTERN="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		Pattern pat=Pattern.compile(EMAIL_PATTERN);
		Matcher mat=pat.matcher(mail);
		boolean matches=mat.matches();
		if(matches)
		{
		return matches;
		}
		else {
			throw new EmailValidation2();
		}
	}
	public boolean mailvalidation1(String mailid) throws Exception
	{
	
		Connection con=Connecting.getconnected();
		//String name2 = null, pwd1 = null;
		String adduser = "select mailid from patientprofile";
		PreparedStatement ps = con.prepareStatement(adduser);
//     	String mail1 = null; 
//		String mail=p.getMail();
	    ResultSet rs = ps.executeQuery();
	    while (rs.next()) {

	    	String mail1 = rs.getString(1);
	    	  if(!mail1.equals(mailid))
	  	    {
	  	    	return true;
	  	    }
	  	    else
	  	    {
	  	    	throw new MailidValidation1();
	  	    }
		  }
	  
		return false;
	}
	public boolean dmailvalidation1(String mailid) throws Exception
	{
	
		Connection con=Connecting.getconnected();
		String adduser = "select mailid from doctorprofile";
		PreparedStatement ps = con.prepareStatement(adduser);
        ResultSet rs = ps.executeQuery();
	    while (rs.next()) {

	    	String mail1 = rs.getString(1);
	    	  if(!mail1.equals(mailid))
	  	    {
	  	    	return true;
	  	    }
	  	    else
	  	    {
	  	    	throw new DmailidValidation();
	  	    }
		  }
	  
		return false;
	}
	public boolean amailvalidation1(String mailid) throws Exception
	{
		Connection con=Connecting.getconnected();
		String adduser = "select mailid from adminprofile";
		PreparedStatement ps = con.prepareStatement(adduser);
        ResultSet rs = ps.executeQuery();
	    while (rs.next()) {

	    	String mail1 = rs.getString(1);
	    	  if(!mail1.equals(mailid))
	  	    {
	  	    	return true;
	  	    }
	  	    else
	  	    {
	  	    	throw new AmailidValidation();
	  	    }
		  }
		return false;
		
	}
	public boolean cardvalidation(long cardno) throws CardValidation
	{
		String num=Long.toString(cardno);
	//	String regex="^[0-9]{16}$";
		Pattern pat1=Pattern.compile("^[0-9]{16}$");
		Matcher mat1=pat1.matcher(num);
		boolean mat2=mat1.matches();
		if(mat2==false) {
			throw new CardValidation();
		}
		return mat2;
		
	}
	public boolean upivalidation(long upino) throws UpiValidation
	{
		String num=Long.toString(upino);
	//	String regex="^[0-9]{16}$";
		Pattern pat1=Pattern.compile("^[0-9]{10}$");
		Matcher mat1=pat1.matcher(num);
		boolean mat2=mat1.matches();
		if(mat2==false) {
			throw new UpiValidation();
		}
		return mat2;
		
	}
	public boolean mnovalidation(String mno) throws Exception
	{
		String regex="^[0-9]{10}$";
		Pattern pat1=Pattern.compile(regex);
		Matcher mat1=pat1.matcher(mno);
		boolean mat2=mat1.matches();
		if(mat2) {
		return mat2;
		}
		else {
			throw new MnoValidation();
		}
		
	}
	public boolean gendervalidation(String gen) throws Exception
	{
		String regex="^male$|^female$";
		Pattern pat1=Pattern.compile(regex);
		Matcher mat1=pat1.matcher(gen);
		boolean mat2=mat1.matches();
		if(mat2) {
		return mat2;
		}
		else {
			throw new GenderValidation();
		}
		
	}
	public boolean appdateValidation(String date)throws Exception
	{
		Pattern pat=Pattern.compile("([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))");
		Matcher mat=pat.matcher(date);
		boolean matches=mat.matches();
		if(matches) {
			return true;
		}
		else
			throw new Datevalidation();
	}
//	public boolean appdateValidation1(String date)throws Exception
//	{
//		Pattern pat=Pattern.compile("^(?:0[1-9]|[12][0-9]|3[01])[-/.](?:0[1-9]|1[012])[-/.](?:2023\\d{2}|20[22][0-9]|2023)\\b");
//		Matcher mat=pat.matcher(date);
//		boolean matches=mat.matches();
//		if(matches) {
//			return true;
//		}
//		else
//			throw new Datevalidation();
//	}
//	public boolean idvalidation(int no) throws Exception
//	{
//		int regex="^[0-9]$";
//		Pattern pat1=Pattern.compile(regex);
//		Matcher mat1=pat1.matcher(no);
//		boolean mat2=mat1.matches();
//		if(mat2) {
//		return mat2;
//		}
//		else {
//			throw new Exception("give positive no only");
//		}
//	}
}
