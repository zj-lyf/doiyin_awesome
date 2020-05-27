package com.zhongli.devplatform.vo;

import lombok.Data;

import java.util.Date;

@Data
public class TaskVO {

    private Long taskId;

    private Long userId;

    private String taskTitle;

    private String taskPoints;

    private Date publishDate;

    private Date stopDate;

    private String description;

    private int status;
}
