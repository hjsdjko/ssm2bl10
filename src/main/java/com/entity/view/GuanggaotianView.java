package com.entity.view;

import com.entity.GuanggaotianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 广告提案
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
@TableName("guanggaotian")
public class GuanggaotianView  extends GuanggaotianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuanggaotianView(){
	}
 
 	public GuanggaotianView(GuanggaotianEntity guanggaotianEntity){
 	try {
			BeanUtils.copyProperties(this, guanggaotianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
