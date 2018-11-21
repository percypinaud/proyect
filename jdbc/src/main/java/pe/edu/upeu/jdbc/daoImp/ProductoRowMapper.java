package pe.edu.upeu.jdbc.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.jdbc.entity.Producto;

public class ProductoRowMapper implements RowMapper<Producto>{

	@Override
	public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
		Producto p=new Producto();
		p.setIdproducto(rs.getInt("idproducto"));
		p.setNom_prod(rs.getString("nom_prod"));
		p.setPrecio(rs.getDouble("precio"));
		p.setCantidad(rs.getInt("cantidad"));
		p.setIdcategoria(rs.getInt("idcategoria"));
		return p;
	}

}
