package com.zhongli.devplatform.controller.api;

import com.zhongli.devplatform.dto.AccountDTO;
import com.zhongli.devplatform.query.AccountQuery;
import com.zhongli.devplatform.service.IAccountService;
import com.zhongli.devplatform.utils.UserUtil;
import com.zhongli.devplatform.vo.AccountVO;
import com.zhongli.devplatform.vo.Res;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api("注册账户接口")
@RestController
@RequestMapping("/account")
public class AcountController {

    @Autowired
    private IAccountService accountService;

    @ApiOperation("注册接口")
    @ApiResponse(code = 200,message = "注册成功")
    @PostMapping("/register")
    public Res register(String phoneNum) {
        System.out.println(phoneNum);
        accountService.register(phoneNum);
        return new Res(null);
    }


    @ApiOperation("验证码接口")
    @ApiResponse(code = 200,message = "验证码获取成功")
    @GetMapping("/captcha")
    public Res register() {
        return new Res("123456");
    }
}
