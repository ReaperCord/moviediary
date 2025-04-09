package br.com.moviediary.service;

import br.com.moviediary.entity.Category;
import br.com.moviediary.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    // Implementação para retornar todas as categorias
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    // Implementação para retornar uma categoria específica
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    // Implementação para salvar uma nova categoria
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Implementação para deletar uma categoria existente
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

}
