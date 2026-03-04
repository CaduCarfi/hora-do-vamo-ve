package com.cadu.milagre.service;

import com.cadu.milagre.model.MilagreModel;
import com.cadu.milagre.repository.MilagreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/milagres")
public class MilagreService {

    @Autowired
    private MilagreRepository milagreRepository;

    //Get
    @GetMapping
    public List<MilagreModel> milagreModelList() {
        return milagreRepository.findAll();
    }
    //Post
    @PostMapping
    public MilagreModel criar(@RequestBody MilagreModel milagreModel) {
        return milagreRepository.save(milagreModel);
    }
    //Delete
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        milagreRepository.deleteById(id);
    }
    //PUT
    @PutMapping("/{id}")
    public MilagreModel atualizar(@PathVariable Long id,@RequestBody MilagreModel milagreModel) {
        MilagreModel newMilagre = milagreRepository.findById(id).get();
        newMilagre.setNome(milagreModel.getNome());
        return milagreRepository.save(newMilagre);
    }
}
