package com.empleartec.redsocial.red_social;

public class ServiciosGrupo {

	private Grupo g;
	
	public ServiciosGrupo(Grupo g){
		this.g=g;
	}
	
	public void setGrupo(Grupo g){
		this.g=g;
	}

	public void cambiarNombre(String nombre){
	
		g.setNombre(nombre);
		
	}
	
	public void agregarIntegrante(Usuario u){
		g.addIntegrante(u);
	}
	
	public void agregarAdmin(Usuario u){
		g.addAdmin(u);
	}
	
	public void mostrarIntegrantes(){
		g.mostrarIntegrantes();
	}
	
	
	public void mostrarAdmins(){
		g.mostrarAdmins();
	}
	
	public void eliminarIntegrante(Usuario u){
		g.removeIntegrante(u);
	}
}

