package br.com.moviediary.service;

import br.com.moviediary.entity.Category;
import br.com.moviediary.entity.Streaming;
import br.com.moviediary.repository.StreamingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StreamingService {

    private final StreamingRepository repository;

    // Implementação para retornar todas as categorias
    public List<Streaming> findAll() {
        return repository.findAll();
    }

    // Implementação para retornar uma categoria específica
    public Optional<Streaming> findById(Long id) {
        return repository.findById(id);
    }

    // Implementação para salvar uma nova categoria
    public Streaming saveStreaming(Streaming streaming) {
        return repository.save(streaming);
    }

    // Implementação para deletar uma categoria existente
    public void deleteStreaming(Long id) {
        repository.deleteById(id);
    }
}
