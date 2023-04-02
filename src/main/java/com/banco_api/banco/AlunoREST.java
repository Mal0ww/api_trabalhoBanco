package com.banco_api.banco;

import java.util.List;
import java.util.Optional;

import com.banco_api.banco.banco.RepositorioAluno;
import com.banco_api.banco.entidade.Aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoREST{
    
    @Autowired
    private RepositorioAluno repositorio;
    
    @GetMapping
    public List<Aluno> listar(){
        return (List<Aluno>) repositorio.findAll();
    }

    @GetMapping("/{cpf}")
    public Optional<Aluno> aluno(@PathVariable String cpf){
        return repositorio.findById(cpf);
    }


    @PostMapping
    public void salvar(@RequestBody Aluno aluno){
        repositorio.save(aluno);
    }

    @PutMapping 
    public void alterar(@RequestBody Aluno aluno){
        if(aluno.getCpf() != ""){
            repositorio.save(aluno);
        }
    }
    
    @DeleteMapping("/{cpf}")
    public void excluir(@PathVariable String cpf){
        repositorio.deleteById(cpf); 
    }

}