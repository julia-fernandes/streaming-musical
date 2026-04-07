package org.example.streamingmusical;

import org.example.streamingmusical.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicaRepository extends JpaRepository<Musica, Long> {

    List<Musica> findByNomeIgnoreCase(String nome);
}
