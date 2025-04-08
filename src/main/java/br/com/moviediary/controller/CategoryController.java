package br.com.moviediary.controller;

import br.com.moviediary.entity.Category;
import br.com.moviediary.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/moviediary/category")
@RequiredArgsConstructor
public class CategoryController {

    // Injeção de dependência do serviço de categoria
    private final CategoryRepository categoryRepository;

    // Implementação para retornar todas as categorias
    @GetMapping()
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

}
