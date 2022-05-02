package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto;

public class SucursalDTO {
	
	private Long idSucursal;
	private String nomSucursal;
	private String paisSucursal;
	private String tipoSucursal;
	private String[] listaPaises= {"España","portugal","Francia","Alemania","Belgica","Paises Bajos","Irlanda","Grecia","Luxemburgo",
			"Estonia","Lituania","Bulgaria","Malta","Chipre","Croacia","Polonia","Hungria",
			"Republica checa","Suecia","Finlandia","Austria","Letonia"};
	
	public Long getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(Long long1) {
		this.idSucursal = long1;
	}
	public String getNomSucursal() {
		return nomSucursal;
	}
	public void setNomSucursal(String nomSucursal) {
		this.nomSucursal = nomSucursal;
	}
	public String getPaisSucursal() {
		return paisSucursal;
	}
	public void setPaisSucursal(String paisSucursal) {
		this.paisSucursal = paisSucursal;
	}
	
	
	public String[] getListaPaises() {
		return listaPaises;
	}
	public void setListaPaises(String[] listaPaises) {
		this.listaPaises = listaPaises;
	}
	public void setTipoSucursal(String pais) {
		this.tipoSucursal=pais;
	}
	
	public String getTipoSucursal(String paisSucursal) {
		
		for(int i=0;i<listaPaises.length;i++) {
			if(paisSucursal.equalsIgnoreCase(listaPaises[i])) {
				tipoSucursal="UE";
			}else {
				tipoSucursal="no_UE";
			}
		}
		return tipoSucursal;
		
	}
	
	
	
	
	

}

