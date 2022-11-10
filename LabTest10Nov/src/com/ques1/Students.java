//import package
package com.ques1;

import java.util.Arrays;

//declaring a class
public class Students {
	
	private int[] s_id = new int[5];
	private String[] s_name = new String[5];
	private int[] s_age = new int[5];
	private String[] course = new String[5];
	
	public int[] getS_id() {
		return s_id;
	}
	public String[] getS_name() {
		return s_name;
	}
	public int[] getS_age() {
		return s_age;
	}
	public String[] getCourse() {
		return course;
	}
	public int[] setS_id() {
		this.s_id = s_id;
		return s_id;
	}
	public void setS_name(String[] s_name) {
		this.s_name = s_name;
	}
	public void setS_age(int[] s_age) {
		this.s_age = s_age;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	//Override
	public String toString() {
		return "Student [s_id=" + Arrays.toString(s_id) + ", s_name=" + Arrays.toString(s_name) + ", s_age="
				+ Arrays.toString(s_age) + ", course=" + Arrays.toString(course) + "]";
	}
}//end of class
