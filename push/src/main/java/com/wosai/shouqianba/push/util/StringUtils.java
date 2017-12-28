package com.wosai.shouqianba.push.util;

import com.wosai.data.util.StringUtil;

public final class StringUtils {

	public static boolean anyEmpty(String... args) {
		if (args == null || args.length < 1) {
			return false;
		}
		for (String arg : args) {
			if (StringUtil.empty(arg)) {
				return false;
			}
		}
		return true;
	}

}
