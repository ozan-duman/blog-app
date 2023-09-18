package com.anproject.BlogApp.payload.response;

import com.anproject.BlogApp.entity.News;
import com.anproject.BlogApp.entity.User;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewsResponseDto {
    private Long id;
    private String title;
    private String contents;
    private Date createdDate;


    private User user;

    public static NewsResponseDto mapEntityToResponsetDto(News news) {
        return NewsResponseDto.builder()
                .id(news.getId())
                .title(news.getTitle())
                .contents(news.getContents())
                .createdDate(news.getCreatedDate())
                .build();
    }


}
