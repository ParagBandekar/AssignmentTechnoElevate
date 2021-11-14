package com.technoelevate.javaassignment.sequencethreadpriority;

public class FreshLiteMain {

public static void main(String[] args) {
	FreshLiteMain main=new FreshLiteMain();
	FreshLite03 freshLite03J=new FreshLite03();
	FreshLite03 freshLite03R=new FreshLite03();
	Thread thread=new Thread(freshLite03R);
	freshLite03J.setPriority(7);
	thread.setPriority(2);
	freshLite03J.start();
	thread.start();
	System.out.print("wellcome to ");
	
	
}
}

