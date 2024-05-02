package com.entity.vo;

import com.entity.GuanggaoshejiyulanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 广告设计预览
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public class GuanggaoshejiyulanVO  implements Serializable {
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
	 * 设计图
	 */
	
	private String shejitu;
		
	/**
	 * 设计图文件
	 */
	
	private String shejituwenjian;
		
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
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：设计图
	 */
	 
	public void setShejitu(String shejitu) {
		this.shejitu = shejitu;
	}
	
	/**
	 * 获取：设计图
	 */
	public String getShejitu() {
		return shejitu;
	}
				
	
	/**
	 * 设置：设计图文件
	 */
	 
	public void setShejituwenjian(String shejituwenjian) {
		this.shejituwenjian = shejituwenjian;
	}
	
	/**
	 * 获取：设计图文件
	 */
	public String getShejituwenjian() {
		return shejituwenjian;
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
