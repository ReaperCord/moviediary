package br.com.moviediary.controller.response;

import lombok.Builder;

@Builder
public record CategoryResponse(Long id, String name) {
    // O construtor é gerado automaticamente pelo record, não é necessário criar um construtor manualmente.

}
