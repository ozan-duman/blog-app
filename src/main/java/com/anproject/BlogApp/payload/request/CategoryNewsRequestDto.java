package com.anproject.BlogApp.payload.request;

import com.anproject.BlogApp.entity.Category;
import com.anproject.BlogApp.entity.News;
import com.anproject.BlogApp.entity.Paraphrase;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryNewsRequestDto {

    private News news;
    private Category category;

    public static CategoryNewsRequestDto mapRequestDtoToEntity(CategoryNewsRequestDto requestDto){
        return CategoryNewsRequestDto.builder()
                .news((requestDto.getNews()))
                .category(requestDto.getCategory())
                .build();


    }
}
