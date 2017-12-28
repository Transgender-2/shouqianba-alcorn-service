package com.wosai.shouqianba.push.function.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wosai.data.bean.BeanUtil;
import com.wosai.shouqianba.push.exception.InvalidParamsException;
import com.wosai.shouqianba.push.exception.PushErrorException;
import com.wosai.shouqianba.push.function.Push;
import com.wosai.shouqianba.push.template.Sms;
import com.wosai.shouqianba.push.util.StreamUtils;
import com.wosai.shouqianba.push.util.StringUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import static com.wosai.shouqianba.push.constants.HttpConstants.*;
import static com.wosai.shouqianba.push.constants.PushConstants.*;

@SuppressWarnings("unchecked")
public class SmsPush implements Push {

	@Override
	public Map<String, Object> send(String code, Map<String, Object> message) {
		return null;
	}

	private void push(String url, String smsKey, Map<String, Object> params) {
		String merchantId = BeanUtil.getPropString(params, MERCHANT_ID);
		String cellphone = BeanUtil.getPropString(params, CELLPHONE);
		String template = BeanUtil.getPropString(params, TEMPLATE);
		if (StringUtils.anyEmpty(merchantId, cellphone, template)) {
			throw new InvalidParamsException(InvalidParamsException.invalidOrNullParams, "商户号、手机号、模版字段不能为空");
		}
		Map<String, Object> vars = (Map<String, Object>) BeanUtil.getProperty(params, VARS);

		String result;
		OutputStream outputStream = null;
		HttpURLConnection connection = null;
		try {
			connection = (HttpURLConnection) new URL(url).openConnection();
			connection.setRequestProperty(CONTENT_TYPE, JSON_APPLICATION);
			connection.setDoOutput(true);
			outputStream = connection.getOutputStream();
			Sms sms = new Sms(smsKey, cellphone, template, vars);
			new ObjectMapper().writeValue(outputStream, sms);
			result = StreamUtils.fromInputStream(connection.getInputStream());
		} catch(Exception e) {
			throw new PushErrorException("短信发送失败:" + e.getMessage());
		} finally {
			if (connection != null) {
				connection.disconnect();
				try {
					outputStream.close();
				} catch (IOException e) {
					throw new RuntimeException("关闭IO流失败");
				}
			}
		}

		if (!"{}".equals(result)) {
			throw new PushErrorException("短信发送失败:" + params);
		}

	}
}
