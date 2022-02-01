package mjv.spring.web.rest.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "tab_cadastro")
public class Cadastro {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 60, nullable = false)
	private String nome;
	@Column(length = 14, nullable = false)
	private String cpf;
	@Column(length = 60, nullable = false)
	private String email;
	@Column(length = 10, nullable = false)
	private String aniversario;
	@Column(length = 60)
	private String foto;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 1)
	private Sexo sexo;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 25)
	private Escolaridade escolaridade;
	
	@Embedded
	private Endereco endereco;
	
//	@ManyToOne(cascade = CascadeType.PERSIST)
//	@JoinColumn(name = "prof_id")
//	private Profissao profissao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAniversario() {
		return aniversario;
	}
	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
		
	public Escolaridade getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
//	
//	public Profissao getProfissao() {
//		return profissao;
//	}
//	public void setProfissao(Profissao profissao) {
//		this.profissao = profissao;
//	}
//	
	
	
	
	
	
	
	
	
	
	

}
