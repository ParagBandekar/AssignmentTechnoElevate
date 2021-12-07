package com.technoelevate.spring.bean;

public class Engine {
private String engname;
private int cylinder;
public String getEngname() {
	return engname;
}
public void setEngname(String engname) {
	this.engname = engname;
}
public int getCylinder() {
	return cylinder;
}
public void setCylinder(int cylinder) {
	this.cylinder = cylinder;
}
@Override
public String toString() {
	return "Engine [engname=" + engname + ", cylinder=" + cylinder + "]";
}

}
