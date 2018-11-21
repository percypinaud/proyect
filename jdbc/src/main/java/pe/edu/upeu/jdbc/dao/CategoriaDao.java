package pe.edu.upeu.jdbc.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.jdbc.entity.Categoria;

public interface CategoriaDao {
	int create(Categoria c);
	int update(Categoria c);
	int delete(int id);
	Categoria read(int id);
	List<Map<String, Object>> readAll();
}
