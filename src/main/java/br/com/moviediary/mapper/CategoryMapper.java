package br.com.moviediary.mapper;

import br.com.moviediary.controller.request.CategoryRequest;
import br.com.moviediary.controller.response.CategoryResponse;
import br.com.moviediary.entity.Category;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CategoryMapper {

    public static Category toCategory(CategoryRequest categoryRequest) {
        return Category
                .builder()
                .name(categoryRequest.name())
                .build();
    }

    public static CategoryResponse toCategoryResponse(Category category) {
        return CategoryResponse
                .builder()
                .id(category.getId())
                .name(category.getName())
                .build();

    }
}
