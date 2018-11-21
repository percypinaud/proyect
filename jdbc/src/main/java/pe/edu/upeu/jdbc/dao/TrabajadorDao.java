package pe.edu.upeu.jdbc.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.jdbc.entity.Trabajador;

public interface TrabajadorDao {
	int create(Trabajador t);
	int update(Trabajador t);
	int delete(int id);
	Trabajador read(int id);
	List<Map<String, Object>> readAll();
}
