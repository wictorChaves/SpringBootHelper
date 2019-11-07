package wictorchaves.github.io.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wictorchaves.github.io.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	Empresa findByCnpj(String cnpj);

}
