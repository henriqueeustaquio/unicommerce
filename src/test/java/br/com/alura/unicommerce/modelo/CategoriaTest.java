package br.com.alura.unicommerce.modelo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CategoriaTest {
	
	private void AssertEquals(Object object, Categoria novaCategoria) {
		// TODO Auto-generated method stub
		
	} 
	
	@Test
	public void TesteNomeCategoriaNulo() {
		Categoria novaCategoria = null;
		try{
			novaCategoria = new Categoria("",true);
			}catch (Exception e) {
				System.out.println("Teste_1_Nulo>>"+e);
			}
		assertEquals(null, novaCategoria);
		}
	
	
	@Test
	public void TesteNomeCategoriaVazio() {
		Categoria novaCategoria = null;
	    try{
	    	novaCategoria = new Categoria(null,true);
	    }catch (Exception e) {
	    	System.out.println("Teste_2_Vazio>>"+e);
	    }
	    //assertEquals(null, novaCategoria);        
	    AssertEquals(null,novaCategoria);
	}

	@Test
	public void TesteNomeCategoriaValido() {
		Categoria novaCategoria = new Categoria("Celular",true);
		assertEquals("Celular" , novaCategoria.getNome() );
	}
}
