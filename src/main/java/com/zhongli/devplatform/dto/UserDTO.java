package com.zhongli.devplatform.dto;

import lombok.Data;

@Data
public class UserDTO {

    private Long userId;

    private Long account;

    private int score;

    private int likes;
}
