package pe.edu.upeu.jdbc.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.jdbc.daoImp.ProductoDaoImp;
import pe.edu.upeu.jdbc.entity.Producto;
import pe.edu.upeu.jdbc.service.ProductoService;
@Service
public class ProductoServiceImp implements ProductoService{
	@Autowired
    private ProductoDaoImp prod;
	
	@Override
	public int create(Producto p) {
		// TODO Auto-generated method stub
		return prod.create(p);
	}

	@Override
	public int update(Producto p) {
		// TODO Auto-generated method stub
		return prod.update(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return prod.delete(id);
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return prod.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return prod.readAll();
	}

}
