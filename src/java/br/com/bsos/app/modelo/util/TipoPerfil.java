package br.com.bsos.app.modelo.util;

public enum TipoPerfil {

	
	USUARIO("Usuario"),
	ADMINISTRADOR("Administrador");

	private String label;

	private TipoPerfil(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}