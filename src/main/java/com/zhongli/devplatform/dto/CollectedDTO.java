package com.zhongli.devplatform.dto;

import lombok.Data;

@Data
public class CollectedDTO {

    private Long collectedId;

    private Long userId;

    private Long taskId;

    private int status;

    private int result;

    private int commitStatus;

    private String commitContent;
}
