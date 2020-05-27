package com.zhongli.devplatform.controller.api;

import com.zhongli.devplatform.dto.CollectedDTO;
import com.zhongli.devplatform.query.UserQuery;
import com.zhongli.devplatform.service.ICollectedService;
import com.zhongli.devplatform.service.IUserService;
import com.zhongli.devplatform.utils.UserUtil;
import com.zhongli.devplatform.vo.Res;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api("领取任务接口")
@RestController
@RequestMapping("/collected")
public class CollectedController {

    @Autowired
    private ICollectedService collectedService;

    @Autowired
    private IUserService userService;

    @PostMapping("/getTask")
    @ApiOperation("领取任务接口")
    @ApiResponse(code = 200,message = "领取成功，等待审核")
    public Res save(@RequestBody CollectedDTO collectedDTO) {
        collectedService.save(collectedDTO);
        return new Res(null);
    }


    @PostMapping("/submitTask")
    public Res submitTask(Long taskId, String commitContent,int commitStatus) {
        Long account = UserUtil.getCurrUser().getId();
        Long userId = userService.findByAccount(account);
        collectedService.submit(userId,taskId,commitContent,commitStatus);
        return new Res(null);
    }


    @PostMapping("/auditTask")
    public Res auditTask(Long taskId, String auditContent,int result) {
        Long account = UserUtil.getCurrUser().getId();
        Long userId = userService.findByAccount(account);
        collectedService.audit(userId,taskId,auditContent,result);
        return new Res(null);
    }


    @GetMapping("/receivedTask")
    @ApiOperation("我领取的任务接口")
    @ApiResponse(code = 200,message = "任务显示")
    public Res receivedTask() {
        Long account = UserUtil.getCurrUser().getId();
        Long userId = userService.findByAccount(account);
        return new Res(collectedService.received(userId));
    }
}
