package br.com.alura.unicommerce.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.unicommerce.dao.CategoriaDAO;
import br.com.alura.unicommerce.dao.ClienteDAO;
import br.com.alura.unicommerce.dao.PedidoDAO;
import br.com.alura.unicommerce.dao.ProdutoDAO;
import br.com.alura.unicommerce.modelo.Cliente;
import br.com.alura.unicommerce.modelo.Produto;
import br.com.alura.unicommerce.util.JPAUtil;
import br.com.alura.unicommerce.vo.RelatorioClientesFiesVo;
import br.com.alura.unicommerce.vo.RelatorioDeVendasVo;
import br.com.alura.unicommerce.vo.RelatorioProdutosMaisVendidosVo;
import br.com.alura.unicommerce.vo.RelatorioVendasPorCategoriaVo;

public class RelatoriosController {
	
	
	
	public static void main(String[] args) {
        
		relatorioVendasPorCategoriaMetodo();
		relatorioClientesFiesMetodo();
		relatorioProdutosMaisVendidosMetodo();
		
    }
	
	
		public static void  relatorioVendasPorCategoriaMetodo() {
			
			EntityManager em = JPAUtil.getEntityManager();
	        CategoriaDAO categoriaDao = new CategoriaDAO(em);
   
	        List<RelatorioVendasPorCategoriaVo> relatorio = categoriaDao.relatorioVendasPorCategoria();
			for (RelatorioVendasPorCategoriaVo relatorioItem : relatorio) {
			    System.out.println(relatorioItem);
			    
			    
			}
	       em.close();
			
		}
	
		public static void  relatorioClientesFiesMetodo() {
				
				EntityManager em = JPAUtil.getEntityManager();
		        ClienteDAO clienteDao = new ClienteDAO(em);

		        List<RelatorioClientesFiesVo> relatorio = clienteDao.relatorioClientesFies();
				for (RelatorioClientesFiesVo relatorioItem : relatorio) {
				    System.out.println(relatorioItem);
				    
				    
				}
		       em.close();
			
		}
		
		
		public static void relatorioProdutosMaisVendidosMetodo() {
		    EntityManager em = JPAUtil.getEntityManager();
		    ProdutoDAO produtoDao = new ProdutoDAO(em);
		    
		    List<RelatorioProdutosMaisVendidosVo> relatorio = produtoDao.relatorioProdutosMaisVendidos();
			for (RelatorioProdutosMaisVendidosVo relatorioItem : relatorio) {
			    System.out.println(relatorioItem);
			    
			    
			}
	       em.close();
		    
		}
		
		public static void RelatorioDeVendas() {
			
			EntityManager em = JPAUtil.getEntityManager();
			
			em.getTransaction().begin();
			
			PedidoDAO pedidoDao = new PedidoDAO(em);
			
			List<RelatorioDeVendasVo> relatorio = pedidoDao.relatorioDeVendas();
			for (RelatorioDeVendasVo relatorioItem : relatorio) {
			    System.out.println(relatorioItem);
			    
			    
			}
		}
}
