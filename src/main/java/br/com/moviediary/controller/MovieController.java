package br.com.moviediary.controller;

import br.com.moviediary.controller.request.MovieRequest;
import br.com.moviediary.controller.response.MovieResponse;
import br.com.moviediary.entity.Movie;
import br.com.moviediary.mapper.MovieMapper;
import br.com.moviediary.repository.MovieRepository;
import br.com.moviediary.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moviediary/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;
    private final MovieRepository movieRepository;

    @PostMapping
    public ResponseEntity<MovieResponse> saveMovie(@RequestBody MovieRequest request) {
        Movie savedMovie = movieService.save(MovieMapper.toMovie(request));

        return ResponseEntity.ok(MovieMapper.toMovieResponse(savedMovie));
    }

    @GetMapping
    public ResponseEntity<List<MovieResponse>> findAllMovies() {
         return ResponseEntity.ok(movieService.findAll()
                    .stream()
                    .map(MovieMapper::toMovieResponse)
                    .toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieResponse> findById(@PathVariable long id) {
        return movieService.findById(id)
                .map(movie -> ResponseEntity.ok(MovieMapper.toMovieResponse(movie)))
                .orElse(ResponseEntity.notFound().build());
    }

}
