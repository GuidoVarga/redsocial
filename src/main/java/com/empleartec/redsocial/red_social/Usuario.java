package com.empleartec.redsocial.red_social;
import java.util.*;


public class Usuario {
	
	private int id;
	private String password;
	private String mail;
	private Perfil p;
	private List <Usuario> listaAmigos;
	private List <Grupo> listaGrupos;
	
	//Constructor
	public Usuario(String mail, String password){
		
		this.mail=mail;
		this.password=password;
		this.id=(int)(Math.random() * 10) + 1;
		p =new Perfil();
		listaAmigos= new ArrayList<Usuario>();
		listaGrupos= new ArrayList<Grupo>();
		
	}
	
	//Getters Usuario
	public String getPassword() {
		return password;
	}

	public String getMail() {
		return mail;
	}
	
	public int getId() {
		return id;
	}


	//Setters Usuario
	public void setMail(String mail){
		this.mail=mail;
	}
	
	
	public void setPassword(String password){
		this.password=password;
	}
	
	//Getters Perfil 
	public String getNombre() {
		return p.getNombre();
	}
	
	public String getApellido() {
		return p.getApellido();
	}
	
	public int getEdad() {
		return p.getEdad();
	}
	
	//Setters Perfil
	public void cambiarNombre(String nombre){
		
		p.setNombre(nombre);
	}
	
	public void cambiarApellido(String apellido){
		
		p.setApellido(apellido);
	}
	
	
	public void addAmigo(Usuario a){
		listaAmigos.add(a);
	}
	
	//Equals para comparar objetos por su id
	@Override
	public boolean equals (Object o){
		
		if(o instanceof Usuario){
			
			Usuario temp=(Usuario) o;
			
			
			if(this.id==temp.getId()){
				return true;
			}
			
		}
		return false;
	}
	
	
	public void removeAmigo(Usuario e){
		int i=0;
		while((i<listaAmigos.size()) && (listaAmigos.get(i).equals(e)==false) )
		{
			i++;	
		}
		if(i<listaAmigos.size()){
			
			listaAmigos.remove(i);
		}
		
	}
	
	
	//String builder para mostrar lista de amigos
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [ Nombre: ").append(getNombre()).append(" Id:").append(id);
			
		return builder.toString();
	}
	
	
	public void mostrarAmigos(){
		
		//listaAmigos.stream().forEach(usuario -> System.out.println(usuario));
		
		for(Usuario u : listaAmigos){
			System.out.println(u.getNombre());
		}
		
		
	}
	

	public void addGrupo(Grupo g){
		
		listaGrupos.add(g);
	}
	
}