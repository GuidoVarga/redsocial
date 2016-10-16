
public class Main {

	
	
	public static void main(String args[]){
		
		Datos d = new Datos();
		Usuario usuario1 = new Usuario("USUARIO 1","123");
		d.addUsuario(usuario1);
		Usuario usuario2= new Usuario("USUARIO 2","123");
		d.addUsuario(usuario2);
		Usuario usuario3=new Usuario("USUARIO 3","4da");
		d.addUsuario(usuario3);
	
		
		ServicioUsuario servicioUsuario= new ServicioUsuario();
		ServicioLogin servicioLogin = new ServicioLogin(d);
		
		
		System.out.println(usuario1.getPassword());
		
		servicioUsuario.cambiarPassword(usuario1,"tuvieja");
		
		servicioUsuario.cambiarNombre(usuario1,"juan");
		servicioUsuario.cambiarNombre(usuario2,"pedro");
		servicioUsuario.cambiarNombre(usuario3,"carlos");
		
		System.out.println(usuario1.getNombre());
		
		servicioUsuario.agregarAmigo(usuario1,usuario3);
		servicioUsuario.agregarAmigo(usuario1,usuario2);
		
		servicioUsuario.eliminarAmigo(usuario1,usuario2);
		
		servicioUsuario.mostrarAmigos(usuario1);
		
		
		Grupo grupo1 = new Grupo ("Rufianes");
		ServicioGrupo servicioGrupo= new ServicioGrupo();
		
		servicioGrupo.agregarIntegrante(grupo1,usuario1);
		servicioGrupo.agregarIntegrante(grupo1,usuario2);
		servicioGrupo.agregarIntegrante(grupo1,usuario3);
	
		
		
		
		servicioGrupo.mostrarIntegrantes(grupo1);
		
		servicioGrupo.eliminarIntegrante(grupo1,usuario1);
		
		servicioGrupo.mostrarIntegrantes(grupo1);
		
		if(servicioLogin.login("USUARIO 3","4da")){
			System.out.println("Logueo exitoso");
		}else{
			System.out.println("Error");
		}
		
		
		
	}
}
