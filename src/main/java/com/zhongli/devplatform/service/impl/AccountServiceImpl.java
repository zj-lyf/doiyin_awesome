package com.zhongli.devplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongli.devplatform.mapper.*;
import com.zhongli.devplatform.po.AccountPO;
import com.zhongli.devplatform.po.UserPO;
import com.zhongli.devplatform.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, AccountPO> implements IAccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private UserMapper userMapper;

    private static int score=10;
    @Override
    @Transactional
    public void register(String phoneNum) {
        System.out.println(phoneNum);
        AccountPO accountPO=new AccountPO();
        accountPO.setPhoneNum(phoneNum);
        accountPO.setStatus("1");
        accountPO.setCreateTime(new Date());
        accountMapper.insert(accountPO);
      /*  Long account = accountMapper.getId(phoneNum);
        UserPO userPO=new UserPO();
        userPO.setScore(10);
        userPO.setAccount(account);
        userPO.setLikes(0);
        userMapper.insert(userPO);*/
    }


}
