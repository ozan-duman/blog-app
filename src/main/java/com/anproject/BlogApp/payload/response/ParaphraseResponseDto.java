package com.anproject.BlogApp.payload.response;

import com.anproject.BlogApp.entity.News;
import com.anproject.BlogApp.entity.Paraphrase;
import com.anproject.BlogApp.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ParaphraseResponseDto {
    private Long id;
    private String contents;
    private Date createdDate;

    private User user;
    private News news;

    public static ParaphraseResponseDto mapEntityToResponsetDto(Paraphrase paraphrase){
        return ParaphraseResponseDto.builder()
                .id(paraphrase.getId())
                .contents(paraphrase.getContents())
                .createdDate(paraphrase.getCreatedDate())
                .user(paraphrase.getUser())
                .news(paraphrase.getNews())
                .build();
    }
}
