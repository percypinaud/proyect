package pe.edu.upeu.jdbc.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.jdbc.daoImp.TrabajadorDaoImp;
import pe.edu.upeu.jdbc.entity.Trabajador;
import pe.edu.upeu.jdbc.service.TrabajadorService;

public class TrabajadorServiceImp implements TrabajadorService{
	@Autowired
    private TrabajadorDaoImp tr;
	@Override
	public int create(Trabajador t) {
		// TODO Auto-generated method stub
		return tr.create(t);
	}

	@Override
	public int update(Trabajador t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Trabajador read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
