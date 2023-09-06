package br.com.alura.unicommerce.controller;

import br.com.alura.unicommerce.dao.CategoriaDAO;
import br.com.alura.unicommerce.modelo.Categoria;

public class CategoriaController {
	
	
	public void criaCategoria(Categoria categoria) {
		
		
		CategoriaDAO categoriaDao = new CategoriaDAO(null);
		categoriaDao.cadastra(categoria);
		
		
	}

}
