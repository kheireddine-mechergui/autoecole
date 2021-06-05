package com.autoecole;

import lombok.*;

import java.io.Serializable;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Todo implements Serializable {
    private Long todoId = null;
    private String todo;
    private String description;
}
