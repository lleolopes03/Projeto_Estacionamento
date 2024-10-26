package com.park.demo_park.web.controller.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioResponseDto {
    private Long id;
    private String username;
    private String role;
}

