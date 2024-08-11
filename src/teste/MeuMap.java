package teste;

/**
*Classe base que recebe um parâmetro genérico
*
*@author gianlucamk04@gmail.com
*
*@param <T> Parâmetro principal da classe
**/
public class MeuMap<T> {
	private String chave;
	private T valor;
	
	/**
	 * Detalhamento do construtor
	 * 
	 * @param chave Chave da Classe, utilizando como uma classe primária, valor String
	 * @param valor Valor é um tipo genérico que será passado na criação do objeto
	 */
	public MeuMap(String chave, T valor) {
		super();
		this.chave = chave;
		this.valor = valor;
	}
}
