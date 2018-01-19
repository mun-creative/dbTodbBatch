package com.medha.model;

public class Instructor {
	
	private int ins_id;
	private String dept_name;
	public int getIns_id() {
		return ins_id;
	}
	public void setIns_id(int ins_id) {
		this.ins_id = ins_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	@Override
	public String toString() {
		return "Instructor [ins_id=" + ins_id + ", dept_name=" + dept_name
				+ "]";
	}
	
	

}
