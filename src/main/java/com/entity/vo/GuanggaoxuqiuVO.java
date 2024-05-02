package com.entity.vo;

import com.entity.GuanggaoxuqiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 广告需求
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public class GuanggaoxuqiuVO  implements Serializable {
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
	 * 需求内容
	 */
	
	private String xuqiuneirong;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 客户账号
	 */
	
	private String kehuzhanghao;
		
	/**
	 * 客户姓名
	 */
	
	private String kehuxingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：需求内容
	 */
	 
	public void setXuqiuneirong(String xuqiuneirong) {
		this.xuqiuneirong = xuqiuneirong;
	}
	
	/**
	 * 获取：需求内容
	 */
	public String getXuqiuneirong() {
		return xuqiuneirong;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
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
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
