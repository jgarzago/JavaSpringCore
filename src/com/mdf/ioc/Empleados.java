package com.mdf.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Empleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.context.xml");
		IEmpleado secretario = ctx.getBean("Secretario", IEmpleado.class);
		IEmpleado director = ctx.getBean("Director", IEmpleado.class);
		IEmpleado jefe = ctx.getBean("Jefe", IEmpleado.class);

		System.out.println("secretario>>>>" + secretario.getTareas());
		System.out.println("director>>>>" + director.getInforme());
		System.out.println("jefe>>>>" + jefe.getInforme());
		
		ctx.close();
	}

}
