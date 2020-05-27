package com.zhongli.devplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongli.devplatform.po.TaskPO;
import com.zhongli.devplatform.vo.TaskVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TaskMapper extends BaseMapper<TaskPO> {
    @Select("select * from doiyin_awesome_task where user_id = #{userId}")
    List<TaskVO> myTask(Long userId);

    @Select("select * from doiyin_awesome_task order by score desc")
    List<TaskVO> recommend();

    @Select("select count(user_id) from doiyin_awesome_task where user_id=#{userId}")
    int count(Long userId);
}
