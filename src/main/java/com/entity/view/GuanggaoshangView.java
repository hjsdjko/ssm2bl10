package com.entity.view;

import com.entity.GuanggaoshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 广告商
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
@TableName("guanggaoshang")
public class GuanggaoshangView  extends GuanggaoshangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuanggaoshangView(){
	}
 
 	public GuanggaoshangView(GuanggaoshangEntity guanggaoshangEntity){
 	try {
			BeanUtils.copyProperties(this, guanggaoshangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
