package com.zhongli.devplatform.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("doiyin_awesome_collected")
public class CollectedPO {

        @TableId(type = IdType.AUTO)
        private Long collectedId;

        private Long userId;

        private Long taskId;

        private int status;

        private int result;

        private int commitStatus;

        private String commitContent;
}
