package com.technoelevate.javabasics.familysorting;

import java.util.TreeSet;

public class FamilyComparable {
public static void main(String[] args) {
	DescendingFamily desc=new DescendingFamily();
	TreeSet<Family> set=new TreeSet<Family>(desc);
	set.add(new Family("brother","prasanna", 27));
	set.add(new Family("mother","sunita", 55));
	set.add(new Family("father","tukaram", 58));
	set.add(new Family("cousin","Arun", 35));
	
	for (Family family:set);
	System.out.println(set);
}
}
