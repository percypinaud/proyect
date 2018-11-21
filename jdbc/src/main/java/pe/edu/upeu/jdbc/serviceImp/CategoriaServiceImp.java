package pe.edu.upeu.jdbc.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.jdbc.daoImp.CategoriaDaoImp;
import pe.edu.upeu.jdbc.entity.Categoria;
import pe.edu.upeu.jdbc.service.CategoriaService;
@Service
public class CategoriaServiceImp implements CategoriaService {
	
	@Autowired
    private CategoriaDaoImp cat;
	
	@Override
	public int create(Categoria c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Categoria c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Categoria read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return cat.readAll();
	}

}
