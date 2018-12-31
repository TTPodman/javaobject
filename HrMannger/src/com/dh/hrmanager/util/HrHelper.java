package com.dh.hrmanager.util;

import com.dh.hrmanager.entity.Employee;
import com.dh.hrmanager.entity.Report;
import com.dh.hrmanager.view.ModifyEmployeeRole;

public class HrHelper
{
	/**
	 * 返回值是一个Employee对象
	 * @param name
	 * @param password
	 * @return 当前员工类型
	 */
	public Employee login(String name, String password)
	{
		if(name.equals(Data.staff.getUserName()) && password.equals(Data.staff.getPassword()))
		{
			Data.currentEmployee = Data.staff;
		}
		else if(name.equals(Data.manager.getUserName()) && password.equals(Data.manager.getPassword()))
		{
			Data.currentEmployee = Data.manager;
		}
		else if(name.equals(Data.admin.getUserName()) && password.equals(Data.admin.getPassword()))
		{
			Data.currentEmployee = Data.admin;
		}
		else
		{
			System.out.println("错误！");
		}
		return Data.currentEmployee;
	}
	/**
	 * 返回现有的汇报数量
	 * @return count
	 */
	public int getRepotsCount()
	{
		int count = 0;
		for(Report item : Data.reports)
		{
			//如果遍历完现有汇报
			if (item.getReportId()<=0)
			{
				break;
			}
			count ++;
		}
		//返回现有汇报数量
		return count;
	}
	//通过员工id返回员工对象
	public Employee getEmployeeByUserId(int userId)
	{
		if (Data.staff.getUserId()==userId)
		{
			return Data.staff;
		}
		if (Data.manager.getUserId()==userId)
		{
			return Data.manager;
		}
		if (Data.admin.getUserId()==userId)
		{
			return Data.admin;
		}
		return null;
	}
	/**
	 * 显示所有汇报
	 */
	public void displayReports() 
	{
		System.out.println("汇报如下：");
		System.out.println("**************************************");
		for(int i=0; i<Data.reports.length; i++)
		{
			//如果遍历完现有汇报
			if (Data.reports[i]==null)
			{
				break;
			}
			//得到汇报人信息
			Employee employee = getEmployeeByUserId(Data.reports[i].getReporterId());
			if (employee!=null)
			{
				System.out.println("编号："+Data.reports[i].getReportId()+"\t汇报人："+employee.getUserName()+"\t汇报内容："+Data.reports[i].getContent());
				
			}
		}
	}
	/**
	 * 添加汇报
	 */
	public void addReport(Report report)
	{
		//得到当前汇报数量
		int count = getRepotsCount();
		if(count>=Data.reports.length)
		{
			System.out.println("汇报日志已满！");
			return ;
		}
		else 
		{
			Data.reports[count] = report;
			System.out.println("汇报成功！");
			
		}
			
		
	}
	/**
	 * 修改员工角色
	 * @param empNo 员工编号
	 * @param roleName 员工名称
	 * 
	 */
	public void modifyEmployeeRole(String empNo, String roleName)
	{
		int roleId = 0;
		switch(roleName)
		{
		case "Staff":
			roleId = 1;
			break;
		case "Manager":
			roleId = 2;
			break;
		case "Admin":
			roleId = 3;
			break;
			
		default:
			System.out.println("输入的角色名称不存在！");
			break;
			
		}
		
		if(empNo.equals(Data.staff.getEmpNo()))
		{
			Data.staff.setRoleId(roleId);
		}
		else if(empNo.equals(Data.manager.getEmpNo()))
		{
			Data.manager.setRoleId(roleId);
		}
		else if(empNo.equals(Data.admin.getEmpNo()))
		{
			Data.admin.setRoleId(roleId);
		}
		else
		{
			System.out.println("不存在此员工！");
		}
		
	}
	

}











