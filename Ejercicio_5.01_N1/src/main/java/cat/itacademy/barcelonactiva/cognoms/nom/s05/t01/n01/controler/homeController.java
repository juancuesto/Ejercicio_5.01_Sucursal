package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.controler;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.service.ISucursalService;


@Controller
public class homeController {
	
	@Autowired
	private ISucursalService sucursalServicio;
	
	@GetMapping("/indice")
	public String index() {
		return "index";
	}
	
	@GetMapping("/listar")
	public String listarSucursales(Model modelo) {
		List<SucursalDTO> listadoSucursales=sucursalServicio.getSucursales();
		modelo.addAttribute("titulo","lista de sucursales");
		modelo.addAttribute("sucursales", listadoSucursales);
		
		return "sucursales2";
	}

}
