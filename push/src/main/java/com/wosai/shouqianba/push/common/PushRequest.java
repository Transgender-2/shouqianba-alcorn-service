package com.wosai.shouqianba.push.common;

import com.wosai.app.push.api.template.Template;
import com.wosai.shouqianba.push.constants.Channel;

public class PushRequest {
    /**
     * 发送渠道 短信、微信、app
     */
    private Channel.ChannelCode channelCode;
    /**
     * 具体的内容
     */
    private Template content;

    /**
     * 推送类型：通知、公告
     */
    private Channel.Type type;

    public Channel.Type getType() {
        return type;
    }

    public void setType(Channel.Type type) {
        this.type = type;
    }

    public Channel.ChannelCode getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(Channel.ChannelCode channelCode) {
        this.channelCode = channelCode;
    }

    public Template getContent() {
        return content;
    }

    public void setContent(Template content) {
        this.content = content;
    }
}
