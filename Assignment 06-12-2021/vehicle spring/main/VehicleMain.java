package com.technoelevate.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.spring.bean.Vehicle;

public class VehicleMain {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
Vehicle bean = (Vehicle) context.getBean("vehicle");
System.out.println(bean);
}
}
