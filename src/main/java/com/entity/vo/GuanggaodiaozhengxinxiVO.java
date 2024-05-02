package com.entity.vo;

import com.entity.GuanggaodiaozhengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 广告调整信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public class GuanggaodiaozhengxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 广告封面
	 */
	
	private String guanggaofengmian;
		
	/**
	 * 投放渠道
	 */
	
	private String toufangqudao;
		
	/**
	 * 广告要求
	 */
	
	private String guanggaoyaoqiu;
		
	/**
	 * 上线时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangxianshijian;
		
	/**
	 * 上线策略要求
	 */
	
	private String shangxiancelveyaoqiu;
		
	/**
	 * 调整内容
	 */
	
	private String diaozhengneirong;
		
	/**
	 * 客户账号
	 */
	
	private String kehuzhanghao;
		
	/**
	 * 客户姓名
	 */
	
	private String kehuxingming;
				
	
	/**
	 * 设置：广告封面
	 */
	 
	public void setGuanggaofengmian(String guanggaofengmian) {
		this.guanggaofengmian = guanggaofengmian;
	}
	
	/**
	 * 获取：广告封面
	 */
	public String getGuanggaofengmian() {
		return guanggaofengmian;
	}
				
	
	/**
	 * 设置：投放渠道
	 */
	 
	public void setToufangqudao(String toufangqudao) {
		this.toufangqudao = toufangqudao;
	}
	
	/**
	 * 获取：投放渠道
	 */
	public String getToufangqudao() {
		return toufangqudao;
	}
				
	
	/**
	 * 设置：广告要求
	 */
	 
	public void setGuanggaoyaoqiu(String guanggaoyaoqiu) {
		this.guanggaoyaoqiu = guanggaoyaoqiu;
	}
	
	/**
	 * 获取：广告要求
	 */
	public String getGuanggaoyaoqiu() {
		return guanggaoyaoqiu;
	}
				
	
	/**
	 * 设置：上线时间
	 */
	 
	public void setShangxianshijian(Date shangxianshijian) {
		this.shangxianshijian = shangxianshijian;
	}
	
	/**
	 * 获取：上线时间
	 */
	public Date getShangxianshijian() {
		return shangxianshijian;
	}
				
	
	/**
	 * 设置：上线策略要求
	 */
	 
	public void setShangxiancelveyaoqiu(String shangxiancelveyaoqiu) {
		this.shangxiancelveyaoqiu = shangxiancelveyaoqiu;
	}
	
	/**
	 * 获取：上线策略要求
	 */
	public String getShangxiancelveyaoqiu() {
		return shangxiancelveyaoqiu;
	}
				
	
	/**
	 * 设置：调整内容
	 */
	 
	public void setDiaozhengneirong(String diaozhengneirong) {
		this.diaozhengneirong = diaozhengneirong;
	}
	
	/**
	 * 获取：调整内容
	 */
	public String getDiaozhengneirong() {
		return diaozhengneirong;
	}
				
	
	/**
	 * 设置：客户账号
	 */
	 
	public void setKehuzhanghao(String kehuzhanghao) {
		this.kehuzhanghao = kehuzhanghao;
	}
	
	/**
	 * 获取：客户账号
	 */
	public String getKehuzhanghao() {
		return kehuzhanghao;
	}
				
	
	/**
	 * 设置：客户姓名
	 */
	 
	public void setKehuxingming(String kehuxingming) {
		this.kehuxingming = kehuxingming;
	}
	
	/**
	 * 获取：客户姓名
	 */
	public String getKehuxingming() {
		return kehuxingming;
	}
			
}
