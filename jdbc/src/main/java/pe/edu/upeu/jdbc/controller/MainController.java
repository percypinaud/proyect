package pe.edu.upeu.jdbc.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upeu.jdbc.entity.Producto;
import pe.edu.upeu.jdbc.entity.Usuario;
import pe.edu.upeu.jdbc.serviceImp.CategoriaServiceImp;
import pe.edu.upeu.jdbc.serviceImp.ProductoServiceImp;
import pe.edu.upeu.jdbc.serviceImp.UsuarioServiceImp;

@Controller
@RequestMapping("/main")
public class MainController {
	@Autowired
	private UsuarioServiceImp usp;
	@Autowired
	private ProductoServiceImp prod;
	@Autowired
	private CategoriaServiceImp cat;
	
@PostMapping("/bienvenido")
public String main() {
	return "main";
}

@GetMapping("/dg")
public String main3() {
	return "DGP";
}

@GetMapping("/user")
public ModelAndView user() {
	ModelAndView ma = new ModelAndView();
	ma.setViewName("user");
	ma.addObject("lista", usp.readAll());
	return ma;
}

@GetMapping("/producto")
public ModelAndView listar() {
	ModelAndView ma = new ModelAndView();
	ma.setViewName("producto");
	ma.addObject("list", prod.readAll());
	ma.addObject("lista",cat.readAll());
	return ma;
}

@GetMapping("/del/{id}")
public String userdelete(Model model, @PathVariable("id") int idusuario) {
	System.out.println(idusuario);
	usp.delete(idusuario);
	return "redirect:/main/user";
}

@GetMapping("/delp/{id}")
public String borrarProducto(Model model, @PathVariable("id") int idproducto) {
	System.out.println(idproducto);
	prod.delete(idproducto);
	return "redirect:/main/producto";
}

@GetMapping("/upd/{id}")
public String userupdate(Model model, @PathVariable("id") int idusuario) {
	System.out.println(idusuario);
	Usuario u = usp.read(idusuario);
	model.addAttribute("user", u);
	return "redirect:/main/user";
}

@GetMapping("/up/{id}")
public String productoUpdate(Model model, @PathVariable("id") int idproducto) {
	System.out.println(idproducto);
	Producto p = prod.read(idproducto);
	model.addAttribute("pro", p);
	return "produc";
}
@PostMapping("/saveUser")
public String usersave(Model model, Usuario user) throws SQLException {
	user.setEstado("1");
	usp.create(user);
	return "redirect:/main/user";
}

@PostMapping("/saveProd")
public String registrarProducto(Model model, Producto pro) throws SQLException {
	System.out.println(pro);
	prod.create(pro);
	return "redirect:/main/producto";
}

@GetMapping("/update")
public ModelAndView update(Model model, Producto pr) throws SQLException {
	prod.update(pr);
	return new ModelAndView("redirect:/main/producto");
}

@PostMapping("/saveDGP")
public String registrarDGP(Model model, DGP dgp) throws SQLException {
	dg.create(dgp);
	return "redirect:/main/producto";
}



}
