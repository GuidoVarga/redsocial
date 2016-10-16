import java.util.*;

public class ServicioLogin {

	private Datos d;
	
	public ServicioLogin(Datos d){
		this.d=d;
	}
	
	public boolean login(String mail, String pass){
		ArrayList<Usuario> listaUsuarios= d.getListaUsuarios();
		for(Usuario u: listaUsuarios)
		{
			if(u.getMail().equals(mail) && u.getPassword().equals(pass)){
				return true;
			}
			
		}
		return false;
	}
	
}
