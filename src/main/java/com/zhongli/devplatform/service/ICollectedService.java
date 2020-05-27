package com.zhongli.devplatform.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongli.devplatform.dto.CollectedDTO;
import com.zhongli.devplatform.po.CollectedPO;
import com.zhongli.devplatform.vo.CollectedVO;

import java.util.List;

public interface ICollectedService extends IService<CollectedPO> {
    CollectedPO save(CollectedDTO collectedDTO);

    void submit(Long userId,Long taskId, String commitContent,int commitStatus);

    void audit(Long userId,Long taskId, String auditContent,int result);

    List<CollectedVO> received(Long userId);
}
