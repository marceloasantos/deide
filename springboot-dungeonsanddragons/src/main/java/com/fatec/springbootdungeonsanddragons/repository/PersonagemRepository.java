package com.fatec.springbootdungeonsanddragons.repository;

import com.fatec.springbootdungeonsanddragons.entity.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Long> {
    // List<Personagem> findByNome(String nome);
}
