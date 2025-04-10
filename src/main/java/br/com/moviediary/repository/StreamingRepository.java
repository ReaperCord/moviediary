package br.com.moviediary.repository;

import br.com.moviediary.entity.Streaming;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreamingRepository extends JpaRepository<Streaming, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário
}
