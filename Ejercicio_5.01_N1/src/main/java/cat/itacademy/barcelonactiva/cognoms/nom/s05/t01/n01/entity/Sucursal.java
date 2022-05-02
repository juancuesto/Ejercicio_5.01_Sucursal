package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sucursal")
public class Sucursal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pk_IdSucursal")
	private Long idSucursal;
	@Column(name = "NombreSucursal", length = 100, unique = true, nullable = false)
	private String nomSucursal;
	@Column(name = "Pais", length = 100)
	private String paisSucursal;
	
	public Long getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(Long idSucursal) {
		this.idSucursal = idSucursal;
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
	@Override
	public String toString() {
		return "Sucursal [idSucursal=" + idSucursal + ", nomSucursal=" + nomSucursal + ", paisSucursal=" + paisSucursal
				+ "]";
	}
	
	
}

