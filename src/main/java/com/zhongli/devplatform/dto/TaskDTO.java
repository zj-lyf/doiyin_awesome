package com.zhongli.devplatform.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TaskDTO {

    private Long taskId;

    private Long userId;

    private String phone;

    private String taskTitle;

    private int taskPoints;

    private Date publishDate;

    private Date stopDate;

    private String description;

    private int status;


}
