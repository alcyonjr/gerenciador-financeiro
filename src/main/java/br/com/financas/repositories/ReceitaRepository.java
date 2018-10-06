package br.com.financas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.financas.entities.Receita;

@Repository
interface ReceitaRepository extends JpaRepository<Receita, Long> {

}
