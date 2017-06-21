package br.com.casadocodigo.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.dao.ProdoutoDAO;
import br.com.casadocodigo.loja.modelo.Produto;

@Controller
public class ProdutoController {
	
	@Autowired
	ProdoutoDAO produtoDao;
	
	@RequestMapping("/cadastroproduto")
	public String index(){
		return "produtoForm";
	}
	
	@RequestMapping("/produtos")
	public String recebeForm(Produto produto){
		System.out.println(produto);
		produtoDao.gravar(produto);
		return "ok";
	}
}
