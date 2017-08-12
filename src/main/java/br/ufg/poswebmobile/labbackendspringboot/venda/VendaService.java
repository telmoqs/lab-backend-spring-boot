package br.ufg.poswebmobile.labbackendspringboot.venda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

	@Autowired
	VendaRepository vendaRepository;

	public Venda salvar(Venda venda) {
		return vendaRepository.save(venda);
	}

	public Venda consultar(Integer codigo) {
		return vendaRepository.findOne(codigo);
	}

	public List<Venda> listar() {
		return (List<Venda>) vendaRepository.findAll();
	}

}
