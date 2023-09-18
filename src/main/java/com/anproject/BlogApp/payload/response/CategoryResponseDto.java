package com.anproject.BlogApp.payload.response;

import com.anproject.BlogApp.entity.Category;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryResponseDto {
    private Long id;
    private String categoryName;

    public static CategoryResponseDto mapEntityToResponsetDto(Category category) {
        return CategoryResponseDto.builder()
                .id(category.getId())
                .categoryName(category.getCategoryName())
                .build();

    }

}
