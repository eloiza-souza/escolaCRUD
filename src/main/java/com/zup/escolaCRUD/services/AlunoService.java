package com.zup.escolaCRUD.services;

import com.zup.escolaCRUD.models.Aluno;

import java.util.List;

public interface AlunoService {
    public List<Aluno> listAll();
    public Aluno save(Aluno aluno);
    public Aluno update(Long id, Aluno alunoAtualizado);
    public void delete(Long id);

}
