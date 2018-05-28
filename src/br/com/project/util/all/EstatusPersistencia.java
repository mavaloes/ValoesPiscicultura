package br.com.project.util.all;

public enum EstatusPersistencia {

	ERRO("Erro"), SUCESSO("Sucesso"), 
	OBJETO_REFERENCIADO("Esso objeto não pode ser apagado por possuir referências ao mesmo.");

	private String name;

	private EstatusPersistencia(String s) {
		this.name = s;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
