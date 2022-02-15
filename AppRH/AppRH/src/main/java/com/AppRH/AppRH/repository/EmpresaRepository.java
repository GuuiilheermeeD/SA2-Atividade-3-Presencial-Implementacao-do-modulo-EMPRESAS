package com.AppRH.AppRH.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.AppRH.AppRH.models.Empresa;

public interface EmpresaRepository extends CrudRepository<Empresa, String>{
	Empresa findById(long id);
	List<Empresa> findByNomeEmpresa(String nome);

	
	
}
