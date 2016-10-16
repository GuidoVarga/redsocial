
public class ServicioGrupo {

	
	
	public ServicioGrupo(){
		
	}
	
	public void cambiarNombre(Grupo g, String nombre){
	
		g.setNombre(nombre);
		
	}
	
	public void agregarIntegrante(Grupo g, Usuario u){
		g.addIntegrante(u);
	}
	
	public void agregarAdmin(Grupo g, Usuario u){
		g.addAdmin(u);
	}
	
	public void mostrarIntegrantes(Grupo g){
		g.mostrarIntegrantes();
	}
	
	
	public void mostrarAdmins(Grupo g){
		g.mostrarAdmins();
	}
	
	public void eliminarIntegrante(Grupo g,Usuario u){
		g.removeIntegrante(u);
	}
}

