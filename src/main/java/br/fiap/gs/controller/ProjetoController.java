package br.fiap.gs.controller;

import br.fiap.gs.dto.ProjetoCreateDTO;
import br.fiap.gs.model.Projeto;
import br.fiap.gs.service.ProjetoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/projetos")
public class ProjetoController {
    private final ProjetoService service;
    public ProjetoController(ProjetoService service) { this.service = service; }

    @GetMapping
    public ResponseEntity<?> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<?> criar(@Valid @RequestBody ProjetoCreateDTO dto) {
        Projeto criado = service.criar(dto);
        return ResponseEntity.status(201).body(criado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @Valid @RequestBody ProjetoCreateDTO dto) {
        return ResponseEntity.ok(service.atualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
