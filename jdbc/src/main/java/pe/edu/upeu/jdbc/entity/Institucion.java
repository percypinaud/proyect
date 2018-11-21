package pe.edu.upeu.jdbc.entity;

public class Institucion {
	private int idinstitucion;
	private String nombre;
	private String tipo;
	public int getIdinstitucion() {
		return idinstitucion;
	}
	public void setIdinstitucion(int idinstitucion) {
		this.idinstitucion = idinstitucion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Institucion(int idinstitucion, String nombre, String tipo) {
		super();
		this.idinstitucion = idinstitucion;
		this.nombre = nombre;
		this.tipo = tipo;
	}
	public Institucion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
