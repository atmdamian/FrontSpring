package com.softtek.web.app.model;

public class Login {
	
	
	private String usuario;
	private String pw;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Login [usuario=" + usuario + ", pw=" + pw + "]";
	}
	
	
		
}
