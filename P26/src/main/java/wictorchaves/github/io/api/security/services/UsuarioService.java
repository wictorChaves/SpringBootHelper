package wictorchaves.github.io.api.security.services;

import java.util.Optional;

import wictorchaves.github.io.api.security.entities.Usuario;

public interface UsuarioService {
	
	Optional<Usuario> buscarPorEmail(String email);

}
