package pe.edu.upeu.jdbc.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.jdbc.entity.Categoria;

public class CategoriaRowMapper implements RowMapper<Categoria>{

	@Override
	public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {
		Categoria c=new Categoria();
		c.setIdcategoria(rs.getInt("idcategoria"));
		c.setNom_cat(rs.getString("nom_cat"));
		return c;
	}

}
