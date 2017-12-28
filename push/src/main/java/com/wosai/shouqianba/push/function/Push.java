package com.wosai.shouqianba.push.function;

import java.util.Map;

public interface Push {
	Map<String, Object> send(String code, Map<String, Object> message);
}
