package org.fatec.l1b.controller;

import org.fatec.l1b.db.PessoaRepository;
import org.fatec.l1b.model.Cliente;
import org.fatec.l1b.model.Telefone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastroController {
	@Autowired
	private PessoaRepository pr;

	@GetMapping("/cadastrar")
	public String paginaCadastro() {
		return "cadastro";
	}

	@PostMapping("/cadastrar")
	public String paginaCadastro(Cliente c, Telefone t) {
		c.getListaTelefones().add(t);
		pr.save(c);
		return "cadastro";
	}
}
