package br.com.casadocodigo.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.casadocodigo.loja.dao.ProdoutoDAO;
import br.com.casadocodigo.loja.modelo.Produto;
import br.com.casadocodigo.loja.modelo.TipoPreco;

@Controller
public class ProdutoController {
	
	@Autowired
	ProdoutoDAO produtoDao;
	
	@RequestMapping("/cadastroproduto")
	public ModelAndView form(){
		ModelAndView modelAndView = new ModelAndView("produtoForm");
		modelAndView.addObject("tipos", TipoPreco.values());
		return modelAndView;
	}
	
	@RequestMapping("/produtos")
	public String recebeForm(Produto produto){
		System.out.println(produto);
		produtoDao.gravar(produto);
		return "ok";
	}
}
