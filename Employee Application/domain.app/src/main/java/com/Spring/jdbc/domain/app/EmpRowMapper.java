package com.Spring.jdbc.domain.app;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee emp = new Employee();
		emp.setEno(rs.getInt("eno"));
		emp.setDepartment(rs.getString("department"));
		emp.setName(rs.getString("name"));
		emp.setSalary(rs.getInt("salary"));
		
		
		
		return emp;
	}
	
	
	

}
