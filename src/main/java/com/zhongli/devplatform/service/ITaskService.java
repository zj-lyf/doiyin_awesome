package com.zhongli.devplatform.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongli.devplatform.dto.TaskDTO;
import com.zhongli.devplatform.po.TaskPO;
import com.zhongli.devplatform.vo.TaskVO;

import java.util.List;

public interface ITaskService extends IService<TaskPO> {
    TaskPO save(TaskDTO taskDTO);

    List<TaskVO> listTask();

    TaskVO showTask(Long taskId);

    List<TaskVO> myTask(Long userId);

    List<TaskVO> recommend();


}
