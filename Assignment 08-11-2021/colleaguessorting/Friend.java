package com.technoelevate.javabasics.colleaguessorting;

public class Friend implements Comparable<Friend> {
int age;
String name;
String relation;
public Friend(int age, String name, String relation) {
	super();
	this.age = age;
	this.name = name;
	this.relation = relation;
}
@Override
public String toString() {
	return "Friend [age=" + age + ", name=" + name + ", relation=" + relation + "]";
}
@Override
public int compareTo(Friend o) {
	// TODO Auto-generated method stub
	return this.age-o.age;
}

}
