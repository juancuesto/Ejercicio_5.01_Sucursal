package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.service;

import java.util.List;


import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto.SucursalDTO;



public interface ISucursalService {

	public Long guardarSucursal(SucursalDTO sucursalDTO);
	public List<SucursalDTO> getSucursales();
	public SucursalDTO getSucursalById(Long id);
	public void borrarById(Long id);
	//public SucursalDTO actualizar(SucursalDTO sucursalDTO,int id);

}

