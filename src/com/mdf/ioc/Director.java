package com.mdf.ioc;

public class Director implements IEmpleado {
	
	private ICreacionInforme InformeNuevo;
	
	
	public Director(ICreacionInforme informeNuevo) {
		this.InformeNuevo = informeNuevo;
	}

	public String getTareas()
	{
		return "Mi tarea principal es superviar la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return this.InformeNuevo.getInforme();
	}
}
