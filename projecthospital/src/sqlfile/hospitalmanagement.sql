create table registration(registrationid integer not null primary key,registname varchar(50)not null unique,password varchar(30) not null,catogories varchar(30) not null);
select * from registration;

create table patientprofile(regid integer,patientid integer not null primary key,patientname varchar(50)not null,
gender varchar(10),age integer,address varchar2(50),mailid varchar(50),mobileNo number(10),
disease varchar2(50)not null,CONSTRAINT registrationid_fk FOREIGN KEY (regid)REFERENCES registration);
select * from patientprofile;
select * from patientprofile where regid=5;
select patientid from patientprofile;
create table appointmentappication(appointmentreqno integer not null primary key,appointmentdate date,patientid integer not null, 
patientname varchar2(30),
doctorid integer,doctorname varchar2(30),disease varchar2(30),
CONSTRAINT patientid_fk foreign key (patientid) REFERENCES patientprofile,
CONSTRAINT doctorid_fk FOREIGN KEY (doctorid) REFERENCES doctorprofile); 
select * from appointmentappication;
commit;

create table doctorprofile(regid integer,doctorid integer not null primary key,doctorname varchar(50)not null,
gender varchar(10),age integer,address varchar2(50),mailid varchar(50),mobileNo number(10),
specialization varchar2(50)not null,CONSTRAINT registrationid1_fk FOREIGN KEY (regid)REFERENCES registration);
select * from doctorprofile;

--create table appointmentdetails(appointmentno integer not null primary key,appointmentreqno integer ,doctorid integer,patientid integer,appointmentdate date,
--appointmenttime date ,status varchar2(20),
--CONSTRAINT doctorid2_fk FOREIGN key (doctorid)REFERENCES doctorprofile,
--CONSTRAINT patientid2_fk FOREIGN KEY (patientid)REFERENCES patientprofile,
--CONSTRAINT appointmentreqno_fk FOREIGN KEY (appointmentreqno)REFERENCES appointmentdetails);
--select * from appointmentdetails;
create table adminprofile(regid integer,adminid integer not null primary key,adminname varchar(50)not null,
gender varchar(10),age integer,address varchar2(50),mailid varchar(50),mobileNo number(10),
CONSTRAINT registrationid2_fk FOREIGN KEY (regid)REFERENCES registration);
select * from adminprofile;
--
--create table prescriptiondetails(precriptionno integer not null primary key,appointmentno integer,doctorid INTEGER,
--precription varchar2(100)not null,qty integer,
--CONSTRAINT appoinmentno_fk FOREIGN key (appointmentno)REFERENCES appointmentdetails,
--CONSTRAINT doctorid3_fk foreign key (doctorid)REFERENCES doctorprofile);
--select * from prescriptiondetails;
create table prescriptiondetails1(precriptionno integer not null primary key,appointmentno integer,doctorid INTEGER,
precription varchar2(100)not null,qty integer,
CONSTRAINT appoinmentno1_fk FOREIGN key (appointmentno)REFERENCES appointmentdetails1,
CONSTRAINT doctorid31_fk foreign key (doctorid)REFERENCES doctorprofile);
select * from prescriptiondetails1;
create table appointmentdetails1(appointmentno integer not null primary key,appointmentreqno integer ,doctorid integer,
patientid integer,appointmentdate date,
appointmenttime varchar(20) ,status varchar2(20),
CONSTRAINT doctorid21_fk FOREIGN key (doctorid)REFERENCES doctorprofile,
CONSTRAINT patientid21_fk FOREIGN KEY (patientid)REFERENCES patientprofile,
CONSTRAINT appointmentreqno21_fk FOREIGN KEY (appointmentreqno)REFERENCES appointmentappication);

select * from appointmentdetails1;

create table billamount(billno integer not null primary key,patientid integer,appointmentno integer,
doctorfees integer,medicinefees integer,payamount integer,
CONSTRAINT patientid22_fk FOREIGN KEY (patientid)REFERENCES patientprofile,
CONSTRAINT appoinmentno22_fk FOREIGN key (appointmentno)REFERENCES appointmentdetails1);
select * from billamount;
alter table billamount add paymentstatus varchar(50);
select billno,patientid,appointmentno,doctorfees,medicinefees,payamount from billamount where billno=456;
create table paymentdetails(billno Integer,paymentmode varchar2(50),cardorupino number(16),amount integer,
CONSTRAINT billno1_fk FOREIGN KEY (billno)REFERENCES billamount);
select * from paymentdetails;
update paymentdetails set cardorupino=9023433423 where billno=456;
--insert into appointmentappication(appointmentreqno,appointmentdate,patientid,patientname,doctorid,doctorname,disease)values
--(143,2023-01-04,105,sekar,71,ranjan,fevar);
--insert into appointmentappication values(143,'04-01-2023',105,'sekar',71,'ranjan','fever');
--SELECT * FROM appointmentappication; 