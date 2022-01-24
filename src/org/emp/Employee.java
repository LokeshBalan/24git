package org.emp;

public class Employee {
public void empId() {
System.out.println("Employee Id is 0405");
}
public void empName() {
System.out.println("Employee Name is Lokesh");
}
public void empDob() {
System.out.println("Employee Dob is on 4th May 2000");
}
public void empPhone() {
System.out.println("Employee Phone No:7401581542");
}
public void empEmail() {
System.out.println("Employee Email Address:lokebooboo@gmai.com");
}
public void empAddress() {
System.out.println("Employee Address:No.2, Ganga Street, Lakshmipuram,Chrompet, Chennai-44");
}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empId();
	e.empName();
	e.empDob();
	e.empPhone();
	e.empEmail();
	e.empAddress();
			
}


}






