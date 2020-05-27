package com.zhongli.devplatform.controller.api;

import com.zhongli.devplatform.dto.TaskDTO;
import com.zhongli.devplatform.po.UserPO;
import com.zhongli.devplatform.service.IAccountService;
import com.zhongli.devplatform.service.ITaskService;
import com.zhongli.devplatform.service.IUserService;
import com.zhongli.devplatform.utils.UserUtil;
import com.zhongli.devplatform.vo.Res;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api("任务接口")
@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private ITaskService taskService;

    @Autowired
    private IUserService userService;

    @Autowired
    private IAccountService accountService;

    @PostMapping("/publishTask")
    @ApiOperation("发布任务接口")
    @ApiResponse(code = 200,message = "发布成功")
    public Res save(@RequestBody TaskDTO taskDTO) {
        Long id = UserUtil.getCurrUser().getId();
        UserPO userPO = userService.getById(id);
        if (userPO == null){
            return new Res("用户不存在");
        }
        int score = userPO.getScore();
        if (score<=taskDTO.getTaskPoints()){
            return new Res("积分不足");
        }
        taskService.save(taskDTO);
        return new Res("ok");
    }

    @PostMapping("/listTask")
    @ApiOperation("任务列表接口")
    @ApiResponse(code = 200,message = "任务列表显示")
    public Res listTask(@RequestBody TaskDTO taskDTO) {
        return new Res(taskService.listTask());
    }

    @PostMapping("/showTask")
    @ApiOperation("任务详情接口")
    @ApiResponse(code = 200,message = "任务详情显示")
    public Res showTask(Long taskId) {
        return new Res(taskService.showTask(taskId));
    }

    @GetMapping("/myTask")
    @ApiOperation("我发布的任务接口")
    @ApiResponse(code = 200,message = "任务显示")
    public Res myTask() {
        Long account = UserUtil.getCurrUser().getId();
        Long userId = userService.findByAccount(account);
        return new Res(taskService.myTask(userId));
    }


    @GetMapping("/recommend")
    @ApiOperation("推荐任务接口")
    @ApiResponse(code = 200,message = "任务显示")
    public Res recommend() {
        return new Res(taskService.recommend());
    }
/*    @PostMapping("/listPage")
    public Res listPage(@RequestBody UserQuery userQuery) {
   *//*     QueryWrapper<TestPO> queryWrapper = new QueryWrapper();
        Page page = testService.page(query, queryWrapper);
        PageVO<TestVO> newPage = PageVO.convert(page, TestVO.class);*//*
        return new Res(null);
    }*/


}
