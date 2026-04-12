package org.example.streamingmusical.service;

import org.example.streamingmusical.model.Musica;
import org.example.streamingmusical.repository.MusicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaService {

    private final MusicaRepository repository;

    public MusicaService(MusicaRepository repository){
        this.repository = repository;
    }

    public List<Musica> listarMusicas(){
        return repository.findAll();
    }

    public Musica buscarId(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Música não encontrada."));
    }

    public List<Musica> buscarMusica(String nome){
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public Musica salvarMusica(Musica musica){
        return repository.save(musica);
    }

    public Musica alterarMusica(Long id, Musica musica){
        buscarId(id);
        musica.setId(id);
        return repository.save(musica);
    }

    public void deletarMusica(Long id){
        repository.deleteById(id);
    }
}
