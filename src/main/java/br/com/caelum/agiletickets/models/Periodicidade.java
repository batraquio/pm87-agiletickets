package br.com.caelum.agiletickets.models;

public enum Periodicidade {

	DIARIA(1), SEMANAL(7);
	private Periodicidade(int dias) {
		this.dias = dias;
	}

	private int dias;

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

}
