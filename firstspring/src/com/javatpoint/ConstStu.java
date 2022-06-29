package com.javatpoint;

public class ConstStu {
	private int id;
	private String name;
	
	public ConstStu()
	{
		System.out.println("Created");
		
	}
	
	public ConstStu(int id)
	{
		this.id=id;
	}
	
	public ConstStu(String name)
	{
		this.name=name;
	}
	
	public ConstStu(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void show()
	{
		System.out.println(id+" "+name);
	}



}
