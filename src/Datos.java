import java.util.ArrayList;

public class Datos {

	private ArrayList<Usuario> listaUsuarios;
	private ArrayList<Grupo> listaGrupos;
	
	public Datos(){
		
		listaUsuarios = new ArrayList <Usuario>();
		listaGrupos = new ArrayList <Grupo>();
		
	}
	
	public void addUsuario(Usuario u){
		listaUsuarios.add(u);
	}
	
	public void addGrupo(Grupo g){
		listaGrupos.add(g);
	}
	
	public ArrayList<Usuario> getListaUsuarios(){
		
		return listaUsuarios;
	}
}
