package pe.edu.upeu.jdbc.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.jdbc.dao.UsuarioDao;
import pe.edu.upeu.jdbc.entity.Usuario;
@Repository
public class UsuarioDaoImp implements UsuarioDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub	
		String sql = "INSERT INTO usuario(idusuario,nom_user,clave,estado) values(null,?,?,?)";
		return jdbcTemplate.update(sql,u.getNomuser(),u.getClave(),u.getEstado());
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("UPDATE usuario SET "+u.getClave()+" WHERE idusuario="+u.getIduser()+")");
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM usuario WHERE idusuario=?";
		return jdbcTemplate.update(sql,id);
	}

	@Override
	public Usuario read(int id) {		
		// TODO Auto-generated method stub
	
		String sql = "select * from contact where id = ?";
		   Usuario user = jdbcTemplate.queryForObject(sql, new UsuarioRowMapper(), id);
		return user;
	}
	
	@Override
	public List<Map<String,Object>> readAll() {
		// TODO Auto-generated method stub
	    return this.jdbcTemplate.queryForList("Select *from usuario");
	}

}
