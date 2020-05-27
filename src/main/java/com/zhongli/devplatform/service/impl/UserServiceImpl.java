package com.zhongli.devplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongli.devplatform.dto.UserDTO;
import com.zhongli.devplatform.mapper.UserMapper;
import com.zhongli.devplatform.po.UserPO;
import com.zhongli.devplatform.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserPO> implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Long findByAccount(Long account) {
        return userMapper.findByAccount(account);
    }

}
