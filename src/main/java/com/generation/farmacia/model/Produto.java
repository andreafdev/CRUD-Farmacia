package com.generation.farmacia.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(max = 100)
	@NotBlank(message = "O nome é obrigatório!")
	private String nome;

	@Size(max = 255)
	@NotBlank(message = "A descrição é obrigatória!")
	private String descricao;

	@Size(min = 10, max = 10)
	@NotBlank(message = "A data de validade é obrigatória!")
	private String datavalidade;

	@NotNull(message = "O preço é obrigatório!")
	private BigDecimal preco;

	@NotNull(message = "A quantidade é obrigatória!")
	private Integer quantidade;
	
	@NotBlank(message = "A foto é obrigatório!")
	@Size(max = 5000, message = "O link da foto não deve conter mais do que 5000 caracteres!")
	private String foto;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDatavalidade() {
		return datavalidade;
	}

	public void setDatavalidade(String datavalidade) {
		this.datavalidade = datavalidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
}