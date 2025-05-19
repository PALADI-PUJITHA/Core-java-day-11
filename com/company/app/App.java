package com.company.app;
import com.company.hr.Employee;
import com.company.admin.Department;
public class App {
	public static void main(String args[]) {
		Employee emp=new Employee();
		emp.setId(123);
		emp.setName("Pujitha");
		emp.setSalary(500000.0);
		Department dept=new Department();
		dept.setDeptName("It");
		dept.setDeptId(1423);
		emp.showEmployeeDetails();
		System.out.println();
		dept.showDepartmentDetails();
	}
}
