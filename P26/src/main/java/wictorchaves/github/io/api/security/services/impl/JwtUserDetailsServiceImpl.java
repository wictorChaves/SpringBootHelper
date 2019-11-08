package wictorchaves.github.io.api.security.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import wictorchaves.github.io.api.security.JwtUserFactory;
import wictorchaves.github.io.api.security.entities.Usuario;
import wictorchaves.github.io.api.security.services.UsuarioService;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> funcionario = usuarioService.buscarPorEmail(username);
		
		if(funcionario.isPresent()) {
			return JwtUserFactory.create(funcionario.get());
		}
		
		throw new UsernameNotFoundException("E-mail não encontrado.");
	}

}
