package com.anproject.BlogApp.payload.request;

import com.anproject.BlogApp.entity.User;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class RegularUserRequestDto {
    private String firstName;
    private String lastName;
    private String nickname;
    private String email;
    private String password;

    public static User mapRequestDtoToEntity(RegularUserRequestDto regularUserRequestDto){

        return User.builder()
                .firstName(regularUserRequestDto.firstName)
                .lastName(regularUserRequestDto.lastName)
                .nickname(regularUserRequestDto.nickname)
                .email(regularUserRequestDto.email)
                .password(regularUserRequestDto.password)
                .build();

    }

}
