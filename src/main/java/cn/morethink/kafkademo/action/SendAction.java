package cn.morethink.kafkademo.action;

import cn.morethink.kafkademo.entity.Message;
import cn.morethink.kafkademo.service.SenderService;
import cn.morethink.kafkademo.util.Result;
import cn.morethink.kafkademo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author 李文浩
 * @date 2017/12/23
 */

@RestController
public class SendAction {

    @Autowired
    private SenderService senderService;

    @RequestMapping("/sendMsg")
    public Result sendMsg(Message message) {
        message.setId(System.currentTimeMillis());
        message.setSendTime(new Date());
        senderService.sendMessage(message);
        return ResultUtil.SUCCESS_RESULT;
    }
}
