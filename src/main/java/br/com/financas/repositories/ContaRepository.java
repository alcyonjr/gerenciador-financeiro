package br.com.financas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.financas.entities.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

}
