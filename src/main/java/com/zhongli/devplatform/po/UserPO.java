package com.zhongli.devplatform.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("doiyin_awesome_user")
public class UserPO {

        @TableId(type = IdType.AUTO)
        private Long userId;

        private Long account;

        private int score;

        private int likes;

}
