package com.zhongli.devplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongli.devplatform.po.UserPO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<UserPO> {
    @Select("select user_id from doiyin_awesome_user where account = #{account}")
    Long findByAccount(Long account);
}
