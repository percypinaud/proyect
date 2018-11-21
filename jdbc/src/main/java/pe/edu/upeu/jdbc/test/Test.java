package pe.edu.upeu.jdbc.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upeu.jdbc.dao.CategoriaDao;
import pe.edu.upeu.jdbc.dao.ProductoDao;
import pe.edu.upeu.jdbc.dao.UsuarioDao;
import pe.edu.upeu.jdbc.entity.Producto;

public class Test {

	public static void main(String[] args) {
		Test t=new Test();
		t.updateProducto();
		
	}

	public String listarUsuario() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		UsuarioDao dao = (UsuarioDao)context.getBean("usuarioDaoImp");
        List<Map<String, Object>> lista = dao.readAll();
		for(Map<String,Object> map:lista) {
		   	System.out.println(map.get("nom_user"));
		   	System.out.println(map.get("clave"));
		}

	   context.close();
	   return "hola";
	}
	
	public String listarCategoria() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		CategoriaDao dao = (CategoriaDao)context.getBean("categoriaDaoImp");
        List<Map<String, Object>> list = dao.readAll();
		for(Map<String,Object> map:list) {
		   	System.out.println(map.get("idcategoria"));
		   	System.out.println(map.get("nom_cat"));
		}
	   context.close();
		return "hola2";
	}
	public String listarProducto() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		ProductoDao dao = (ProductoDao)context.getBean("productoDaoImp");
        List<Map<String, Object>> list = dao.readAll();
		for(Map<String,Object> map:list) {
		   	System.out.println(map.get("idproducto"));
		   	System.out.println(map.get("nom_prod"));
		   	System.out.println(map.get("nom_cat"));
		}
	   context.close();
		return "hola3";
	}
	public String crearProducto() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		ProductoDao dao = (ProductoDao)context.getBean("productoDaoImp");
		Producto pr=new Producto();
		pr.setNom_prod("Primor");
		pr.setPrecio(5.20);
		pr.setCantidad(10);
		pr.setIdcategoria(1);
		dao.create(pr);
	    context.close();
		return "hola4";
	}
	
	public String updateProducto() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		ProductoDao dao = (ProductoDao)context.getBean("productoDaoImp");
		Producto pr=new Producto();
		pr.setIdproducto(5);
		pr.setNom_prod("Prof");
		pr.setPrecio(5.20);
		pr.setCantidad(10);
		dao.update(pr);
	    context.close();
		return "hola4";
	}
	
	public String deleteProducto() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		ProductoDao dao = (ProductoDao)context.getBean("productoDaoImp");
		dao.delete(1);
	    context.close();
		return "hola5";
	}
	
	
	
}
