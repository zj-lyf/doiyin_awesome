package com.zhongli.devplatform.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongli.devplatform.po.AccountPO;


public interface IAccountService extends IService<AccountPO> {
     void register(String phoneNum);

}
