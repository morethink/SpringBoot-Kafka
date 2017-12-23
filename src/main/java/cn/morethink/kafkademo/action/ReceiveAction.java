package cn.morethink.kafkademo.action;

import cn.morethink.kafkademo.service.ReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李文浩
 * @date 2017/12/23
 */

@RestController
public class ReceiveAction {

    @Autowired
    private ReceiveService receiveService;

//    @RequestMapping("/receiveMsg")
//    public Result receiveMsg() {
//        return ResultUtil.successResult()
//    }

}
