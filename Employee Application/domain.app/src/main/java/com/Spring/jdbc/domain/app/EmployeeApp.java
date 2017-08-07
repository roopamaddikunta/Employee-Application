package com.Spring.jdbc.domain.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeApp {
	
	public static void main(String args[]){
	
		
	//Spring container
	ApplicationContext cfg = new ClassPathXmlApplicationContext("applicationContext.xml");
  
	EmployeeDao empdata = cfg.getBean("empdata",EmployeeDao.class);
	
	empdata.addEmployee(1,"Photography","Liam",200000);
	empdata.addEmployee(2,"Technology","Sammy",600000);
	empdata.addEmployee(3,"Technology","Sam",500000);
	empdata.addEmployee(4,"Finance","Sia",800000);
	empdata.addEmployee(5,"Medicine","Matt",1000000);
	empdata.addEmployee(6,"Science","Daniel",500000);
	
	empdata.deleteEmployee(2);
	
	empdata.editEmployee(1,"medicine");
	System.out.println();
	
	List<Employee> listOfEmployees = empdata.getListOfEmployee();
	for (Employee record : listOfEmployees) {
        System.out.print("Eno : " + record.getEno() );
        System.out.print(", Name : " + record.getName() );
        System.out.print(", Department : " + record.getDepartment());
        System.out.print(", salary : " + record.getSalary());
        System.out.println();
     }
	
	
}
}


/*output:
 * 
added employee data eno : 1  department : Photography  name :Liam  salary : 200000
added employee data eno : 2  department : Technology  name :Sammy  salary : 600000
added employee data eno : 3  department : Technology  name :Sam  salary : 500000
added employee data eno : 4  department : Finance  name :Sia  salary : 800000
added employee data eno : 5  department : Medicine  name :Matt  salary : 1000000
added employee data eno : 6  department : Science  name :Daniel  salary : 500000
deleted from employe eno : 2
Employee updated eno=1 department : medicine

Eno : 3, Name : Sam, Department : Technology, salary : 500000
Eno : 4, Name : Sia, Department : Finance, salary : 500000
Eno : 5, Name : Matt, Department : Medicine, salary : 500000
Eno : 6, Name : Daniel, Department : Science, salary : 500000
Eno : 1, Name : Liam, Department : medicine, salary : 200000
Eno : 3, Name : Sam, Department : Technology, salary : 500000
Eno : 4, Name : Sia, Department : Finance, salary : 800000
Eno : 5, Name : Matt, Department : Medicine, salary : 1000000
Eno : 6, Name : Daniel, Department : Science, salary : 500000
*/
