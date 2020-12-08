package com.softtek.web.app.response;

public class ResponseLogin {
	
	public String mensaje;
	public Boolean estatus;
	
	
	public ResponseLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseLogin(String mensaje, boolean estatus) {
		super();
		this.mensaje = mensaje;
		this.estatus = estatus;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}
	
	
	

}
