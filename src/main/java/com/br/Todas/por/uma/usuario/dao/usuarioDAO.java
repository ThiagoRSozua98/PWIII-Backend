package com.br.Todas.por.uma.usuario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.Todas.por.uma.usuario.model.Usuario;

public interface usuarioDAO extends JpaRepository<Usuario , Integer >  {

}
