package com.technoelevate.javabasics.colleaguessorting;

import java.util.TreeSet;

public class FriendCollection {
public static void main(String[] args) {
	TreeSet<Friend> treeSet=new TreeSet<Friend>();
	treeSet.add(new Friend(25, "akshay", "Friend"));
	treeSet.add(new Friend(23, "avinash", "Friend"));
	treeSet.add(new Friend(21, "venkatesh", "Friend"));
	treeSet.add(new Friend(20, "nitish", "Friend"));
	
for(Friend friend:treeSet);
System.out.println(treeSet);
}
}
