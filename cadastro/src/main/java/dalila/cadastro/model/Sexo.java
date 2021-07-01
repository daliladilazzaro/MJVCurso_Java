package dalila.cadastro.model;

public enum Sexo {
	F("Feminino"), M("Masculino");

	private String nome;

	private Sexo(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
