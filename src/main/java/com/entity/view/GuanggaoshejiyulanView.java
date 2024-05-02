package com.entity.view;

import com.entity.GuanggaoshejiyulanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 广告设计预览
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
@TableName("guanggaoshejiyulan")
public class GuanggaoshejiyulanView  extends GuanggaoshejiyulanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuanggaoshejiyulanView(){
	}
 
 	public GuanggaoshejiyulanView(GuanggaoshejiyulanEntity guanggaoshejiyulanEntity){
 	try {
			BeanUtils.copyProperties(this, guanggaoshejiyulanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
