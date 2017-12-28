package com.wosai.shouqianba.push.function;

import com.wosai.shouqianba.push.common.PushRequest;
import com.wosai.shouqianba.push.common.PushResponse;

public interface PushService {
    PushResponse pushMessage(PushRequest pushRequest);
}
