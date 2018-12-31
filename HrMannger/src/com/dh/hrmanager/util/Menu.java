package com.dh.hrmanager.util;

import java.util.Scanner;

import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;

public class Menu
{

	Scanner input = new Scanner(System.in);
	//其他省略
	/**
	 * 返回登陆系统
	 */
	private void returnLoginMenu(Scanner input)
	{
		boolean flag = true;
		do
		{
			String num = input.next();
			if(num.toUpperCase().equals("R"))
			{
				flag = false;
				showLoginMenu();
				break;
			}
			else
			{
				System.out.println("具体功能是西安将在后面的实践篇实现，"
						+ "现在请输入r/R返回登陆菜单");
			}
		} while (flag);
	}
	/**
	 * 普通员工菜单
	 */
	
	public void showStaffMenu()
	{
		System.out.println("人力资源管理系统=>普通员工");
		System.out.println("**************************************\n");
		System.out.println("\t\t\t 1、汇报工作\n");
		System.out.println("\t\t\t 2、查看个人信息\n");
		System.out.println("\t\t\t 3、修改密码\n");
		System.out.println("\t\t\t 4、查看评测\n");
		System.out.println("\t\t\t 5、工资范畴\n");
		System.out.println("\t\t\t 6、今日工作\n");
		System.out.println("\t\t\t 7、在线工作交流\n");
		System.out.println("**************************************\n");
		System.out.println("请输入菜单项数字的或者输入r/R返回上一菜单");
		boolean flag = true;
		do
		{
			String num = input.next();
			switch(num)
			{
			case "1":
				//汇报工作代码
				Data.staff.addReport();
				//重新显示员工菜单
				showStaffMenu();
				flag = false;
				break;
			case "2":
				//显示个人信息代码
				Data.staff.displayInfo();
				showStaffMenu();
				flag = false;
				break;
			case "3":
				//修改个人密码代码
				System.out.println("请输入新密码：");
				String newPassword = input.next();
				Data.staff.modifyPassword(newPassword);
				showStaffMenu();
				flag = false;
				break;
			case "4":
				//查看评测成绩
				break;
			case "5":
				//查看工资范畴
				break;
			case "6":
				//查看今日工作
				break;
			case "7":
				//在线工作交流
				break;
			case "r":
			case "R":
				flag = false;
				showLoginMenu();
				break;
			default:
				System.out.println("输入错误，请重新输入数字：");
				
			}
		} while (flag);
		
		
		//
		returnLoginMenu(input);
		
		
		
	}
	/**
	 * 显示部门经理菜单
	 */
	public void showManagerMenu()
	{
		System.out.println("人力资源管理系统=>部门经理");
		System.out.println("**************************************\n");
		System.out.println("\t\t\t 1、查看汇报工作\n");
		System.out.println("\t\t\t 2、考评员工\n");
		System.out.println("\t\t\t 2、查看个人信息\n");
		System.out.println("\t\t\t 3、修改密码\n");
		System.out.println("\t\t\t 5、工资范畴\n");
		System.out.println("\t\t\t 6、今日工作\n");
		System.out.println("\t\t\t 7、在线工作交流\n");
		System.out.println("**************************************\n");
		System.out.println("请输入菜单项数字的或者输入r/R返回上一菜单");
		boolean flag = true;
		do
		{
			String num = input.next();
			switch(num)
			{
			case "1":
				//查看汇报工作代码
				Data.manager.displayReports();
				//重新显示经理菜单
				showManagerMenu();
				flag = false;
				break;
			case "2":
				//考评员工
				break;
			case "3":
				//查看个人信息
				Data.manager.displayInfo();
				showManagerMenu();
				flag = false;
				break;
			case "4":
				//修改个人密码代码
				System.out.println("请输入新密码：");
				String newPassword = input.next();
				Data.manager.setPassword(newPassword);
				showManagerMenu();
				flag = false;
				break;
			case "5":
				//查看工资范畴
				break;
			case "6":
				//查看今日工作
				break;
			case "7":
				//在线工作交流
				break;
			case "r":
			case "R":
				flag = false;
				showLoginMenu();
				break;
			default:
				System.out.println("输入错误，请重新输入数字：");
				
			}
		} while (flag);
		//
		returnLoginMenu(input);
		
		
	}
	/**
	 * 显示管理员菜单
	 */
	public void showAdminMenu()
	{
		System.out.println("人力资源管理系统=>管理员");
		System.out.println("**************************************\n");
		System.out.println("\t\t\t 1、查看员工信息\n");
		System.out.println("\t\t\t 2、修改员工角色\n");
		System.out.println("\t\t\t 3、查看个人信息\n");
		System.out.println("\t\t\t 4、修改密码\n");
		System.out.println("\t\t\t 5、工资范畴\n");
		System.out.println("\t\t\t 6、今日工作\n");
		System.out.println("**************************************\n");
		System.out.println("请输入菜单项数字的或者输入r/R返回上一菜单");
		boolean flag = true;
		do
		{
			String num = input.next();
			switch(num)
			{
			case "1":
				//查看员工信息
				showAdminMenu();
				flag = false;
				break;
			case "2":
				//修改员工角色
				System.out.println("请输入员工编号：");
				String empNo = input.next();
				System.out.println("请输入员工角色，角色只能是Staff， Manager， Admin");
				String role = input.next();
				Data.admin.modifyEmployeeRole(empNo, role);
				showAdminMenu();
				flag = false;
				break;
			case "3":
				//查看个人信息
				Data.admin.displayInfo();
				showAdminMenu();
				flag = false;
				break;
			case "4":
				//修改个人密码代码
				System.out.println("请输入新密码：");
				String newPassword = input.next();
				Data.admin.setPassword(newPassword);
				showAdminMenu();
				flag = false;
				break;
			case "5":
				//查看工资范畴
				break;
			case "6":
				//查看今日工作
				break;
			case "7":
				//在线工作交流
				break;
			case "r":
			case "R":
				flag = false;
				showLoginMenu();
				break;
			default:
				System.out.println("输入错误，请重新输入数字：");
				
			}
		} while (flag);
		//
		returnLoginMenu(input);
		
		
	}
	/**
	 * 登陆菜单
	 */
	public void showLoginMenu() {
		System.out.println("\n\n\t\t\t欢迎进入企业人力资源管理系统\n\n");
		System.out.println("**************************************\n");
		System.out.println("\t\t\t 1、登陆系统\n");
		System.out.println("\t\t\t 2、注册用户\n");
		System.out.println("\t\t\t 3、退出系统\n");
		System.out.println("**************************************\n");
		System.out.println("请输入菜单选项数字：");
	}
}
