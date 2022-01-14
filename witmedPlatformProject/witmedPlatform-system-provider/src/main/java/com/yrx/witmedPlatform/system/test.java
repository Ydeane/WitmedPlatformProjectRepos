package com.yrx.witmedPlatform.system;

import cn.hutool.crypto.digest.MD5;

/**
 * <b></b>
 *
 * @author Ydeane
 * @date --
 */
public class test {
	public static void main(String[] args) {
		System.out.println(MD5.create().digestHex("123456"));
	}
}
