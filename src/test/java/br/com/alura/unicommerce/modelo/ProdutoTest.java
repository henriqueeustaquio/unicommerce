package br.com.alura.unicommerce.modelo;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class ProdutoTest {
	
//Semana04	
	
	@Test
	public void TestePrecoProdutoZero() {
		Produto novoProduto = null;
		

		Categoria categoria = new Categoria();
		BigDecimal preco = new BigDecimal(0.0);		
		try{
			//novoProduto = new Produto(nome,descricao,quantidadeEstoque,categoria,preco);
			novoProduto = new Produto("Xaiomi","Smartphone",10,categoria,preco);
			
			}catch (Exception e) {
				System.out.println("Teste_2_Zero>>"+e);
			}
		assertEquals(null, novoProduto);
		}
	
		
	
	
		
	@Test
	public void TestePrecoProdutoNegativo() {
		Produto novoProduto = null;
		
//		String nome = "Xaiomi";
//		String descricao = "Smartphone";
//		int quantidadeEstoque = 10;
		Categoria categoria = new Categoria();
		BigDecimal preco = new BigDecimal("-10.0");
		
		try{
			//novoProduto = new Produto(nome,descricao,quantidadeEstoque,categoria,preco);
			novoProduto = new Produto("Xaiomi","Smartphone",10,categoria,preco);
			
			}catch (Exception e) {
				System.out.println("Teste_1_Negativo>>"+e);
			}
		assertEquals(null, novoProduto);
		}
	

	
	@Test
	public void TestePrecoProdutoPositivo() {
		Produto novoProduto = null;
		
		Categoria categoria = new Categoria();
		BigDecimal preco = new BigDecimal(13.3);		
		try{
			//novoProduto = new Produto(nome,descricao,quantidadeEstoque,categoria,preco);
			novoProduto = new Produto("Xaiomi","Smartphone",10,categoria,preco);
			
			}catch (Exception e) {
				//System.out.println("Teste_3_Positivo>>"+e);
			}
		System.out.println("Teste_3_Valor_Positivo - CORRETO!!!!>> "+preco);
		assertEquals(null, novoProduto);
		
		}
		
	
	

}
