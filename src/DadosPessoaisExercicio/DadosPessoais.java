package DadosPessoaisExercicio;

public class DadosPessoais {
	private String nome;
	private int idade;
	private double altura;
	public DadosPessoais(String nome, int idade, double altura) {
		this.altura = altura;
		this.idade = idade;
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public int getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}
}
