package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户等级和积分查询接口（不需要授权）
 *
 * @author auto create
 * @since 1.0, 2016-10-11 14:22:58
 */
public class AlipayUserGradeAuthbaseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1572722721646932925L;

	/**
	 * 用户的支付宝账户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
