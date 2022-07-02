package com.dept_tech_department;

import com.dept_super_department.SuperDepartment;
// Tech Department inherits SuperDepartment

public class TechDepartment extends SuperDepartment {

	public String departmentName() {
		return("Tech Department");
	}
	
	public String getTodaysWork() {
		return ("Complete coding of Module 1");
	}
	
	public String getWorkDeadline() {
		return("Complete by EOD");
	}
	public String getTechStackInformation() {
		return ("core Java");
	}
}
