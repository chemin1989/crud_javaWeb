package modelo;

public class Usuario {

	
	private String nombre;
	private String email;
	private String comentario;
	private int id;
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}


	public Usuario(String nombre, String email, String comentario) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.comentario = comentario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", email=" + email + ", comentario=" + comentario + ", id=" + id + "]";
	}
	
	
}
