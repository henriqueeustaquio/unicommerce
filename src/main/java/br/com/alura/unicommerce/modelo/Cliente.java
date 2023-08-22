package br.com.alura.unicommerce.modelo;


import javax.annotation.processing.Generated;
import javax.persistence.Entity;

@Entity 
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	

}
