package com.entity.model;

import com.entity.GuanggaojiesuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 广告结算
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public class GuanggaojiesuanModel  implements Serializable {
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
	 * 广告商名称
	 */
	
	private String guanggaoshangmingcheng;
		
	/**
	 * 广告总费用
	 */
	
	private Integer guanggaozongfeiyong;
		
	/**
	 * 结算时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiesuanshijian;
		
	/**
	 * 客户账号
	 */
	
	private String kehuzhanghao;
		
	/**
	 * 客户姓名
	 */
	
	private String kehuxingming;
		
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
	 * 设置：广告总费用
	 */
	 
	public void setGuanggaozongfeiyong(Integer guanggaozongfeiyong) {
		this.guanggaozongfeiyong = guanggaozongfeiyong;
	}
	
	/**
	 * 获取：广告总费用
	 */
	public Integer getGuanggaozongfeiyong() {
		return guanggaozongfeiyong;
	}
				
	
	/**
	 * 设置：结算时间
	 */
	 
	public void setJiesuanshijian(Date jiesuanshijian) {
		this.jiesuanshijian = jiesuanshijian;
	}
	
	/**
	 * 获取：结算时间
	 */
	public Date getJiesuanshijian() {
		return jiesuanshijian;
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
