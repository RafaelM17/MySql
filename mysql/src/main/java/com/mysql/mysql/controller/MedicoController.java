package com.mysql.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public medico salvar(@RequestBody medico medico) {
        return medicoRepository.save(medico);
    }

    @GetMapping
    public List<medico> listar() {
        return medicoRepository.findAll();
    }
}
