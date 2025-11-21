package br.fiap.gs.repository;

import br.fiap.gs.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> { }
