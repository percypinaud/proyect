package pe.edu.upeu.jdbc.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.jdbc.entity.Institucion;

public interface InstitucionDao {
	int create(Institucion i);
	int update(Institucion i);
	int delete(int id);
	Institucion read(int id);
	List<Map<String, Object>> readAll();
}
