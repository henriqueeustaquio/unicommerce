package br.com.alura.unicommerce.modelo;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;

@Entity 
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private float qtdEstoque;
	private boolean status;
	private Long categoriaId;
	

}
