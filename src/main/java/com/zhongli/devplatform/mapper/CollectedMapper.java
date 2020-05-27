package com.zhongli.devplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongli.devplatform.po.CollectedPO;
import com.zhongli.devplatform.vo.CollectedVO;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CollectedMapper extends BaseMapper<CollectedPO> {
    @Update("update doiyin_awesome_collected set commit_content = #{commitContent},commit_status = #{commitStatus} where task_id = #{taskId} and user_id= #{userId}")
    void submit(Long userId,Long taskId, String commitContent,int commitStatus);

    @Update("update doiyin_awesome_collected set audit_content = #{auditContent},result = #{result} where task_id = #{taskId} and user_id= #{userId}")
    void audit(Long userId,Long taskId, String auditContent,int result);

    @Select("select * from doiyin_awesome_collected where user_id = #{userId}")
    List<CollectedVO> received(Long userId);
}
