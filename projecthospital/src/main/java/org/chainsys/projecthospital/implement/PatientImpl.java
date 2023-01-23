package org.chainsys.projecthospital.implement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.chainsys.projecthospital.connection.Connecting;
import org.chainsys.projecthospital.inter.PatientInter;
import org.chainsys.projecthospital.model.Doctorpojo;
import org.chainsys.projecthospital.model.Patientpojo;
import org.chainsys.projecthospital.model.Registrationpojo;
import org.chainsys.projecthospital.validation.Validation;

public class PatientImpl implements PatientInter {

	

	public boolean login(int id, String password) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();
		Patientpojo p=new Patientpojo();
		int regid=0,pid=0,regid1=0;
		String pword=null,role1=null;
		
		String log="select registrationid,password,catogories from registration where registrationid=?";
		PreparedStatement ps=con.prepareStatement(log);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			regid=rs.getInt("registrationid");
			pword=rs.getString("password");
			role1=rs.getString("catogories");
		}
		if((regid==id)&&(pword.equals(password))&&(role1.equals("patient")))
		
		return true;
		
		else
		return false;
		
	}
	public boolean pidcheck(int id,int crid) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();
		Patientpojo p=new Patientpojo();
		int pid=0,regid1=0;
		String check="select regid,patientid from patientprofile where regid=?";
		PreparedStatement ps1=con.prepareStatement(check);
		ps1.setInt(1, id);
		ResultSet rs1=ps1.executeQuery();
		while(rs1.next()) {
			regid1=rs1.getInt("regid");
			pid=rs1.getInt("patientid");
		}
		if((regid1==id)&&(pid==crid))
		
			return true;
		else
		return false;
	}
   public void userprofile(Patientpojo p) throws ClassNotFoundException, SQLException,Exception {
		Connection con=Connecting.getconnected();

		String addprofile="insert into patientprofile(regid,patientid,patientname,gender,age,address,mailid,mobileNo,disease)values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(addprofile);
		
		
		   ps.setInt(1, p.getRegistid());
	       ps.setInt(2, p.getPatientid());
		   ps.setString(3, p.getPatientName());
	       ps.setString(4, p.getGender());
           ps.setInt(5, p.getAge());
	       ps.setString(6, p.getAddress());
	       ps.setString(7, p.getMail());
           ps.setString(8, p.getMnumber());
	       ps.setString(9,p.getDiseaes());
        
        int row=ps.executeUpdate();
        System.out.println("****Profile added****");
		
	}
   public int updateProfile(Patientpojo m) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();

		Integer row=null;

		String query="update patientprofile set patientname=? where patientid=?";
		PreparedStatement ps = con.prepareStatement(query);
		int uid=m.getPatientid();
		String name=m.getPatientName();
        ps.setInt(2, uid);
		ps.setString(1,name);
		  row=ps.executeUpdate();
		return row;
	}
   public int removeProfile(Patientpojo m) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();
		Integer row=null;
		String query="delete from patientprofile where patientid=?";
		PreparedStatement ps = con.prepareStatement(query);
		int uid=m.getPatientid();
		
		ps.setInt(1, uid);
		  row=ps.executeUpdate();
		return row;
	}
   public int applyappointment(Patientpojo m) throws ClassNotFoundException, SQLException {
	Connection con=Connecting.getconnected();

    
	String appointment="insert into appointmentappication(appointmentreqno,appointmentdate,patientid,patientname,doctorid,doctorname,disease)values(?,?,?,?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(appointment);
	Integer row=null;
	
	 ps.setInt(1, m.getPreqno());
	 ps.setDate(2, Date.valueOf(m.getDate()));
	 ps.setInt(3, m.getPatientid());
	 ps.setString(4, m.getPatientName());
	 ps.setInt(5, m.getDoctorid());
	 ps.setString(6, m.getDoctorName());
	 ps.setString(7, m.getDiseaes());
	
	  row=ps.executeUpdate();
	 System.out.println("****appointment added****");

	return row;
  }
   public List<Patientpojo> listofappointmentapp() throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();
		String apply="select appointmentreqno,appointmentdate,patientid,patientname,doctorid,doctorname,disease from appointmentappication";
		PreparedStatement ps2 = con.prepareStatement(apply);
        int arno1,apid,adid;
		String adate,apname,adname,adisease;
		ArrayList<Patientpojo> list1 = new ArrayList<Patientpojo>();
		ResultSet rsq = ps2.executeQuery();
        while(rsq.next()) {
        	arno1=rsq.getInt("appointmentreqno");
        	adate=rsq.getString("appointmentdate");
        	apid=rsq.getInt("patientid");
        	apname=rsq.getString("patientname");
        	adid=rsq.getInt("doctorid");
        	adname=rsq.getString("doctorname");
        	adisease=rsq.getString("disease");
        
        	System.out.println("Reqno "+arno1+"\t" + "appointmentdate "+adate+"\t"+"patient id "+apid+"\t"+"patientname"+apname+" \t"+"Doctorid "+adid+"\t"+"Doctorname"+adname+"\t"+"Disease"+adisease);

        }

	return list1;
  }
  public int billdetails(Registrationpojo r) throws ClassNotFoundException, SQLException {
	  Connection con=Connecting.getconnected();
	  String apply="select billno,patientid,appointmentno,doctorfees,medicinefees,payamount from billamount";
	  PreparedStatement ps2 = con.prepareStatement(apply);
	  int bno,paid,apno,dof,mef,pamount;
	  ResultSet rs=ps2.executeQuery();
	  while(rs.next()) {
		  bno=rs.getInt(1);
		  paid=rs.getInt(2);
		  apno=rs.getInt(3);
		  dof=rs.getInt(4);
		  mef=rs.getInt(5);
		  pamount=rs.getInt(6);
		  System.out.println("Billno "+bno+" "+"patient id "+paid+" "+"AppointmentNo "+apno+" "+"Doctorfees "+dof+" "+"Medicinefees "+mef+" "+"Payamount"+pamount);
	  }
	 return 0;
  }
  public int paymentBill(Registrationpojo r,int bno) throws ClassNotFoundException, SQLException {
	  Connection con=Connecting.getconnected();

	  String log="select billno,patientid,appointmentno,doctorfees,medicinefees,payamount from billamount where billno=?";
	  PreparedStatement ps=con.prepareStatement(log);
	  int bno1,paid,apno,dof,mef,pamount;
      ResultSet rs=ps.executeQuery();
      while(rs.next()) {
    	  bno=rs.getInt(1);
		  paid=rs.getInt(2);
		  apno=rs.getInt(3);
		  dof=rs.getInt(4);
		  mef=rs.getInt(5);
		  pamount=rs.getInt(6);
      }
      
	return 0;
  }
public void listofprescription() throws ClassNotFoundException, SQLException {
	 Connection con=Connecting.getconnected();

	  String pres="select precriptionno,appointmentno,doctorid,precription,qty from prescriptiondetails1";
	  PreparedStatement ps=con.prepareStatement(pres);
	 int prno,ano,did,qty;
	 String pre;
	 ResultSet rs=ps.executeQuery();
	 while(rs.next()) {
		 prno=rs.getInt(1);
		 ano=rs.getInt(2);
		 did=rs.getInt(3);
		 pre=rs.getString(4);
		 qty=rs.getInt(5);
		 ArrayList list=new ArrayList();
		 list.add(prno);
		 list.add(ano);
		 list.add(did);
		 list.add(pre);
		 list.add(qty);
		 System.out.println(list);
	 }
}
  



	

}
