package com.br.Todas.por.uma.usuario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Table(name="Usuario")
@Entity
@Setter
@Getter
public class usuario {
	
	@Column(name="rg",columnDefinition = "numeric")
	@Id
	private Integer rg;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telefone",columnDefinition = "numeric")
	private Integer telefone;
	
}


