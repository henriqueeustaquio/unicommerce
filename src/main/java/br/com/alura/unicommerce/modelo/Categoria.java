package br.com.alura.unicommerce.modelo;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;


//DUVIDA - Porque o STS não reconheceu @Entity e não sugeriu a importação da lib javax.persistence.Entity;? 
@Entity 
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private boolean status;

}
