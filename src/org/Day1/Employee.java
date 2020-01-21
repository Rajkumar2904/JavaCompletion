package org.Day1;

import org.Day2.CompanyInfo;

final class Employee extends CompanyInfo {
public void EmpId() {
	System.out.println("EmpId:1415168");
}
protected void EmpName() {
	System.out.println("Name: Rajkumar JS");
}
static void EmpDob() {
	System.out.println("Dob:29/04/1997");
	}
private void EmpPhone() {
	System.out.println("Phone:7010942059");
	}
public static void main(String[] args) {
	Employee e=new Employee();
	e.EmpId();
	e.EmpName();
	e.EmpPhone();
	EmpDob();
	System.out.println();
	GreensTech g=new GreensTech();
	g.greensOmr();
	g.greensAdyar();
	GreensTech.greensTambaram();
    //private
	//g.greensVelachery();
    System.out.println();
    e.companyName();
    e.companyId();
    
	
}
}
