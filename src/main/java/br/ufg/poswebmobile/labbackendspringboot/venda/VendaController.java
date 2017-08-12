package br.ufg.poswebmobile.labbackendspringboot.venda;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vendas")
public class VendaController {

	@Autowired
	VendaService vendaService;

	@PostMapping()
	public Venda salvarVenda(@RequestBody @Valid Venda venda){
		return vendaService.salvar(venda);
	}

	@GetMapping()
	public List<Venda> listarVendas(){
		return vendaService.listar();
	}

	public void apagarVenda(Venda venda){
		System.out.println("Apagou");
	}

}
