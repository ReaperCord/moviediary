package br.com.moviediary.service;

import br.com.moviediary.controller.request.MovieRequest;
import br.com.moviediary.entity.Category;
import br.com.moviediary.entity.Movie;
import br.com.moviediary.entity.Streaming;
import br.com.moviediary.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {

    // Esse repository é responsável por gerir a lógica de negócios relacionada aos filmes.
    private final MovieRepository movieRepository;
    private final CategoryService categoryService;
    private final StreamingService streamingService;


    public Movie save(Movie movie) {
        movie.setCategories(this.findCategories(movie.getCategories()));
        movie.setStreamings(this.findStreamings(movie.getStreamings()));

        return movieRepository.save(movie);
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findById(long id) {
        return movieRepository.findById(id);
    }


    //Métodos de injeção de categorias e streamings
    private List<Category> findCategories(List<Category> categories) {
        List<Category> categoriesFound = new ArrayList<>();
        categories.forEach(category -> categoryService.findById(category.getId()).ifPresent(categoriesFound::add));

        return categoriesFound;
    }

    private List<Streaming> findStreamings(List<Streaming> streamings) {
        List<Streaming> streamingsFound = new ArrayList<>();
        streamings.forEach(s -> {
            streamingService.findById(s.getId()).ifPresent(streamingsFound::add);
        });

        return streamingsFound;
    }
}
