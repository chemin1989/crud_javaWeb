package modelo;

public class Cliente {

	private String nombre;
	private String apellidos;
	private String direccion;
	private String numero;
	private String poblacion;
	private String cp;
	private String email;
	private String ep;
	private int id;
	

	public Cliente() {

		
	}


	public Cliente(String nombre, String apellidos, String direccion, String numero, String poblacion, String cp,
			String email, String ep) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.numero = numero;
		this.poblacion = poblacion;
		this.cp = cp;
		this.email = email;
		this.ep = ep;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}


	public String getCp() {
		return cp;
	}


	public void setCp(String cp) {
		this.cp = cp;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEp() {
		return ep;
	}


	public void setEp(String ep) {
		this.ep = ep;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", numero="
				+ numero + ", poblacion=" + poblacion + ", cp=" + cp + ", email=" + email + ", ep=" + ep + ", id=" + id
				+ "]";
	}

	
}	