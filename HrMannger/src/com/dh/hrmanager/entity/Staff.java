package com.dh.hrmanager.entity;

import java.util.Scanner;

import com.dh.hrmanager.util.Data;
import com.dh.hrmanager.util.HrHelper;

public class Staff extends Employee
{
	HrHelper helper = new HrHelper();
	
	public Staff()
	{
		
	}
	public Staff(int userId, String empNo, String userName, String password, int deptId, int roleId, double salary)
	{
		super(userId, empNo, userName, password, deptId, roleId, salary);
	}
	
	
	
	public void addReport()
	{
		System.out.println("请输入回报信息：");
		Scanner input = new Scanner(System.in);
		String content = input.next();
		//实例化report对象
		Report report = new Report();
		//汇报id
		report.setReportId(helper.getRepotsCount()+1);
		report.setContent(content);
		//设置汇报人id
		report.setReporterId(Data.currentEmployee.getUserId());
		//加入汇报数组
		helper.addReport(report);
	}
	
}









