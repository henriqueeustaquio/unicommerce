package br.com.alura.unicommerce.controller;

import javax.persistence.EntityManager;

import br.com.alura.unicommerce.dao.CategoriaDAO;
import br.com.alura.unicommerce.util.JPAUtil;

public class TesteAutomatizadoController {

	
	public static void main (String[] args) {
		
		
		EntityManager em = JPAUtil.getEntityManager();
		// TESTE  RELATORIO DE VENDAS POR CATEGORIA
		//Gerar relatório com uma lista com um único pedido;
		//Gerar relatório com uma lista sem pedidos.
		//Gerar relatório com todos os dados
		//Validar todas as regras de cálculo
		CategoriaDAO testeCategoria = new CategoriaDAO(em); 
		
		
	}
	
	
}
