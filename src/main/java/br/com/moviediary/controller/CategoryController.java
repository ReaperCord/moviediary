package br.com.moviediary.controller;

import br.com.moviediary.controller.request.CategoryRequest;
import br.com.moviediary.controller.response.CategoryResponse;
import br.com.moviediary.entity.Category;
import br.com.moviediary.mapper.CategoryMapper;
import br.com.moviediary.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moviediary/category")
@RequiredArgsConstructor
public class CategoryController {

    // Injeção de dependência do serviço de categoria
    private final CategoryService categoryService;

    // Implementação para retornar todas as categorias
    @GetMapping()
    public ResponseEntity<List<CategoryResponse>> getAllCategories() {
        List<CategoryResponse> categories = categoryService.findAll()
                .stream()
                .map(CategoryMapper::toCategoryResponse)
                .toList();

        return ResponseEntity.ok(categories);
    }

    // Implementação para retornar uma categoria específica
    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponse> getCategoryById(@PathVariable Long id) {
        return categoryService.findById(id)
            .map(category -> ResponseEntity.ok(CategoryMapper.toCategoryResponse(category)))
            .orElse(ResponseEntity.notFound().build());
    }

    // Implementação para salvar uma nova categoria
    @PostMapping
    public ResponseEntity<CategoryResponse> saveCategory(@RequestBody CategoryRequest request) {
        CategoryMapper.toCategory(request);
        Category newCategory = CategoryMapper.toCategory(request);
        Category savedCategory = categoryService.saveCategory(newCategory);

        return ResponseEntity.status(HttpStatus.CREATED).body(CategoryMapper.toCategoryResponse(savedCategory));
    }

    // Implementação para deletar uma categoria existente
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteByCategoryId(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
