package mjv.spring.web.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mjv.spring.web.rest.model.Cadastro;
import mjv.spring.web.rest.repository.CadastroRepository;

@Service
public class CadastroService {
	
	@Autowired
	private CadastroRepository repository;
	
//	@Autowired
//	private ProfissaoRepository profissaoRepository;
//	
	public void salvarCadastro(Cadastro cadastro) {
		
		repository.save(cadastro);
		
	}
	
}
