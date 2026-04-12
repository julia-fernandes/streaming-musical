package org.example.streamingmusical.controller;

import jakarta.validation.Valid;
import org.example.streamingmusical.model.Musica;
import org.example.streamingmusical.service.MusicaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/streaming")
public class MusicaController {

    private final MusicaService service;

    public MusicaController(MusicaService service){
        this.service = service;
    }

    @GetMapping
    public List<Musica> listarMusicas(){
        return service.listarMusicas();
    }

    @GetMapping("/{id}")
    public Musica buscarId(@PathVariable Long id){
        return service.buscarId(id);
    }

    @GetMapping("/buscar")
    public List<Musica> buscarNome(String nome){
        return service.buscarMusica(nome);
    }

    @PostMapping
    public Musica salvarMusica(@Valid @RequestBody Musica musica){
        return service.salvarMusica(musica);
    }

    @PutMapping("/{id}")
    public Musica alterarMusica(@PathVariable @Valid @RequestBody Long id, Musica musica){
        return service.alterarMusica(id, musica);
    }

    @DeleteMapping("/{id}")
    public void deletarMusica(@PathVariable Long id){
        service.deletarMusica(id);
    }
}
