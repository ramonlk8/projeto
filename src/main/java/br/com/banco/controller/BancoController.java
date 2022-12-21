package br.com.banco.controller;

import br.com.banco.service.ContaService;
import br.com.banco.service.TransacaoService;
import br.com.banco.util.Filtro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/banco")
public class BancoController {


    @Autowired
    ContaService contaService;
    @Autowired
    TransacaoService transacaoService;


    @GetMapping("/transacao")
    public ResponseEntity<?> getAllTransaction(Filtro filtro) {
        return new ResponseEntity<>(transacaoService.getTransactions(filtro), HttpStatus.OK);
    }
}
