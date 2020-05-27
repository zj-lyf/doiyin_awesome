package com.zhongli.devplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongli.devplatform.dto.CollectedDTO;
import com.zhongli.devplatform.mapper.CollectedMapper;
import com.zhongli.devplatform.mapper.TaskMapper;
import com.zhongli.devplatform.mapper.UserMapper;
import com.zhongli.devplatform.po.CollectedPO;
import com.zhongli.devplatform.po.TaskPO;
import com.zhongli.devplatform.service.IAccountService;
import com.zhongli.devplatform.service.ICollectedService;
import com.zhongli.devplatform.service.ITaskService;
import com.zhongli.devplatform.utils.BeanCopierUtil;
import com.zhongli.devplatform.utils.UserUtil;
import com.zhongli.devplatform.vo.CollectedVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectedServiceImpl extends ServiceImpl<CollectedMapper, CollectedPO> implements ICollectedService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ICollectedService collectedService;

    @Override
    public CollectedPO save(CollectedDTO collectedDTO) {
        Long account = UserUtil.getCurrUser().getId();
        Long userId = userMapper.findByAccount(account);
        CollectedPO collectedPO = BeanCopierUtil.copy(collectedDTO, CollectedPO.class);
        collectedPO.setUserId(userId);
        collectedPO.setResult(0);
        collectedPO.setStatus(0);
        collectedPO.setCommitStatus(0);
        collectedPO.setCommitContent(null);
        return collectedPO;
    }

    @Override
    public void submit(Long userId,Long taskId, String commitContent, int commitStatus) {
        collectedService.submit(userId,taskId,commitContent,commitStatus);
    }

    @Override
    public void audit(Long userId, Long taskId, String auditContent, int result) {
        collectedService.audit(userId,taskId,auditContent,result);
    }

    @Override
    public List<CollectedVO> received(Long userId) {
        return collectedService.received(userId);
    }
}
