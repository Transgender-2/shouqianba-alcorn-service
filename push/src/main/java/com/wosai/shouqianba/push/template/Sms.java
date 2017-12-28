package com.wosai.shouqianba.push.template;

import com.wosai.data.util.CollectionUtil;

import java.util.Map;

/**
 * Created by jianfree on 8/8/15.
 * Copy from backend-upay
 */
public class Sms {
	public static final String AUTH_CODE_TYPE_REG = "reg";//注册
	public static final String AUTH_CODE_TYPE_NORMAL = "normal";//不带业务场景的验证码
	public static final String AUTH_CODE_TYPE_FIND = "findPass";//找回密码

	public static final String AUTH_CODE_TYPE_SETMANAGERPWD = "setMPwd";//修改店长密码
	public static final String AUTH_CODE_TYPE_TRADE = "trade"; // 发送交易统计信息

	public static final String WITHDRAW_ACCESS = "withdrawAccess";//提现记录 通过
	public static final String WITHDRAW_DENIED = "withdrawDenied";//提现记录，驳回；
	public static final String WITHDRAW_FAIL = "withdrawFail";//提现记录，失败；
	public static final String WITHDRAW_COMPENSATION_COMPLETED = "withdrawCompensationCompleted";//超时赔付；
	public static final String WITHDRAW_LAKALA_EZ_STATUS = "withdrawLakaLaEz";//拉卡拉EZ状态；
	public static final String WITHDRAW_UNKNOWN = "withdrawUnknown";//提现记录，状态未知；
	public static final String STORE_ACTIVATE = "storeActivate";//店铺激活

	public static final String SMS_TO_HEADQUARTERS = "VD0ga4"; // 发送给总部的数据统计
	public static final String SMS_TO_DIVISION = "d0UXv2"; // 发送给分部的数据统计

	public static final String SMS_INVITE_STAFF = "x4iov1"; // 首次邀请店员
	public static final String SMS_BIND_CELLPHONE = "6lDgZ4"; // 绑定手机号验证码
	public static final String SMS_ISV_BIND_CELLPHONE = "isvBindCellphone"; // ISV帐号绑定手机号验证码
	public static final String SMS_ISV_FIND_PASS = "isvFindPass"; // ISV帐号找回密码

	public static final String SMS_BIND_QRCODE = "bindQrcode"; // 绑定商户收款码
	/**
	 * 提现关闭短信通知文案
	 */
	public static final String SMS_WITHDRAW_CLOSE_SMS_NOTICE = "smsWithdrawCloseSmsNotice";


	//短信模板
	public static Map<String, String> smsTemplateMap = CollectionUtil.hashMap(
			"reg", "LJXnt",
			"normal", "veqof4",
			"findPass", "6yHOs3",
			"setMPwd", "EzKPA1",
			"trade", "SwmQw",
			"storeActivate", "WJBc13",
			WITHDRAW_ACCESS, "6dHHl2",
			WITHDRAW_DENIED, "UL43A3",
			WITHDRAW_FAIL, "YJnEM1",
			WITHDRAW_COMPENSATION_COMPLETED, "kIlT92",
			WITHDRAW_LAKALA_EZ_STATUS, "oGq4s2",
			"withdrawUnknown", "ipU4a3",
			"isvBindCellphone", "oZa0p",
			"isvFindPass", "si94Y4",
			"bindQrcode", "sl9753",
			SMS_WITHDRAW_CLOSE_SMS_NOTICE,"Eztf4"
	);

	private String key;
	private String to;
	private String template;
	private Map vars;

	public Sms(String key, String to, String template, Map vars) {
		this.key = key;
		this.to = to;
		this.template = template;
		this.vars = vars;
	}



	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public Map getVars() {
		return vars;
	}

	public void setVars(Map vars) {
		this.vars = vars;
	}

}