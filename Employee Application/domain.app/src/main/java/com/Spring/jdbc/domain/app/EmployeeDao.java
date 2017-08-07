package com.Spring.jdbc.domain.app;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	
@Autowired JdbcTemplate jdbcTemplate;
	


public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}




	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//Edit Employee 
	
	public void editEmployee(Integer eno, String department){
		 this.jdbcTemplate.update("update employee set department = ? where eno = ?", department, eno
				);
		System.out.println("Employee updated eno=" +eno + " department : "+ department );
	}
	
	//List Employees
	public List<Employee> getListOfEmployee(){
		return this.jdbcTemplate.query("select * from employee", new EmpRowMapper());
		
		}

	//To delete Employee
	public void deleteEmployee(Integer eno){
		this.jdbcTemplate.update(
		        "delete from employee where eno = ?",
		       eno);
		System.out.println("deleted from employe eno : " +eno );
	}

	//Add Employee
	public void addEmployee(Integer eno,String department,String name, Integer salary){
		this.jdbcTemplate.update("insert into employee (eno,department,name,salary) values (?,?,?,?)",eno,department,name,salary);
	System.out.println("added employee data eno : " +eno +"  department : " + department + "  name :"  +name +"  salary : " +salary);
	}
	
}