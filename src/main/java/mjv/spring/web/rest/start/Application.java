package mjv.spring.web.rest.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mjv.spring.web.rest.model.Cadastro;
import mjv.spring.web.rest.model.Endereco;
import mjv.spring.web.rest.model.Escolaridade;
import mjv.spring.web.rest.model.Sexo;
import mjv.spring.web.rest.repository.CadastroRepository;
import mjv.spring.web.rest.service.CadastroService;


@Component
public class Application implements CommandLineRunner {
	
	@Autowired
	private CadastroService cadastroService;

	@Override
	public void run(String... args) throws Exception {
		
		Cadastro cadastro = new Cadastro();
		Endereco end = new Endereco();
		//Profissao prof = new Profissao();
		
		
		end.setLogradouro("Av. Brasil");
		end.setBairro("Catolé");
		cadastro.setNome("Eddward");
		cadastro.setCpf("01289749563");
		cadastro.setAniversario("03021997");
		cadastro.setSexo(Sexo.M);
		cadastro.setEmail("eddward@gmail.com");
		cadastro.setEndereco(end);
		//prof.setNome("Treinee Java");
		//cadastro.setProfissao(prof);
		cadastro.setEscolaridade(Escolaridade.SUPERIOR);
		//cadastroService.salvarCadastro(cadastro);
		}
	
	

}
