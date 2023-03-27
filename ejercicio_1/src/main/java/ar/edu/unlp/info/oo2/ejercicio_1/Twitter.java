package ar.edu.unlp.info.oo2.ejercicio_1;
import java.util.ArrayList;
import java.util.List;


public class Twitter {
	
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Tweet> tweets = new ArrayList<Tweet>();
	
	
	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public List<Tweet> getTweets(){
		return this.tweets;
	}
	
	public void agregarUsuario(Usuario newUsuario) {
		if(this.getUsuarios().contains(newUsuario)) {
			System.out.println("El usuario con este ScreenName ya existe");
		}else {
			this.usuarios.add(newUsuario);
		}
	}
	
	public void eliminarUsuario(Usuario unUsuario) {
		if(this.getUsuarios().contains(unUsuario)) {
			this.getUsuarios().remove(unUsuario);
			/* Falta eliminar los tweets */
		}else {
			System.out.println("El usuario no existe");
		}
	}
	
	
}