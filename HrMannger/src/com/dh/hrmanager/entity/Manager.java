package com.dh.hrmanager.entity;

import com.dh.hrmanager.util.HrHelper;

public class Manager extends Employee
{
	HrHelper helper = new HrHelper();
	
	public Manager() 
	{
		super();
	}
	public Manager(int userId, String empNo, String userName, String password, int deptId, int roleId, double salary)
	{
		super(userId, empNo, userName, password, deptId, roleId, salary);
	}
	//显示所有汇报
	public void displayReports()
	{
		helper.displayReports();
	}
}
