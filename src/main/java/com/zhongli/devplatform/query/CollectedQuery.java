package com.zhongli.devplatform.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;


@Data
public class CollectedQuery extends Page {
    private Long collectedId;

    private Long userId;

    private Long taskId;

    private int status;

    private int result;

    private int commitStatus;

    private String commitContent;
}
