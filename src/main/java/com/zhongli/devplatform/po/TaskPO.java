package com.zhongli.devplatform.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("doiyin_awesome_task")
public class TaskPO {

        @TableId(type = IdType.AUTO)
        private Long taskId;

        private Long userId;

        private String taskTitle;

        private String taskPoints;

        private Date publishDate;

        private Date stopDate;

        private String description;

        private int status;

}
