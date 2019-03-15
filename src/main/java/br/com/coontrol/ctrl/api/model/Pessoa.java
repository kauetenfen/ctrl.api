package br.com.coontrol.ctrl.api.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Pessoa extends AbstractEntity {
	
	private static final long serialVersionUID = 8891303934503253968L;

	private String nome;
	
	private Date dataNascimento;
	
	private String sexo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	
}
