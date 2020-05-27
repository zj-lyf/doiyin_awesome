package com.zhongli.devplatform.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.util.Date;


@Data
public class TaskQuery extends Page {
    private Long taskId;

    private Long userId;

    private String taskTitle;

    private String taskPoints;

    private Date publishDate;

    private Date stopDate;

    private String description;

    private int status;
}
