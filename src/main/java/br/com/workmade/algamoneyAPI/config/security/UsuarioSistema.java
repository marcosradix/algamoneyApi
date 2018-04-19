package br.com.workmade.algamoneyAPI.config.security;



import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import br.com.workmade.algamoneyAPI.model.Usuario;

public class UsuarioSistema extends User{

	private static final long serialVersionUID = -398150566874958172L;
	private Usuario usuario;
	
	public UsuarioSistema(Usuario usuario, Collection<? extends GrantedAuthority> authorities) {
		super(usuario.getEmail(), usuario.getSenha(), authorities);
		this.usuario = usuario;
	}

	
	public Usuario getUsuario() {
		return usuario;
	}

}
