package com.entity.view;

import com.entity.GuanggaozhizuoxuqiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 广告制作需求
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
@TableName("guanggaozhizuoxuqiu")
public class GuanggaozhizuoxuqiuView  extends GuanggaozhizuoxuqiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuanggaozhizuoxuqiuView(){
	}
 
 	public GuanggaozhizuoxuqiuView(GuanggaozhizuoxuqiuEntity guanggaozhizuoxuqiuEntity){
 	try {
			BeanUtils.copyProperties(this, guanggaozhizuoxuqiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
