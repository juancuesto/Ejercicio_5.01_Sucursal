package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.entity.Sucursal;

 
@Repository
public interface ISucursalRepository extends JpaRepository<Sucursal, Long> {

}
