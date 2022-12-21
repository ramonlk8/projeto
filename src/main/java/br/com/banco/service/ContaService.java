package br.com.banco.service;

import br.com.banco.model.Conta;
import br.com.banco.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    @Autowired

    ContaRepository contaRepository;


    public List<Conta> getAll() {
        return contaRepository.findAll();
    }
}
