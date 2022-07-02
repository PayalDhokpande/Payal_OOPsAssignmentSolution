package com.dept_main;

import com.dept_admin_department.AdminDepartment;
import com.dept_hr_department.HrDepartment;
import com.dept_tech_department.TechDepartment;

public class DriverClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating objects for admin, HR, and Tech Department to driver class
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();

		System.out.println("\nWelcome to " + admin.departmentName());
		System.out.println( admin.getTodaysWork());
		System.out.println( admin.getWorkDeadline());
		System.out.println( admin.isTodayAHoliday());
		
		
		System.out.println("\nWelcome to " + hr.departmentName());
		System.out.println( hr.doActivity());
		System.out.println( hr.getTodaysWork());
		System.out.println( hr.getWorkDeadline());	
		System.out.println( hr.isTodayAHoliday());
		
		System.out.println("\nWelcome to " + tech.departmentName());
		System.out.println( tech.getTodaysWork());
		System.out.println( tech.getWorkDeadline());
		System.out.println( tech.getTechStackInformation());
		System.out.println( tech.isTodayAHoliday());
	}

}
