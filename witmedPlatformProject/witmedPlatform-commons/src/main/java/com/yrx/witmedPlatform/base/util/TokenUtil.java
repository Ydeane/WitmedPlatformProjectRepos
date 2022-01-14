package com.yrx.witmedPlatform.base.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>基础信息功能-Token工具类</b>
 * <p>为了能够实现Token机制，选择借助于JWT（json web Token）来实现，
 * 通过jwt能够实现一个经过加密的token
 * </p>
 * @author Ydeane
 * @date 2021-1-6
 * @version 1.0.0
 */
public class TokenUtil {
	//设置系统加密算法
	private static Algorithm algorithm = Algorithm.HMAC256(BaseConstants.SECRET_KEY);

	/**
	 * 根据用户所给定的信息创建token
	 * @return
	 */
	public static String createToken(Map<String,String> claimMap, 
Long expireSec) {
		//创建JWT token生成器
		JWTCreator.Builder builder = JWT.create();
		//创建Map集合，用于设定生成Token的头部信息
		Map<String, Object> headerMap = new HashMap<String,Object>();
		//设定token的生成方式是jwt
		headerMap.put("typ", "jwt");
		//设置token的加密算法
		headerMap.put("alg", "HS256");
		//设定头部信息
		builder.withHeader(headerMap);
		//设置token的有效载荷
		//使用jdk8新特性中的foreach()进行map集合的遍历
		claimMap.forEach((key,value) -> {
			builder.withClaim(key, value);
		});
		//设置token的有效时间
		builder.withExpiresAt(new Date(System.currentTimeMillis() + expireSec * 1000));
		return builder.sign(algorithm);
	}

	public static Map<String, String> verifyToken(String token){
		//检验此时所给定的Token是符合相关形式的
		if(token != null && !"".equals(token.trim())){
			//此时的token有效
			//获得token校验对象JWTVerifier
			JWTVerifier verifier = JWT.require(algorithm).build();
			//对该token进行校验
			DecodedJWT decodedJWT = verifier.verify(token);
			//如果能够获得DecodedJWT则说明通过密钥能够加密token进行解密
			//提取绑定在token上的有效载荷信息
			Map<String, String> resultMap = new HashMap<String, String>();
			decodedJWT.getClaims().forEach((key,value) -> {
				resultMap.put(key, String.valueOf(value));
			});
			return resultMap;
		}
		return null;
	}
}
