package modelo;

public class Ropa {
	private String marca;
	private String modelo;
	private String pais;
	private String coste;
	private String talla;
	private String color;
	private String descripcion;
	private int id;

	public Ropa() {

	}

	public Ropa(String marca, String modelo, String pais, String coste, String talla, String color,
			String descripcion) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.pais = pais;
		this.coste = coste;
		this.talla = talla;
		this.color = color;
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCoste() {
		return coste;
	}

	public void setCoste(String coste) {
		this.coste = coste;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ropa [marca=" + marca + ", modelo=" + modelo + ", pais=" + pais + ", coste=" + coste + ", talla="
				+ talla + ", color=" + color + ", descripcion=" + descripcion + ", id=" + id + "]";
	}

}