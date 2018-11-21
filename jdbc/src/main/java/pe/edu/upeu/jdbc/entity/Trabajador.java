package pe.edu.upeu.jdbc.entity;

public class Trabajador extends Institucion{
	private int idtrabajador;
	private String nomb;
	private String apell;
	private String area;
	private String finn;
	private String ffin;
	private int totdias;
	
	
	public Trabajador() {
		super();
	}
	public Trabajador(int idinstitucion, String nombre, String tipo, int idtrabajador, String nomb, String apell,
			String area, String finn, String ffin, int totdias) {
		super(idinstitucion, nombre, tipo);
		this.idtrabajador = idtrabajador;
		this.nomb = nomb;
		this.apell = apell;
		this.area = area;
		this.finn = finn;
		this.ffin = ffin;
		this.totdias = totdias;
	}
	public int getIdtrabajador() {
		return idtrabajador;
	}
	public void setIdtrabajador(int idtrabajador) {
		this.idtrabajador = idtrabajador;
	}
	public String getNomb() {
		return nomb;
	}
	public void setNomb(String nomb) {
		this.nomb = nomb;
	}
	public String getApell() {
		return apell;
	}
	public void setApell(String apell) {
		this.apell = apell;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getFinn() {
		return finn;
	}
	public void setFinn(String finn) {
		this.finn = finn;
	}
	public String getFfin() {
		return ffin;
	}
	public void setFfin(String ffin) {
		this.ffin = ffin;
	}
	public int getTotdias() {
		return totdias;
	}
	public void setTotdias(int totdias) {
		this.totdias = totdias;
	}
	

	
}
