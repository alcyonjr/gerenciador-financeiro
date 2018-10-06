package br.com.financas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.financas.entities.Despesa;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {

}
