package wictorchaves.github.io.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wictorchaves.github.io.api.dtos.EmpresaDto;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

	@PostMapping
	public ResponseEntity<EmpresaDto> cadastrar(@RequestBody EmpresaDto empresaDto){
		empresaDto.setId(1L);
		return ResponseEntity.ok(empresaDto);
	}
	
}
