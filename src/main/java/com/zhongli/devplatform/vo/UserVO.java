package com.zhongli.devplatform.vo;

import lombok.Data;

@Data
public class UserVO  {
    private Long userId;

    private Long account;

    private int score;

    private int likes;
}
