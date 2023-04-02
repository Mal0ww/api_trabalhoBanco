package com.banco_api.banco.banco;

import com.banco_api.banco.entidade.Aluno;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioAluno extends CrudRepository<Aluno, String>{
    
}