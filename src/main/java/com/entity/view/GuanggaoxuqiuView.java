package com.entity.view;

import com.entity.GuanggaoxuqiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 广告需求
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
@TableName("guanggaoxuqiu")
public class GuanggaoxuqiuView  extends GuanggaoxuqiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuanggaoxuqiuView(){
	}
 
 	public GuanggaoxuqiuView(GuanggaoxuqiuEntity guanggaoxuqiuEntity){
 	try {
			BeanUtils.copyProperties(this, guanggaoxuqiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
