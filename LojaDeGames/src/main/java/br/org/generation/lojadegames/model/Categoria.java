package br.org.generation.lojadegames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table (name = "tb_categoria")
public class Categoria {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotNull(message = "Nome do jogo obrigatorio")
		@Size(min = 5, max = 100, message = "O nome do jogo deve conter no mínimo 5 e no máximo 100 caracteres")
		private String nome;
		
		@NotNull(message = "O gênero do jogo deve ser informado")
		@Size(min = 5, max = 100)
		private String genero;
		
		@NotNull(message = "A faixa etária deve ser informada")
		private int faixaEtaria;
		
		@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("categoria")
		private List<Produto> produto;

		
		
		public List<Produto> getProduto() {
			return produto;
		}
		public void setProduto(List<Produto> produto) {
			this.produto = produto;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public int getFaixaEtaria() {
			return faixaEtaria;
		}
		public void setFaixaEtaria(int faixaEtaria) {
			this.faixaEtaria = faixaEtaria;
		}
		
	}