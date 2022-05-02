package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.entity.Sucursal;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.repository.ISucursalRepository;

@Service
public class SucursalServiceImp implements ISucursalService {

	@Autowired
	private ISucursalRepository sucursalRepository;

	@Override
	public Long guardarSucursal(SucursalDTO sucursalDTO) {
		Sucursal sucursal = this.mapDTOToEntity(sucursalDTO);
		sucursal = sucursalRepository.save(sucursal);
		return sucursal.getIdSucursal();
	}

	@Override
	public List<SucursalDTO> getSucursales() {
		List<SucursalDTO> resultat = new ArrayList<SucursalDTO>();

		List<Sucursal> sucursales = sucursalRepository.findAll();
		if (sucursales != null && sucursales.size() > 0) {
			for (Sucursal sucursal : sucursales) {
				resultat.add(this.mapEntityToDTO(sucursal));
			}

		}
		return resultat;
	}

	@Override
	public SucursalDTO getSucursalById(Long id) {
		SucursalDTO resultat = new SucursalDTO();
		Optional<Sucursal> sucursal = sucursalRepository.findById(id);
		if (sucursal.isPresent()) {
			resultat = this.mapEntityToDTO(sucursal.get());
		}

		return resultat;
		
	}

	@Override
	public void borrarById(Long id) {
		sucursalRepository.deleteById(id);

	}

	private Sucursal mapDTOToEntity(SucursalDTO sucursalDTO) {
		Sucursal resultat = null;

		if (sucursalDTO != null) {
			resultat = new Sucursal();
			resultat.setIdSucursal(sucursalDTO.getIdSucursal());
			resultat.setNomSucursal(sucursalDTO.getNomSucursal());
			resultat.setPaisSucursal(sucursalDTO.getPaisSucursal());
			String pais = sucursalDTO.getPaisSucursal();

		}

		return resultat;

	}

	private SucursalDTO mapEntityToDTO(Sucursal sucursal) {
		SucursalDTO resultat = null;

		if (sucursal != null) {
			resultat = new SucursalDTO();
			resultat.setIdSucursal(sucursal.getIdSucursal());
			resultat.setNomSucursal(sucursal.getNomSucursal());
			resultat.setPaisSucursal(sucursal.getPaisSucursal());
			String pais = sucursal.getPaisSucursal();
			// resultat.setTipoSucursal(pais);

		}

		return resultat;
	}

}
