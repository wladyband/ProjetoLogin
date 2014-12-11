package com.example.projetologin.model;

public class LoginUsuario {
	
	public long id;
	public String usuario;
	public String password;
	
	public LoginUsuario(){
		
	}
	public LoginUsuario(String usuario, String  password){
		super();
		this.usuario = usuario;
		this.password =password;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginUsuario other = (LoginUsuario) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	

}
