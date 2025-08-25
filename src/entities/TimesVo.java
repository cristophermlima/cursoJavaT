package entities;

public class TimesVo {

	private String nome;
	private int ano;
	
	public TimesVo () {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public TimesVo(String nome, int ano) {
		super();
		this.nome = nome;
		this.ano = ano;
	}
	
	
}
