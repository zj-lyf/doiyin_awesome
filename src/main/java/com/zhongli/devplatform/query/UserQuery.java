package com.zhongli.devplatform.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;


@Data
public class UserQuery extends Page {
    private Long userId;

    private Long account;

    private int score;

    private int likes;
}
