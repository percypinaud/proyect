package pe.edu.upeu.jdbc.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.jdbc.entity.Trabajador;

public interface TrabajadorService {
	int create(Trabajador t);
	int update(Trabajador t);
	int delete(int id);
	Trabajador read(int id);
	List<Map<String, Object>> readAll();
}
