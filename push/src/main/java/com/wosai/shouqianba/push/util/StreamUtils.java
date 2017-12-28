package com.wosai.shouqianba.push.util;

import java.io.*;

/**
 * 流处理工具类
 */
public final class StreamUtils {

	public static String fromInputStream(InputStream inputStream) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(inputStream)
		);
		String line;
		StringBuilder accum = new StringBuilder();
		while((line=bufferedReader.readLine()) != null) {
			accum.append(line);
		}
		return accum.toString();
	}

}
