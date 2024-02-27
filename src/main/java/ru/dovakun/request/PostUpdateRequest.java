package ru.dovakun.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PostUpdateRequest {
    private Integer id;
    private Integer userId;
    private String title;
    private String body;
}
