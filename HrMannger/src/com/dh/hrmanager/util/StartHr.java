package com.dh.hrmanager.util;

import java.util.Scanner;

import com.dh.hrmanager.entity.Employee;

public class StartHr
{

	public static void main(String[] args)
	{
		
		//角色1值代表普通员工角色，2代表经理角色，3代表管理员角色
		//部门值1代表市场部，2代表开发部，3代表信息部
		
		//实例化普通员工
		Employee staff = new Employee(1, "DH001", "Staff", "Staff", 2, 1, 3000.5);
		//实例化部门经理
		Employee manager = new Employee(2, "DH002", "Manager", "Manager", 2, 2, 6000.5);
		// 实例化管理员
		Employee admin = new Employee(3, "DH003", "Admin", "Admin", 2, 3, 4000.5);
		
		//实例化业务逻辑类
		HrHelper helper = new HrHelper();
		//初始化数据
		Data.init();
		
		//实例化菜单
		Menu menu = new Menu();
		//显示登陆主菜单
		menu.showLoginMenu();
		//循环标志位
		boolean flag = true;
		
		Scanner input = new Scanner(System.in);
		while(flag) 
		{
			int choice = input.nextInt();
			//根据输入不同的选项进行不同的功能选择操作
			switch(choice)
			{
			case 1:
				System.out.println("请输入用户名：");
				String userName = input.next();
				System.out.println("请输入密码：");
				String password = input.next();
				//判断，如果是普通员工
				if(userName.equals(staff.getUserName()) && password.equals(staff.getPassword()))
				{
					//显示普通员工功能菜单
					menu.showStaffMenu();
				}
				//判断，如果是经理
				else if(userName.equals(manager.getUserName()) && password.equals(manager.getPassword()))
				{
					//显示经理功能菜单
					menu.showManagerMenu();
				}
				//判断，如果是管理员
				else if(userName.equals(admin.getUserName()) && password.equals(admin.getPassword()))
				{
					//显示管理员功能菜单
					menu.showAdminMenu();
				}
				else
				{
					System.out.println("用户名或者密码不正确，请重新输入选项数字：");
				}
				break;
				
			case 2:
				System.out.println("本功能将在后面的实践篇实现，现在请选择其他选项");
				menu.showLoginMenu();
				break;
				
			case 3:
				flag = false;
				System.out.println("您选择了退出系统！");
				break;
				
			default:
				System.out.println("输入选项编号不正确，请重新输入数字：");
				
		
			}//switch
			
			if(!flag)
			{
				break;
			}
			
		}
	}
}








