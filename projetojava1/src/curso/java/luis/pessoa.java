package curso.java.luis;

public class pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	private Date datanacimento;
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public Date getDatanacimento() {
		return datanacimento;
	}
	public void setDatanacimento(Date datanacimento) {
		this.datanacimento = datanacimento;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
}
