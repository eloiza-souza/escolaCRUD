package com.zup.escolaCRUD.services;

import com.zup.escolaCRUD.models.Aluno;
import com.zup.escolaCRUD.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listAll() {
        return alunoRepository.findAll();
    }

    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno update(Long id, Aluno alunoAtualizado) {
        Aluno aluno = alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        aluno.setName(alunoAtualizado.getName());
        aluno.setAge(alunoAtualizado.getAge());
        return alunoRepository.save(aluno);
    }

    public void delete(Long id) {
        alunoRepository.deleteById(id);
    }
}
