package com.dh.hrmanager.util;

import com.dh.hrmanager.entity.Admin;
import com.dh.hrmanager.entity.Employee;
import com.dh.hrmanager.entity.Manager;
import com.dh.hrmanager.entity.Report;
import com.dh.hrmanager.entity.Staff;

public class Data
{
	public static Employee currentEmployee;
	//角色值1代表普通员工角色，2代表经理角色，3代表管理员角色
	//部门值1代表市场部，2代表开发部，3代表信息部
	//下面实例普通员工
	public static Staff staff = new Staff(1, "DH001", "Staff", "Staff", 2, 1, 3000.5);
	//下面实例部门经理
	public static Manager manager = new Manager(2, "DH003", "Manager", "Manager", 2, 2, 5000.5);
	//下面实例管理员
	public static Admin admin = new Admin(3, "DH003", "Admin", "Admin", 2, 3, 4000.5); 
	
	//存储员工汇报内容
	public static Report[] reports = new Report[1000];
	//初始化数据方法init()
	public static void init()
	{
		for(int i=0; i<reports.length; i++)
		{
			reports[i] = new Report();
		}
	}
	

}
















