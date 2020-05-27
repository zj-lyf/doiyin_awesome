package com.zhongli.devplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongli.devplatform.po.AccountPO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountMapper extends BaseMapper<AccountPO> {

    /*@Insert("insert into dev_platform_account values(#{phoneNum})")
    void register(@Param("phoneNum") String phoneNum);*/

    @Select("select id from dev_platform_account where phone_num = #{phoneNum}")
    Long getId(String phoneNum);
}
