package br.com.banco.service;

import br.com.banco.model.Transacao;
import br.com.banco.repository.TransacaoRepository;
import br.com.banco.util.Filtro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {

    @Autowired
    TransacaoRepository transacaoRepository;


    public List<Transacao> getTransactions(Filtro filtro) {
        return transacaoRepository.getTransactions(filtro);
    }
}
