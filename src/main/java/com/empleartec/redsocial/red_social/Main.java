package com.empleartec.redsocial.red_social;

public class Main {

	
	
	public static void main(String args[]){
		
		Usuario usuario1 = new Usuario("USUARIO 1","123");
		Usuario usuario2= new Usuario("USUARIO 2","123");
		Usuario usuario3=new Usuario("USUARIO 3","4da");
		
		ServiciosUsuario serviciosUsuario1= new ServiciosUsuario(usuario1);
		ServiciosUsuario serviciosUsuario2= new ServiciosUsuario(usuario2);
		ServiciosUsuario serviciosUsuario3= new ServiciosUsuario(usuario3);
		
		
		System.out.println(usuario1.getPassword());
		
		serviciosUsuario1.cambiarPassword("tuvieja");
		
		serviciosUsuario1.cambiarNombre("juan");
		serviciosUsuario2.cambiarNombre("pedro");
		serviciosUsuario3.cambiarNombre("carlos");
		
		System.out.println(usuario1.getNombre());
		
		serviciosUsuario1.agregarAmigo(usuario3);
		serviciosUsuario1.agregarAmigo(usuario2);
		
		serviciosUsuario1.eliminarAmigo(usuario2);
		
		serviciosUsuario1.mostrarAmigos();
		
		
		Grupo grupo1 = new Grupo ("Rufianes");
		ServiciosGrupo serviciosGrupo1=new ServiciosGrupo(grupo1);
		
		serviciosGrupo1.agregarIntegrante(usuario1);
		serviciosGrupo1.agregarIntegrante(usuario2);
		serviciosGrupo1.agregarIntegrante(usuario3);
	
		
		
		
		serviciosGrupo1.mostrarIntegrantes();
		
		serviciosGrupo1.eliminarIntegrante(usuario1);
		
		serviciosGrupo1.mostrarIntegrantes();
		
		
		
	}
}
