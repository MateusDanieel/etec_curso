package br.sp.gov.etec.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.dto.CursoDto;
import br.sp.gov.etec.entity.Curso;
import br.sp.gov.etec.service.CursoService;

@RestController
@RequestMapping("/api/curso")
public class CursoConroller {
	
	@Autowired
	CursoService service;

	@PostMapping
	public ResponseEntity<?> cadastrarCurso(@RequestBody CursoDto dto) {
		// ResponseEntity<?> Se estiver interrogação é por que não sei o que devolver.
	   Curso curso = service.cadastrarCurso(dto);
		return ResponseEntity.status(HttpStatus.OK).body(curso);
	}

	@GetMapping
	public ResponseEntity<?> Cruso(CursoDto dto){
		List<Curso> curso = service.listaCursos();
		return ResponseEntity.status(HttpStatus.OK).body(curso);
	}
}
