package com.mdf.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Empleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.context.xml");
		IEmpleado secretario = ctx.getBean("Director", IEmpleado.class);

		System.out.println(secretario.getTareas());
		System.out.println(Director.getInforme());
		
		ctx.close();
	}

}
