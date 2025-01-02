package com.cinnmon.user_service.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String name;
    private String email;
    private String password;
}
