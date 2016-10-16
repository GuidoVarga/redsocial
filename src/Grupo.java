import java.util.*;

public class Grupo {
	
	private List<Usuario> admins;
	private List<Usuario> integrantes;
	private String nombre;
	
	//Constructores
	public Grupo(){
		admins=new ArrayList<Usuario>();
		integrantes=new ArrayList<Usuario>();
	}
	
	public Grupo(String nombre){
		this.nombre=nombre;
		admins=new ArrayList<Usuario>();
		integrantes=new ArrayList<Usuario>();
	}

	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Getters
	public String getNombre() {
		return nombre;
	}
	
	//Agregar a las listas
	public void addIntegrante(Usuario u){
		integrantes.add(u);
	}
	public void addAdmin(Usuario u){
		admins.add(u);
	}
	
	//Mostrar listas
	public void mostrarIntegrantes(){
		System.out.println(nombre);
		System.out.println();
		integrantes.stream().forEach(usuario -> System.out.println(usuario));
		
	}
	
	public void mostrarAdmins(){
		
		integrantes.stream().forEach(usuario -> System.out.println(usuario));
		
	}
	
	//Eliminar de la lista (Implementando equals de clase usuario)
	public void removeIntegrante(Usuario u){
		int i=0;
		while(i<integrantes.size() && integrantes.get(i).equals(u)==false){
			i++;
		}
		if(i<integrantes.size()){
			integrantes.remove(i);
		}
		
	}
	
	public void removeAdmin(Usuario u){
		int i=0;
		while(i<admins.size() && admins.get(i).equals(u)==false){
			i++;
		}
		if(i<admins.size()){
			admins.remove(i);
		}
		
	}
	
	
}
