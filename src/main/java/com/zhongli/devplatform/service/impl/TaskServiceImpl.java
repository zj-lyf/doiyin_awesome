package com.zhongli.devplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongli.devplatform.dto.TaskDTO;
import com.zhongli.devplatform.mapper.AccountMapper;
import com.zhongli.devplatform.mapper.TaskMapper;
import com.zhongli.devplatform.mapper.UserMapper;
import com.zhongli.devplatform.po.TaskPO;
import com.zhongli.devplatform.service.ITaskService;
import com.zhongli.devplatform.utils.BeanCopierUtil;
import com.zhongli.devplatform.vo.TaskVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.Date;
import java.util.List;

@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, TaskPO> implements ITaskService {
    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public TaskPO save(TaskDTO taskDTO) {
        TaskPO taskPO = BeanCopierUtil.copy(taskDTO, TaskPO.class);
        taskPO.setPublishDate(new Date());
        taskPO.setStatus(0);
        return taskPO;
    }

    @Override
    public List<TaskVO> listTask() {
        List<TaskPO> taskPOList = taskMapper.selectList(null);
        return BeanCopierUtil.copy(taskPOList,TaskVO.class);
    }

    @Override
    public TaskVO showTask(Long taskId) {
        TaskPO taskPO = taskMapper.selectById(taskId);
        return BeanCopierUtil.copy(taskPO,TaskVO.class);
    }

    @Override
    public List<TaskVO> myTask(Long account) {
        List<TaskVO> taskVOS =taskMapper.myTask(account);
        return taskVOS;
    }

    @Override
    public List<TaskVO> recommend() {
        List<TaskVO> recommend = taskMapper.recommend();
        return recommend;
    }


}
