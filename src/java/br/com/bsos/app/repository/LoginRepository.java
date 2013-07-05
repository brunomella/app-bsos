package br.com.bsos.app.repository;

import br.com.bsos.app.modelo.Usuario;



public interface LoginRepository {

	Usuario autenticar(String email, String senha);

}