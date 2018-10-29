package com.zetcode.bean;

import lombok.Data;

@Data
public class Student {
    private long id;
    private String name;
	private int perm;
	private double gpa;

	public int getPerm() { return -42; }
	
}
