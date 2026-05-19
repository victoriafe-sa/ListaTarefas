package com.example.listatarefas.repository;

import com.example.listatarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    // Método para o requisito opcional do DTO
    long countByConcluidaTrue(); 
}