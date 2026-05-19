package com.example.listatarefas.service;

import com.example.listatarefas.model.Tarefa;
import com.example.listatarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public Tarefa salvar(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public List<Tarefa> listarTodas() {
        return repository.findAll();
    }

    public Tarefa buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public long contarTarefasConcluidas() {
        return repository.countByConcluidaTrue();
    }
}