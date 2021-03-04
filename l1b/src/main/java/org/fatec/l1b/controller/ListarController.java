package org.fatec.l1b.controller;

import java.util.List;

import org.fatec.l1b.db.PessoaRepository;
import org.fatec.l1b.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListarController {
	@Autowired
	private PessoaRepository pr;

	@GetMapping("/listar-clientes")
	public ModelAndView listarPessoas() {
		List<Pessoa> pessoas = pr.findAll();
		ModelAndView mv = new ModelAndView("listar");
		mv.addObject("pessoas", pessoas);
		return mv;
	}
}
