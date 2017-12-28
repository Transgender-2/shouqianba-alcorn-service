package com.wosai.shouqianba.push.function.impl;

import com.wosai.shouqianba.push.common.PushRequest;
import com.wosai.shouqianba.push.common.PushResponse;
import com.wosai.shouqianba.push.exception.CommonBsmException;
import com.wosai.shouqianba.push.function.PushService;

public class PushServiceImpl implements PushService{
    @Override
    public PushResponse pushMessage(PushRequest pushRequest) {
        if (pushRequest == null) {
            throw new CommonBsmException("推送的消息不能为空");
        }

        return null;
    }
}
