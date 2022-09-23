package com.mdf.ioc;

public class Secretario implements IEmpleado{

		private ICreacionInforme informeNuevo;
	

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Gestionar agenda de los jefes";
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return null;
	}

	public ICreacionInforme getInformeNuevo() {
		return informeNuevo;
	}

	public void setInformeNuevo(ICreacionInforme _informeNuevo) {
		this.informeNuevo = _informeNuevo;
	}

	
}
