package com.zhongli.devplatform.vo;

import lombok.Data;

@Data
public class CollectedVO {

    private Long collectedId;

    private Long userId;

    private Long taskId;

    private int status;

    private int result;

    private int commitStatus;

    private String commitContent;
}
