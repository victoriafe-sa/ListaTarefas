package com.example.listatarefas.controller;

import com.example.listatarefas.dto.TarefaResumoDTO;
import com.example.listatarefas.model.Tarefa;
import com.example.listatarefas.service.TarefaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    // 2. Listar todas as tarefas cadastradas
    @GetMapping
    public List<Tarefa> listarTodas() {
        return service.listarTodas();
    }

    // 1. Criar uma tarefa (com validação @Valid)
    @PostMapping
    public Tarefa criar(@Valid @RequestBody Tarefa tarefa) {
        return service.salvar(tarefa);
    }

    // 3. Atualizar tarefa existente
    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizar(@PathVariable Long id, @RequestBody Tarefa tarefaAtualizada) {
        Tarefa tarefa = service.buscarPorId(id);
        
        tarefa.setTitulo(tarefaAtualizada.getTitulo());
        tarefa.setDescricao(tarefaAtualizada.getDescricao());
        tarefa.setConcluida(tarefaAtualizada.isConcluida());
        
        return ResponseEntity.ok(service.salvar(tarefa));
    }

    // 4. Excluir tarefa pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build(); // Retorna 204 No Content
    }

    // 6. (Opcional) Contagem via DTO
    @GetMapping("/resumo")
    public ResponseEntity<TarefaResumoDTO> resumoConcluidas() {
        long total = service.contarTarefasConcluidas();
        return ResponseEntity.ok(new TarefaResumoDTO(total));
    }
}