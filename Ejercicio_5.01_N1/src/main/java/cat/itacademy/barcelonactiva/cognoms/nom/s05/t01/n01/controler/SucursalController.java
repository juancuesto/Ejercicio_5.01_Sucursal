package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.entity.Sucursal;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.service.SucursalServiceImp;


@Controller
@RequestMapping("/views/clientes")
public class SucursalController {
	
	@Autowired
	private SucursalServiceImp sucursalService;
	
	@GetMapping("/indice")
	public String inicio() {
		return "/views/clientes/index";
	}
	
	@GetMapping("/ListaSucursales")
	public String llistaSucursales(Model modelo) {
		List<SucursalDTO> listadoClientes=sucursalService.getSucursales();
		modelo.addAttribute("titulo", "lista de Clientes");
		modelo.addAttribute("clientes", listadoClientes);
		
		return "/views/clientes/listar";
	}
	
	@GetMapping("/Sucursal/nuevo")
	public String crearSucursalFormulario(Model modelo) {
		Sucursal  sucursal=new Sucursal();
		modelo.addAttribute("titulo", "Formulario nueva Sucursal");
		modelo.addAttribute("sucursal", sucursal);
		return "/views/clientes/crear_sucursal";	
	}
	
	@PostMapping("/save")
	public String Guardar(@ModelAttribute SucursalDTO sucursalDTO) {
		
		sucursalService.guardarSucursal(sucursalDTO);
		System.out.println("Sucursal guardada con éxito");
		return "redirect:/views/clientes/ListaSucursales";
	}
	
	@GetMapping("/Editar/{id}")
	public String Editar(@PathVariable ("id") Long idSucursal,Model modelo) {
		SucursalDTO  sucursal=sucursalService.getSucursalById(idSucursal);
		modelo.addAttribute("titulo", "Formulario Editar Sucursal");
		modelo.addAttribute("sucursal", sucursal);
		return "/views/clientes/crear_sucursal";	
	}
	
	@GetMapping("/delete/{id}")
	public String Eliminar(@PathVariable ("id") Long idSucursal) {
		sucursalService.borrarById(idSucursal);
		return "redirect:/views/clientes/ListaSucursales";
			
	}


}
