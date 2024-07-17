package com.example.basic.Spring0717;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BoardPostDto {
    private Long id;
    private String content;
    private String author;
    private LocalDateTime createdAt;
}
