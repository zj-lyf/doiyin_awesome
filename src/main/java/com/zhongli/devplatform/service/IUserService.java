package com.zhongli.devplatform.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongli.devplatform.po.UserPO;

public interface IUserService extends IService<UserPO> {

    Long findByAccount(Long account);
}
