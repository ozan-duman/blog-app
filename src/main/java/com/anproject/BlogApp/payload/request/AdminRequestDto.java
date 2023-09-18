package com.anproject.BlogApp.payload.request;

import com.anproject.BlogApp.entity.Role;
import com.anproject.BlogApp.entity.User;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AdminRequestDto {
    private String nickname;
    private String password;

    private Role role;


    public static User mapRequestDtoToEntity(AdminRequestDto requestDto){
        return User.builder()
                .nickname(requestDto.getNickname())
                .password(requestDto.getPassword())
                .role((requestDto.getRole()))
                .build();

    }


}
