package pe.edu.upeu.jdbc.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.jdbc.dao.ProductoDao;
import pe.edu.upeu.jdbc.entity.Producto;
@Repository
public class ProductoDaoImp implements ProductoDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Producto p) {
		String sql = "INSERT INTO producto(idproducto,nom_prod,precio,cantidad,idcategoria) values(null,?,?,?,?)";
		return jdbcTemplate.update(sql,p.getNom_prod(),p.getPrecio(),p.getCantidad(),p.getIdcategoria());
	}

	@Override
	public int update(Producto p) {
		String sql ="UPDATE producto SET nom_prod=?, precio=?, cantidad=? WHERE idproducto=?";
		return jdbcTemplate.update(sql,p.getNom_prod(),p.getPrecio(),p.getCantidad(),p.getIdproducto());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM producto WHERE idproducto=?";
		return jdbcTemplate.update(sql,id);	}

	@Override
	public Producto read(int id) {
		String sql = "select * from producto where idproducto = ?";
		   Producto prod = jdbcTemplate.queryForObject(sql, new ProductoRowMapper(), id);
		return prod;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		  return this.jdbcTemplate.queryForList("select p.idproducto,p.nom_prod,p.precio,p.cantidad,c.idcategoria,c.nom_cat from producto p,categoria c where p.idcategoria=c.idcategoria");
	}

}
