package pe.edu.upeu.jdbc.entity;

public class Categoria {
	private int idcategoria;
	private String nom_cat;
	
	public Categoria() {
		super();
	}
	public Categoria(int idcategoria, String nom_cat) {
		super();
		this.idcategoria = idcategoria;
		this.nom_cat = nom_cat;
	}
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getNom_cat() {
		return nom_cat;
	}
	public void setNom_cat(String nom_cat) {
		this.nom_cat = nom_cat;
	}
	
}
