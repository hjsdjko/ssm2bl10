package com.entity.vo;

import com.entity.GuanggaotoufangqudaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 广告投放渠道
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public class GuanggaotoufangqudaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 投放预算要求
	 */
	
	private String toufangyusuanyaoqiu;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
				
	
	/**
	 * 设置：投放预算要求
	 */
	 
	public void setToufangyusuanyaoqiu(String toufangyusuanyaoqiu) {
		this.toufangyusuanyaoqiu = toufangyusuanyaoqiu;
	}
	
	/**
	 * 获取：投放预算要求
	 */
	public String getToufangyusuanyaoqiu() {
		return toufangyusuanyaoqiu;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
			
}
