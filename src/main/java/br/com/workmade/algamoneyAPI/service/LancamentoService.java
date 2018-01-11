package br.com.workmade.algamoneyAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workmade.algamoneyAPI.model.Lancamento;
import br.com.workmade.algamoneyAPI.model.Pessoa;
import br.com.workmade.algamoneyAPI.repository.LancamentoRepository;
import br.com.workmade.algamoneyAPI.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {

	@Autowired
	private PessoaService pessoaService;
	@Autowired
	private LancamentoRepository lancamentoRepository;
	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaService.buscarPessoaPeloCodigo(lancamento.getPessoa().getCodigo());
		if(pessoa == null ||  !pessoa.isAtivo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}

	
}