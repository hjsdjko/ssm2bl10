package com.entity.model;

import com.entity.GuanggaoshejitujiaofuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 广告设计图交付
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public class GuanggaoshejitujiaofuModel  implements Serializable {
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
	 * 交付费用
	 */
	
	private Integer jiaofufeiyong;
		
	/**
	 * 设计图
	 */
	
	private String shejitu;
		
	/**
	 * 设计图文件
	 */
	
	private String shejituwenjian;
		
	/**
	 * 设计图内容
	 */
	
	private String shejituneirong;
		
	/**
	 * 提交时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tijiaoshijian;
		
	/**
	 * 客户账号
	 */
	
	private String kehuzhanghao;
		
	/**
	 * 客户姓名
	 */
	
	private String kehuxingming;
		
	/**
	 * 广告商账号
	 */
	
	private String guanggaoshangzhanghao;
		
	/**
	 * 广告商名称
	 */
	
	private String guanggaoshangmingcheng;
		
	/**
	 * 制作商账号
	 */
	
	private String zhizuoshangzhanghao;
		
	/**
	 * 制作商名称
	 */
	
	private String zhizuoshangmingcheng;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：交付费用
	 */
	 
	public void setJiaofufeiyong(Integer jiaofufeiyong) {
		this.jiaofufeiyong = jiaofufeiyong;
	}
	
	/**
	 * 获取：交付费用
	 */
	public Integer getJiaofufeiyong() {
		return jiaofufeiyong;
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
	 * 设置：设计图内容
	 */
	 
	public void setShejituneirong(String shejituneirong) {
		this.shejituneirong = shejituneirong;
	}
	
	/**
	 * 获取：设计图内容
	 */
	public String getShejituneirong() {
		return shejituneirong;
	}
				
	
	/**
	 * 设置：提交时间
	 */
	 
	public void setTijiaoshijian(Date tijiaoshijian) {
		this.tijiaoshijian = tijiaoshijian;
	}
	
	/**
	 * 获取：提交时间
	 */
	public Date getTijiaoshijian() {
		return tijiaoshijian;
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
	 * 设置：广告商账号
	 */
	 
	public void setGuanggaoshangzhanghao(String guanggaoshangzhanghao) {
		this.guanggaoshangzhanghao = guanggaoshangzhanghao;
	}
	
	/**
	 * 获取：广告商账号
	 */
	public String getGuanggaoshangzhanghao() {
		return guanggaoshangzhanghao;
	}
				
	
	/**
	 * 设置：广告商名称
	 */
	 
	public void setGuanggaoshangmingcheng(String guanggaoshangmingcheng) {
		this.guanggaoshangmingcheng = guanggaoshangmingcheng;
	}
	
	/**
	 * 获取：广告商名称
	 */
	public String getGuanggaoshangmingcheng() {
		return guanggaoshangmingcheng;
	}
				
	
	/**
	 * 设置：制作商账号
	 */
	 
	public void setZhizuoshangzhanghao(String zhizuoshangzhanghao) {
		this.zhizuoshangzhanghao = zhizuoshangzhanghao;
	}
	
	/**
	 * 获取：制作商账号
	 */
	public String getZhizuoshangzhanghao() {
		return zhizuoshangzhanghao;
	}
				
	
	/**
	 * 设置：制作商名称
	 */
	 
	public void setZhizuoshangmingcheng(String zhizuoshangmingcheng) {
		this.zhizuoshangmingcheng = zhizuoshangmingcheng;
	}
	
	/**
	 * 获取：制作商名称
	 */
	public String getZhizuoshangmingcheng() {
		return zhizuoshangmingcheng;
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
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
