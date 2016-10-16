
public class ServicioUsuario {
	

	public ServicioUsuario(){
		
		
	}
	

	public void cambiarPassword(Usuario u, String password){
		
		u.setPassword(password);
	}
	
	public void cambiarNombre(Usuario u, String nombre){
		
		u.cambiarNombre(nombre);
		
	}
	
	public void cambiarApellido(Usuario u, String apellido){
		
		u.cambiarApellido(apellido);
		
	}
	
	public void agregarAmigo(Usuario u, Usuario a){
		
		u.addAmigo(a);
	}
	
	public void eliminarAmigo(Usuario u, Usuario e){
		u.removeAmigo(e);
	}
	
	
	public void ingresarEnGrupo(Usuario u, Grupo g){
		u.addGrupo(g);
	}
	
	public void mostrarAmigos(Usuario u){
		u.mostrarAmigos();
	}
	
	
}
