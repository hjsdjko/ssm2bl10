package com.entity.view;

import com.entity.GuanggaoshejitujiaofuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 广告设计图交付
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
@TableName("guanggaoshejitujiaofu")
public class GuanggaoshejitujiaofuView  extends GuanggaoshejitujiaofuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuanggaoshejitujiaofuView(){
	}
 
 	public GuanggaoshejitujiaofuView(GuanggaoshejitujiaofuEntity guanggaoshejitujiaofuEntity){
 	try {
			BeanUtils.copyProperties(this, guanggaoshejitujiaofuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
