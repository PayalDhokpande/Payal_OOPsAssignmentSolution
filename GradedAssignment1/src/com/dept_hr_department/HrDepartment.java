package com.dept_hr_department;

import com.dept_super_department.SuperDepartment;

//Hr department inherits SuperDepartement

public class HrDepartment extends SuperDepartment{
	
	public String departmentName() {
		return ("HR Departement");
	}
 
	public String getTodaysWork() {
		return ("Fill today's worksheet and mark your attendance");
	}
	public String getWorkDeadline() {
		return("Complete by EOD");
	}
	public String doActivity() {
		return("team Lunch");
	}
				
	
}
