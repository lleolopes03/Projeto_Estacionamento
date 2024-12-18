package com.park.demo_park.Jwt;

import com.park.demo_park.entities.Usuario;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class JwtUserDetails  extends User {
    private Usuario usuario;

    public JwtUserDetails(Usuario usuario) {
        super(usuario.getUsername(), usuario.getPassword(), AuthorityUtils.createAuthorityList(usuario.getRole().name()));
        this.usuario = usuario;
    }
    public Long getId(){
        return this.usuario.getId();
    }
    public String getRole(){
        return this.usuario.getRole().name();
    }
}
