package com.empleartec.redsocial.red_social;

public class ServiciosUsuario {
	
	private Usuario u;
	
	
	public ServiciosUsuario(Usuario u){
		
		this.u=u;
	}
	
	public void setUsuario(Usuario u){
		this.u=u;
	}
	
	public void cambiarPassword(String password){
		
		u.setPassword(password);
	}
	
	public void cambiarNombre(String nombre){
		
		u.cambiarNombre(nombre);
		
	}
	
	public void cambiarApellido(String apellido){
		
		u.cambiarApellido(apellido);
		
	}
	
	public void agregarAmigo(Usuario a){
		
		u.addAmigo(a);
	}
	
	public void eliminarAmigo(Usuario e){
		u.removeAmigo(e);
	}
	
	
	public void ingresarEnGrupo(Grupo g){
		u.addGrupo(g);
	}
	
	public void mostrarAmigos(){
		u.mostrarAmigos();
	}
	
	
}
