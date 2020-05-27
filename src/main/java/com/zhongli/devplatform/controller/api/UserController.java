package com.zhongli.devplatform.controller.api;

import com.zhongli.devplatform.dto.UserDTO;
import com.zhongli.devplatform.query.UserQuery;
import com.zhongli.devplatform.service.IUserService;
import com.zhongli.devplatform.vo.Res;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("用户积分接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/save")
    @ApiOperation("发布任务接口")
    @ApiResponse(code = 200,message = "发布成功")
    public Res save(@RequestBody UserDTO userDTO) {
   /*     if (testDTO.getId() == null) {
            TestPO testPO = BeanCopierUtil.copy(testDTO, TestPO.class);
            testService.saveOrUpdate(testPO);
        } else {
            testService.update(new UpdateWrapper<TestPO>());
        }*/
        return new Res(null);
    }


    @PostMapping("/listPage")
    public Res listPage(@RequestBody UserQuery userQuery) {
   /*     QueryWrapper<TestPO> queryWrapper = new QueryWrapper();
        Page page = testService.page(query, queryWrapper);
        PageVO<TestVO> newPage = PageVO.convert(page, TestVO.class);*/
        return new Res(null);
    }


}
