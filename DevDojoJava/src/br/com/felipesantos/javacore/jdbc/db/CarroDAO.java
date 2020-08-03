package br.com.felipesantos.javacore.jdbc.db;

import java.util.List;

import br.com.felipesantos.javacore.jdbc.classes.Carro;

public interface CarroDAO {

	void save(Carro carro);

	void delete(Carro carro);

	void update(Carro carro);

	List<Carro> selectAll();

	List<Carro> findByName(String nome);

	Carro findById(Integer id);

}
