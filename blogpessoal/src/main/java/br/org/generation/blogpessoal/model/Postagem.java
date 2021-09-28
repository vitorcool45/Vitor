package br.org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //gera tabela no banco de dados
@Table(name = "tb_postagens") // definir nome da tabela
public class Postagem {
	
	@Id//Chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)//AUTO_INCREMENT
	private long id ;
	
	@NotNull(message = "Título obrigatório.")
	@Size(min = 5, max = 100, message = "Título deve conter no mínimo 5 caracteres e no máximo 100.")
	private String titulo;
	
	@NotNull(message = "Texto obrigatório.")
	@Size(min = 10, max = 1000, message = "Texto deve conter no mínimo 10 caracteres e no máximo 1000.")
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
		
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	
}
