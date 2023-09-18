package com.anproject.BlogApp.payload.request;

import com.anproject.BlogApp.entity.News;
import com.anproject.BlogApp.entity.User;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewsRequestDto {
    private String title;
    private String contents;
    private String photos;
    private Date createdDate;


    private User user;

    public static News mapRequestDtoToEntity(NewsRequestDto requestDto){
        return News.builder()
                .title(requestDto.getTitle())
                .contents(requestDto.getContents())
                .photos(requestDto.getPhotos())
                .user((requestDto.getUser()))
                .createdDate((requestDto.getCreatedDate()))
                .build();


    }

}
