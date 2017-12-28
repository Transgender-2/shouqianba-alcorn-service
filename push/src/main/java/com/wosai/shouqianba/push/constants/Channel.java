package com.wosai.shouqianba.push.constants;

public class Channel {
	public enum ChannelCode {
		SMS(100, "短信发送"),
		WECHAT(200, "微信推送"),
		APP(300, "APP推送");

		private int channelCode;
		private String desc;

		ChannelCode(int channelCode, String desc) {
			this.channelCode = channelCode;
			this.desc = desc;
		}

		public int getChannelCode() {
			return channelCode;
		}

		public String getDesc() {
			return desc;
		}
	}

	public enum StatusCode {
		SUCCESS(10, "发送成功"),
		FAIL(20, "发送失败"),
		EXCEPTION(30, "发送异常"),
		UNKNOWN(40, "未知异常");

		private int code;
		private String desc;

		StatusCode(int code, String desc) {
			this.code = code;
			this.desc = desc;
		}
	}
}
