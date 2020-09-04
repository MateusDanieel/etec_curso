package br.sp.gov.etec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.sp.gov.etec.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}