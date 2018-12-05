package com.dnp.test.constant.tips;

/**
 * 返回给前台的成功提示
 *
 * @author 华仔
 * @date 2017年8月17日10:18:46
 */
public class SuccessTip extends Tip{
	
	public SuccessTip(){
		super.code = 200;
		super.message = "操作成功";
	}
}
