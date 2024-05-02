package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 广告制作需求
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
@TableName("guanggaozhizuoxuqiu")
public class GuanggaozhizuoxuqiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GuanggaozhizuoxuqiuEntity() {
		
	}
	
	public GuanggaozhizuoxuqiuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 广告名称
	 */
					
	private String guanggaomingcheng;
	
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
	 * 客户账号
	 */
					
	private String kehuzhanghao;
	
	/**
	 * 客户姓名
	 */
					
	private String kehuxingming;
	
	/**
	 * 需求提交时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date xuqiutijiaoshijian;
	
	/**
	 * 制作需求内容
	 */
					
	private String zhizuoxuqiuneirong;
	
	/**
	 * 广告商账号
	 */
					
	private String guanggaoshangzhanghao;
	
	/**
	 * 广告商名称
	 */
					
	private String guanggaoshangmingcheng;
	
	/**
	 * 商家姓名
	 */
					
	private String shangjiaxingming;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：广告名称
	 */
	public void setGuanggaomingcheng(String guanggaomingcheng) {
		this.guanggaomingcheng = guanggaomingcheng;
	}
	/**
	 * 获取：广告名称
	 */
	public String getGuanggaomingcheng() {
		return guanggaomingcheng;
	}
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
	 * 设置：需求提交时间
	 */
	public void setXuqiutijiaoshijian(Date xuqiutijiaoshijian) {
		this.xuqiutijiaoshijian = xuqiutijiaoshijian;
	}
	/**
	 * 获取：需求提交时间
	 */
	public Date getXuqiutijiaoshijian() {
		return xuqiutijiaoshijian;
	}
	/**
	 * 设置：制作需求内容
	 */
	public void setZhizuoxuqiuneirong(String zhizuoxuqiuneirong) {
		this.zhizuoxuqiuneirong = zhizuoxuqiuneirong;
	}
	/**
	 * 获取：制作需求内容
	 */
	public String getZhizuoxuqiuneirong() {
		return zhizuoxuqiuneirong;
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
	 * 设置：商家姓名
	 */
	public void setShangjiaxingming(String shangjiaxingming) {
		this.shangjiaxingming = shangjiaxingming;
	}
	/**
	 * 获取：商家姓名
	 */
	public String getShangjiaxingming() {
		return shangjiaxingming;
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
