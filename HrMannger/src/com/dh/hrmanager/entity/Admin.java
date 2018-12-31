package com.dh.hrmanager.entity;

import com.dh.hrmanager.util.HrHelper;

public class Admin extends Employee
{
	HrHelper helper = new HrHelper();
	
	public Admin()
	{
		super();
	}
	public Admin(int userId, String empNo, String userName, String password, int deptId, int roleId, double salary)
	{
		super(userId, empNo, userName, password, deptId, roleId, salary);
	}

	
	/**
	 * 修改员工角色
	 * 
	 */
	
	public void modifyEmployeeRole(String empNo, String role)
	{
		helper.modifyEmployeeRole(empNo, role);
		
	}
}
