package wictorchaves.github.io.api.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import wictorchaves.github.io.api.security.entities.Usuario;
import wictorchaves.github.io.api.security.enums.PerfilEnum;

public class JwtUserFactory {
	
	private JwtUserFactory() {
		
	}
	
	public static JwtUser create(Usuario usuario) {
		return new JwtUser(usuario.getId(), usuario.getEmail(), usuario.getSenha(), mapToGrantedAuthorities(usuario.getPerfil()));
	}
	
	private static List<GrantedAuthority> mapToGrantedAuthorities(PerfilEnum perfilEnum){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(perfilEnum.toString()));
		return authorities;
	}

}
