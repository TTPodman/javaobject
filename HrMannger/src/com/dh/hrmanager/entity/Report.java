package com.dh.hrmanager.entity;

public class Report
{
	//汇报id
	private int reportId;
	//汇报人Id
	private int reporterId;
	//汇报内容
	private String content;
	
	//getter,setter方法
	public int getReportId()
	{
		return reportId;
	}
	public void setReportId(int reportId)
	{
		this.reportId = reportId;
	}
	public int getReporterId()
	{
		return reporterId;
	}
	public void setReporterId(int reporterId)
	{
		this.reporterId = reporterId;
	}
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content = content;
	}
	

}
